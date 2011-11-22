/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.quickfix;

/**
 * The interface ICoreModification is a copy of {@link org.eclipse.xtext.ui.editor.model.edit.IModification}.
 * <p>
 * This class is UI-independent.
 */
public interface ICoreModification {

  /**
   * Applies a textual quickfix.
   * 
   * @param context
   *          the modification context instance
   * @throws Exception
   *           the exception
   */
  void apply(ICoreModificationContext context) throws Exception; // NOPMD copy of IModification

  ICoreModification NULL = new ICoreModification() {
    public void apply(final ICoreModificationContext context) {}
  };
}

/* Copyright (c) Avaloq License AG */