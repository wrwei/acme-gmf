/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.execution.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.acme.scala.util.IsabelleAgent;
import org.eclipse.acme.scala.util.IsabelleError;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.csv.CsvModel;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.emf.xml.XmlModel;
import org.eclipse.epsilon.emc.spreadsheets.SpreadsheetModel;
import org.eclipse.epsilon.emc.spreadsheets.excel.ExcelModel;
import org.eclipse.epsilon.emf.dt.EmfRegistryManager;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import acme.execution.activator.Activator;
import artifact.ArtifactAsset;
import artifact.Property;
import base.SACMElement;

public class UtilityMethods {

	protected static IFile current_selection;
	protected String metamodel_uri;
	protected String model_uri;
	private static List<Object> metamodels = new ArrayList<Object>();
	protected static HashSet<IResource> resourcePool = new HashSet<>();

	protected String text_query;

	String project_name;

	// progress monitor
	IProgressMonitor progressMonitor = new NullProgressMonitor();

	// get current workspace
	IWorkspace workspace = ResourcesPlugin.getWorkspace();

	// get root of workspace
	IWorkspaceRoot root = workspace.getRoot();

	IProject project;

	public UtilityMethods(String theSelectedFilePath) {
	}

	public static IFile getCurrent_selection() {
		return current_selection;
	}

	public static void setCurrent_selection(IFile current_selection) {
		UtilityMethods.current_selection = current_selection;
	}

	public static String executeQuery(SACMElement citedElement, String query) throws Exception {
		// FIXME: getArtifactProperty returns a list. In this implementation we assume
		// the query model is the first property.
		Property theProperty = ((ArtifactAsset) citedElement).getArtifactProperty().get(0);
		String referencedModelPath = theProperty.getDescription().getContent().getValue().get(0).getContent();

		Collection<EPackage> ePackages = findEPackages(referencedModelPath);
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}
		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.out.println(metamodelsString);
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, referencedModelPath, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}

	public static String executeQuery(EObject obj, String query, String... mmuri) throws Exception {
		// FIXME: getArtifactProperty returns a list. In this implementation we assume
		// the query model is the first property.

//		URI uri = EcoreUtil.getURI(obj);
//		
//		uri = uri.trimFragment();
//		URI resolved = CommonPlugin.resolve(uri);
//		String referencedModelPath = resolved.toFileString();

		EmfModel theReferencedEMFModel = loadInMemoryEMFModel("M", "true", "true", obj.eResource(), mmuri);
		String result = runStringEOLQuery(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}

	public static String executeQuery(String referencedModelPath, String query) throws Exception {
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String absolutePath = projectlocation + referencedModelPath;

		if (query.equals("Isabelle")) {
			String isabellePath = System.getenv("ISABELLE_ROOT");
			File source = new File(absolutePath);
			File target = new File(isabellePath + "\\src\\HOL\\ex\\" + source.getName());
			String problem = "true";

			copyFileUsingStream(source, target);
			IsabelleAgent agent = new IsabelleAgent();
			agent.init();
			agent.setTheoryFilepath("~~/src/HOL/ex/" + target.getName().substring(0, target.getName().length() - 4));
			try {
				agent.validate();
			} catch (Exception e) {
				target.delete();
				agent.shutdown();
				problem = "false";
			}

			int nStatus = agent.getStatus();
			for (int i = 0; i < nStatus; i++) {
				problem = "Isabelle validation problems: \n";
				IsabelleError error = agent.getError(i);
				String message = error.getErrorMsg();
				problem += message + "\n";
			}
			target.delete();
			agent.shutdown();
			return problem;
		} else if (query.contains("return")) {
			Collection<EPackage> ePackages = findEPackages(absolutePath);
			if (ePackages.size() > 0) {
				for (EPackage ePkg : ePackages) {
					final URI uri = URI.createURI(ePkg.getNsURI());
					if (!metamodels.contains(uri)) {
						metamodels.add(uri);
					}
				}
			}
			String metamodelsString = "";
			for (Object mm : metamodels) {
				metamodelsString = metamodelsString + mm.toString() + ", ";
			}
			metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
			System.out.println(metamodelsString);
			EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, absolutePath, "M", "true",
					"false");
			String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
			System.out.println("Result: " + result);
			return result;
		} else {
			return "false";
		}
	}
	
	public static String executeQuerySpreadsheet(String referencedModelPath, String query) throws Exception {
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String absolutePath = projectlocation + referencedModelPath;

		if (query.contains("return")) {
			SpreadsheetModel model = createAndLoadSpreadsheetModel(absolutePath, "M", "true", "false");
			String result = runStringEOLQueryOnOneModel(model, query).toString();
			System.out.println("Result: " + result);
			return result;
		} else {
			return "false";
		}
	}

	public static String executeQuery(String doc_path, String metadata_path, String query) throws Exception {

		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String doc_absolute_path = projectlocation + doc_path;
		String metadata_absolute_path = projectlocation + metadata_path;

//		registerMetamodel(metadata_path);
		Collection<EPackage> ePackages = registerMetamodel(metadata_absolute_path);
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}

		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.out.println(metamodelsString);
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, doc_absolute_path, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}

	public static String getAbsoluteProjectPath() {
		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		return projectlocation;
	}
	
/*
  	public static EvlModule generateEvlModule(Resource resource) throws Exception {
		java.net.URI cnl2evl = new ResourceFinder().findResource("evl_interpreter_generator.egl");
		java.net.URI cnl2evlutils = new ResourceFinder().findResource("utils.eol");
		EmfModel sourceModel = null;
		InputStream migration = UtilityMethods.class.getClassLoader().getResourceAsStream("org/eclipse/acme/model/epsilon/migration.eol");
		InputStream mappingmm = UtilityMethods.class.getClassLoader().getResourceAsStream("org/eclipse/acme/model/mapping.ecore");
//		InputStream mappingm = UtilityMethods.class.getClassLoader().getResourceAsStream("org/eclipse/acme/model/mapping.model");
		try {
			LazyLinkingResource r = (LazyLinkingResource) resource;
			r.resolveLazyCrossReferences(null);
			sourceModel = loadInMemoryEMFModel("sourceModel", "true", "false", r, "http://org.eclipse.acme/cnl");
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (sourceModel != null) {
			
			sourceModel.getAliases().add("sm");
			//add the config metamodel and model (MAPPING)
			//mapping mm rs
			ResourceSet rs = new ResourceSetImpl();
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

			Resource mappingMMResource = rs.createResource(URI.createPlatformPluginURI("mappingmmresource", true));
			mappingMMResource.load(mappingmm, null);

			// TODO check that this is a package as this is very specific to current metamodel
			EPackage mappingpackage = (EPackage) mappingMMResource.getContents().get(0);

			//mapping m rs
			ResourceSet rs2 = new ResourceSetImpl();
			rs2.getPackageRegistry().put(mappingpackage.getNsURI(), mappingpackage);

			rs2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			rs2.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

			URL url = UtilityMethods.class.getClassLoader().getResource("org/eclipse/acme/model/mapping.model");
			URI uri = URI.createURI(url.toString());
			Resource mappingResource = rs2.createResource(uri);
			mappingResource.load(null);

			System.out.println("mappingResource loaded: " + mappingMMResource.isLoaded());
			EmfModel mappingModel = new InMemoryEmfModel("mappingModel", mappingResource, Collections.singleton(mappingpackage));

			
			//target m rs
			ResourceSet rs3 = new ResourceSetImpl();
			rs3.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			rs3.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

			Resource xmiResource = rs3.createResource(URI.createURI("plainxmitargetmodelresource.xmi"));
			// xmiResource.save(null)		
			EmfModel targetModel = new InMemoryEmfModel("targetModel", xmiResource, Collections.singleton(CnlPackage.eINSTANCE));
			targetModel.getAliases().add("tm");

			EcoreUtil.resolveAll(sourceModel.getResource());
			
			// println(targetModel.allContents)
			EolModule eolModule = new EolModule();
			eolModule.getContext().getModelRepository().addModel(sourceModel);
			eolModule.getContext().getModelRepository().addModel(mappingModel);
			eolModule.getContext().getModelRepository().addModel(targetModel);
			eolModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());

			//execute migration
			String code = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(migration, "UTF-8"));
			for (var x = br.readLine(); x != null; x = br.readLine())
				code += x + "\n";

			eolModule.parse(code);
			if (!eolModule.getParseProblems().isEmpty()) {
				throw new EolRuntimeException("Parsing problems in the EOL code: " + eolModule.getParseProblems());
			}
			eolModule.execute();
			targetModel.clearCache();

			// use (transformed) rules alongside mapping model to create an executable EVL script using EGL
			var factory = new EglFileGeneratingTemplateFactory();
			var eglModule = new EglTemplateFactoryModuleAdapter(factory);

			eglModule.parse(cnl2evl);

			if (!eglModule.getParseProblems().isEmpty()) {
				throw new EolRuntimeException("Parsing problems in the EGL code: " + eglModule.getParseProblems());
			}

			var context = eglModule.getContext();
			targetModel.getAliases().add("Model");
			context.getModelRepository().addModel(targetModel);
			mappingModel.getAliases().add("mappingmodel");
			context.getModelRepository().addModel(mappingModel);

			String cnl2evlutilsvar = "utilsEOLPath";
			cnl2evlutils = new ResourceFinder().findResource("utils.eol");
			
			// println(mappingModel.allContents)
			context.getFrameStack().putGlobal(
				new Variable(cnl2evlutilsvar, cnl2evlutils, EolPrimitiveType.String));
			String generated_evl = eglModule.execute().toString();
			code = eglModule.execute().toString();
			context.dispose();
			context.getModelRepository().dispose();

			System.out.println("\n" + code);

			var evlModule = new EvlModule();
			evlModule.parse(code + "");
			if (!evlModule.getParseProblems().isEmpty()) {
				throw new EolRuntimeException("Parsing problems in the generated EVL code: " +
					evlModule.getParseProblems());
			}

			// workaround for compatibility with 1.4.0 stable epsilon version (later
			// versions handle this properly)
//			for (ConstraintContext c : evlModule.getConstraintContexts())
//				c.setModule(evlModule);

			return evlModule;

		}
		return null;
	}
	*/

	/*
	public static String executeQuery(String doc_path, String metadata_path, Resource input_resource) throws Exception {

		// getting the absolute path
		String projectlocation = getAbsoluteProjectPath();
		String doc_absolute_path = projectlocation + doc_path;
		String metadata_absolute_path = projectlocation + metadata_path;

//		registerMetamodel(metadata_path);
		Collection<EPackage> ePackages = registerMetamodel(metadata_absolute_path);
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}

		EvlModule evlModule = generateEvlModule(input_resource);
		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.out.println(metamodelsString);
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, doc_absolute_path, "M", "true",
				"false");
		evlModule.getContext().getModelRepository().addModel(theReferencedEMFModel);
		theReferencedEMFModel.getAliases().add("Model");
		evlModule.execute();
		String result = "false";
		if (evlModule.getContext().getUnsatisfiedConstraints().size() == 0) {
			result = "true";
		}
//		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
//		System.out.println("Result: " + result);
		return result;
	}
	*/

	public static EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties, (IRelativePathResolver) null);
		return theModel;
	}
	
	public static SpreadsheetModel createAndLoadSpreadsheetModel(String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal)
			throws EolModelLoadingException {
		ExcelModel model = new ExcelModel();
//		model.setSpreadsheetFile(modelFile);
		StringProperties properties = new StringProperties();
		properties.put(ExcelModel.SPREADSHEET_FILE, modelFile);
		properties.put(ExcelModel.PROPERTY_NAME, modelName);
		properties.put(ExcelModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(ExcelModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		model.load(properties);
		return model;
	}
	public static SpreadsheetModel createAndLoadSpreadsheetModel(String modelFile, String modelName)
			throws EolModelLoadingException {
		ExcelModel model = new ExcelModel();
		StringProperties properties = new StringProperties();
		properties.put(ExcelModel.SPREADSHEET_FILE, modelFile);
		properties.put(ExcelModel.PROPERTY_NAME, modelName);
		properties.put(ExcelModel.PROPERTY_READONLOAD, "readOnLoad");
		properties.put(ExcelModel.PROPERTY_STOREONDISPOSAL, "storeOnDisposal");
		model.load(properties);
		return model;
	}
	
	public static CsvModel createAndLoadCSVModel(String modelFile, String modelName)
			throws EolModelLoadingException {
		CsvModel model = new CsvModel();
		StringProperties properties = new StringProperties();
		properties.put(ExcelModel.SPREADSHEET_FILE, modelFile);
		properties.put(ExcelModel.PROPERTY_NAME, modelName);
		properties.put(ExcelModel.PROPERTY_READONLOAD, "readOnLoad");
		properties.put(ExcelModel.PROPERTY_STOREONDISPOSAL, "storeOnDisposal");
		model.load(properties);
		return model;
	}
	
	public static XmlModel createAndLoadXMLModel(String modelFile, String modelName)
			throws EolModelLoadingException {
		XmlModel model = new XmlModel();
		StringProperties properties = new StringProperties();
		properties.put(ExcelModel.SPREADSHEET_FILE, modelFile);
		properties.put(ExcelModel.PROPERTY_NAME, modelName);
		properties.put(ExcelModel.PROPERTY_READONLOAD, "readOnLoad");
		properties.put(ExcelModel.PROPERTY_STOREONDISPOSAL, "storeOnDisposal");
		model.load(properties);
		return model;
	}

	public static EmfModel loadInMemoryEMFModel(String modelName, String readOnLoad, String storeOnDisposal,
			Resource modelFile, String... nsuris) throws EolModelLoadingException {
		InMemoryEmfModel theModel = new InMemoryEmfModel(modelName, modelFile, nsuris);
		theModel.setReadOnLoad(false);
		theModel.setStoredOnDisposal(true);
		theModel.allContents().clear();
		return theModel;
	}

	public EmfMetaModel createAndLoadAnEmfMetaModel(String metamodelUri, String modelName, String readOnLoad,
			String storeOnDisposal) throws EolModelLoadingException {
		EmfMetaModel metamodel = new EmfMetaModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, metamodelUri);
		properties.put(EmfMetaModel.PROPERTY_NAME, modelName);
		properties.put(EmfMetaModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		metamodel.load(properties, (IRelativePathResolver) null);
		return metamodel;
	}

	public void doTheETLTransformation(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		EtlModule etlModule = new EtlModule();
		for (IModel theModel : allTheModels) {
			etlModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI etlFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		etlModule.parse(etlFile);
		etlModule.execute();
		etlModule.getContext().getModelRepository().dispose();
	}

	public String runEOLQuery(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		String ret = "";
		EolModule eolModule = new EolModule();
		for (IModel theModel : allTheModels) {
			eolModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI eolFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		eolModule.parse(eolFile);
		Object object = eolModule.execute();
		System.out.println(object);
		return ret;
	}

	public static String runStringEOLQueryOnOneModel(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
//		if (!query.endsWith(";")) {
//			query = query + ";";
//		}
		try {
			eolModule.parse(query);
//			eolModule.parse("return " +  query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}

		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		System.out.println("Result: " + result);
		eolModule.getContext().getModelRepository().dispose();
		if (result != null) {
			return result.toString();
		}
		else {
			return "null";
		}
		
	}

	public static String runStringEOLQuery(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
		try {
			eolModule.parse(query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}

		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		return "";
	}

	public String performEVLTransformation(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		String ret = null;
		EvlModule evlModule = new EvlModule();
		for (IModel theModel : allTheModels) {
			evlModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI evlFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		evlModule.parse(evlFile);
		evlModule.execute();
		if (evlModule.getContext().getUnsatisfiedConstraints().size() > 0) {
			ret = evlModule.getContext().getUnsatisfiedConstraints().toString();
		}
		evlModule.getContext().getModelRepository().dispose();
		return ret;
	}

	public static void doEOLTransformation(ArrayList<IModel> allTheModels, String theFile, String fileType) throws Exception {
		EolModule eolModule = new EolModule();
		for (IModel theModel : allTheModels) {
			eolModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI etlFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		eolModule.parse(etlFile);
		eolModule.getContext().getFrameStack().put(Variable.createReadOnlyVariable("fileType", fileType));
		eolModule.execute();
		//eolModule.getContext().getModelRepository().dispose();
	}

	public void doTheUsersETLTransformation(ArrayList<IModel> allTheModels, final String theFile,
			IProject theSelectedFileParentIProject) throws Exception {
		File dir = new File(
				theSelectedFileParentIProject.getLocation().toOSString() + File.separator + "transformations");
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.equals(theFile);
			}
		};
		String[] children = dir.list(filter);
		if (children == null) {
			System.out.println("Either dir does not exist or is not a directory");
		} else if (children.length > 0) {
			EtlModule etlModule = new EtlModule();
			for (IModel theModel : allTheModels) {
				etlModule.getContext().getModelRepository().addModel(theModel);
			}
			File etlFile = new File(theSelectedFileParentIProject.getLocation().toOSString() + File.separator
					+ "transformations" + File.separator + children[0]);
			etlModule.parse(etlFile);
			etlModule.execute();
			etlModule.getContext().getModelRepository().dispose();
		}
	}

	public void refresh(IProject parentProject) throws CoreException {
		parentProject.refreshLocal(1, null);
	}

	public static Collection<EPackage> findEPackages(String resourceLocation) {
		registerMetamodels();

		Set<EPackage> ePackages = new HashSet<EPackage>();

		try {
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(URI.createFileURI(resourceLocation));
			r.load(null);
			EcoreUtil.resolveAll(r);
			for (Resource res : rs.getResources()) {
				Iterator<EObject> it = res.getAllContents();
				while (it.hasNext()) {
					ePackages.add(EmfUtil.getTopEPackage(it.next().eClass().getEPackage()));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ePackages;
	}

	public static Collection<EPackage> registerMetamodel(String path) {
		IFile file = getCurrentSelection();
		List<EPackage> ePackages = null;
		try {
			for (IResource r : file.getParent().members()) {
				if (path.contains(r.getName())) {
					if (r instanceof IFolder) {
						for(IResource s : ((IContainer) r).members()) {
							if (path.contains(s.getName())) {
								String filename = s.getFullPath().toOSString();
								try {
									EmfRegistryManager.getInstance().addMetamodel(filename);
									LogUtil.logInfo(filename + " registered successfully");
									ePackages = EmfUtil.register(URI.createPlatformResourceURI(filename, true),
											EPackage.Registry.INSTANCE);
								} catch (Exception ex) {
									LogUtil.log(filename + " could not be registered", ex);
								}
							}
						}
					}
					else {
						String filename = r.getFullPath().toOSString();
						try {
							EmfRegistryManager.getInstance().addMetamodel(filename);
							LogUtil.logInfo(filename + " registered successfully");
							ePackages = EmfUtil.register(URI.createPlatformResourceURI(filename, true),
									EPackage.Registry.INSTANCE);
						} catch (Exception ex) {
							LogUtil.log(filename + " could not be registered", ex);
						}
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return ePackages;
	}

	private static boolean registerMetamodels() {
		IFile file = getCurrentSelection();
		try {
			for (IResource r : file.getParent().members()) {
				if (resourcePool.contains(r)) {
					continue;
				}
				resourcePool.add(r);
				String filename = r.getFullPath().toOSString();
				try {
					EmfRegistryManager.getInstance().addMetamodel(filename);
					LogUtil.logInfo(filename + " registered successfully");
				} catch (Exception ex) {
					LogUtil.log(filename + " could not be registered", ex);
					return false;
				}
			}
			return true;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static IFile getCurrentSelection() {
		if (current_selection == null) {
			IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorPart editor = workbenchPage.getActiveEditor();
			IEditorInput input = editor.getEditorInput();
			URIEditorInput editorInput = (URIEditorInput) input;
			URI uri = editorInput.getURI();
			URI resolvedFile = CommonPlugin.resolve(uri.trimFragment());

			Path path = new Path(resolvedFile.devicePath());
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IFile file = workspace.getRoot().getFileForLocation(path);
			return file;
		} else {
			return current_selection;
		}
	}

	private static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}
}