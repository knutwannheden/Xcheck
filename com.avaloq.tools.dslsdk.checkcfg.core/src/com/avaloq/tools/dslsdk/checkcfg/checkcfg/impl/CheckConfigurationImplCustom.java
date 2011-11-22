/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl; // NOPMD should be changed

/**
 * Configures custom behavior for the Check Configuration model element.
 */
public class CheckConfigurationImplCustom extends CheckConfigurationImpl {

  /**
   * Converts the given label to a Java identifier.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public String getName() {
    return com.avaloq.tools.dslsdk.check.util.CheckUtil.toIdentifier(this.getLabel());
  }

}

/* Copyright (c) Avaloq License AG */