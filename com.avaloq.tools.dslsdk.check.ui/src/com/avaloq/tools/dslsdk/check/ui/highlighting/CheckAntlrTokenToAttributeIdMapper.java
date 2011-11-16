/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

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