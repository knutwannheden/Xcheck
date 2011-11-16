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

import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;

import com.avaloq.tools.dslsdk.check.check.SeverityKind;
import com.google.inject.Inject;


/**
 * Provides icons for Check Configuration model elements.
 */
public class CheckCfgImages {

  private static final String RESOURCE_IMAGE = "editor.gif";
  private static final String CATEGORY_IMAGE = "category.gif";
  private static final String ERROR_IMAGE = "error.gif";
  private static final String WARNING_IMAGE = "warning.gif";
  private static final String INFO_IMAGE = "info.gif";
  private static final String IGNORE_IMAGE = "ignore.gif";

  @Inject
  private IImageHelper imageHelper;

  /** @return an image representing a Check Configuration resource */
  public Image forResource() {
    return imageHelper.getImage(RESOURCE_IMAGE);
  }

  /** @return an image representing a Check Configuration */
  public Image forCheckConfiguration() {
    return forResource();
  }

  /** @return an image representing a configured category */
  public Image forConfiguredCatalog() {
    return imageHelper.getImage(CATEGORY_IMAGE);
  }

  /**
   * Returns an image for a Configured Check according to its severity (error, warning, info, ignore).
   * 
   * @param severity
   *          the severity of the check
   * @return an image representing a Configured Check
   */
  public Image forConfiguredCheck(final SeverityKind severity) {
    switch (severity) {
    case ERROR:
      return imageHelper.getImage(ERROR_IMAGE);
    case WARNING:
      return imageHelper.getImage(WARNING_IMAGE);
    case INFO:
      return imageHelper.getImage(INFO_IMAGE);
    default:
    case IGNORE:
      return imageHelper.getImage(IGNORE_IMAGE);
    }
  }

}

/* Copyright (c) Avaloq License AG */