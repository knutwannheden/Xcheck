/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.templates;

import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;


/**
 * Used for adding custom template variable resolvers.
 */
public class CheckTemplateContextType extends XtextTemplateContextType {

  /** {@inheritDoc} */
  @Override
  protected void addDefaultTemplateVariables() {
    super.addDefaultTemplateVariables();
    addResolver(new ResourceNameTemplateVariableResolver());
  }

}

/* Copyright (c) Avaloq License AG */