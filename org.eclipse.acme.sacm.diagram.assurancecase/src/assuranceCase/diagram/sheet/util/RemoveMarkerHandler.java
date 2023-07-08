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
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart;

public class RemoveMarkerHandler implements IHandler {

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
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				if (element instanceof AssuranceCasePackageCanvasEditPart) {
					AssuranceCasePackageCanvasEditPart targetEditPart = (AssuranceCasePackageCanvasEditPart) element;
					
					View view = (View) targetEditPart.getModel(); 
					IFile target = view.eResource() != null ? WorkspaceSynchronizer.getFile(view.eResource()) : null;
					if (target != null) {
						assuranceCase.diagram.providers.AssurancecaseMarkerNavigationProvider.deleteMarkers(target);
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
