/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;


/**
 * A HighlightingConfiguration for the Check language. Highlights the javadoc comments as
 * blue instead of green...
 */
@SuppressWarnings("restriction")
public class CheckHighlightingConfiguration extends XbaseHighlightingConfiguration {

  public static final String JAVADOC_ID = "javadoc";

  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(JAVADOC_ID, "JavaDoc", javaDocCommentTextStyle());
  }

  /**
   * @return a bluish TextStyle for JavaDoc comments
   */
  public TextStyle javaDocCommentTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    // CHECKSTYLE:OFF
    textStyle.setColor(new RGB(63, 95, 191));
    // CHECKSTYLE:ON
    return textStyle;
  }

}

