/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.ui.test;

import java.util.Collections;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.avaloq.tools.dslsdk.check.ui.test.internal.CheckWizardUiTestInjectorProvider;
import com.avaloq.tools.dslsdk.check.ui.test.swtbot.SwtWizardBot;
import com.avaloq.tools.dslsdk.check.ui.test.util.CheckWizardTestUtil;
import com.avaloq.tools.dslsdk.check.ui.wizard.Messages;
import com.google.inject.Inject;
import com.google.inject.Provider;


/**
 * The CheckProjectWizardTestBackup tests the Check Project Wizard.
 */
@InjectWith(CheckWizardUiTestInjectorProvider.class)
@RunWith(XtextRunner.class)
public class CheckCatalogWizardTest extends TestCase {

  private static final String SRC_FOLDER = "src";
  private static final String CHECK_CATALOG = "Check Catalog";

  /** input strings for wizard testing. */
  private static final String CORRECT_PACKAGE_NAME = "p.p";

  private static final Logger LOG = Logger.getLogger(CheckCatalogWizardTest.class);

  private SwtWizardBot wizard;
  private static IProject project;
  // private static IJavaProject jProject;

  @Inject
  private Provider<PluginProjectFactory> projectFactoryProvider;

  /**
   * Creates a project.
   * 
   * @return a created project
   */
  private IProject createProject() {
    PluginProjectFactory factory = projectFactoryProvider.get();
    factory.setProjectName("project.name");

    factory.addFolders(Collections.singletonList(SRC_FOLDER));
    factory.addBuilderIds(JavaCore.BUILDER_ID);
    factory.addProjectNatures(JavaCore.NATURE_ID);

    IProject testProject = factory.createProject(new NullProgressMonitor(), null);
    IJavaProject jProject = JavaCore.create(testProject);

    IFolder sourceFolder = testProject.getFolder(SRC_FOLDER);
    IPackageFragmentRoot root = jProject.getPackageFragmentRoot(sourceFolder);
    try {
      root.createPackageFragment(CORRECT_PACKAGE_NAME, false, null);
    } catch (JavaModelException e1) {
      LOG.error("create package" + e1.getMessage());
    }
    return testProject;
  }

  /**
   * Start again the Check project wizard before every test.
   */
  @Override
  @Before
  public void setUp() {
    wizard = new SwtWizardBot();
    project = createProject();
  }

  /**
   * Test if the package field contains the selected package.
   */
  @Test
  public void packageSelected() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);
    wizard.initializeWizardBot(CHECK_CATALOG);
    // because the selected item is a package initially, this package is shown in the field.
    assertEquals("Initial package is entered", CORRECT_PACKAGE_NAME, wizard.textWithLabel(Messages.PACKAGE_NAME_LABEL).getText());
  }

  /**
   * Test if catalog wizard is enabled if a project folder is selected.
   */
  @Test
  public void checkCatalogWizardIsEnabled() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);
    // open the check catalog wizard after having selected the project source folder.
    // that way, the wizard page should be enabled.
    wizard.initializeWizardBot(CHECK_CATALOG);

    assertNotNull("wizard was found", wizard);
    assertTrue("catalog field is enabled", wizard.textWithLabel(Messages.CATALOG_FIELD_NAME_LABEL).isEnabled());
    assertTrue("package field is enabled", wizard.textWithLabel(Messages.PACKAGE_NAME_LABEL).isEnabled());
    CheckWizardTestUtil.assertButtonsEnabled(false, true, false, wizard);
  }

  /**
   * Test if the package field is empty, if the selected item is no package.
   */
  @Test
  public void noPackageSelected() {
    CheckWizardTestUtil.selectProjectFolder(wizard, SRC_FOLDER);
    wizard.initializeWizardBot(CHECK_CATALOG);

    // because the selected item is not a package initially, the field has to be empty.
    assertSame("Initially, no package is selected", wizard.textWithLabel(Messages.PACKAGE_NAME_LABEL).getText().length(), 0);
  }

  /**
   * Test if the next and finish button are disabled if the package name is invalid.
   */
  @Test
  public void packageNameIsInvalid() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);
    // open the check catalog wizard after having selected the project source folder.
    wizard.initializeWizardBot(CHECK_CATALOG);

    CheckWizardTestUtil.packageNameIsInvalid(wizard);

  }

  /**
   * Test if the finish button is enabled if the package name is valid.
   */
  @Test
  public void packageNameIsValid() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);
    // open the check catalog wizard after having selected the project source folder.
    wizard.initializeWizardBot(CHECK_CATALOG);

    CheckWizardTestUtil.packageNameIsValid(wizard);

  }

  /**
   * Test if the next and finish button are disabled if the catalog name is invalid.
   */
  @Test
  public void catalogNameIsInvalid() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);
    // open the check catalog wizard after having selected the project source folder.
    wizard.initializeWizardBot(CHECK_CATALOG);

    CheckWizardTestUtil.catalogNameIsInvalid(wizard);

  }

  /**
   * Test if the finish button is enabled if the catalog name is deprecated.
   */
  @Test
  public void catalogNameIsDeprecated() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);

    wizard.initializeWizardBot(CHECK_CATALOG);

    CheckWizardTestUtil.catalogNameIsDeprecated(wizard);

  }

  /**
   * Test if the finish button is enabled if the catalog name is valid.
   */
  @Test
  public void catalogNameIsValid() {
    CheckWizardTestUtil.selectProjectFolder(wizard, CORRECT_PACKAGE_NAME);

    wizard.initializeWizardBot(CHECK_CATALOG);

    CheckWizardTestUtil.catalogNameIsValid(wizard);

  }

  /**
   * Close the wizard after every test.
   * 
   * @throws CoreException
   *           if project doesn't exist.
   */
  @After
  @Override
  public void tearDown() throws CoreException {
    wizard.closeWizard();
    project.delete(true, new NullProgressMonitor());
  }

}