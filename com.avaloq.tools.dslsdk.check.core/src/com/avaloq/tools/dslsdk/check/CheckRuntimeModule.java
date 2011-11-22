/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.util.XExpressionHelper;

import com.avaloq.tools.dslsdk.check.conversion.CheckValueConverterService;
import com.avaloq.tools.dslsdk.check.documentation.CheckEObjectDocumentationProvider;
import com.avaloq.tools.dslsdk.check.naming.CheckDeclarativeQualifiedNameProvider;
import com.avaloq.tools.dslsdk.check.naming.CheckIdentifiableSimpleNameProvider;
import com.avaloq.tools.dslsdk.check.resource.CheckLocationInFileProvider;
import com.avaloq.tools.dslsdk.check.resource.CheckResourceDescriptionStrategy;
import com.avaloq.tools.dslsdk.check.scoping.CheckImportedNamespaceScopeProvider;
import com.avaloq.tools.dslsdk.check.scoping.CheckLinkingService;
import com.avaloq.tools.dslsdk.check.scoping.CheckScopeProvider;
import com.avaloq.tools.dslsdk.check.typing.CheckTypeProvider;
import com.avaloq.tools.dslsdk.check.util.CheckExpressionHelper;
import com.google.inject.name.Names;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CheckRuntimeModule extends com.avaloq.tools.dslsdk.check.AbstractCheckRuntimeModule {

  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return CheckValueConverterService.class;
  }

  @Override
  public Class<? extends ITypeProvider> bindITypeProvider() {
    return CheckTypeProvider.class;
  }

  @Override
  public Class<? extends ILinkingService> bindILinkingService() {
    return CheckLinkingService.class; // workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=350695
  }

  @Override
  public Class<? extends IScopeProvider> bindIScopeProvider() {
    return CheckScopeProvider.class;
  }

  /**
   * Binds an expression helper required as a workaround for a bug.
   * 
   * @return the expression helper class
   */
  public Class<? extends XExpressionHelper> bindXExpressionHelper() {
    return CheckExpressionHelper.class; // dirty workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=350748
  }

  @Override
  public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
    return CheckIdentifiableSimpleNameProvider.class;
  }

  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return CheckDeclarativeQualifiedNameProvider.class;
  }

  /**
   * @return a JavaDoc-like documentation provider
   */
  public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProviderr() {
    return CheckEObjectDocumentationProvider.class;
  }

  @Override
  public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
    return CheckLocationInFileProvider.class;
  }

  @Override
  public void configureIScopeProviderDelegate(final com.google.inject.Binder binder) {
    binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(CheckImportedNamespaceScopeProvider.class);
  }

  /** @return a strategy for selecting the objects to export in Index */
  public Class<? extends org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
    return CheckResourceDescriptionStrategy.class;
  }

  @Override
  public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
    return com.avaloq.tools.dslsdk.check.generator.CheckGenerator.class;
  }

}

/* Copyright (c) Avaloq License AG */