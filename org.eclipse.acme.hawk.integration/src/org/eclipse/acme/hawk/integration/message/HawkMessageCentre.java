package org.eclipse.acme.hawk.integration.message;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;

public class HawkMessageCentre {

	private boolean blocking = false;
	private final PropertyChangeSupport support = new PropertyChangeSupport(this);

	protected HashSet<String> changedFiles = new HashSet<>();
	protected HashSet<String> removedFiles = new HashSet<>();
	static private HawkMessageCentre instance = new HawkMessageCentre();

	public static HawkMessageCentre getInstance() {
		return instance;
	}

	public void addChangedFile(String file) {
		if (!blocking) {
			HashSet<String> before = (HashSet<String>) changedFiles.clone();
			changedFiles.add(file);
			support.firePropertyChange("changedFiles", before, changedFiles);
		}
	}

	public void addRemovedFile(String file) {
		removedFiles.add(file);
	}

	public HashSet<String> getChangedFiles() {
		return changedFiles;
	}

	public HashSet<String> getRemovedFiles() {
		return removedFiles;
	}

	public void reset() {
		changedFiles.clear();
		removedFiles.clear();
	}

	public boolean isChanged(String file) {
		return changedFiles.contains(file);
	}

	public boolean isRemoved(String file) {
		return removedFiles.contains(file);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
	
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
}
