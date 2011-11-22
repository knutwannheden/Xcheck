/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.runtime.validation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.IGrammarAccess;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.name.Named;


/**
 * Default validator implementation which registers the validator using the LANGUAGE_NAME as injected by Guice and all its generated EPackages.
 */
public class DefaultCheckValidator extends AbstractCheckValidator {

  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String hostLanguage;

  @Inject
  private IGrammarAccess grammarAccess;

  @Override
  protected String getHostLanguage() {
    return hostLanguage;
  }

  @Override
  protected List<EPackage> getEPackages() {
    List<EPackage> result = Lists.newArrayList();
    for (AbstractMetamodelDeclaration decl : grammarAccess.getGrammar().getMetamodelDeclarations()) {
      // TODO what about imported meta models?
      if (decl instanceof GeneratedMetamodel) {
        result.add(EPackage.Registry.INSTANCE.getEPackage(decl.getEPackage().getNsURI()));
      }
    }
    return result;
  }

}

/* Copyright (c) Avaloq License AG */