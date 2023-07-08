package org.eclipse.acme.hawk.integration;

import java.io.File;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.hawk.core.IModelIndexer;
import org.eclipse.hawk.core.IModelIndexer.ShutdownRequestType;
import org.eclipse.hawk.core.graph.IGraphDatabase;
import org.eclipse.hawk.core.query.InvalidQueryException;
import org.eclipse.hawk.core.query.QueryExecutionException;
import org.eclipse.hawk.core.runtime.ModelIndexerImpl;
import org.eclipse.hawk.core.security.FileBasedCredentialsStore;
import org.eclipse.hawk.core.util.DefaultConsole;
import org.eclipse.hawk.emf.metamodel.EMFMetaModelResourceFactory;
import org.eclipse.hawk.emf.model.EMFModelResourceFactory;
import org.eclipse.hawk.epsilon.emc.EOLQueryEngine;
import org.eclipse.hawk.graph.updater.GraphMetaModelUpdater;
import org.eclipse.hawk.graph.updater.GraphModelUpdater;
import org.eclipse.hawk.greycat.LevelDBGreycatDatabase;
import org.eclipse.hawk.localfolder.LocalFolder;
import org.eclipse.hawk.workspace.Workspace;

public class HawkIndexCreator_deprecated {

	protected DefaultConsole console;
	protected IModelIndexer indexer;
	protected EOLQueryEngine queryEngine;
	protected IGraphDatabase db;

	/**
	 * Base directory for all the resources.
	 */
	protected File baseDir;

	public HawkIndexCreator_deprecated(File baseDir) {
		this.baseDir = baseDir;
	}
	
	public static void main(String[] args) {
		HawkIndexCreator_deprecated creator = new HawkIndexCreator_deprecated(new File("model"));
		try {
			creator.setup();
			creator.requestFolderIndex(new File("model"));
			//creator.eol("SACMElement.all().println();");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setup() throws Throwable {
		if (indexer != null) {
			// Might have been invoked by a rule before
			return;
		}
		final File dbFolder = new File(baseDir, "acme_hawkdb");
		dbFolder.mkdir();
		console = new DefaultConsole();
		db = new LevelDBGreycatDatabase();
		db.run(dbFolder, console);
		final FileBasedCredentialsStore credStore = new FileBasedCredentialsStore(new File("keystore"),
				"admin".toCharArray());
		indexer = createIndexer(baseDir, credStore);
		indexer.addMetaModelResourceFactory(new EMFMetaModelResourceFactory());
		indexer.addModelResourceFactory(new EMFModelResourceFactory());
		queryEngine = new EOLQueryEngine();
		indexer.addQueryEngine(queryEngine);
		indexer.setMetaModelUpdater(new GraphMetaModelUpdater());
		indexer.addModelUpdater(createModelUpdater());
		indexer.setDB(db, true);
		indexer.init(0, 0);
	}

	protected IModelIndexer createIndexer(final File indexerFolder, final FileBasedCredentialsStore credStore) {
		return new ModelIndexerImpl("test", indexerFolder, credStore, console);
	}

	protected GraphModelUpdater createModelUpdater() {
		return new GraphModelUpdater();
	}

	public void teardown() throws Exception {
		indexer.shutdown(ShutdownRequestType.ALWAYS);
		db.delete();
	}

	protected LocalFolder requestFolderIndex(final File folder) throws Exception {
		final LocalFolder vcs = new LocalFolder();
		vcs.init(folder.getCanonicalPath(), indexer);
		vcs.run();
		indexer.addVCSManager(vcs, true);
		return vcs;
	}

	protected void requestWorkspaceIndex() throws Exception {
		final Workspace vcs = new Workspace();
		vcs.init("/", indexer);
		vcs.run();
		indexer.addVCSManager(vcs, true);
	}

	protected Object eol(final String eolQuery) throws InvalidQueryException, QueryExecutionException {
		return eol(eolQuery, null);
	}

	protected Object eol(final String eolQuery, Map<String, Object> context)
			throws InvalidQueryException, QueryExecutionException {
		return queryEngine.query(indexer, eolQuery, context);
	}

	protected Object eolWorkspace(final String query) throws InvalidQueryException, QueryExecutionException {
		return eol(query,
				Collections.singletonMap(EOLQueryEngine.PROPERTY_REPOSITORYCONTEXT, Workspace.REPOSITORY_URL));
	}

	protected IProject openProject(final File projectFolder) throws CoreException {
		final File projectFile = new File(projectFolder, ".project");
		final Path projectPath = new Path(projectFile.getAbsolutePath());
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProjectDescription description = ws.loadProjectDescription(projectPath);
		IProject project = ws.getRoot().getProject(description.getName());
		if (!project.exists()) {
			project.create(description, null);
		}
		if (!project.isOpen()) {
			project.open(null);
		}
		return project;
	}

}
