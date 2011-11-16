package com.avaloq.tools.dslsdk.check.ui.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.avaloq.tools.dslsdk.check.ui.test.internal.CheckWizardUiTestInjectorProvider;
import com.avaloq.tools.dslsdk.check.ui.test.swtbot.SwtWizardBot;
import com.avaloq.tools.dslsdk.check.ui.test.util.CheckWizardTestUtil;
import com.avaloq.tools.dslsdk.check.ui.wizard.Messages;


/**
 * The CheckProjectWizardTest tests the Check Project Wizard.
 */
@InjectWith(CheckWizardUiTestInjectorProvider.class)
@RunWith(XtextRunner.class)
public class CheckProjectWizardTest {

  /** input strings for wizard testing. */
  private static final String CORRECT_PROJECT_NAME = "p.n";

  private SwtWizardBot wizard;

  /**
   * Start again the Check project wizard before every test.
   */
  @Before
  public void setUp() {
    wizard = new SwtWizardBot();
    wizard.initializeWizardBot("Check Project");
  }

  /**
   * Check if the project wizard is available.
   */
  @Test
  public void checkProjectWizardIsAvailable() {
    assertNotNull("the project wizard was found", wizard);
    CheckWizardTestUtil.assertButtonsEnabled(false, true, false, wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void projectNameIsInvalid() {
    CheckWizardTestUtil.projectNameIsInvalid(wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void projectNameIsValid() {
    CheckWizardTestUtil.projectNameIsValid(wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void packageNameIsInvalid() {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, CORRECT_PROJECT_NAME);
    wizard.changeToNextPage();

    CheckWizardTestUtil.packageNameIsInvalid(wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void packageNameIsValid() {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, CORRECT_PROJECT_NAME);
    wizard.changeToNextPage();

    CheckWizardTestUtil.packageNameIsValid(wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void catalogNameIsInvalid() {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, CORRECT_PROJECT_NAME);
    wizard.changeToNextPage();

    CheckWizardTestUtil.catalogNameIsInvalid(wizard);

  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void catalogNameIsDeprecated() {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, CORRECT_PROJECT_NAME);
    wizard.changeToNextPage();
    CheckWizardTestUtil.catalogNameIsDeprecated(wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void catalogNameIsValid() {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, CORRECT_PROJECT_NAME);
    wizard.changeToNextPage();

    CheckWizardTestUtil.catalogNameIsValid(wizard);
  }

  /**
   * Test if the buttons 'next', 'back' and 'finish' are correctly enabled/disabled.
   */
  @Test
  public void fieldValuesAfterPageChange() {
    wizard.writeToInputField(Messages.PROJECT_NAME_LABEL, CORRECT_PROJECT_NAME);
    wizard.changeToPreviousPage();
    wizard.changeToNextPage();
    assertEquals("Project input stays unchanged", CORRECT_PROJECT_NAME, wizard.textWithLabel(Messages.PROJECT_NAME_LABEL).getText());
    wizard.changeToNextPage();
    assertEquals("Initially, package name equals to project name", CORRECT_PROJECT_NAME, wizard.textWithLabel(Messages.PACKAGE_NAME_LABEL).getText());
  }

  /**
   * Close the wizard after every test.
   */
  @After
  public void tearDown() {
    wizard.closeWizard();
  }

}