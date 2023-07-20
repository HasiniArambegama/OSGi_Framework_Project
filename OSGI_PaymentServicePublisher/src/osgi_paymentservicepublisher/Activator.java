package osgi_paymentservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceregistration;
	

	//start publisher
	public void start(BundleContext context) throws Exception {
		System.out.println("Payment Service Publisher Started");
		PaymentServicePublish publisherService = new PaymentServicePublishImpl();
		
		publishServiceregistration = context.registerService(PaymentServicePublish.class.getName(),publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Payment Service Publisher Stop");
		publishServiceregistration.unregister();
	}

}
