/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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

