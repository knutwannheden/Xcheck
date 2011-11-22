/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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

