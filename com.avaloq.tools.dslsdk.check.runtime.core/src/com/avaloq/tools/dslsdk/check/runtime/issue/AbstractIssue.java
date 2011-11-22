/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.issue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;


/**
 * The Class AbstractIssue provides a set of default implementations of inherited
 * operations from {@link IIssue}.
 */
public abstract class AbstractIssue implements IIssue {

  private final ValidationMessageAcceptor messageAcceptor;

  public AbstractIssue(final ValidationMessageAcceptor messageAcceptor) {
    this.messageAcceptor = messageAcceptor;
  }

  /** {@inheritDoc} */
  public boolean isEnabled() { // NOPMD method empty for the time being
    // TODO this should be abstract (?) or have a real default behavior
    return true;
  }

  private ValidationMessageAcceptor getMessageAcceptor() {
    return messageAcceptor;
  }

  /** {@inheritDoc} */
  public void accept(final EObject object, final EStructuralFeature feature, final int index, final String issueCode, final String... issueData) {
    if (!isEnabled()) {
      return;
    }

    switch (getSeverityKind()) {
    case ERROR:
      getMessageAcceptor().acceptError(getMessage(), object, feature, index, issueCode, issueData);
      return;
    case WARNING:
      getMessageAcceptor().acceptWarning(getMessage(), object, feature, index, issueCode, issueData);
      return;
    case INFO:
      getMessageAcceptor().acceptInfo(getMessage(), object, feature, index, issueCode, issueData);
      return;
    case IGNORE:
    default:
      return;
    }
  }

  /** {@inheritDoc} */
  public void accept(final Object[] messageBindings, final EObject object, final EStructuralFeature feature, final int index, final String issueCode, final String... issueData) {
    if (!isEnabled()) {
      return;
    }

    switch (getSeverityKind()) {
    case ERROR:
      getMessageAcceptor().acceptError(getMessage(messageBindings), object, feature, index, issueCode, issueData);
      return;
    case WARNING:
      getMessageAcceptor().acceptWarning(getMessage(messageBindings), object, feature, index, issueCode, issueData);
      return;
    case INFO:
      getMessageAcceptor().acceptInfo(getMessage(messageBindings), object, feature, index, issueCode, issueData);
      return;
    case IGNORE:
    default:
      return;
    }
  }

}

