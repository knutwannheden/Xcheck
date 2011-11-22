/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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

