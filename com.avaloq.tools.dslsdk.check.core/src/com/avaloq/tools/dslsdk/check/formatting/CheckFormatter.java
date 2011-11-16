/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the formatting configurationonfidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.formatting;

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.impl.GrammarImpl;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.formatting.XbaseFormatter;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess.XFeatureCallElements;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess.XIfExpressionElements;

import com.avaloq.tools.dslsdk.check.CheckConstants;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.CategoryElements;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.CheckCatalogElements;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.CheckElements;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.ImportElements;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.SeverityRangeElements;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.XIssueExpressionElements;


/**
 * Configures formatting for the Check editor.
 */
public class CheckFormatter extends XbaseFormatter {

  private static final int LINE_WRAP_LENGTH = 132;

  /** {@inheritDoc} */
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    configure(c, checkGrammarAccess());
  }

  /**
   * (Re-) Configure feature call formatting.
   * 
   * @param c
   *          the formatting configuration
   * @param featureCallElements
   *          the feature call elements
   */
  private void configureFeatureCall(final FormattingConfig c, final XFeatureCallElements featureCallElements) {
    // set no space after '::' in CheckUtil::hasQualifiedName(...
    c.setNoSpace().after(featureCallElements.getDeclaringTypeAssignment_1());
  }

  // Override Xbase default formatting:
  // Keep '{' on same line as 'if' keyword (instead of a line wrap before opening curly bracket)
  //
  /** {@inheritDoc} */
  @Override
  public void configureXIfExpression(final FormattingConfig c, final XIfExpressionElements elements) {
    c.setNoSpace().after(elements.getLeftParenthesisKeyword_2());
    c.setNoSpace().before(elements.getRightParenthesisKeyword_4());
    c.setLinewrap().after(elements.getLeftParenthesisKeyword_2()); // changed
    c.setIndentationIncrement().after(elements.getLeftParenthesisKeyword_2()); // changed
    c.setIndentationDecrement().before(elements.getRightParenthesisKeyword_4()); // changed
  }

  /**
   * Configure XIssueExpressions formatting.
   * 
   * @param c
   *          the formatting configuration
   * @param elements
   *          the accessible formattable parser elements
   */
  public void configureXIssueExpression(final FormattingConfig c, final XIssueExpressionElements elements) {
    c.setSpace(" ").after(elements.getOnKeyword_3_0());

    c.setNoSpace().around(elements.getNumberSignKeyword_3_1_0_0());
    c.setNoSpace().around(elements.getNumberSignKeyword_3_1_1_1_0());

    c.setNoSpace().around(elements.getLeftSquareBracketKeyword_3_2_0());
    c.setNoSpace().before(elements.getRightSquareBracketKeyword_3_2_2());

    c.setNoSpace().after(elements.getLeftParenthesisKeyword_5_1());
    c.setNoSpace().before(elements.getCommaKeyword_5_3_0());
    c.setNoSpace().before(elements.getRightParenthesisKeyword_5_4());

    c.setNoSpace().after(elements.getLeftParenthesisKeyword_6_2());
    c.setNoSpace().before(elements.getCommaKeyword_6_4_0());
    c.setNoSpace().before(elements.getRightParenthesisKeyword_6_5());
  }

  /**
   * Configure CheckCatalog formatting.
   * 
   * @param c
   *          the formatting configuration
   * @param elements
   *          the accessible formattable parser elements
   */
  private void configureCheckCatalog(final FormattingConfig c, final CheckCatalogElements elements) {
    c.setLinewrap(0, 0, 0).after(elements.getFinalFinalKeyword_4_0());
    c.setLinewrap(1, 2, 2).before(elements.getFinalFinalKeyword_4_0());

    c.setLinewrap(2, 2, 2).after(elements.getPackageNameAssignment_2());

    c.setLinewrap(2, 2, 2).before(elements.getCatalogKeyword_5());
    c.setLinewrap(1, 1, 1).before(elements.getForKeyword_7_0());
  }

  /**
   * Configure Imports formatting.
   * 
   * @param c
   *          the formatting configuration
   * @param elements
   *          the accessible formattable parser elements
   */
  private void configureImports(final FormattingConfig c, final ImportElements elements) {} // NOPMD

  /**
   * Configure category.
   * 
   * @param c
   *          the formatting configuration
   * @param elements
   *          the accessible formattable parser elements
   */
  private void configureCategory(final FormattingConfig c, final CategoryElements elements) {}// NOPMD

  /**
   * Configures severity range elements. A default severity range should be configured as follows:
   * <p>
   * {@code @SeverityRange(error .. warning)}
   * </p>
   * 
   * @param c
   *          the formatting configuration
   * @param elements
   *          the severity range elements
   */
  private void configureSeverityRange(final FormattingConfig c, final SeverityRangeElements elements) {
    c.setNoSpace().around(elements.getSeverityRangeKeyword_1());
    c.setNoSpace().after(elements.getLeftParenthesisKeyword_2());
    c.setNoSpace().before(elements.getRightParenthesisKeyword_6());
    c.setLinewrap().after(elements.getRightParenthesisKeyword_6());
  }

  /**
   * Configure check.
   * 
   * @param c
   *          the formatting configuration
   * @param elements
   *          the accessible formattable parser elements
   */
  private void configureCheck(final FormattingConfig c, final CheckElements elements) {
    c.setNoSpace().between(elements.getLeftParenthesisKeyword_6_0(), elements.getRightParenthesisKeyword_6_2());
    c.setLinewrap(1, 1, 2).before(elements.getMessageKeyword_7_0());

    c.setNoSpace().after(elements.getLeftParenthesisKeyword_6_0());
    c.setNoSpace().before(elements.getRightParenthesisKeyword_6_2());
    c.setNoSpace().before(elements.getCommaKeyword_6_1_1_0());
    c.setLinewrap(0, 0, 1).after(elements.getCommaKeyword_6_1_1_0());
    c.setIndentation(elements.getLeftParenthesisKeyword_6_0(), elements.getRightParenthesisKeyword_6_2());
    c.setIndentation(elements.getLeftCurlyBracketKeyword_8_0_0(), elements.getRightCurlyBracketKeyword_8_0_2());
    c.setLinewrap(2, 2, 2).around(elements.getContextsAssignment_8_0_1());
  }

  /**
   * Configure the formatter.
   * 
   * @param c
   *          formating configuration
   * @param ga
   *          grammarAccess
   */
  private void configure(final FormattingConfig c, final CheckGrammarAccess ga) {

    super.configure(c, ga.getXbaseWithAnnotationsGrammarAccess());

    // Common curly brackets handling (for check grammar only)
    List<Pair<Keyword, Keyword>> curlyPairs = ga.findKeywordPairs("{", "}");
    for (Pair<Keyword, Keyword> pair : curlyPairs) {
      if (EcoreUtil2.getContainerOfType(pair.getFirst(), GrammarImpl.class).getName().equals(CheckConstants.GRAMMAR)) {
        c.setLinewrap().after(pair.getFirst());
        c.setIndentation(pair.getFirst(), pair.getSecond());
        c.setLinewrap().before(pair.getSecond());
      }
    }

    // AutoLineWrap
    c.setAutoLinewrap(LINE_WRAP_LENGTH);

    // Comments
    c.setLinewrap(0, 1, 2).before(ga.getSL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(ga.getML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(ga.getML_COMMENTRule());

    // Rules
    c.setLinewrap(1, 1, 2).before(ga.getImportRule());
    c.setLinewrap(2, 2, 2).before(ga.getCategoryRule());
    c.setLinewrap(2, 2, 2).before(ga.getImplementationRule());
    c.setLinewrap(2, 2, 2).before(ga.getCheckRule());
    c.setLinewrap(1, 1, 2).before(ga.getXGuardExpressionRule());
    c.setLinewrap(1, 1, 2).before(ga.getXIssueExpressionRule());
    c.setLinewrap(1, 1, 2).before(ga.getXIfExpressionRule());
    c.setLinewrap(1, 1, 2).before(ga.getXVariableDeclarationRule());

    // Rule elements
    configureFeatureCall(c, ga.getXFeatureCallAccess());
    configureCheckCatalog(c, ga.getCheckCatalogAccess());
    configureCategory(c, ga.getCategoryAccess());
    configureImports(c, ga.getImportAccess());
    configureSeverityRange(c, ga.getSeverityRangeAccess());
    configureCheck(c, ga.getCheckAccess());
    configureXIssueExpression(c, ga.getXIssueExpressionAccess());

  }

  /**
   * Gets the Check grammar access.
   * 
   * @return the check grammar access
   */
  protected CheckGrammarAccess checkGrammarAccess() {
    return (CheckGrammarAccess) super.getGrammarAccess();
  }
}

/* Copyright (c) Avaloq License AG */