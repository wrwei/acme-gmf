package org.eclipse.acme.model.epsilon;

import java.net.URI;

public class ResourceFinder {

	public URI findResource(String string) {
		return URI.create(getClass().getResource(string).toString());
	}

}
