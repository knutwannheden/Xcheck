/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.internal;

/**
 * Plug-in Activator.
 */
public class Activator extends CheckActivator {

  public static String getPluginId() {
    return CheckActivator.getInstance().getBundle().getSymbolicName();
  }

}

/* Copyright (c) Avaloq License AG */