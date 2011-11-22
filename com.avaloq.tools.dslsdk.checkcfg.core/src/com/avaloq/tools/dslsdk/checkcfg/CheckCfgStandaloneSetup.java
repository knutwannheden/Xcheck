/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.checkcfg;

/**
 * Initialization support for running Xtext languages without equinox extension registry.
 */
public class CheckCfgStandaloneSetup extends CheckCfgStandaloneSetupGenerated {

  /** Does standalone setup. */
  public static void doSetup() {
    new CheckCfgStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

/* Copyright (c) Avaloq License AG */