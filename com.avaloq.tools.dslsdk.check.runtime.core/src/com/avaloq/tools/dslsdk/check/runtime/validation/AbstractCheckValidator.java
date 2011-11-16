package com.avaloq.tools.dslsdk.check.runtime.validation;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.xtext.validation.AbstractInjectableValidator;

import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckImpl;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;


/**
 * The Class AbstractCheckValidator.
 */
public abstract class AbstractCheckValidator extends AbstractInjectableValidator {

  private static final Logger LOGGER = Logger.getLogger(AbstractCheckValidator.class);

  @Inject
  private Injector injector;

  private Iterable<? extends ICheckImpl> validators;

  /**
   * Returns Xtext grammar of the host language (e.g. <em>org.eclipse.xtext.example.domainmodel.Domainmodel</em>).
   * 
   * @return the Xtext grammar ID
   */
  protected abstract String getHostLanguage();

  /**
   * Returns all validators for the language defined by {@link #getHostLanguage()}.
   * 
   * @return a collection of validators
   */
  public Iterable<? extends ICheckImpl> getValidators() {
    if (validators == null) {
      validators = internalCollectValidators(getHostLanguage());
    }
    return validators;
  }

  /**
   * Internal collect validators.
   * 
   * @param language
   *          the language
   * @return the iterable
   */
  private Iterable<? extends ICheckImpl> internalCollectValidators(final String language) {
    if (language == null) {
      throw new IllegalArgumentException("Input language cannot be null"); //$NON-NLS-1$
    } else if (injector == null) {
      LOGGER.debug(NLS.bind("No injector found for {0}. Could not inject registered validators.", language)); //$NON-NLS-1$
    }

    final List<ICheckImpl> result = Lists.newArrayList();
    Collection<ICheckImpl> registered = ICheckImpl.Registry.INSTANCE.getValidators(language);
    if (registered != null && !registered.isEmpty()) {
      for (ICheckImpl iCheckImpl : registered) {
        if (injector != null) {
          injector.injectMembers(iCheckImpl);
        }
        result.add(iCheckImpl);
      }
    }

    return result;
  }

  @Override
  protected boolean internalValidate(final EClass eClass, final EObject eObject, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    boolean result = true;
    for (ICheckImpl v : getValidators()) {
      result &= v.validate(eClass, eObject, diagnostics, context);
    }
    return result;
  }

}
