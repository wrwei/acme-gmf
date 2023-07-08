package gsn.diagram.sheet.util;

import org.eclipse.acme.evaluation.framework.ValidationCentre;
import org.eclipse.acme.evaluation.framework.ValidationError;
import org.eclipse.acme.evaluation.framework.ValidationWarning;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.gsn.diagram.dialog.AddMarkerDialog;
import artifact.ArtifactPackage;
import base.ModelElement;
import gsn.diagram.edit.parts.GsnEditPart;
import gsn.diagram.edit.parts.SolutionEditPart;
import gsn.diagram.part.ValidateAction;

public class AddMarkerHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

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
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object obj = structuredSelection.getFirstElement();
			if (obj instanceof SolutionEditPart) {
				SolutionEditPart editPart = (SolutionEditPart) obj;
				try {
					String script_String = "";
					AddMarkerDialog dialog = new AddMarkerDialog(Display.getDefault().getActiveShell(), (ModelElement) editPart.resolveSemanticElement());
					dialog.create();
					if (dialog.open() == Window.OK) {
						script_String = dialog.getScript_string();
						int severity = 0;
	        			severity = Diagnostic.ERROR;
	        			String message = script_String;
	        			
						BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(editPart.resolveSemanticElement());
	        			diagnostic.add(new BasicDiagnostic(severity, "org.eclipse.acme.sacm.diagram.gsn", 0, "" + message, new Object[] {editPart.resolveSemanticElement()}));

						ValidateAction.createMarkers(file, diagnostic, (GsnEditPart)editPart.getParent());
						
						
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//editPart.refresh();
			}
		}
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
