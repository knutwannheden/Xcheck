/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.jvmmodel.JvmLocationInFileProvider;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckPackage;


/**
 * Provides the right "name" feature for Checks and Categories.
 */
public class CheckLocationInFileProvider extends JvmLocationInFileProvider {

  @Override
  public EStructuralFeature getIdentifierFeature(final EObject object) {
    if (object instanceof Check) {
      if (((Check) object).getId() != null) {
        return CheckPackage.Literals.CHECK__ID;
      } else {
        return CheckPackage.Literals.CHECK__LABEL;
      }
    } else if (object instanceof Category) {
      if (((Category) object).getId() != null) {
        return CheckPackage.Literals.CATEGORY__ID;
      } else {
        return CheckPackage.Literals.CATEGORY__LABEL;
      }
    }
    return super.getIdentifierFeature(object);
  }

}

/* Copyright (c) Avaloq License AG */