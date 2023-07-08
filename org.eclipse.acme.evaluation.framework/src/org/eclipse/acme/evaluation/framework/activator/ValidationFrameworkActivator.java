package org.eclipse.acme.evaluation.framework.activator;

import org.eclipse.acme.evaluation.framework.ValidationCentre;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ValidationFrameworkActivator implements BundleActivator {

	@Override
	public void start(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		ValidationCentre.getInstance().init();
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		ValidationCentre.getInstance().clear();
	}

}
