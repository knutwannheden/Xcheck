/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.checkcfg.typing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter;
import com.google.inject.Singleton;


/**
 * The type provider for the Check language.
 */
@Singleton
@SuppressWarnings("restriction")
public class CheckCfgTypeProvider extends XbaseTypeProvider {
  // CHECKSTYLE:OFF

  @Override
  protected JvmTypeReference expectedType(final EObject container, final EReference reference, final int index, final boolean rawType) {
    if (container instanceof ConfiguredParameter) {
      return _expectedType((ConfiguredParameter) container, reference, index, rawType);
    }
    return super.expectedType(container, reference, index, rawType);
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _expectedType(final ConfiguredParameter configuredParameter, final EReference reference, final int index, final boolean rawType) {
    if (reference == CheckcfgPackage.Literals.CONFIGURED_PARAMETER__NEW_VALUE) {
      final JvmFormalParameter jvmFormalParameter = configuredParameter.getParameter().getParameter();
      if (jvmFormalParameter.getParameterType() == null) {
        // TODO null if no explicit type has been assigned in the check::FormalParameter
        // check how to infer type from given formal parameter's default value
      }
      return jvmFormalParameter.getParameterType();
    }
    return null; // no expectations
  }

}
// CHECKSTYLE:ON

/* Copyright (c) Avaloq License AG */