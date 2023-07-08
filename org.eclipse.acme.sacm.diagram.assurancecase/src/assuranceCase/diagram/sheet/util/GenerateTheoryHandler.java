/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package assuranceCase.diagram.sheet.util;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.eclipse.ui.part.FileEditorInput;

import acme.diagram.util.ModelElementFeatureUtil;
import acme.execution.egl.EGLUtilityMethods;
import assuranceCase.diagram.edit.parts.ModuleEditPart;
import base.ModelElement;

public class GenerateTheoryHandler implements IHandler {

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
		IPath file_path = ((FileEditorInput)input).getPath();
		
		file_path = file_path.removeLastSegments(1);
		String project_name = file_path.lastSegment();

		String path = file_path.toOSString();
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				if (element instanceof ModuleEditPart) {
					ModuleEditPart targetEditPart = (ModuleEditPart) element;
					ModelElement modelElement = (ModelElement) targetEditPart.resolveSemanticElement();
					try {
						EGLUtilityMethods.createTheoryFile(modelElement, ModelElementFeatureUtil.getName(modelElement), path);
						
						// show OK window
						Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						MessageBox diag = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.ICON_WORKING | SWT.OK);
						diag.setMessage("Theory file is successfully generated as: " + path + "\\" + ModelElementFeatureUtil.getName(modelElement) + ".thy");
						diag.open();
					} catch (Exception e) {
						// show failed window
						Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						MessageBox diag = new MessageBox(shell, SWT.APPLICATION_MODAL | SWT.ICON_ERROR | SWT.OK);
						diag.setMessage("Theory file failed to generate");
						diag.open();
					}
					finally {
						IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
						IProject project = workspaceRoot.getProject(project_name);
						try {
							project.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
						} catch (CoreException e) {
							e.printStackTrace();
						}

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
