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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;


/**
 * Copy of Xtext's {@link org.eclipse.xtext.ui.editor.model.edit.SemanticModificationWrapper
 * SemanticModificationWrapper}.
 * <p>
 * This class is UI-independent.
 */
// CHECKSTYLE:OFF
public class CoreSemanticModificationWrapper implements ICoreModification {

  private final URI uriToProblem;

  private final ICoreSemanticModification semanticModification;

  public CoreSemanticModificationWrapper(final URI uriToProblem, final ICoreSemanticModification semanticModification) {
    this.semanticModification = semanticModification;
    this.uriToProblem = uriToProblem;
  }

  public void apply(final ICoreModificationContext context) {
    context.getXtextDocument().modify(new IUnitOfWork.Void<XtextResource>() {
      @Override
      public void process(final XtextResource state) throws Exception { // NOPMD (as in org.eclipse.xtext)
        EObject eObject = state.getEObject(uriToProblem.fragment());
        semanticModification.apply(eObject, context);
      }
    });
  }

}

/* Copyright (c) Avaloq License AG */