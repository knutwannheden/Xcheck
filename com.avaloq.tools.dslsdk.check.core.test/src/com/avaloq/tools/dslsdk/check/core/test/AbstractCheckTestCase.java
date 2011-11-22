/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.core.test;

import static com.google.common.collect.Lists.*;
import static com.google.common.collect.Sets.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil;
import org.eclipse.xtext.ui.junit.util.JavaProjectSetupUtil;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.AfterClass;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;


/**
 * An abstract test class for tests on Check models. Allows creating a project and adding files.
 */
public abstract class AbstractCheckTestCase extends TestCase {

  private static final int TWO_KILO_BYTES = 2048;

  public static final String TESTPROJECT_NAME = "test.project";
  private static final Logger LOGGER = Logger.getLogger(AbstractCheckTestCase.class);

  private static IProject project;
  private final Set<IFile> files = newHashSet();
  private static final List<String> REQUIRED_BUNDLES = newArrayList("org.eclipse.xtext.xbase.lib", "org.eclipse.xtext.xtend2.lib", //
      "org.eclipse.emf.ecore", "com.avaloq.tools.dslsdk.check.core", "com.avaloq.tools.dslsdk.check.runtime.core", "org.eclipse.xtext", //
      "org.eclipse.osgi", "org.eclipse.xtend", "org.eclipse.core.runtime", "org.eclipse.xtext.xbase");

  @Inject
  private FileExtensionProvider fileExtensionProvider;

  @Inject
  private Provider<PluginProjectFactory> projectFactoryProvider;

  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;

  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String languageName;

  /**
   * Gets the project.
   * 
   * @return the project
   */
  protected IProject getProject() {
    try {
      return getOrCreatePluginProject();
    } catch (CoreException e) {
      return null;
    }
  }

  public String getEditorID() {
    return languageName;
  }

  /**
   * Clean up after all tests have terminated.
   */
  @AfterClass
  public static void cleanUp() {
    try {
      if (project != null) {
        deleteProject(project);
      }
      IResourcesSetupUtil.cleanWorkspace();
    } catch (CoreException e) {
      LOGGER.error(e.getMessage(), e);
    }
  }

  /**
   * Delete a given project.
   * 
   * @param someProject
   *          the project
   * @throws CoreException
   *           the core exception
   */
  public static void deleteProject(final IProject someProject) throws CoreException {
    if (someProject.exists()) {
      if (someProject.isOpen()) {
        someProject.close(null);
      }
      someProject.delete(true, true, null);
    }
  }

  public Set<IFile> getFiles() {
    return files;
  }

  /**
   * Creates a file with given name and contents.
   * 
   * @param fileName
   *          the file name
   * @param content
   *          the file content
   * @return the file
   * @throws Exception
   *           the exception
   */
  public IFile createFile(final String fileName, final String content) throws Exception { // NOPMD
    String fullFileName = getFullFileName(fileName);
    IFile file = IResourcesSetupUtil.createFile(fullFileName, content);
    getFiles().add(file);
    return file;
  }

  /**
   * Gets the full file name.
   * 
   * @param fileName
   *          the file name
   * @return the full file name
   */
  protected String getFullFileName(final String fileName) {
    if (fileName.contains("/")) {
      // it is assumed that a fully qualified file name is provided, only add the project name suffix
      return '/' + TESTPROJECT_NAME + '/' + fileName;
    }
    String extension = (fileName.indexOf('.') != -1) ? "" : '.' + fileExtensionProvider.getPrimaryFileExtension();
    return getSourceFolderPath() + fileName + extension;
  }

  /**
   * Gets the contents of a given file. Contents are returned as a single string.
   * 
   * @param file
   *          the file
   * @return the file contents
   * @throws Exception
   *           the exception
   */
  public String getContents(final IFile file) throws Exception { // NOPMD
    InputStream inputStream = file.getContents();
    try {
      byte[] buffer = new byte[TWO_KILO_BYTES];
      int bytesRead = 0;
      StringBuffer b = new StringBuffer();
      do {
        bytesRead = inputStream.read(buffer);
        if (bytesRead != -1) {
          b.append(new String(buffer, 0, bytesRead));
        }
      } while (bytesRead != -1);
      return b.toString();
    } finally {
      inputStream.close();
    }
  }

  /**
   * Gets the model.
   * 
   * @param fileName
   *          the file name
   * @param content
   *          the content
   * @return the model
   * @throws Exception
   *           the exception
   */
  public EObject getModel(final String fileName, final String content) throws Exception { // NOPMD
    IFile file = createFile(fileName, content);
    Resource resource = getResourceSet().createResource(uri(file));
    resource.load(new StringInputStream(content), null);
    assertEquals(resource.getErrors().toString(), 0, resource.getErrors().size());
    return resource.getContents().get(0);
  }

  /**
   * Gets the URI for a given file.
   * 
   * @param file
   *          the file
   * @return the URI
   */
  public URI uri(final IFile file) {
    return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
  }

  /**
   * Gets the resource set.
   * 
   * @return the resource set
   */
  public ResourceSet getResourceSet() {
    return resourceSetProvider.get();
  }

  /**
   * Gets the top-level model object contained by a file with given file name.
   * 
   * @param fileName
   *          the file name
   * @return the top-level model object
   * @throws Exception
   *           the exception
   */
  public EObject getModel(final String fileName) throws Exception { // NOPMD
    IFile file = getFile(fileName);
    Resource resource = getResourceSet().createResource(uri(file));
    resource.load(file.getContents(), null);
    assertEquals(resource.getErrors().toString(), 0, resource.getErrors().size());
    return resource.getContents().get(0);
  }

  /**
   * Gets the file with given file name.
   * 
   * @param fileName
   *          the file name
   * @return the file
   */
  private IFile getFile(final String fileName) {
    final String fileNameWithExtension = fileName.indexOf('.') > 0 ? fileName : fileName + '.' + fileExtensionProvider.getPrimaryFileExtension();
    return Iterables.find(files, new Predicate<IFile>() {
      public boolean apply(final IFile input) {
        return fileNameWithExtension.equals(input.getName());
      }
    });
  }

  /**
   * Gets the project or creates and returns it if it is <code>null</code>.
   * 
   * @return the project
   * @throws CoreException
   *           the core exception
   */
  protected IProject getOrCreatePluginProject() throws CoreException {
    if (project == null) {
      PluginProjectFactory projectFactory = projectFactoryProvider.get();
      projectFactory.setProjectName(TESTPROJECT_NAME);
      projectFactory.addFolders(Collections.singletonList(getSourceFolderName()));
      projectFactory.addBuilderIds(JavaCore.BUILDER_ID, "org.eclipse.pde.ManifestBuilder", "org.eclipse.pde.SchemaBuilder", XtextProjectHelper.BUILDER_ID);
      projectFactory.addProjectNatures(JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID);
      projectFactory.addRequiredBundles(REQUIRED_BUNDLES);
      IProject result = projectFactory.createProject(new NullProgressMonitor(), null);
      IJavaProject javaProject = JavaCore.create(result);
      JavaProjectSetupUtil.makeJava5Compliant(javaProject);
      JavaProjectSetupUtil.addJre15ClasspathEntry(javaProject);
      project = result;
    }
    return project;
  }

  protected String getSourceFolderName() {
    return "src";
  }

  /**
   * Adds sources with given file names to the {@link #getSourceFolderName()} folder of current project. If resources
   * to be added to workspace do not contain a file extension in their file name, it is nevertheless added on files
   * created.
   * 
   * @param clazz
   *          the clazz
   * @param sourceFileNames
   *          the source file names
   */
  public void addSourcesToWorkspace(final Class<? extends AbstractCheckTestCase> clazz, final List<String> sourceFileNames) {
    try {
      new WorkspaceModifyOperation() {
        @Override
        protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
          for (int i = 0; i < sourceFileNames.size(); i++) {
            final String fileName = sourceFileNames.get(i);
            final String contents = getNormalizedContents(clazz, fileName);

            // Create URI including file extension
            URI resourceURI = URI.createPlatformResourceURI(getFullFileName(fileName), true);
            IFile file = IResourcesSetupUtil.createFile(resourceURI.toPlatformString(true), contents);
            getFiles().add(file);
          }
        }
      }.run(new NullProgressMonitor());
    } catch (InvocationTargetException e) {
      fail("Error adding files to workspace: " + e.getMessage());
    } catch (InterruptedException e) {
      fail("Error adding files to workspace: " + e.getMessage());
    }
    assertEquals("All files successfully added to workspace", sourceFileNames.size(), getFiles().size());
  }

  /**
   * Gets the full path to the {@link #getSourceFolderName()} folder.
   * 
   * @return the source folder path
   */
  protected String getSourceFolderPath() {
    return '/' + TESTPROJECT_NAME + '/' + getSourceFolderName() + '/';
  }

  /**
   * Gets the normalized contents.
   * 
   * @param clazz
   *          the class
   * @param modelName
   *          the contents
   * @return the normalized contents
   */
  private String getNormalizedContents(final Class<? extends AbstractCheckTestCase> clazz, final String modelName) {
    try {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      copy(clazz.getResourceAsStream(modelName), out);
      String modelContents = out.toString();
      return modelContents.replace("\r\n", "\n").replace("\r", "\n"); //$NON-NLS-1$ //$NON-NLS-2$
    } catch (IOException e) {
      LOGGER.error(e.getMessage(), e);
    }
    return modelName;
  }

	private static long copy(final InputStream input, final OutputStream output) throws IOException {
		byte[] buffer = new byte[8192];
		try {
			long count = 0;
			int n = 0;
			while (-1 != (n = input.read(buffer))) {
				output.write(buffer, 0, n);
				count += n;
			}
			return count;
		} finally {
			output.close();
			input.close();
		}
	}

}

/* Copyright (c) Avaloq License AG */