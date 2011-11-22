/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.builder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.core.plugin.IFragmentModel;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.TargetPlatformHelper;
import org.eclipse.pde.internal.core.plugin.WorkspaceFragmentModel;
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModel;
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModelBase;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.editor.plugin.ManifestEditor;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.MergeableManifest;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Strings;

import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.ui.builder.util.CheckPreferencesExtensionUtil;
import com.avaloq.tools.dslsdk.check.ui.builder.util.CheckQuickfixExtensionUtil;
import com.avaloq.tools.dslsdk.check.ui.builder.util.CheckValidatorExtensionUtil;
import com.avaloq.tools.dslsdk.check.ui.internal.Activator;
import com.avaloq.tools.dslsdk.check.ui.wizard.Messages;
import com.avaloq.tools.dslsdk.check.util.GrammarHelper;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;


/**
 * A Builder Participant for the Check Language, that takes care of the plugin extension registry.
 */
@SuppressWarnings("restriction")
public class CheckBuilderParticipant extends BuilderParticipant {

  private static final Logger LOGGER = Logger.getLogger(CheckBuilderParticipant.class);

  private static final IProgressMonitor NULL_PROGRESS_MONITOR = new NullProgressMonitor();

  @Inject
  private IResourceServiceProvider resourceServiceProvider;

  @Inject
  private IStorage2UriMapper mapper;

  @Inject
  private CheckValidatorExtensionUtil validatorUtil;

  @Inject
  private CheckQuickfixExtensionUtil quickfixProviderUtil;

  @Inject
  private CheckPreferencesExtensionUtil preferencesUtil;

  private final ProjectUtil projectUtil = new ProjectUtil(); // TODO refactor with Carl...

  private IProgressMonitor progressMonitor;

  @Override
  public void build(final IBuildContext context, final IProgressMonitor monitor) throws CoreException {
    if (!isEnabled(context)) {
      return;
    }
    this.progressMonitor = monitor;
    super.build(context, monitor);

    for (Delta delta : context.getDeltas()) {
      if (delta.getNew() == null) {
        handleDeletion(delta, context);
      }
    }
  }

  /**
   * Gets current progress monitor instance or a default {@link NullProgressMonitor} if none is set.
   * 
   * @return a progress monitor
   */
  private IProgressMonitor getProgressMonitor() {
    if (progressMonitor != null) {
      return progressMonitor;
    } else {
      return NULL_PROGRESS_MONITOR;
    }
  }

  @Override
  protected void handleChangedContents(final Delta delta, final IBuildContext context, final EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
    if (isAffected(delta, context)) {
      super.handleChangedContents(delta, context, fileSystemAccess);
      try {
        new CheckGenerator(context, delta.getUri()).changePluginXmlFile();
      } catch (CoreException e) {
        LOGGER.error(e.getMessage(), e);
      }
    }
  }

  /**
   * Removes corresponding entries from plugin.xml.
   * 
   * @param delta
   *          delta of deleted resource
   * @param context
   *          build context
   */
  protected void handleDeletion(final Delta delta, final IBuildContext context) {
    if (isAffected(delta, context)) {
      try {
        new CheckGenerator(context, delta.getUri()).removeFromPluginXmlFile();
      } catch (CoreException e) {
        LOGGER.error(e.getMessage(), e);
      }
    }
  }

  /**
   * Returns true if the delta is a Check file and it has not errors.
   * 
   * @param delta
   *          the delta
   * @param context
   *          the build context
   * @return the affected resource if any, null otherwise
   */
  protected boolean isAffected(final Delta delta, final IBuildContext context) {
    return resourceServiceProvider.canHandle(delta.getUri());
  }

  /**
   * The enumeration used for identifying plugin extension IDs.
   */
  enum ExtensionType {
    ALL, // Matches all extension types
    VALIDATOR, // Check validator extension
    QUICKFIX, // Check quickfix extension
    PREFERENCE_INITIALIZER // Extension for preference initializers
  }

  /**
   * The class responsible for the manipulation of plugin.xml extensions.
   */
  // CHECKSTYLE:OFF (abstraction coupling)
  class CheckGenerator {
    // CHECKSTYLE:ON

    private final URI uri;
    private final IBuildContext context;
    private Resource resource;

    public CheckGenerator(final IBuildContext context, final URI uri) {
      this.context = context;
      this.uri = uri;
    }

    public URI getURI() {
      return uri;
    }

    /**
     * Gets the ID for the extension to be created in the {@code plugin.xml} file. The extension consists
     * of current Java package as a prefix and ends with the name of current resource, all in lower case
     * letters. This means that multiple resources with equal name may exist, but only when not in the same
     * package. Another consequence is that name comparison of resources is case <em>insensitive</em>.
     * <p>
     * Note that every extension point supported has unique extension IDs. The following rules apply:
     * <ul>
     * <li>extensions for the validator point have a ".validator" suffix
     * <li>extensions for the quickfix point have a ".quickfix" suffix
     * <li>extensions for the preference initializer point have a ".preference" suffix
     * </ul>
     * If this operation is called using {@link ExtensionType#ALL}, an ID without this last segment consisting of "." followed by the suffix is returned. Note
     * also that {@link #findExtensions(IPluginModelBase, ExtensionType)} with {@link ExtensionType#ALL} matches all extensions for a given catalog.
     * </p>
     * <p>
     * Returns {@code null} if none could be determined.
     * </p>
     * 
     * @param typeId
     *          the type id
     * @return the extension ID for current Catalog or {@code null}
     */
    public String getExtensionId(final ExtensionType typeId) {
      if (uri == null) {
        // should not happen
        LOGGER.warn("Could not calculate extension ID to Check extension point: target URI is undefined");
        return null;
      }

      StringBuilder result = new StringBuilder();

      IPath path = new Path(uri.toPlatformString(true));
      final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
      // file may be null if it could not be created; this is the case if the uri points to the 'bin' folder
      // for instance
      if (file != null && file.getParent() instanceof IFolder) {
        IJavaElement element = JavaCore.create(file.getParent());
        if (element instanceof PackageFragment) {
          final String packagePath = ((PackageFragment) element).getElementName();
          final String resourceName = getURI().trimFileExtension().lastSegment();
          result.append(packagePath).append('.').append(resourceName);
          switch (typeId) {
          case VALIDATOR:
            result.append(".validator");
            break;
          case QUICKFIX:
            result.append(".quickfix");
            break;
          case PREFERENCE_INITIALIZER:
            result.append(".preference");
            break;
          default: // ALL
            break; // the string without last segment, including dot delimiter, is returned
          }
          return result.toString().toLowerCase();
        }
      } else {
        LOGGER.warn("Could not calculate extension ID to Check extension point for " + uri);
      }
      return null;
    }

    /**
     * @return the resource associated to the URI (possibly load the resource)
     */
    public Resource getResource() {
      if (resource == null) {
        resource = context.getResourceSet().getResource(uri, true);
      }
      return resource;
    }

    /**
     * Gets the current resource's top-level object, which is expected to be of type {@link CheckCatalog} or {@code null} if no such top-level type found.
     * 
     * @return the check catalog or {@code null}
     */
    public CheckCatalog getCatalog() {
      if (getResource() == null || !(getResource().getContents().get(0) instanceof CheckCatalog)) { // NOPMD null check required
        return null;
      }
      return (CheckCatalog) getResource().getContents().get(0);
    }

    /**
     * Get the ID of the plug-in in which the extension is created.
     * 
     * @return the plug-in name or {@code null}
     */
    private String getPluginId() {
      final IProject project = getProject();
      if (project == null || PluginRegistry.findModel(project) == null) {
        return null;
      }
      return PluginRegistry.findModel(project).getPluginBase().getId();
    }

    /**
     * Checks if given check catalog has a resolvable grammar.
     * 
     * @param catalog
     *          a catalog
     * @return {@code true} if the catalog has a grammar that is resolvable
     */
    private boolean hasGrammar(final CheckCatalog catalog) {
      Grammar grammar = catalog.getGrammar();
      return grammar != null && !grammar.eIsProxy();
    }

    /**
     * Add an extension to the <code>plugin.xml</code> file.
     * 
     * @throws CoreException
     *           the core exception
     */
    public void changePluginXmlFile() throws CoreException {
      CheckCatalog catalog = getCatalog();
      if (catalog == null) {
        throw new CoreException(new Status(IStatus.ERROR, Activator.getPluginId(), IStatus.ERROR, "No Catalog found", null)); //$NON-NLS-1$
      }

      if (getExtensionId(ExtensionType.ALL) != null) { // will be true if at least one extension for given catalog is defined
        IFile file = getFile();
        if (!file.exists()) {
          createNewFile(catalog, file);
        } else {
          changeExtension(catalog, file);
        }
      } else {
        LOGGER.warn("Could not modify plugin.xml file, no extension found for uri " + uri);
      }

    }

    /**
     * Add an extension to the <code>plugin.xml</code> file.
     * 
     * @throws CoreException
     *           the core exception
     */
    public void removeFromPluginXmlFile() throws CoreException {
      IFile file = getFile();
      if (file.exists()) {
        removeExtension(file);
      }
    }

    /**
     * Returns the {@link ExtensionType} for a given plugin extension.
     * 
     * @param extension
     *          the extension
     * @return the extension type
     */
    private ExtensionType getExtensionType(final IPluginExtension extension) {
      if (extension.getPoint().equals(CheckValidatorExtensionUtil.CHECK_EXTENSION_POINT_ID)) {
        return ExtensionType.VALIDATOR;
      } else if (extension.getPoint().equals(CheckPreferencesExtensionUtil.PREFERENCES_EXTENSION_POINT_ID)) {
        return ExtensionType.PREFERENCE_INITIALIZER;
      } else if (extension.getPoint().equals(CheckQuickfixExtensionUtil.QUICKFIX_EXTENSION_POINT_ID)) {
        return ExtensionType.QUICKFIX;
      }
      return null;
    }

    /**
     * Modifies an existing a new <code>plugin.xml</code> file.
     * 
     * @param catalog
     *          the check catalog
     * @param pluginxml
     *          the plugin.xml file to modify
     * @throws CoreException
     *           if an error occurred while modifying the plugin.xml file
     * @see org.eclipse.pde.internal.ui.wizards.product.ProductIntroOperation
     */
    private void changeExtension(final CheckCatalog catalog, final IFile pluginxml) throws CoreException { // NOPMD NPath complexity
      IStatus status = PDEPlugin.getWorkspace().validateEdit(new IFile[] {pluginxml}, null); // null means don't contact me...
      if (status.getSeverity() != IStatus.OK) {
        throw new CoreException(new Status(IStatus.ERROR, Activator.getPluginId(), IStatus.ERROR, NLS.bind(Messages.EXTENSION_MODIFICATION_READONLY, getPluginId()), null));
      }

      final ModelModification modification = new ModelModification(pluginxml) {
        @Override
        protected void modifyModel(final IBaseModel model, final IProgressMonitor monitor) throws CoreException {// NOPMD NPath complexity
          if (!(model instanceof IPluginModelBase)) {
            return;
          }
          IPluginModelBase pluginModel = (IPluginModelBase) model;
          // @Format-Off
          Collection<IPluginExtension> catalogExtensions = findExtensions(pluginModel, ExtensionType.ALL);
          Iterable<ExtensionType> registeredExtensionTypes = findExtensionTypes(catalogExtensions);

            // Update extensions as appropriate
            for (IPluginExtension extension : catalogExtensions) {
              List<IPluginObject> children = Lists.newArrayList(extension.getChildren());
              Iterable<IPluginElement> elements = Iterables.filter(children, IPluginElement.class);
              if (hasGrammar(catalog)) {
                if (validatorUtil.isExtensionUpdateRequired(catalog, extension, elements)) {
                  validatorUtil.updateExtension(catalog, extension, elements);
                  mergeManifest();
                } else if (quickfixProviderUtil.isExtensionUpdateRequired(catalog, extension, elements)) {
                  quickfixProviderUtil.updateExtension(catalog, extension, elements);
                } else if (preferencesUtil.isExtensionUpdateRequired(catalog, extension, elements)) {
                  preferencesUtil.updateExtension(catalog, extension, elements);
                }
              } else {
                pluginModel.getPluginBase().remove(extension); // no extensions for Catalogs without valid grammar
              }
            }
            
            // Add extensions if they're missing
            if (!Iterables.contains(registeredExtensionTypes, ExtensionType.VALIDATOR) 
              && getExtensionId(ExtensionType.VALIDATOR) != null && hasGrammar(catalog)) {
              IPluginExtension p = validatorUtil.createExtension(catalog, getExtensionId(ExtensionType.VALIDATOR), pluginModel);
              pluginModel.getPluginBase().add(p);
              mergeManifest(); // also merge manifest
              
              if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Updated plugin.xml of " + pluginxml.getProject().getName() + " with Check validator extension " + p.getId());
              }
            }
            if (!Iterables.contains(registeredExtensionTypes, ExtensionType.QUICKFIX) 
                && getExtensionId(ExtensionType.QUICKFIX) != null && hasGrammar(catalog)) {
              IPluginExtension p = quickfixProviderUtil.createExtension(catalog, getExtensionId(ExtensionType.QUICKFIX), pluginModel);
              pluginModel.getPluginBase().add(p);
              
              if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Updated plugin.xml of " + pluginxml.getProject().getName() + " with Check quickfix extension " + p.getId());
              }
            }
            if (!Iterables.contains(registeredExtensionTypes, ExtensionType.PREFERENCE_INITIALIZER) 
              && getExtensionId(ExtensionType.PREFERENCE_INITIALIZER) != null && hasGrammar(catalog)) {
              IPluginExtension p = preferencesUtil.createExtension(catalog, getExtensionId(ExtensionType.PREFERENCE_INITIALIZER), pluginModel);
              pluginModel.getPluginBase().add(p);
              
              if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Updated plugin.xml of " + pluginxml.getProject().getName() + " with preference initialization extension " + p.getId());
              }
            }
          // @Format-On
        }

        @Override
        public boolean saveOpenEditor() {
          return false; // do nothing with any open editor...
        }
      };
      modifyModel(modification);
    }

    /**
     * Performs modifications to the Plugin Model.
     * 
     * @param modification
     *          a modification
     */
    private void modifyModel(final ModelModification modification) {
      // PDEModelUtility.changesForModelModication(modification, getProgressMonitor());
      Display.getDefault().syncExec(new Runnable() {

        public void run() {
          ManifestEditor editor = PDEModelUtility.getOpenManifestEditor(getProject());

          if (editor == null) {
            PDEModelUtility.modifyModel(modification, getProgressMonitor());
          } else {
            LOGGER.error(NLS.bind("An editor is already open for {0}.", getProject().getName()));
          }
        }
      });

    }

    /**
     * Gets current project from the {@link ProjectUtil project utility} instance.
     * 
     * @return the project
     */
    private IProject getProject() {
      return projectUtil.getProject(uri);
    }

    /**
     * Merges the {@code MANIFEST.MF} file with new plug-in dependencies. Adds dependencies as returned by
     * {@link com.avaloq.tools.dslsdk.check.util.GrammarHelper#getRequiredBundleSymbolicNames()} of current
     * check catalog to the MANIFEST.MF file.
     */
    public void mergeManifest() {
      final IProject project = getProject();
      final IFile file = PDEProject.getManifest(project);

      if (file.exists() && getCatalog() != null) {
        try {
          MergeableManifest manifest = new MergeableManifest(file.getContents(), project.getName());
          manifest.addRequiredBundles(new GrammarHelper(getCatalog().getGrammar()).getRequiredBundleSymbolicNames());
          if (manifest.isModified()) {
            OutputStream os = new FileOutputStream(file.getLocation().toFile(), false);
            manifest.write(os);
            os.close();
            file.refreshLocal(0, getProgressMonitor());
          }
        } catch (IOException e) {
          throw new WrappedException(e);
        } catch (CoreException e) {
          throw new WrappedException(e);
        }
      }

    }

    /**
     * Finds extensions of given {@link ExtensionType extension type} in given {@link IPluginModelBase plugin model}.
     * If {@code type} is {@link ExtensionType#ALL}, all extensions which may be mapped to {@link ExtensionType} are
     * returned. (They must have an ID pattern as defined in {@link CheckGenerator#getExtensionId(ExtensionType)}).
     * 
     * @param pluginModel
     *          the plugin in which to find the extensions
     * @param type
     *          the extension type to be looked up
     * @return a collection of extensions in the plugin.xml that match given extension type
     */
    private Collection<IPluginExtension> findExtensions(final IPluginModelBase pluginModel, final ExtensionType type) {
      IPluginExtension[] pluginExtensions = pluginModel.getPluginBase().getExtensions();
      return Collections2.filter(Arrays.asList(pluginExtensions), new Predicate<IPluginExtension>() {
        public boolean apply(final IPluginExtension extension) {
          String extensionPointId = null;
          final String currentExtensionId = extension.getId();
          switch (type) {
          case VALIDATOR:
            extensionPointId = CheckValidatorExtensionUtil.CHECK_EXTENSION_POINT_ID;
            break;
          case QUICKFIX:
            extensionPointId = CheckQuickfixExtensionUtil.QUICKFIX_EXTENSION_POINT_ID;
            break;
          case PREFERENCE_INITIALIZER:
            extensionPointId = CheckPreferencesExtensionUtil.PREFERENCES_EXTENSION_POINT_ID;
            break;
          default: // ALL: do not compare the extension point!
            final int pos = currentExtensionId.lastIndexOf('.');
            return pos != -1 && currentExtensionId.substring(0, pos).equals(getExtensionId(type));
          }
          return Strings.equal(currentExtensionId, getExtensionId(type)) && Strings.equal(extension.getPoint(), extensionPointId);
        }
      });
    }

    /**
     * Finds extension point types used in a given set of extensions. Returns a non-null list of extension types.
     * 
     * @param extensions
     *          the extensions
     * @return the non-{@code null} list of {@link ExtensionType extension types}
     */
    private Iterable<ExtensionType> findExtensionTypes(final Collection<IPluginExtension> extensions) {
      return Iterables.filter(Iterables.transform(extensions, new Function<IPluginExtension, ExtensionType>() {
        public ExtensionType apply(final IPluginExtension from) {
          return getExtensionType(from);
        }
      }), Predicates.notNull());
    }

    /**
     * Removes extensions registered for a check catalog. All extensions as returned by {@link #findExtensions(IPluginModelBase, ExtensionType) findExtensions}
     * with extension type {@link ExtensionType#ALL ALL}.
     * <p>
     * No modification is done if the plugin.xml editor is opened.
     * </p>
     * 
     * @param pluginxml
     *          the plugin.xml file to be modified
     * @throws CoreException
     *           if the file is read-only and cannot be edited
     */
    private void removeExtension(final IFile pluginxml) throws CoreException {
      IStatus status = PDEPlugin.getWorkspace().validateEdit(new IFile[] {pluginxml}, null); // null means don't contact me...
      if (status.getSeverity() != IStatus.OK) {
        throw new CoreException(new Status(IStatus.ERROR, "com.avaloq.tools.dslsdk.check.ui", IStatus.ERROR, NLS.bind(Messages.EXTENSION_MODIFICATION_READONLY, getPluginId()), null)); //$NON-NLS-1$
      }

      final ModelModification mod = new ModelModification(pluginxml) {
        @Override
        protected void modifyModel(final IBaseModel model, final IProgressMonitor monitor) throws CoreException {
          if (!(model instanceof IPluginModelBase)) {
            return;
          }
          IPluginModelBase pluginModel = (IPluginModelBase) model;
          for (IPluginExtension extension : findExtensions(pluginModel, ExtensionType.ALL)) {
            pluginModel.getPluginBase().remove(extension);
          }
        }

        @Override
        public boolean saveOpenEditor() {
          return false; // prevent modifications
        }
      };
      modifyModel(mod);
    }

    /**
     * Get the plugin.xml file of current project.
     * 
     * @return the plugin.xml file
     */
    protected IFile getFile() {
      final IProject project = getProject();
      return PluginRegistry.findModel(project) instanceof IFragmentModel ? PDEProject.getFragmentXml(project) : PDEProject.getPluginXml(project);
    }

    /**
     * Create a new plugin.xml file.
     * 
     * @param catalog
     *          the built catalog
     * @param pluginxml
     *          the file (not existing)
     * @throws CoreException
     *           if the plug-in extension could not be created
     * @see org.eclipse.pde.internal.ui.wizards.product.ProductIntroOperation
     */
    private void createNewFile(final CheckCatalog catalog, final IFile pluginxml) throws CoreException {
      WorkspacePluginModelBase pluginModel = (WorkspacePluginModelBase) getModel(pluginxml);
      IPluginBase base = pluginModel.getPluginBase();
      base.setSchemaVersion(TargetPlatformHelper.getSchemaVersion());
      base.add(validatorUtil.createExtension(catalog, getExtensionId(ExtensionType.VALIDATOR), pluginModel));
      base.add(quickfixProviderUtil.createExtension(catalog, getExtensionId(ExtensionType.QUICKFIX), pluginModel));
      base.add(preferencesUtil.createExtension(catalog, getExtensionId(ExtensionType.PREFERENCE_INITIALIZER), pluginModel));
      mergeManifest();
      pluginModel.save();
    }

    /**
     * Returns the plugin model associated to the given file.
     * 
     * @param file
     *          a plugin.xml file
     * @return a plugin model
     */
    protected IPluginModelBase getModel(final IFile file) {
      if (ICoreConstants.PLUGIN_FILENAME_DESCRIPTOR.equals(file.getName())) {
        return new WorkspacePluginModel(file, false);
      }
      return new WorkspaceFragmentModel(file, false);
    }

  }

  /**
   * Class providing utility methods for projects.
   */
  class ProjectUtil {

    /**
     * Get the project containing the file indicated by a URI.
     * 
     * @param uri
     *          the URI
     * @return the containing project
     */
    public IProject getProject(final URI uri) {
      return findFileStorage(uri).getProject();
    }

    /**
     * Return the IFile for a given URI.
     * 
     * @param uri
     *          the URI of the resource for which an IFile is to be returned
     * @return the file corresponding to the URI
     */
    private IFile findFileStorage(final URI uri) {
      Iterable<Pair<IStorage, IProject>> storages = mapper.getStorages(uri);
      try {
        Pair<IStorage, IProject> fileStorage = Iterables.find(storages, new Predicate<Pair<IStorage, IProject>>() {
          public boolean apply(final Pair<IStorage, IProject> input) {
            IStorage storage = input.getFirst();
            if (storage instanceof IFile) {
              return true;
            }
            return false;
          }
        });

        return (IFile) fileStorage.getFirst();
      } catch (NoSuchElementException e) {
        throw new IllegalArgumentException("Cannot find file storage for " + uri, e); //$NON-NLS-1$
      }
    }
  }
}

