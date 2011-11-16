/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.documentation;

import org.eclipse.emf.ecore.EObject;


/**
 * An implementation of a JavaDoc-like documentation providers that enriches documentation with
 * other elements from the Check language.
 */
public class CheckEObjectDocumentationProvider extends JavaDocCommentDocumentationProvider {

  @Override
  public String getDocumentation(final EObject object) { // NOPMD
    // TODO possibly extend with other documentation
    return super.getDocumentation(object);
  }

}

/* Copyright (c) Avaloq License AG */