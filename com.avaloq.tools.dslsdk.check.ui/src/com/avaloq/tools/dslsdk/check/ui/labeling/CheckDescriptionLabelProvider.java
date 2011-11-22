/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.ui.labeling;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.Import;
import com.avaloq.tools.dslsdk.check.check.SeverityKind;
import com.google.inject.Inject;


/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CheckDescriptionLabelProvider extends DefaultDescriptionLabelProvider {
  @Inject
  private CheckImages images;

  @Override
  public String text(final IEObjectDescription element) {
    return element.getName() + " - " + element.getEClass().getName();
  }

  @Override
  public Object image(final IEObjectDescription element) {
    String className = element.getEClass().getName();
    if (CheckCatalog.class.getSimpleName().equals(className)) {
      return images.forCheckCatalog();
    } else if (Category.class.getSimpleName().equals(className)) {
      return images.forCategory();
    } else if (Check.class.getSimpleName().equals(className)) {
      return images.forCheck(SeverityKind.ERROR);
    } else if (Import.class.getSimpleName().equals(className)) {
      return images.forImport();
    }
    return super.image(element);

  }

}

/* Copyright (c) Avaloq License AG */