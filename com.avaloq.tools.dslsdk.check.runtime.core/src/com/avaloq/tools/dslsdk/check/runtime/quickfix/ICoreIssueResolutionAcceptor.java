/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.quickfix;

import java.util.List;

import org.eclipse.xtext.validation.Issue;


/**
 * The Interface ICoreIssueResolutionAcceptor provides hooks for creating document modifications in quickfix
 * providers.
 * <p>
 * See also {@link org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor}.
 * <p>
 * This class is UI-independent.
 */
public interface ICoreIssueResolutionAcceptor {

  /**
   * Interface for accepting diagnostics, typically textual quickfixes.
   * 
   * @param issue
   *          the issue
   * @param label
   *          the label
   * @param description
   *          the description
   * @param image
   *          the image
   * @param modification
   *          the modification
   */
  void accept(final Issue issue, final String label, final String description, final String image, final ICoreModification modification);

  /**
   * Interface for accepting diagnostics, typically semantic quickfixes.
   * 
   * @param issue
   *          the issue
   * @param label
   *          the label
   * @param description
   *          the description
   * @param image
   *          the image
   * @param semanticModification
   *          the semantic modification
   */
  void accept(final Issue issue, final String label, final String description, final String image, final ICoreSemanticModification semanticModification);

  /**
   * Gets the issue resolutions.
   * 
   * @return the issue resolutions
   */
  List<CoreIssueResolution> getIssueResolutions();

}

/* Copyright (c) Avaloq License AG */