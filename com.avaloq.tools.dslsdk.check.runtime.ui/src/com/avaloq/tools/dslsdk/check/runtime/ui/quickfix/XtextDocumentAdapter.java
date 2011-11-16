/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 88document.7 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.ui.quickfix;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.BadLocationException;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreXtextDocument;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.IRegion;


/** Adapter for the XtextDocument class. */
public class XtextDocumentAdapter implements ICoreXtextDocument {

  private final IXtextDocument document;

  public XtextDocumentAdapter(final IXtextDocument document) {
    this.document = document;
  }

  /** {@inheritDoc} */
  public <T> T readOnly(final IUnitOfWork<T, XtextResource> work) {
    return document.readOnly(work);
  }

  /** {@inheritDoc} */
  public <T> T modify(final IUnitOfWork<T, XtextResource> work) {
    return document.modify(work);
  }

  /** {@inheritDoc} */
  public <T> T getAdapter(final Class<T> adapterType) {
    return document.getAdapter(adapterType);
  }

  /** {@inheritDoc} */
  public char getChar(final int offset) throws BadLocationException {
    try {
      return document.getChar(offset);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public int getLength() {
    return document.getLength();
  }

  /** {@inheritDoc} */
  public String get() {
    return document.get();
  }

  /** {@inheritDoc} */
  public String get(final int offset, final int length) throws BadLocationException {
    try {
      return document.get(offset, length);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public void set(final String text) {
    document.set(text);
  }

  /** {@inheritDoc} */
  public void replace(final int offset, final int length, final String text) throws BadLocationException {
    try {
      document.replace(offset, length, text);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public int getLineLength(final int line) throws BadLocationException {
    try {
      return document.getLineLength(line);
    } catch (org.eclipse.jface.text.BadLocationException e) {

      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public int getLineOfOffset(final int offset) throws BadLocationException {
    try {
      return document.getLineOfOffset(offset);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public int getLineOffset(final int line) throws BadLocationException {
    try {
      return document.getLineOffset(line);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public IRegion getLineInformation(final int line) throws BadLocationException {
    try {
      final org.eclipse.jface.text.IRegion lineInformation = document.getLineInformation(line);
      return new IRegion() {
        public int getOffset() {
          return lineInformation.getOffset();
        }

        public int getLength() {
          return lineInformation.getLength();
        }
      };
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public IRegion getLineInformationOfOffset(final int offset) throws BadLocationException {
    try {
      final org.eclipse.jface.text.IRegion lineInformationOfOffset = document.getLineInformationOfOffset(offset);
      return new IRegion() {
        public int getOffset() {
          return lineInformationOfOffset.getOffset();
        }

        public int getLength() {
          return lineInformationOfOffset.getLength();
        }
      };
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }

  }

  /** {@inheritDoc} */
  public int getNumberOfLines() {
    return document.getNumberOfLines();
  }

  /** {@inheritDoc} */
  public int getNumberOfLines(final int offset, final int length) throws BadLocationException {
    try {
      return document.getNumberOfLines(offset, length);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  public int computeNumberOfLines(final String text) {
    return document.computeNumberOfLines(text);
  }

  /** {@inheritDoc} */
  public String[] getLegalLineDelimiters() {
    return document.getLegalLineDelimiters();
  }

  /** {@inheritDoc} */
  public String getLineDelimiter(final int line) throws BadLocationException {
    try {
      return document.getLineDelimiter(line);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }

  /** {@inheritDoc} */
  @Deprecated
  public int search(final int startOffset, final String findString, final boolean forwardSearch, final boolean caseSensitive, final boolean wholeWord) throws BadLocationException {
    try {
      return document.search(startOffset, findString, forwardSearch, caseSensitive, wholeWord);
    } catch (org.eclipse.jface.text.BadLocationException e) {
      throw new BadLocationException(e);
    }
  }
}

/* Copyright (c) Avaloq License AG */