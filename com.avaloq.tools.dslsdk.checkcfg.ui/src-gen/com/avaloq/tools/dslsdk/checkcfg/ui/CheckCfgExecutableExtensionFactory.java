/*
 * generated by Xtext
 */
package com.avaloq.tools.dslsdk.checkcfg.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CheckCfgExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return com.avaloq.tools.dslsdk.checkcfg.ui.internal.CheckCfgActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return com.avaloq.tools.dslsdk.checkcfg.ui.internal.CheckCfgActivator.getInstance().getInjector("com.avaloq.tools.dslsdk.checkcfg.CheckCfg");
	}
	
}
