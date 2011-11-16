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