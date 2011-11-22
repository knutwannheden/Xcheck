/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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