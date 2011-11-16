/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.quickfix;

import org.eclipse.emf.ecore.EObject;


/**
 * Copy of Xtext's {@link org.eclipse.xtext.ui.editor.model.edit.ISemanticModification ISemanticModification}.
 * <p>
 * This class is UI-independent.
 */
public interface ICoreSemanticModification {
  /**
   * Applies a semantic quickfix.
   * 
   * @param element
   *          the context element for the semantic quickfix; the context element for which a validation issue has been created
   * @param context
   *          the modification context
   */
  void apply(EObject element, ICoreModificationContext context);

}

/* Copyright (c) Avaloq License AG */