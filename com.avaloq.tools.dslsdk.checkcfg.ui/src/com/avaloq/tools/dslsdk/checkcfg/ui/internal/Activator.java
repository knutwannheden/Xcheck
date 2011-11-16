/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.checkcfg.ui.internal;



/**
 * Configures a custom Check Configuration plug-in activator.
 */
public class Activator extends CheckCfgActivator {

  /**
   * Gets the Check Configuration plug-in ID.
   * 
   * @return the plugin ID
   */
  public static String getPluginId() {
    return CheckCfgActivator.getInstance().getBundle().getSymbolicName();
  }

}

/* Copyright (c) Avaloq License AG */