/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

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

/* Copyright (c) Avaloq License AG */