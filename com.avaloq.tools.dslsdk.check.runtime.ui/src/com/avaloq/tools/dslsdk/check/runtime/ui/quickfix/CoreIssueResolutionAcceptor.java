/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.ui.quickfix;

import java.util.List;

import org.eclipse.xtext.validation.Issue;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.CoreIssueResolution;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.CoreSemanticModificationWrapper;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreModification;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreSemanticModification;
import com.google.common.collect.Lists;
import com.google.inject.Inject;


/**
 * Copy of org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor.
 * <p>
 * Defines a concrete acceptor for issue resolutions. Is used in quickfix implementations to add document modifications.
 */
// CHECKSTYLE:OFF copied class
public class CoreIssueResolutionAcceptor implements ICoreIssueResolutionAcceptor2 {

  private final List<CoreIssueResolution> issueResolutions = Lists.newArrayList();

  private final CoreIssueModificationContext.Factory modificationContextFactory;

  @Inject
  public CoreIssueResolutionAcceptor(final CoreIssueModificationContext.Factory modificationContextFactory) {
    this.modificationContextFactory = modificationContextFactory;
  }

  public void accept(final Issue issue, final String label, final String description, final String image, final ICoreModification modification) {
    issueResolutions.add(new CoreIssueResolution(label, description, image, modificationContextFactory.createModificationContext(issue), modification));
  }

  public void accept(final Issue issue, final String label, final String description, final String image, final ICoreSemanticModification semanticModification) {
    CoreSemanticModificationWrapper modificationWrapper = new CoreSemanticModificationWrapper(issue.getUriToProblem(), semanticModification);
    issueResolutions.add(new CoreIssueResolution(label, description, image, modificationContextFactory.createModificationContext(issue), modificationWrapper));
  }

  public List<CoreIssueResolution> getIssueResolutions() {
    return issueResolutions;
  }

}

/* Copyright (c) Avaloq License AG */