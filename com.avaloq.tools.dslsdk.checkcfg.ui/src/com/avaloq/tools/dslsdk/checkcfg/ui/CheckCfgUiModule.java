/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.checkcfg.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;

import com.avaloq.tools.dslsdk.checkcfg.ui.templates.CheckCfgTemplateProposalProvider;


/**
 * Use this class to register components to be used within the IDE.
 */
public class CheckCfgUiModule extends com.avaloq.tools.dslsdk.checkcfg.ui.AbstractCheckCfgUiModule {
  public CheckCfgUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }

  // /**
  // * Calculates highlighting of node model elements.
  // * <p>
  // * {@inheritDoc}
  // */
  // @Override
  // public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
  // return SemanticHighlightingCalculator.class;
  // }

  // /**
  // * Binds a highlighting configuration used for highlighting text in the editor or nodes in the outline view.
  // *
  // * @return the highlighting configuration
  // */
  // public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
  // return SemanticHighlightingConfiguration.class;
  // }

  /**
   * Binds a proposal provider for Check Configuration templates.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
    return CheckCfgTemplateProposalProvider.class;
  }
}

/* Copyright (c) Avaloq License AG */