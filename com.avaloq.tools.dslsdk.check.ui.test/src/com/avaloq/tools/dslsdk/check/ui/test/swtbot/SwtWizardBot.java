/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.test.swtbot;

import org.apache.log4j.Logger;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;

import com.avaloq.test.swtbot.SwtWorkbenchBot;
import com.avaloq.tools.dslsdk.check.ui.test.util.CheckWizardTestUtil;


/**
 * An SwtBot to manipulate a wizard.
 */
public class SwtWizardBot extends SwtWorkbenchBot {

  private static final String NEXT = "Next >";
  private static final Logger LOG = Logger.getLogger("SwtWizardBot");

  /** The bot. */
  private SwtWorkbenchBot bot;

  /**
   * Initialize the SwtWizardBot.
   * 
   * @param wizardName
   *          the wizard name
   */
  public void initializeWizardBot(final String wizardName) {
    bot = new SwtWorkbenchBot();
    getNewWizards(wizardName);
    clickButton(NEXT);
  }

  /**
   * Close the wizard.
   */
  public void closeWizard() {
    clickButton("Cancel");
  }

  /**
   * Write some input in the field with the given label.
   * 
   * @param label
   *          the field in which the input is written
   * @param input
   *          an input
   */
  public void writeToInputField(final String label, final String input) {
    SWTBotText text = bot.textWithLabel(label);
    text.setText(input);
  }

  /**
   * Click the button with the given label.
   * 
   * @param label
   *          the label of the button
   */
  @Override
  public void clickButton(final String label) {
    bot.clickButton(label);
  }

  /**
   * If available and enabled change to previous wizard page.
   */
  public void changeToPreviousPage() {
    if (bot.button("< Back").isEnabled()) {
      clickButton("< Back");
    } else {
      LOG.error("the wizard page has no previous page.");
    }
  }

  /**
   * If available and enabled change to next wizard page.
   */
  public void changeToNextPage() {
    if (bot.button(NEXT).isEnabled()) {
      clickButton(NEXT);
    } else {
      LOG.error("the wizard page has no next page.");
    }
  }

  /**
   * Get the wizard.
   * 
   * @param wizardName
   *          name of the required wizard
   */
  private void getNewWizards(final String wizardName) {
    this.menu("File").menu("New").menu("Other...").click();
    SWTBotShell shell = bot.shell("New");
    shell.activate();
    if (!CheckWizardTestUtil.selectItem(this.tree(), wizardName)) {
      LOG.error("Wizard '" + wizardName + "' does not exist.");
    }

  }
}

/* Copyright (c) Avaloq License AG */