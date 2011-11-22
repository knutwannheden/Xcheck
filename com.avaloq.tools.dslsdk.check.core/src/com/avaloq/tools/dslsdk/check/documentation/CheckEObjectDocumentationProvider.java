/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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

