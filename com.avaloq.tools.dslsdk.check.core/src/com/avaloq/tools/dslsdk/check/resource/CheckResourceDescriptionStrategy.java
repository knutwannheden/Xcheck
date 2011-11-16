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
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;


/**
 * A strategy to select which class can come into the index.
 */
public class CheckResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    if (eObject instanceof CheckCatalog || eObject instanceof Category || eObject instanceof Check || eObject instanceof FormalParameter) {
      return super.createEObjectDescriptions(eObject, acceptor);
    } else {
      return false;
    }
  }

}

/* Copyright (c) Avaloq License AG */