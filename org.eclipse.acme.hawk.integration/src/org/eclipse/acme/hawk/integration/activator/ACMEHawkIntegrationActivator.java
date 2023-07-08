package org.eclipse.acme.hawk.integration.activator;
import org.eclipse.hawk.ui2.util.HUIManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ACMEHawkIntegrationActivator implements BundleActivator {

	protected HUIManager hawkManager = HUIManager.getInstance();

	@Override
	public void start(BundleContext arg0) throws Exception {
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
	}
}
