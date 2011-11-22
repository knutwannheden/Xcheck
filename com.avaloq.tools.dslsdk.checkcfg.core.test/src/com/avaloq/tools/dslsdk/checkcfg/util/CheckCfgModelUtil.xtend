/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.checkcfg.util

/*
 * Provides utility operations for Check Configuration model stubs. Only partial models
 * are returned as strings.
 */
class CheckCfgModelUtil {

  def String basicModel() {'''
    check configuration "Testing" {'''.toString
  }

  def String basicModelWithCatalog() {
    basicModel + '''
      catalog Sample {'''.toString
  }

  def String basicModelWithTest() {
    basicModelWithCatalog + '''
      Test'''.toString
  }

  def String basicModelWithDisabledTest() {
    basicModelWithCatalog + '''
      ignore Test'''.toString
  }

}