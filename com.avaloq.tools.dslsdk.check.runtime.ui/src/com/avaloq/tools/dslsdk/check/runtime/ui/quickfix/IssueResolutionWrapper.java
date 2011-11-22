/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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

