/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.ui.quickfix;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreModification;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreModificationContext;


/**
 * An implementation of IssueResolution that is based on the Check-based quickfix framework.
 * <p>
 * See also org.eclipse.xtext.ui.editor.model.edit.SemanticModificationWrapper.
 */
public class IssueResolutionWrapper extends IssueResolution {

  private final ICoreModificationContext modificationContext;
  private final ICoreModification modification;

  public IssueResolutionWrapper(final com.avaloq.tools.dslsdk.check.runtime.quickfix.CoreIssueResolution from) {
    this(from.getLabel(), from.getDescription(), from.getImage(), from.getModificationContext(), from.getModification());
  }

  public IssueResolutionWrapper(final String label, final String description, final String image, final ICoreModificationContext modificationContext, final ICoreModification modification) {
    super(label, description, image, null, null);
    this.modificationContext = modificationContext;
    this.modification = modification;
  }

  /**
   * Applies the quickfix (the modification). While the code is exactly the same as the parent,
   * note that the typing of the different variables (modification, modificationcontext) is not
   * the same, thus the override. Thus, never call <b>super</b> on this method.
   */
  @Override
  public void apply() {
    try {
      modification.apply(modificationContext);
      // CHECKSTYLE:OFF
    } catch (Exception exc) { // like override...
      // CHECKSTYLE:ON
      throw new WrappedException(exc);
    }
  }

}

/* Copyright (c) Avaloq License AG */