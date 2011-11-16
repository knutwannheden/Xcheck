/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;


/**
 * The value converter for the Check language.
 */
public class CheckValueConverterService extends XbaseValueConverterService {

  @ValueConverter(rule = "QualifiedNameWithWildCard")
  public IValueConverter<String> getQualifiedNameWithWildCard() {
    return getQualifiedNameValueConverter();
  }

}

/* Copyright (c) Avaloq License AG */