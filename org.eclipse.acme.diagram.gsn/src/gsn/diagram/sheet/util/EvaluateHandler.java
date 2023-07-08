package gsn.diagram.sheet.util;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.acme.evaluation.framework.ValidationCentre;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.execution.util.UtilityMethods;
import argumentation.ArgumentPackage;
import artifact.Artifact;
import base.ArtifactElement;
import base.ModelElement;
import gsn.diagram.edit.parts.GsnEditPart;
import gsn.diagram.part.ValidateAction;
import gsn.diagram.providers.GsnMarkerNavigationProvider;

public class EvaluateHandler implements IHandler {

	int problem_count = 0;
	
	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editor = workbenchPage.getActiveEditor();
		IEditorInput input = editor.getEditorInput();
		URIEditorInput editorInput = (URIEditorInput) input;
		URI uri = editorInput.getURI();
		URI resolvedFile = CommonPlugin.resolve(uri.trimFragment());
		
		Path path = new Path(resolvedFile.devicePath());
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IFile file = workspace.getRoot().getFileForLocation(path);
		
		ValidationCentre validationCentre = ValidationCentre.getInstance();
		
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				if (element instanceof GsnEditPart) {
					
					GsnEditPart targetEditPart = (GsnEditPart) element;

					View view = (View) targetEditPart.getModel(); 
					IFile target = view.eResource() != null ? WorkspaceSynchronizer.getFile(view.eResource()) : null;
					if (target != null) {
						GsnMarkerNavigationProvider.deleteMarkers(target);
					}
					
					IRunnableWithProgress runnable = new IRunnableWithProgress() {
						
						@Override
						public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
							SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
							GsnEditPart targetEditPart = (GsnEditPart) element;
							ModelElement modelElement = (ModelElement) targetEditPart.resolveSemanticElement();
							
							//clear errors
							validationCentre.clear(modelElement);
							
							ArgumentPackage argumentPackage = (ArgumentPackage) modelElement;
							
							HashMap<ModelElement, String> map = new HashMap<>();
							
							subMonitor.split(10);
							subMonitor.setTaskName("Checking elements...");
							

							for(ModelElement m: argumentPackage.getArgumentationElement()) {
								ArtifactElement cited = getCitedArtifactElement(m);
								validationCentre.removeError(cited);
								if (cited != null) {
									if (cited instanceof Artifact) {
										String result = "";
										Artifact artifact = (Artifact) cited;
										try {
											UtilityMethods.setCurrent_selection(file);
											result = UtilityMethods.executeQuery(artifact.getArtifactProperty().get(0).getDescription().getContent().getValue().get(0).getContent(), getImplementationConstraint(artifact, 0));
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										if (!Boolean.valueOf(result)) {
											map.put(m, "Model evaluation failed, cited element " + cited.getName().getContent() + " failed to pass its Implementation Constraint.");
											map.put(cited, "Evaluation failed");
										}
									}
								}
							}
							subMonitor.split(20);
							
							subMonitor.setTaskName("Generating error messages...");
							subMonitor.split(30);
							problem_count = map.keySet().size();
							for(ModelElement m: map.keySet()) {
								
			        			String message = map.get(m);

			        			int severity = 0;
			        			severity = Diagnostic.ERROR;
			        			
			        			BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(modelElement);
			        			BasicDiagnostic diag = null;
			        			if (m.eContainer().equals(argumentPackage)) {
			        				diag = new BasicDiagnostic(severity, "org.eclipse.acme.sacm.diagram.gsn", 0, "" + message, new Object[] {m});
								}
			        			else {
			        				diag = new BasicDiagnostic(severity, "org.eclipse.acme.sacm.diagram.artifact", 0, "" + message, new Object[] {m});
								}
			        			diagnostic.add(diag);
								
			        			if (m.eContainer().equals(argumentPackage)) {
				        			ValidateAction.createMarkers(file, diagnostic, targetEditPart);
								}
			        			else {
								}
								
								validationCentre.addError(m, message, diagnostic, file);
							}
							subMonitor.setTaskName("Processing errors...");
							subMonitor.split(40);
						}
					};
					
					try {
						new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()).run(true, true, runnable);
						if (problem_count == 0) {
							Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
							MessageBox diag = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.ICON_WORKING | SWT.OK);
							diag.setMessage("Checking finished with no errors.");
							diag.open();
						}
						else {
							Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
							MessageBox diag = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.ICON_WORKING | SWT.OK);
							diag.setMessage("Checking finished with " + problem_count +" errors.");
							diag.open();
						}
						
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}
	
	private ArtifactElement getCitedArtifactElement(ModelElement modelElement) {
		ModelElement cited = (ModelElement) modelElement.getCitedElement();
		if (cited == null) {
			return (ArtifactElement) cited;
		}
		while (cited.getCitedElement() != null) {
			cited = (ModelElement) cited.getCitedElement();
		}
		return (ArtifactElement) cited;
	}
	
	protected String getImplementationConstraint(ModelElement modelElement, int index) {
		return modelElement.getImplementationConstraint().get(index).getContent().getValue().get(0).getContent();
	}

}
