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

import org.eclipse.emf.common.util.URI;


/**
 * Copy of Xtext's {@link org.eclipse.xtext.ui.editor.model.edit.IModificationContext IModificationContext}.
 * <p>
 * This class is UI-independent.
 */
public interface ICoreModificationContext {

  /**
   * Gets the ICoreXtextDocument instance.
   * 
   * @return a document
   */
  ICoreXtextDocument getXtextDocument();

  /**
   * Gets the ICoreXtextDocument instance for a given URI.
   * 
   * @param uri
   *          a URI
   * @return the ICoreXtextDocument
   */
  ICoreXtextDocument getXtextDocument(URI uri);

}

/* Copyright (c) Avaloq License AG */