/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.checkcfg.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;


/**
 * Configures Check Configuration model element labels for a EObjects.
 */
public class CheckCfgLabelProvider extends DefaultEObjectLabelProvider {

  @Inject
  public CheckCfgLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}

/* Copyright (c) Avaloq License AG */