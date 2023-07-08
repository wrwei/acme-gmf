package org.eclipse.acme.hawk.integration;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.hawk.core.IModelIndexer;
import org.eclipse.hawk.core.IVcsManager;
import org.eclipse.hawk.core.runtime.LocalHawkFactory;
import org.eclipse.hawk.localfolder.LocalFolder;
import org.eclipse.hawk.osgiserver.HModel;
import org.eclipse.hawk.ui2.util.HUIManager;
import org.osgi.service.prefs.BackingStoreException;

public class HawkInstanceCreator {

	protected HUIManager hawkManager = HUIManager.getInstance();
	
	protected HModel hawkInstance;
	protected String dbfolder;
	protected String indexFolder;

	protected LocalHawkFactory factory;
	ArrayList<String> plugins;
	
	public HawkInstanceCreator(String dbfolder, String indexFolder) throws Exception {
		
		factory= new LocalHawkFactory();
		plugins = new ArrayList<>();
		plugins.add("org.eclipse.hawk.emf.metamodel.EMFMetaModelResourceFactory");
		plugins.add("org.eclipse.hawk.emf.metamodel.EMFModelParser");
		plugins.add("org.eclipse.hawk.epsilon.emc.EOLQueryEngine");
		plugins.add("org.eclipse.hawk.graph.updater.GraphModelUpdater");
		plugins.add(new ACMEGraphChangeListener().getType());
		plugins.add(new IsabelleResourceFactory().getType());
		this.dbfolder = dbfolder;
		this.indexFolder = indexFolder;
	}
	
	public void init() {
		try {
//			String orient = "org.eclipse.hawk.orientdb.OrientDatabase";
			String greycat = "org.eclipse.hawk.greycat.LevelDBGreycatDatabase";
			hawkInstance = HModel.create(factory, "acme_hawk", new File(dbfolder), "http://localhost:8080/thrift/hawk/tuple", greycat, 
					plugins, hawkManager, hawkManager.getCredentialsStore(), 5000, 12000);

			IModelIndexer indexer = hawkInstance.getIndexer();
			IVcsManager vcs = new LocalFolder();
			vcs.init(indexFolder, indexer);
			vcs.run();
			indexer.addVCSManager(vcs, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void teardown() {
		try {
			hawkInstance.delete();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
