/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.checkcfg;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.avaloq.tools.dslsdk.checkcfg.conversion.CheckCfgValueConverterService;
import com.avaloq.tools.dslsdk.checkcfg.generator.CheckCfgGenerator;
import com.avaloq.tools.dslsdk.checkcfg.resource.CheckCfgLocationInFileProvider;
import com.avaloq.tools.dslsdk.checkcfg.scoping.CheckCfgScopeProvider;
import com.avaloq.tools.dslsdk.checkcfg.typing.CheckCfgTypeProvider;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class CheckCfgRuntimeModule extends com.avaloq.tools.dslsdk.checkcfg.AbstractCheckCfgRuntimeModule {

  /**
   * Configures a type provider for Check Configuration. Assists in type checking of expressions.
   * 
   * @return the Check Configuration type provider
   */
  @Override
  public Class<? extends ITypeProvider> bindITypeProvider() {
    return CheckCfgTypeProvider.class;
  }

  /**
   * Custom location in file provider used for revealing and highlighting a model element in the editor.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
    return CheckCfgLocationInFileProvider.class;
  }

  /**
   * Binds a custom value converter service.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return CheckCfgValueConverterService.class;
  }

  @Override
  public Class<? extends IScopeProvider> bindIScopeProvider() {
    return CheckCfgScopeProvider.class;
  }

  @Override
  public Class<? extends IGenerator> bindIGenerator() {
    return CheckCfgGenerator.class;
  }
}

/* Copyright (c) Avaloq License AG */