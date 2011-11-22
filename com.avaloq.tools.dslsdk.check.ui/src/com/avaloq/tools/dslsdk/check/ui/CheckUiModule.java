/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import com.avaloq.tools.dslsdk.check.ui.builder.CheckBuilderParticipant;
import com.avaloq.tools.dslsdk.check.ui.contentassist.CheckImportingTypesProposalProvider;
import com.avaloq.tools.dslsdk.check.ui.highlighting.CheckAntlrTokenToAttributeIdMapper;
import com.avaloq.tools.dslsdk.check.ui.highlighting.CheckHighlightingCalculator;
import com.avaloq.tools.dslsdk.check.ui.highlighting.CheckHighlightingConfiguration;
import com.avaloq.tools.dslsdk.check.ui.hover.CheckHoverProvider;
import com.avaloq.tools.dslsdk.check.ui.templates.CheckTemplateContextType;
import com.avaloq.tools.dslsdk.check.ui.templates.CheckTemplateProposalProvider;
import com.avaloq.tools.dslsdk.check.ui.wizard.CheckCatalogCreator;
import com.avaloq.tools.dslsdk.check.ui.wizard.CheckProjectCreator;
import com.avaloq.tools.dslsdk.check.ui.wizard.ICheckCatalogCreator;
import com.google.inject.Provider;


/**
 * Use this class to register components to be used within the IDE.
 */
public class CheckUiModule extends com.avaloq.tools.dslsdk.check.ui.AbstractCheckUiModule {
  public CheckUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }

  /**
   * Binds a project creator. Used for the wizards.
   * 
   * @return project creator
   */
  public Class<? extends IProjectCreator> bindIProjectCreator() {
    return CheckProjectCreator.class;
  }

  /**
   * Bind ICheckCatalogCreator.
   * 
   * @return CheckCatalogCreator.class which creates a new Check catalog in an existing Check plugin project
   */
  public Class<? extends ICheckCatalogCreator> bindICheckCatalogCreator() {
    return CheckCatalogCreator.class;
  }

  /**
   * Provide a Check template context type. Is used to provide custom template variable resolver.
   * 
   * @see {@link com.avaloq.tools.dslsdk.check.ui.templates.ResourceNameTemplateVariableResolver}
   * @return the provider
   */
  public Provider<XtextTemplateContextType> provideCheckTemplateContextType() {
    return new Provider<XtextTemplateContextType>() {
      public XtextTemplateContextType get() {
        return new CheckTemplateContextType();
      }
    };
  }

  /**
   * Provides support for custom template proposals.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
    return CheckTemplateProposalProvider.class;
  }

  /**
   * Automatically updates the {@code plugin.xml} and {@code MANIFEST.MF} files.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
    return CheckBuilderParticipant.class;
  }

  /**
   * Used by content assist for automatic generation of import statements.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public Class<? extends ITypesProposalProvider> bindITypesProposalProvider() {
    return CheckImportingTypesProposalProvider.class;
  }

  @Override
  public Class<? extends org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider> bindIEObjectHoverProvider() {
    return CheckHoverProvider.class;
  }

  @Override
  public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return CheckHighlightingCalculator.class;
  }

  /**
   * Binds a semantic highlighting calculator.
   * 
   * @return the semantic highlighting calculator>
   */
  public final Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return CheckHighlightingConfiguration.class;
  }

  /**
   * Binds a lexical highlighting calculator (Token to Attribute ID mapper).
   * 
   * @return the lexical highlighting calculator>
   */
  @Override
  public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
    return CheckAntlrTokenToAttributeIdMapper.class;
  }
}

/* Copyright (c) Avaloq License AG */