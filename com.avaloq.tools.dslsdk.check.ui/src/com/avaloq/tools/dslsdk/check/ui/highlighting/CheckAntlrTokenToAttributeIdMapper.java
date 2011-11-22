/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.highlighting;

import org.eclipse.xtext.xbase.ui.syntaxcoloring.XbaseTokenToAttributeIdMapper;


/**
 * A Token Scanner that recognizes @SeverityRange tokens.
 */
@SuppressWarnings("restriction")
public class CheckAntlrTokenToAttributeIdMapper extends XbaseTokenToAttributeIdMapper {

  /** {@inheritDoc} */
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    if ("'SeverityRange'".equals(tokenName)) {
      return CheckHighlightingConfiguration.ANNOTATION;
    } else if ("'@'".equals(tokenName)) {
      return CheckHighlightingConfiguration.ANNOTATION;
    } else {
      return super.calculateId(tokenName, tokenType);
    }
  }
}

/* Copyright (c) Avaloq License AG */