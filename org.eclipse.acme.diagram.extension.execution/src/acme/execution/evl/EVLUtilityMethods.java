package acme.execution.evl;

import java.net.URISyntaxException;

import acme.execution.activator.Activator;

public class EVLUtilityMethods {

	public static java.net.URI getScriptURI() throws URISyntaxException
	{
		return Activator.getDefault().getBundle().getResource("files/defaultValidation.evl").toURI();
	}
}
