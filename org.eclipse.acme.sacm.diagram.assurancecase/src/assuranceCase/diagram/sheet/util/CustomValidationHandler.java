/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package assuranceCase.diagram.sheet.util;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.execution.evl.ACMEEVLValidator;
import assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart;
import assuranceCase.diagram.part.ValidateAction;
import base.ImplementationConstraint;
import base.ModelElement;

public class CustomValidationHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
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
					
					IRunnableWithProgress runnable = new IRunnableWithProgress() {
						
						@Override
						public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
							
							ACMEEVLValidator validator = new ACMEEVLValidator();
							
							int size = modelElement.getImplementationConstraint().size();
							SubMonitor subMonitor = SubMonitor.convert(monitor, 100*(size-1));
							
							for(int i = 1; i < size; i++) {
								ImplementationConstraint constraint = modelElement.getImplementationConstraint().get(i);
								String osString = constraint.getContent().getValue().get(0).getContent();
								File file = new File(osString);

								subMonitor.setTaskName("Performing Validation "+ i +"...");

								validator.initialise(file.toURI(), "M", "org.eclipse.acme.sacm.diagram.assurancecase");
								subMonitor.split(10);

								BasicDiagnostic diagnostic = Diagnostician.INSTANCE.createDefaultDiagnostic(modelElement);
								
								subMonitor.split(60);
								validator.validate(modelElement.eClass(), modelElement, diagnostic, Diagnostician.INSTANCE.createDefaultContext());
								
								subMonitor.split(20);

								View view = (View) targetEditPart.getModel(); 
								
								IFile target = view.eResource() != null ? WorkspaceSynchronizer.getFile(view.eResource()) : null;
								if (target != null) {
									assuranceCase.diagram.providers.AssurancecaseMarkerNavigationProvider.deleteMarkers(target);
								}
								
								ValidateAction.createMarkers(target, diagnostic, targetEditPart);
								
								subMonitor.split(10);
							}
						}
					};
					
					try {
						new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()).run(true, true, runnable);
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
