/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.test.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

import com.avaloq.test.swtbot.SwtWorkbenchBot;
import com.avaloq.tools.dslsdk.check.ui.test.swtbot.SwtWizardBot;
import com.avaloq.tools.dslsdk.check.ui.wizard.Messages;


/**
 * Util class for the Check project and Check catalog wizard tests.
 */
public final class CheckWizardTestUtil {

  private static final Logger LOG = Logger.getLogger(CheckWizardTestUtil.class);
  /** button labels. */
  public static final String FINISH = "Finish";
  public static final String BACK = "< Back";
  public static final String NEXT = "Next >";

  /** input strings for wizard testing. */
  private static final String EMPTY_STRING = "";
  private static final String CORRECT_CATALOG_NAME = "Cc";
  private static final String CORRECT_PACKAGE_NAME = "p.p";

  private CheckWizardTestUtil() {
    // prevent class from being instantiated.
  }

  /**
   * Select a folder in a project.
   * 
   * @param bot
   *          the bot
   * @param folderName
   *          the folder name
   */
  public static void selectProjectFolder(final SwtWorkbenchBot bot, final String folderName) {
    SWTBotView packageExplorer = bot.viewByTitle("Package Explorer");
    packageExplorer.show();
    Composite comp = (Composite) packageExplorer.getWidget();
    Tree tree = bot.widget(WidgetMatcherFactory.widgetOfType(Tree.class), comp);
    SWTBotTree botTree = new SWTBotTree(tree);
    if (!selectItem(botTree, folderName)) {
      LOG.error("folder was not found");
    }
  }

  /**
   * Select a TreeItem with the given name in a tree.
   * 
   * @param tree
   *          the tree in which the item is searched
   * @param name
   *          the name of the required item
   * @return true, if the item was selected
   */
  public static boolean selectItem(final SWTBotTree tree, final String name) {
    SWTBotTreeItem[] items = tree.getAllItems();
    for (SWTBotTreeItem item : items) {
      if (selectTreeItem(item, name)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Select a tree item.
   * 
   * @param treeItem
   *          the tree node
   * @param name
   *          the name of the item to look for
   * @return true, if item was found and selected
   */
  private static boolean selectTreeItem(final SWTBotTreeItem treeItem, final String name) {
    if (name.equals(treeItem.getText())) {
      treeItem.select();
      return true;
    }
    if (!treeItem.isExpanded()) {
      treeItem.expand();
    }
    for (SWTBotTreeItem item : treeItem.getItems()) {
      if (selectTreeItem(item, name)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Assert buttons are correctly enabled.
   * 
   * @param nextIsEnabled
   *          is next button enabled
   * @param backIsEnabled
   *          is the back button enabled
   * @param finishIsEnabled
   *          is the finish button enabled
   * @param swtWizardBot
   *          the wizard
   */
  public static void assertButtonsEnabled(final boolean nextIsEnabled, final boolean backIsEnabled, final boolean finishIsEnabled, final SwtWizardBot swtWizardBot) {
    if (nextIsEnabled) {
      assertTrue("Next button is enabled", swtWizardBot.button(NEXT).isEnabled());
    } else {
      assertFalse("Next button is disabled", swtWizardBot.button(NEXT).isEnabled());
    }
    if (backIsEnabled) {
      assertTrue("Back button is enabled", swtWizardBot.button(BACK).isEnabled());
    } else {
      assertFalse("Back button is disabled", swtWizardBot.button(BACK).isEnabled());
    }
    if (finishIsEnabled) {
      assertTrue("Finish button is enabled", swtWizardBot.button(FINISH).isEnabled());
    } else {
      assertFalse("Finish button is disabled", swtWizardBot.button(FINISH).isEnabled());
    }
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   * 
   * @param wizard
   *          the wizard
   */

  public static void projectNameIsInvalid(final SwtWizardBot wizard) {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, EMPTY_STRING);
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, ".project.name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, "Project.name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, "projectName");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, "project. name ");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, "project..name");
    assertButtonsEnabled(false, true, false, wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   * 
   * @param wizard
   *          the wizard
   */
  public static void projectNameIsValid(final SwtWizardBot wizard) {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, "project.name");
    CheckWizardTestUtil.assertButtonsEnabled(true, true, false, wizard);

    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, "projectname");
    CheckWizardTestUtil.assertButtonsEnabled(true, true, false, wizard);
  }

  /**
   * Test if the next and finish button are disabled if the package name is invalid.
   * * @param wizard
   * the wizard
   */
  public static void packageNameIsInvalid(final SwtWizardBot wizard) {

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, CORRECT_CATALOG_NAME);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, EMPTY_STRING);
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, ".package.name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, "Package.name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, "packageName");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, "package. name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, "package..name");
    assertButtonsEnabled(false, true, false, wizard);
  }

  /**
   * Test if the finish button is enabled if the package name is valid.
   * 
   * @param wizard
   *          the wizard
   */
  public static void packageNameIsValid(final SwtWizardBot wizard) {

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, CORRECT_CATALOG_NAME);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, "package.name");
    assertButtonsEnabled(false, true, true, wizard);

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, "packagename");
    assertButtonsEnabled(false, true, true, wizard);
  }

  /**
   * Test if the next and finish button are disabled if the catalog name is invalid.
   * * @param wizard
   * the wizard
   */
  public static void catalogNameIsInvalid(final SwtWizardBot wizard) {

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, CORRECT_PACKAGE_NAME);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, "catalog.name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, "catalog*name");
    assertButtonsEnabled(false, true, false, wizard);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, ",catalogname");
    assertButtonsEnabled(false, true, false, wizard);

  }

  /**
   * Test if the finish button is enabled if the catalog name is deprecated.
   * * @param wizard
   * the wizard
   */
  public static void catalogNameIsDeprecated(final SwtWizardBot wizard) {
    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, CORRECT_PACKAGE_NAME);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, "catalogname");
    assertButtonsEnabled(false, true, true, wizard);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, "catalogName");
    assertButtonsEnabled(false, true, true, wizard);
  }

  /**
   * Test if the finish button is enabled if the catalog name is valid.
   * * @param wizard
   * the wizard
   */
  public static void catalogNameIsValid(final SwtWizardBot wizard) {

    wizard.writeToInputField(Messages.PACKAGE_NAME_LABEL, CORRECT_PACKAGE_NAME);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, "Catalogname");
    assertButtonsEnabled(false, true, true, wizard);

    wizard.writeToInputField(Messages.CATALOG_FIELD_NAME_LABEL, "CatalogName");
    assertButtonsEnabled(false, true, true, wizard);
  }

}

/* Copyright (c) Avaloq License AG */