package acme.execution.egl;

import java.io.File;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplate;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.types.EolAnyType;

import acme.execution.activator.Activator;

public class EGLUtilityMethods {
	
	static private EGLUtilityMethods instance = new EGLUtilityMethods();
	static private HashMap<Integer, EObject> map = new HashMap<Integer, EObject>();
	
	private EGLUtilityMethods() {}
	
	public static EGLUtilityMethods getInstance() {
		return instance;
	}
	
	public static void cleanMap() {
		map.clear();
	}
	
	public static HashMap<Integer, EObject> getMap() {
		return map;
	}

//	public static void createTheoryFile(String theSelectedFilePath, String moduleName, String theDestinationIProjectFolder, IProject theSelectedFileParentIProject) throws Exception {
//		//emf source
//		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");
//
//		//egl factory and module
//		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
//		EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
//
//		eglModule.getContext().getModelRepository().addModel(sourceModel);
//
//		java.net.URI EglFile = Activator.getDefault().getBundle().getResource("files/Module2Theory.egl").toURI();
//
//		EglFileGeneratingTemplate template = (EglFileGeneratingTemplate) factory.load(EglFile);
//		template.process();
//		File target = new File(theDestinationIProjectFolder + File.separator + "src" + File.separator + "util" + File.separator
//				+ moduleName + ".thy");
//		target.createNewFile();
//		template.generate(target.toURI().toString());
//	}
	
	public static void createTheoryFile(EObject selectedElement, String moduleName, String theDestinationIProjectFolder) throws Exception {
		//emf source
		EmfModel sourceModel = loadInMemoryEMFModel("GSN", "true", "false", selectedElement.eResource(), "http://omg.sacm/2.0/argumentation", 
				"http://omg.sacm/2.0/artifact",
				"http://omg.sacm/2.0/terminology",
				"http://omg.sacm/2.0/assurancecase",
				"http://omg.sacm/2.0/base",
				"http://org.eclipse.acme/1.0/gsn");
				
		//egl factory and module
		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		

		eglModule.getContext().getModelRepository().addModel(sourceModel);

		java.net.URI EglFile = Activator.getDefault().getBundle().getResource("files/Module2Theory.egl").toURI();
		
		Variable module = new Variable("module", selectedElement, EolAnyType.Instance);
		Variable v = new Variable("map", map, EolAnyType.Instance);
		eglModule.getContext().getFrameStack().putGlobal(module);
		eglModule.getContext().getFrameStack().putGlobal(v);



		EglFileGeneratingTemplate template = (EglFileGeneratingTemplate) factory.load(EglFile);
		template.process();
		File target = new File(theDestinationIProjectFolder + File.separator + moduleName + ".thy");
		target.createNewFile();
		template.generate(target.toURI().toString());
	}

	private static EmfModel loadInMemoryEMFModel(String modelName, String readOnLoad, String storeOnDisposal, Resource modelFile, String... nsuris) throws EolModelLoadingException {
		InMemoryEmfModel theModel = new InMemoryEmfModel(modelName, modelFile, nsuris);
//		StringProperties properties = new StringProperties();
		return theModel;
	}

}
