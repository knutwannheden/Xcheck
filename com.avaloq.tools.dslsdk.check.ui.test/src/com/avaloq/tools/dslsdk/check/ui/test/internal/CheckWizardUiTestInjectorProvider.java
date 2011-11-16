package com.avaloq.tools.dslsdk.check.ui.test.internal;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;


/**
 * The Class CheckWizardUiTestInjectorProvider is a copy of com/avaloq/tools/dslsdk/check/CheckUiInjectorProvider.java.
 */
public class CheckWizardUiTestInjectorProvider implements IInjectorProvider {

  public Injector getInjector() {
    return com.avaloq.tools.dslsdk.check.ui.internal.CheckActivator.getInstance().getInjector("com.avaloq.tools.dslsdk.check.Check");
  }
}
