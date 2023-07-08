package gsn.diagram.sheet.util;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.acme.scala.util.IsabelleAgent;
import org.eclipse.acme.scala.util.IsabelleError;
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
import org.eclipse.emf.ecore.EObject;
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

import acme.diagram.util.ModelElementFeatureUtil;
import acme.execution.egl.EGLUtilityMethods;
import base.ModelElement;
import gsn.diagram.edit.parts.GsnEditPart;
import gsn.diagram.part.ValidateAction;
import gsn.diagram.providers.GsnMarkerNavigationProvider;

public class CheckIsabelleHandler implements IHandler {

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
		
		IsabelleAgent agent = new IsabelleAgent();
		
		problem_count = 0;		

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
							String isabellePath= System.getenv("ISABELLE_ROOT");
							
							GsnEditPart targetEditPart = (GsnEditPart) element;
							ModelElement modelElement = (ModelElement) targetEditPart.resolveSemanticElement();

							try {
								subMonitor.setTaskName("Generating theory file...");
								subMonitor.split(10);
								
								EGLUtilityMethods.createTheoryFile(modelElement, ModelElementFeatureUtil.getName(modelElement), isabellePath+"\\src\\HOL\\ex\\");
								HashMap<Integer, EObject> map = EGLUtilityMethods.getMap();
								
								subMonitor.setTaskName("Contacting Isabelle server...");
								subMonitor.split(10);
								
								agent.init();
								
								subMonitor.setTaskName("Isabelle server started...");
								subMonitor.split(10);

								subMonitor.setTaskName("Locating theory file...");
								subMonitor.split(10);
								agent.setTheoryFilepath("~~/src/HOL/ex/" + ModelElementFeatureUtil.getName(modelElement));
								
								subMonitor.setTaskName("Starting session with theory file...");
								subMonitor.split(5);
								
								subMonitor.setTaskName("Checking theory file...");
								subMonitor.split(5);
								
								agent.validate();
								
								subMonitor.setTaskName("Validation finished, parsing responses...");
								subMonitor.split(10);
								
								int nStatus = agent.getStatus();
								problem_count += nStatus;
								
								subMonitor.setTaskName("Found "+ nStatus + " problems...");
								subMonitor.split(30);
								
				        		// print error messages
				        		for (int i = 0; i < nStatus; i++) {
				        			IsabelleError error = agent.getError(i);
				        			int line = error.getLine();
				        			ModelElement _element = (ModelElement) map.get(new Integer(line-1));
				        			int severity = 0;
				        			severity = Diagnostic.ERROR;
				        			String message = error.getErrorMsg();

				        			BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(modelElement);
				        			diagnostic.add(new BasicDiagnostic(severity, "org.eclipse.acme.sacm.diagram.gsn", 0, "" + message, new Object[] {_element}));

				        			subMonitor.setTaskName("Problem "+ i + ": " + error.getErrorMsg() + "...");
									ValidateAction.createMarkers(file, diagnostic, targetEditPart);
				        		}
							} catch (Exception e) {
//								Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//								MessageBox diag = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.ICON_ERROR | SWT.OK);
//								diag.setMessage("Something went wrong..." + "\n" + e.getMessage());
//								diag.open();
								e.printStackTrace();
							}
							finally {
								subMonitor.setTaskName("Shutting down Isabelle server...");
								subMonitor.split(10);
								agent.shutdown();
							}
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

}
