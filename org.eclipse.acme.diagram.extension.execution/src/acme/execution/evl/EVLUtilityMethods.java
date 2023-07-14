package acme.execution.evl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import acme.execution.activator.Activator;

public class EVLUtilityMethods {

	public static java.net.URI getScriptURI() throws URISyntaxException
	{
		return Activator.getDefault().getBundle().getResource("files/defaultValidation.evl").toURI();
	}
	
	public static java.net.URI getFiles2GSNEol() throws URISyntaxException
	{
		return Activator.getDefault().getBundle().getResource("files/files2gsn.eol").toURI();
	}
	
	public static String getGSNModel() throws URISyntaxException
	{
		URI uri = Activator.getDefault().getBundle().getResource("files/files2gsn.model").toURI();
		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart(); 
		URL url = null;
		try {
			url = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource("files/files2gsn.model"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = url.getPath();
		return path;
	}
}
