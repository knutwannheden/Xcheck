/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.checkcfg.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;


/**
 * Configures the Check Configuration proposal provider (content assist).
 */
public class CheckCfgProposalProvider extends AbstractCheckCfgProposalProvider {

  @Override
  protected boolean isKeywordWorthyToPropose(final Keyword keyword) {
    return true; // show all keywords
  }

  @Override
  protected boolean doCreateIntProposals() {
    return true;
  }

  @Override
  protected boolean doCreateIdProposals() {
    return true;
  }

  @Override
  protected boolean doCreateStringProposals() {
    return true;
  }

  // CHECKSTYLE:OFF

  @Override
  public void completeConfiguredParameter_NewValue(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    // TODO filter depending on type of linked parameter
    super.completeConfiguredParameter_NewValue(model, assignment, context, acceptor);
  }

}

