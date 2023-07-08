package org.eclipse.acme.hawk.integration;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.hawk.core.IFileImporter;
import org.eclipse.hawk.core.IModelResourceFactory;
import org.eclipse.hawk.core.model.IHawkModelResource;
import org.eclipse.hawk.emf.EMFWrapperFactory;
import org.eclipse.hawk.emf.model.EMFModelResource;

import log.Log;
import log.LogFactory;
import log.SubLog;


public class IsabelleResourceFactory implements IModelResourceFactory{

	@Override
	public String getHumanReadableName() {
		return "Isabelle Resource Factory";
	}

	@Override
	public IHawkModelResource parse(IFileImporter importer, File changedFile) throws Exception {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource r = rs.createResource(URI.createFileURI(changedFile.getAbsolutePath()));
		Log log = LogFactory.eINSTANCE.createLog();
		log.setName(changedFile.getName());
		SubLog subLog = LogFactory.eINSTANCE.createSubLog();
		subLog.setName("content");
		subLog.setContent(System.currentTimeMillis()+"");
		log.getSublog().add(subLog);
		r.getContents().add(log);
		return new EMFModelResource(r, new EMFWrapperFactory(), this);
	}

	@Override
	public void shutdown() {
		// Nothing to do
	}

	@Override
	public boolean canParse(File f) {
		return f.getName().endsWith(".thy");
	}

	@Override
	public Collection<String> getModelExtensions() {
		return Collections.singleton(".thy");
	}
	

}
