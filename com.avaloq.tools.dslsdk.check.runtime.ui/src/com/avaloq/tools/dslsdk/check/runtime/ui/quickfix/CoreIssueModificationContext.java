/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.ui.quickfix;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.validation.Issue;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreModificationContext;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreXtextDocument;
import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.Provider;


/**
 * Copy of org.eclipse.xtext.ui.editor.model.edit.IssueModificationContext.
 * <p>
 * Defines a the concrete context for textual and semantic document modifications.
 */
// CHECKSTYLE:OFF copied class
public class CoreIssueModificationContext implements ICoreModificationContext {

  @Inject
  private IURIEditorOpener editorOpener;

  private Issue issue;

  public void setIssue(final Issue issue) {
    this.issue = issue;
  }

  public Issue getIssue() {
    return issue;
  }

  public ICoreXtextDocument getXtextDocument() {
    return getXtextDocument(issue.getUriToProblem());
  }

  public ICoreXtextDocument getXtextDocument(final URI uri) {
    IEditorPart editor = editorOpener.open(uri, false);
    if (editor instanceof XtextEditor) {
      XtextEditor xtextEditor = (XtextEditor) editor;
      return new XtextDocumentAdapter(xtextEditor.getDocument());
    }
    return null;
  }

  @ImplementedBy(Factory.Default.class)
  public static interface Factory {
    ICoreModificationContext createModificationContext(Issue issue);

    public static class Default implements Factory {

      @Inject
      private Provider<CoreIssueModificationContext> provider;

      public ICoreModificationContext createModificationContext(final Issue issue) {
        CoreIssueModificationContext modificationContext = provider.get();
        modificationContext.setIssue(issue);
        return modificationContext;
      }

    }
  }

}

