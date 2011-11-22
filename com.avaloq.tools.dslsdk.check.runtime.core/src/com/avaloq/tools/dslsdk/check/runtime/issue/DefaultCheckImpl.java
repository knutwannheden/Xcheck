/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.runtime.issue; //TODO rename package

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.SimpleCache;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.FeatureBasedDiagnostic;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.base.Function;
import com.google.common.collect.Sets;


/**
 * The class DefaultCheckImpl serves as the default parent implementation for generated
 * issue classes.
 */
public class DefaultCheckImpl implements ICheckImpl, ValidationMessageAcceptor {

  private static final int VISITED_CLASSES_INIT_CAPACITY = 4;

  private static final Logger LOGGER = Logger.getLogger(DefaultCheckImpl.class);

  private volatile Set<MethodWrapper> checkMethods; // NOPMD: may be modified by different threads; thread safety guaranteed by double-checked locking

  private final ThreadLocal<State> state;
  private final ValidationMessageAcceptor messageAcceptor;

  public DefaultCheckImpl() {
    this.state = new ThreadLocal<State>();
    this.messageAcceptor = this;
  }

  public ValidationMessageAcceptor getMessageAcceptor() {
    return messageAcceptor;
  }

  // ////////////////////////////////////////////////
  // Copied and adapted from AbstractDeclarativeValidator below
  // ////////////////////////////////////////////////

  /** {@inheritDoc} */
  public boolean validate(final EClass eClass, final EObject eObject, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return internalValidate(eClass, eObject, diagnostics, context);
  }

  /**
   * Executes all Check methods found.
   * 
   * @param class1
   *          the class1
   * @param object
   *          the object
   * @param diagnostics
   *          the diagnostics
   * @param context
   *          the context
   * @return true, if successful
   */
  protected final boolean internalValidate(final EClass class1, final EObject object, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    if (checkMethods == null) {
      synchronized (this) {
        // CHECKSTYLE:OFF Double-checked locking
        if (checkMethods == null) {
          // CHECKSTYLE:ON
          Set<MethodWrapper> internalCheckMethods = Sets.newLinkedHashSet();
          internalCheckMethods.addAll(collectMethods());
          this.checkMethods = internalCheckMethods;
        }
      }
    }
    CheckMode checkMode = CheckMode.getCheckMode(context);

    State internalState = new State();
    internalState.chain = diagnostics;
    internalState.currentObject = object;
    internalState.checkMode = checkMode;
    internalState.context = context;

    for (MethodWrapper method : methodsForType.get(object.getClass())) {
      method.invoke(internalState);
    }

    return !internalState.hasErrors;
  }

  private final SimpleCache<Class<?>, List<MethodWrapper>> methodsForType = new SimpleCache<Class<?>, List<MethodWrapper>>(new Function<Class<?>, List<MethodWrapper>>() {
    public List<MethodWrapper> apply(final Class<?> param) {
      List<MethodWrapper> result = new ArrayList<MethodWrapper>();
      for (MethodWrapper mw : checkMethods) {
        if (mw.isMatching(param)) {
          result.add(mw);
        }
      }
      return result;
    }
  });

  /**
   * The Class MethodWrapper.
   */
  static class MethodWrapper {
    private final Method method;
    private final String s;
    private final DefaultCheckImpl instance;

    public MethodWrapper(final DefaultCheckImpl instance, final Method m) {
      this.instance = instance;
      this.method = m;
      this.s = m.getName() + ":" + m.getParameterTypes()[0].getName(); //$NON-NLS-1$
    }

    @Override
    public int hashCode() {
      return s.hashCode() ^ instance.hashCode();
    }

    /**
     * Checks if a given formal parameter type is assignable from current method's first formal parameter type.
     * 
     * @param param
     *          the parameter class
     * @return true, if given class is assignable from current method's first formal parameter type
     */
    public boolean isMatching(final Class<?> param) {
      return method.getParameterTypes()[0].isAssignableFrom(param);
    }

    /**
     * Invokes a method using reflection.
     * 
     * @param state
     *          the state
     */
    public void invoke(final State state) {
      if (instance.state.get() != null && instance.state.get() != state) {
        throw new IllegalStateException("State is already assigned."); //$NON-NLS-1$
      }
      boolean wasNull = instance.state.get() == null;
      if (wasNull) {
        instance.state.set(state);
      }
      try {
        Check annotation = method.getAnnotation(Check.class);
        if (!state.checkMode.shouldCheck(annotation.value())) {
          return;
        }
        try {
          state.currentMethod = method;
          state.currentCheckType = annotation.value();
          method.setAccessible(true);
          method.invoke(instance, state.currentObject);
        } catch (IllegalArgumentException e) {
          LOGGER.error(e.getMessage(), e);
        } catch (IllegalAccessException e) {
          LOGGER.error(e.getMessage(), e);
        } catch (InvocationTargetException e) {
          // ignore GuardException, check is just not evaluated if
          // guard is false
          // ignore NullPointerException, as not having to check for
          // NPEs all the time is a convenience feature
          Throwable targetException = e.getTargetException();
          if (!(targetException instanceof NullPointerException)) {
            throw new RuntimeException(targetException); // NOPMD
          }
        }
      } finally {
        if (wasNull) {
          instance.state.set(null);
        }
      }
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof MethodWrapper)) {
        return false;
      }
      MethodWrapper mw = (MethodWrapper) obj;
      return s.equals(mw.s) && instance == mw.instance;
    }
  }

  /**
   * Collect all method wrappers.
   * 
   * @return the list of method wrappers
   */
  private List<MethodWrapper> collectMethods() {
    List<MethodWrapper> result = new ArrayList<MethodWrapper>();
    Set<Class<?>> visitedClasses = new HashSet<Class<?>>(VISITED_CLASSES_INIT_CAPACITY);
    collectMethods(this, visitedClasses, result);
    return result;
  }

  /**
   * Collects methods method wrappers and stores them in given collection.
   * 
   * @param instance
   *          the instance
   * @param visitedClasses
   *          the visited classes
   * @param result
   *          the collection in which to store method wrappers found
   */
  private void collectMethods(final DefaultCheckImpl instance, final Collection<Class<?>> visitedClasses, final Collection<MethodWrapper> result) {
    if (visitedClasses.contains(instance.getClass())) {
      return;
    }
    collectMethodsImpl(instance, visitedClasses, result);
  }

  /**
   * Internally collects methods in a given instance of {@link DefaultCheckImpl}. A given instance class is only analyzed once.
   * 
   * @param instance
   *          the instance of {@link DefaultCheckImpl}
   * @param visitedClasses
   *          the visited classes
   * @param result
   *          the collection in which to store method wrappers found
   */
  private void collectMethodsImpl(final DefaultCheckImpl instance, final Collection<Class<?>> visitedClasses, final Collection<MethodWrapper> result) {
    if (!visitedClasses.add(instance.getClass())) {
      return;
    }
    Method[] methods = instance.getClass().getDeclaredMethods();
    for (Method method : methods) {
      if (method.getAnnotation(Check.class) != null && method.getParameterTypes().length == 1) {
        result.add(new MethodWrapper(instance, method));
      }
    }
  }

  /**
   * The holding the current state for a validation method being executed.
   */
  public static class State {
    // CHECKSTYLE:OFF
    public DiagnosticChain chain = null;
    public EObject currentObject = null;
    public Method currentMethod = null;
    public CheckMode checkMode = null;
    public CheckType currentCheckType = null;
    public boolean hasErrors = false;
    public Map<Object, Object> context;
    // CHECKSTYLE:ON
  }

  protected EObject getCurrentObject() {
    return state.get().currentObject;
  }

  protected Method getCurrentMethod() {
    return state.get().currentMethod;
  }

  protected DiagnosticChain getChain() {
    return state.get().chain;
  }

  protected CheckMode getCheckMode() {
    return state.get().checkMode;
  }

  protected Map<Object, Object> getContext() {
    return state.get().context;
  }

  /**
   * The inner Class StateAccess provides access to the {@link State} of the validator being handled.
   */
  public static final class StateAccess {

    private final DefaultCheckImpl validator;

    private StateAccess(final DefaultCheckImpl validator) {
      this.validator = validator;
    }

    /**
     * Gets the validator's state.
     * 
     * @return the state
     */
    public State getState() {
      State result = validator.state.get();
      if (result == null) {
        result = new State();
        validator.state.set(result);
      }
      return result;
    }
  }

  // ////////////////////////////////////////////////////////
  // Implementation of the Validation message acceptor below
  // ////////////////////////////////////////////////////////

  /** {@inheritDoc} */
  public void acceptError(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
    this.state.get().hasErrors = true;
    state.get().chain.add(createDiagnostic(Severity.ERROR, message, object, feature, index, code, issueData));
  }

  /** {@inheritDoc} */
  public void acceptWarning(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
    state.get().chain.add(createDiagnostic(Severity.WARNING, message, object, feature, index, code, issueData));
  }

  /** {@inheritDoc} */
  public void acceptInfo(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
    state.get().chain.add(createDiagnostic(Severity.INFO, message, object, feature, index, code, issueData));
  }

  /** {@inheritDoc} */
  public void acceptError(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
    this.state.get().hasErrors = true;
    state.get().chain.add(createDiagnostic(Severity.ERROR, message, object, offset, length, code, issueData));
  }

  /** {@inheritDoc} */
  public void acceptWarning(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
    state.get().chain.add(createDiagnostic(Severity.WARNING, message, object, offset, length, code, issueData));
  }

  /** {@inheritDoc} */
  public void acceptInfo(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
    state.get().chain.add(createDiagnostic(Severity.INFO, message, object, offset, length, code, issueData));
  }

  /**
   * Creates a diagnostic for given parameters.
   * 
   * @param severity
   *          the issue severity
   * @param message
   *          the issue message
   * @param object
   *          the context object
   * @param feature
   *          the structural feature on which to create a marker
   * @param index
   *          the index at which to create a marker
   * @param code
   *          the issue code
   * @param issueData
   *          the issue data
   * @return the diagnostic
   */
  protected Diagnostic createDiagnostic(final Severity severity, final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
    int diagnosticSeverity = toDiagnosticSeverity(severity);
    return new FeatureBasedDiagnostic(diagnosticSeverity, message, object, feature, index, state.get().currentCheckType, code, issueData);
  }

  /**
   * Creates a diagnostic for given parameters.
   * 
   * @param severity
   *          the issue severity
   * @param message
   *          the issue message
   * @param object
   *          the context object
   * @param offset
   *          the offset of the marker
   * @param length
   *          the length of tokens to be marked by the issue
   * @param code
   *          the issue code
   * @param issueData
   *          the issue data
   * @return the diagnostic
   */
  protected Diagnostic createDiagnostic(final Severity severity, final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
    int diagnosticSeverity = toDiagnosticSeverity(severity);
    return new CheckRangeBasedDiagnostic(diagnosticSeverity, message, object, offset, length, state.get().currentCheckType, code, issueData);
  }

  /**
   * Gets a numeric value mapped to a given {@link Severity}. Severities are mapped to
   * <ul>
   * <li>{@link Diagnostic#ERROR}
   * <li>{@link Diagnostic#WARNING}
   * <li>{@link Diagnostic#INFO}
   * </ul>
   * 
   * @param severity
   *          the issue severity
   * @return the numeric value representing a severity
   */
  protected int toDiagnosticSeverity(final Severity severity) {
    int diagnosticSeverity = -1;
    switch (severity) {
    case ERROR:
      diagnosticSeverity = Diagnostic.ERROR;
      break;
    case WARNING:
      diagnosticSeverity = Diagnostic.WARNING;
      break;
    case INFO:
      diagnosticSeverity = Diagnostic.INFO;
      break;
    default:
      throw new IllegalArgumentException("Unknow severity " + severity); //$NON-NLS-1$
    }
    return diagnosticSeverity;
  }

}

/* Copyright (c) Avaloq License AG */