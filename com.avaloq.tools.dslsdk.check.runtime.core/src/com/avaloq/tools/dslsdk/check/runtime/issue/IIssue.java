/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.runtime.issue; //TODO rename package

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * Interface defining an issue.
 */
public interface IIssue {

  /**
   * Returns the message with bound message bindings.
   * 
   * @param bindings
   *          optional message bindings
   * @return the message
   */
  String getMessage(Object... bindings);

  /**
   * Gets the default severity kind.
   * 
   * @return the severity kind as configured in the check definition
   */
  SeverityKind getSeverityKind();

  /**
   * Checks if is enabled.
   * 
   * @return <code>true</code>, if is enabled
   */
  boolean isEnabled();

  /**
   * Annotate an instance, a feature value, or all feature values with an issue.
   * 
   * @param object
   *          the object or the feature holder. May not be <code>null</code>.
   * @param feature
   *          the feature or <code>null</code> if the complete instance should be annotated.
   * @param index
   *          index of the erroneous value or <code>-1</code> if all values are considered to be invalid. The index is ignored if
   *          the feature is null or the feature is a single value feature.
   * @param issueCode
   *          the issue code or <code>null</code>
   * @param issueData
   *          the optional issue data.
   */
  void accept(EObject object, EStructuralFeature feature, int index, String issueCode, String... issueData);

  /**
   * Annotate an instance, a feature value, or all feature values with an issue.
   * 
   * @param messageBindings
   *          bindings for message
   * @param object
   *          the object or the feature holder. May not be <code>null</code>.
   * @param feature
   *          the feature or <code>null</code> if the complete instance should be annotated.
   * @param index
   *          index of the erroneous value or <code>-1</code> if all values are considered to be invalid. The index is ignored if
   *          the feature is null or the feature is a single value feature.
   * @param issueCode
   *          the issue code or <code>null</code>
   * @param issueData
   *          the optional issue data.
   */
  void accept(Object[] messageBindings, EObject object, EStructuralFeature feature, int index, String issueCode, String... issueData);

}

/* Copyright (c) Avaloq License AG */