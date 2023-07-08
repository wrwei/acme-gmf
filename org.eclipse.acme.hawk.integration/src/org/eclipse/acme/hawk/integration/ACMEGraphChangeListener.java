package org.eclipse.acme.hawk.integration;

import org.eclipse.acme.hawk.integration.message.HawkMessageCentre;
import org.eclipse.hawk.core.IModelIndexer;
import org.eclipse.hawk.core.VcsCommitItem;
import org.eclipse.hawk.core.graph.IGraphChangeListener;
import org.eclipse.hawk.core.graph.IGraphNode;
import org.eclipse.hawk.core.model.IHawkClass;
import org.eclipse.hawk.core.model.IHawkObject;
import org.eclipse.hawk.core.model.IHawkPackage;

public class ACMEGraphChangeListener implements IGraphChangeListener {

	private HawkMessageCentre messageCentre = HawkMessageCentre.getInstance();
	
	public ACMEGraphChangeListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "ACME Graph Change Listener";
	}

	@Override
	public void setModelIndexer(IModelIndexer m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void synchroniseStart() {
	}

	@Override
	public void synchroniseEnd() {
		System.out.println("Changed files: " + messageCentre.getChangedFiles().toString());
		System.out.println("Removed files: " + messageCentre.getRemovedFiles().toString());
	}

	@Override
	public void changeStart() {
	}

	@Override
	public void changeSuccess() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeFailure() {
		// TODO Auto-generated method stub

	}

	@Override
	public void metamodelAddition(IHawkPackage pkg, IGraphNode pkgNode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void classAddition(IHawkClass cls, IGraphNode clsNode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fileAddition(VcsCommitItem s, IGraphNode fileNode) {
	}

	@Override
	public void fileRemoval(VcsCommitItem s, IGraphNode fileNode) {
		//need to handle these
		messageCentre.addRemovedFile(s.getPath());
	}

	@Override
	public void modelElementAddition(VcsCommitItem s, IHawkObject element, IGraphNode elementNode,
			boolean isTransient) {
//		String path = s.getPath();
//		System.err.println("model element addition" + path);
		messageCentre.addChangedFile(s.getPath());

	}

	@Override
	public void modelElementRemoval(VcsCommitItem s, IGraphNode elementNode, boolean isTransient) {
		messageCentre.addChangedFile(s.getPath());
	}

	@Override
	public void modelElementAttributeUpdate(VcsCommitItem s, IHawkObject eObject, String attrName, Object oldValue,
			Object newValue, IGraphNode elementNode, boolean isTransient) {
		messageCentre.addChangedFile(s.getPath());
	}

	@Override
	public void modelElementAttributeRemoval(VcsCommitItem s, IHawkObject eObject, String attrName,
			IGraphNode elementNode, boolean isTransient) {
		messageCentre.addChangedFile(s.getPath());
	}

	@Override
	public void referenceAddition(VcsCommitItem s, IGraphNode source, IGraphNode destination, String edgelabel,
			boolean isTransient) {
		messageCentre.addChangedFile(s.getPath());
	}

	@Override
	public void referenceRemoval(VcsCommitItem s, IGraphNode source, IGraphNode destination, String edgelabel,
			boolean isTransient) {
		messageCentre.addChangedFile(s.getPath());
	}

}
