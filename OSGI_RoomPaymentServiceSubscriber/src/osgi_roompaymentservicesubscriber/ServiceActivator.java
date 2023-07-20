package osgi_roompaymentservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import osgi_paymentservicepublisher.PaymentServicePublish;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Payment Service Subscriber Started\n");
		serviceReference = context.getServiceReference(PaymentServicePublish.class.getName());
		PaymentServicePublish servicePublisher = (PaymentServicePublish)context.getService(serviceReference);
		servicePublisher.roomPayment();
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Payment Service Subscriber Stoped\n");
		context.ungetService(serviceReference);
	}

}
