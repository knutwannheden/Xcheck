/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.Import;
import com.google.inject.Inject;


/**
 * Provides labels for a EObjects.
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class CheckLabelProvider extends DefaultEObjectLabelProvider {

  @Inject
  private CheckImages images;

  @Inject
  public CheckLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }

  /**
   * A text for category labels.
   * 
   * @param context
   *          any context
   * @return a textual representation of the category
   */
  public String text(final Context context) {
    return context.getContextType().getSimpleName();
  }

  /**
   * A text for check labels.
   * 
   * @param check
   *          any check
   * @return a textual representation of the check
   */
  public String text(final Check check) {
    return check.getName();
  }

  /**
   * A text for category labels.
   * 
   * @param category
   *          any category
   * @return a textual representation of the category
   */
  public String text(final Category category) {
    return category.getName();
  }

  /**
   * An image for catalog labels.
   * 
   * @param catalog
   *          any catalog
   * @return a graphical representation of the catalog
   */
  public Image image(final CheckCatalog catalog) {
    return images.forCheckCatalog();
  }

  /**
   * An image for category labels.
   * 
   * @param category
   *          any category
   * @return a graphical representation of the category
   */
  public Image image(final Category category) {
    return images.forCategory();
  }

  /**
   * An image for import labels.
   * 
   * @param imported
   *          any import
   * @return a graphical representation of the import
   */
  public Image image(final Import imported) {
    return images.forImport();
  }

  /**
   * An image for check labels.
   * 
   * @param check
   *          any check
   * @return a graphical representation of the check
   */
  public Image image(final Check check) {
    return images.forCheck(check.getDefaultSeverity());
  }

  /**
   * An image for context labels.
   * 
   * @param context
   *          any context
   * @return a graphical representation of the context
   */
  public Image image(final Context context) {
    return images.forContext();
  }
}

