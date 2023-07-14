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
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.spreadsheets.SpreadsheetModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.execution.evl.ACMEEVLValidator;
import acme.execution.evl.EOLExecutor;
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
		AssuranceCasePackage assuranceCasePackage = null;
//		Use different models for different extensions
//		#######################################################################################################
		//create EMF model with target location
		//Identify the suffix name of the file.
//		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
		SpreadsheetModel spreadsheetModel = null;
		EmfModel emfmodel = null;
		ResourceSet resourceSet = new ResourceSetImpl();

		if (path.substring(path.length()-5).contains(".xlsx")) {
//---------------------------------E-----------------------------------------
			try {
			spreadsheetModel = UtilityMethods.createAndLoadSpreadsheetModel(
					path,
					"E",
					"readOnLoad",
					"storeOnDisposal");
			System.out.println("E ok!");
//---------------------------------M-----------------------------------------
			AssuranceCase_Package.eINSTANCE.eClass();
			Registry reg = Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("assurancecase", new XMIResourceFactoryImpl());
//			EOLExecutor executor = new EOLExecutor();
//			executor.initialise("M", "org.eclipse.acme.sacm.diagram.assurancecase");
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
//----------------------------files2gsn.eol---------------------------------------
			//load Excel model with location
			ArrayList<IModel> list = new ArrayList();
			list.add(emfmodel);
			list.add(spreadsheetModel);
			try {
				UtilityMethods.doEOLTransformation(list, EVLUtilityMethods.getFiles2GSNEol().getPath());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			
//			Resource eolresource = resourceSet.getResource(URI.createFileURI("C:\\Users\\yangr\\Git\\acme-new\\org.eclipse.acme.diagram.extension.execution\\files\\files2gsn.eol"), true);
//			
//			InMemoryEmfModel model = new InMemoryEmfModel(eolresource);
//			model.setName("M");
//			EolModule module = new EolModule();
//			module.parse();
//			module.getContext().getModelRepository().addModel(spreadsheetModel);
//			module.getContext().getModelRepository().addModel(emfmodel);
//			module.execute();
//			resource.save(...);
			System.out.println("EOL ok!");
//----------------------------files2gsn.eol---------------------------------------
			
//				System.out.println(spreadsheetModel);
//			ACMEEVLValidator validator = new ACMEEVLValidator();
//			try {
//				validator.initialise(EVLUtilityMethods.getScriptURIfiles2gsn(), "M", "org.eclipse.acme.sacm.diagram.assurancecase");
//			} catch (URISyntaxException e) {
//				e.printStackTrace();
//			}
			
			
//				FileDialog eolfileDialog = new FileDialog(Display.getCurrent().getActiveShell());
//				eolfileDialog.setText("Locate .eol file");
//				String eolpath = eolfileDialog.open();
//				if (eolpath == null) {
//					return null;
//				}
//				System.out.println(eolpath);
//				
//				
//				
//				try {
//					ArrayList<IModel> list = new ArrayList();
//					list.add(spreadsheetModel);
//					list.add(emfmodel);
//					UtilityMethods.doEOLTransformation(list, eolpath);
//					System.out.println("eol over!");
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				
//				
			assuranceCasePackage = (AssuranceCasePackage) emfmodel.getModelImpl().getContents().get(0);
			
			
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
			
			} catch (EolModelLoadingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EolRuntimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if (path.substring(path.length()-5).contains(".xml")) {
			
		} else if (path.substring(path.length()-5).contains(".csv")) {
			
		}
		
		
//		perform transformation
//		UtilityMethods.doEOLTransformation(null, path);
//		emfmodel = 
//				Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
//		AssuranceCasePackage assuranceCasePackage = (AssuranceCasePackage) resource.getContents().get(0);
//		#######################################################################################################
//		path = "C:\\Users\\yangr\\Git\\acme-new\\org.eclipse.acme.diagram.extension.execution\\files\\files2gsn.model";
//		//register AssuranceCasePackage metamodel
//		System.out.println(path);
//		AssuranceCase_Package.eINSTANCE.eClass();
//		Registry reg = Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("assurancecase", new XMIResourceFactoryImpl());
		
//		ResourceSet resourceSet = new ResourceSetImpl();
		
//		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
//		assuranceCasePackage = (AssuranceCasePackage) resource.getContents().get(0);
		
	
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
