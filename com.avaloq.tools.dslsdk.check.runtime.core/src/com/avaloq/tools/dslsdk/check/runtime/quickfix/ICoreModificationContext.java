/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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

