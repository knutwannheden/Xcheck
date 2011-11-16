/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.checkcfg.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.jvmmodel.JvmLocationInFileProvider;

import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck;


/**
 * Assists in revealing a node model element in the editor.
 */
@SuppressWarnings("restriction")
public class CheckCfgLocationInFileProvider extends JvmLocationInFileProvider {

  @Override
  protected EStructuralFeature getIdentifierFeature(final EObject object) {
    if (object instanceof CheckConfiguration) {
      return CheckcfgPackage.Literals.CHECK_CONFIGURATION__LABEL;
    } else if (object instanceof ConfiguredCatalog) {
      return CheckcfgPackage.Literals.CONFIGURED_CATALOG__CATALOG;
    } else if (object instanceof ConfiguredCheck) {
      return CheckcfgPackage.Literals.CONFIGURED_CHECK__CHECK;
    }
    return super.getIdentifierFeature(object);
  }
}

/* Copyright (c) Avaloq License AG */