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
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.spreadsheets.SpreadsheetModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.execution.util.UtilityMethods;
import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCase_Package;
import assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart;


public class ImportACHandler implements IHandler {

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
		FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell());
		fileDialog.setText("Locate file");
		String path = fileDialog.open();
		if (path == null) {
			return null;
		}
		
//		Use different models for different extensions
//		##########################################################
		//create EMF model with target location
		try {
			EmfModel emfmodel = UtilityMethods.createAndLoadAnEmfModel(path, path, path, path, path);
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//load Excel model with location 
		try {
			SpreadsheetModel spreadsheetModel = UtilityMethods.createAndLoadSpreadsheetModel(path, path, path, path);
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		perform transformation
//		UtilityMethods.doEOLTransformation(null, path);
//		emfmodel = 
//				Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
//		AssuranceCasePackage assuranceCasePackage = (AssuranceCasePackage) resource.getContents().get(0);
//		##########################################################
		
		AssuranceCase_Package.eINSTANCE.eClass();
		
		Registry reg = Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("assurancecase", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
		AssuranceCasePackage assuranceCasePackage = (AssuranceCasePackage) resource.getContents().get(0);
		
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();)
			{
				Object element = iterator.next();
				if (element instanceof EditPart) {
					EditPart targetEditPart = (EditPart) element;
					if (targetEditPart instanceof AssuranceCasePackageCanvasEditPart) {
						AssuranceCasePackage acp = (AssuranceCasePackage) ((AssuranceCasePackageCanvasEditPart) targetEditPart).resolveSemanticElement();
						for(AssuranceCasePackage temp: assuranceCasePackage.getAssuranceCasePackage()) {
							ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
									acp,
									AssuranceCase_Package.eINSTANCE.getAssuranceCasePackage_AssuranceCasePackage(),
									temp);
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
