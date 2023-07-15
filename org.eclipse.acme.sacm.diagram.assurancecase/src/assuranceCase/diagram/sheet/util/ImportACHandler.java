/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package assuranceCase.diagram.sheet.util;

import java.net.URISyntaxException;
import java.util.ArrayList;
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
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.execution.evl.EVLUtilityMethods;
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

		//create EMF model with target location
		//Identify the suffix name of the file.

		Model sourceModel = null;
		if (path.substring(path.length()-5).contains(".xlsx")) {
			try {
				sourceModel = UtilityMethods.createAndLoadSpreadsheetModel(path, "E");
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			loadOtherFile(path, event, sourceModel, "EXCEL");
		} else if (path.substring(path.length()-5).contains(".xml")) {
			try {
				sourceModel = UtilityMethods.createAndLoadXMLModel(path, "X");
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			loadOtherFile(path, event, sourceModel, "XML");
		} else if (path.substring(path.length()-5).contains(".csv")) {
			try {
				sourceModel = UtilityMethods.createAndLoadCSVModel(path, "C");
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			loadOtherFile(path, event, sourceModel, "CSV");
		} else {
			loadAssurancecaseOrModelFile(path, event);
		}
		return null;
	}

	public void loadAssurancecaseOrModelFile(String path, ExecutionEvent event) {
		AssuranceCase_Package.eINSTANCE.eClass();
		Registry reg = Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("assurancecase", new XMIResourceFactoryImpl());
		ResourceSet resourceSet1 = new ResourceSetImpl();
		Resource resource = resourceSet1.getResource(URI.createFileURI(path), true);
		AssuranceCasePackage assuranceCasePackage = (AssuranceCasePackage) resource.getContents().get(0);
		loadAssuranceCasePackage(assuranceCasePackage, event);
	}
	
	public void loadOtherFile(String path, ExecutionEvent event, Model model,
			String spreadsheetModelNameForEOL) {
		EmfModel emfmodel = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		try {
			AssuranceCase_Package.eINSTANCE.eClass();
			Registry reg = Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("assurancecase", new XMIResourceFactoryImpl());
			Resource resource = null;
			try {
				String p = EVLUtilityMethods.getGSNModel();
				resource = resourceSet.getResource(URI.createFileURI(p), true);
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				emfmodel = UtilityMethods.loadInMemoryEMFModel(
						"M",
						"false",
						"true",
						resource,
						"http://omg.sacm/2.0/assurancecase",
						"http://omg.sacm/2.0/argumentation",
						"http://omg.sacm/2.0/base",
						"http://org.eclipse.acme/1.0/gsn");
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("M ok!");
			ArrayList<IModel> list = new ArrayList();
			list.add(emfmodel);
			list.add(model);
			try {
				UtilityMethods.doEOLTransformation(list, EVLUtilityMethods.getFiles2GSNEol().getPath(), spreadsheetModelNameForEOL);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			AssuranceCasePackage assuranceCasePackage = (AssuranceCasePackage) emfmodel.getModelImpl().getContents().get(0);
			loadAssuranceCasePackage(assuranceCasePackage, event);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadAssuranceCasePackage(AssuranceCasePackage assuranceCasePackage, ExecutionEvent event) {
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
