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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.common.diagram.dialog.DialogHelper;
import assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart;
import base.ModelElement;

public class ShowPropertiesHandler implements IHandler {

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
					ModelElement modelElement = (ModelElement) targetEditPart.resolveSemanticElement();
					DialogHelper.handleElement(targetEditPart.getEditingDomain(), modelElement);
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
