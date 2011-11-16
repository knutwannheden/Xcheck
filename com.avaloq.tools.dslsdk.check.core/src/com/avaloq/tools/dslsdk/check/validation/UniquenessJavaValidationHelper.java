/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.validation;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.base.Function;


/**
 * Defines utility methods for validating different flavors of uniqueness in an ECore Model.
 * 
 * @param <T>
 *          type of the objects that can be duplicated in the context, subtype of EObject
 */
public class UniquenessJavaValidationHelper<T extends EObject> extends UniquenessValidationHelper<T> {

  private static final String ACCEPTOR_CAN_T_BE_NULL = "acceptor can't be null."; //$NON-NLS-1$

  private final ValidationMessageAcceptor acceptor;

  public UniquenessJavaValidationHelper(final Function<T, QualifiedName> nameFunction, final ValidationMessageAcceptor acceptor) {
    super(nameFunction);
    this.acceptor = acceptor;
  }

  /**
   * Find duplicates in the given objects and mark them (on the given feature) as
   * warnings.
   * 
   * @param possiblyDuplicateObjects
   *          an Iterable into which to look for duplicates
   * @param feature
   *          the feature of the duplicate object on which to anchor the marker
   * @param issueCode
   *          the issue code
   */
  public void warnOnDuplicates(final Iterable<T> possiblyDuplicateObjects, final EStructuralFeature feature, final String issueCode) {
    if (acceptor == null) {
      throw new IllegalArgumentException(ACCEPTOR_CAN_T_BE_NULL);
    }
    if (possiblyDuplicateObjects == null) {
      return; // NO_ERROR
    }

    Set<T> duplicateEObjects = findDuplicates(possiblyDuplicateObjects);

    for (final T duplicate : duplicateEObjects) {
      acceptor.acceptWarning(getMessage(duplicate), duplicate, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, issueCode);
    }
  }

  /**
   * Find duplicates in the given objects and mark them (on the given feature) as
   * errors.
   * 
   * @param possiblyDuplicateObjects
   *          an Iterable into which to look for duplicates
   * @param feature
   *          the feature of the duplicate object on which to anchor the marker
   * @param issueCode
   *          the issue code
   */
  public void errorOnDuplicates(final Iterable<T> possiblyDuplicateObjects, final EStructuralFeature feature, final String issueCode) {
    if (acceptor == null) {
      throw new IllegalArgumentException(ACCEPTOR_CAN_T_BE_NULL);
    }
    if (possiblyDuplicateObjects == null) {
      return; // NO_ERROR
    }

    Set<T> duplicateEObjects = findDuplicates(possiblyDuplicateObjects);

    for (final T duplicate : duplicateEObjects) {
      acceptor.acceptError(getMessage(duplicate), duplicate, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, issueCode);
    }
  }

  /**
   * Hook to override the standard error/warning message provided by {@link #errorOnDuplicates(Iterable, int)} and {@link #warnOnDuplicates(Iterable, int)}.
   * 
   * @param duplicate
   *          the duplicate object
   * @return the marker's message
   */
  public String getMessage(final T duplicate) {
    return "duplicate found " + getNameFunction().apply(duplicate); //$NON-NLS-1$
  }

}

/* Copyright (c) Avaloq License AG */