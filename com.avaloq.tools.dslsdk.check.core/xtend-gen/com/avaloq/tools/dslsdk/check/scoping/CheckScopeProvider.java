package com.avaloq.tools.dslsdk.check.scoping;

import com.avaloq.tools.dslsdk.check.CheckConstants;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.CheckPackage.Literals;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

@SuppressWarnings("all")
public class CheckScopeProvider extends XbaseScopeProvider {
  @Inject
  private Factory jvmTypeProviderFactory;
  
  public IScope getScope(final EObject context, final EReference reference) {
      final EObject context_1 = context;
      boolean matched = false;
      if (!matched) {
        if (context_1 instanceof XIssueExpression) {
          final XIssueExpression context_2 = (XIssueExpression) context_1;
          matched=true;
          boolean _operator_equals = ObjectExtensions.operator_equals(reference, Literals.XISSUE_EXPRESSION__MARKER_FEATURE);
          if (_operator_equals) {
            {
              JvmTypeReference _xifexpression = null;
              XExpression _markerObject = context_2.getMarkerObject();
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_markerObject, null);
              if (_operator_notEquals) {
                ITypeProvider _typeProvider = this.getTypeProvider();
                XExpression _markerObject_1 = context_2.getMarkerObject();
                JvmTypeReference _type = _typeProvider.getType(_markerObject_1);
                _xifexpression = _type;
              } else {
                Context _containerOfType = EcoreUtil2.<Context>getContainerOfType(context_2, com.avaloq.tools.dslsdk.check.check.Context.class);
                JvmTypeReference _contextType = _containerOfType.getContextType();
                _xifexpression = _contextType;
              }
              JvmTypeReference jvmTypeRef = _xifexpression;
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(jvmTypeRef, null);
              if (_operator_notEquals_1) {
                {
                  JvmType _type_1 = jvmTypeRef.getType();
                  EClass _classForJvmType = this.classForJvmType(context_2, _type_1);
                  final EClass eClass = _classForJvmType;
                  boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(eClass, null);
                  if (_operator_notEquals_2) {
                    {
                      EList<EStructuralFeature> _eAllStructuralFeatures = eClass.getEAllStructuralFeatures();
                      EList<EStructuralFeature> features = _eAllStructuralFeatures;
                      final Function1<EStructuralFeature,IEObjectDescription> _function = new Function1<EStructuralFeature,IEObjectDescription>() {
                          public IEObjectDescription apply(final EStructuralFeature f) {
                            String _name = f.getName();
                            QualifiedName _create = QualifiedName.create(_name);
                            IEObjectDescription _create_1 = EObjectDescription.create(_create, f);
                            return _create_1;
                          }
                        };
                      Collection<IEObjectDescription> _transform = Collections2.<EStructuralFeature, IEObjectDescription>transform(features, new Function<EStructuralFeature,IEObjectDescription>() {
                          public IEObjectDescription apply(EStructuralFeature from) {
                            return _function.apply(from);
                          }
                      });
                      final Collection<IEObjectDescription> descriptions = _transform;
                      IScope _createScope = MapBasedScope.createScope(IScope.NULLSCOPE, descriptions);
                      return _createScope;
                    }
                  } else {
                    return IScope.NULLSCOPE;
                  }
                }
              } else {
                return IScope.NULLSCOPE;
              }
            }
          } else {
            boolean _operator_equals_1 = ObjectExtensions.operator_equals(reference, Literals.XISSUE_EXPRESSION__CHECK);
            if (_operator_equals_1) {
              {
                CheckCatalog _containerOfType_1 = EcoreUtil2.<CheckCatalog>getContainerOfType(context_2, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
                final CheckCatalog catalog = _containerOfType_1;
                EList<Check> _allChecks = catalog.getAllChecks();
                final Function1<Check,Boolean> _function_1 = new Function1<Check,Boolean>() {
                    public Boolean apply(final Check c) {
                      String _name = c.getName();
                      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
                      return ((Boolean)_operator_notEquals);
                    }
                  };
                Iterable<Check> _filter = IterableExtensions.<Check>filter(_allChecks, _function_1);
                List<Check> _list = IterableExtensions.<Check>toList(_filter);
                final List<Check> checks = _list;
                final Function1<Check,IEObjectDescription> _function_2 = new Function1<Check,IEObjectDescription>() {
                    public IEObjectDescription apply(final Check c) {
                      String _name = c.getName();
                      QualifiedName _create = QualifiedName.create(_name);
                      IEObjectDescription _create_1 = EObjectDescription.create(_create, c);
                      return _create_1;
                    }
                  };
                Collection<IEObjectDescription> _transform_1 = Collections2.<Check, IEObjectDescription>transform(checks, new Function<Check,IEObjectDescription>() {
                    public IEObjectDescription apply(Check from) {
                      return _function_2.apply(from);
                    }
                });
                final Collection<IEObjectDescription> descriptions_1 = _transform_1;
                IScope _xifexpression_1 = null;
                CheckCatalog _includedCatalogs = catalog.getIncludedCatalogs();
                boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_includedCatalogs, null);
                if (_operator_notEquals_3) {
                  CheckCatalog _includedCatalogs_1 = catalog.getIncludedCatalogs();
                  IScope _scope = this.getScope(_includedCatalogs_1, reference);
                  _xifexpression_1 = _scope;
                } else {
                  _xifexpression_1 = IScope.NULLSCOPE;
                }
                final IScope parentScope = _xifexpression_1;
                Predicate<IEObjectDescription> _notNull = Predicates.<IEObjectDescription>notNull();
                Iterable<IEObjectDescription> _filter_1 = Iterables.<IEObjectDescription>filter(descriptions_1, _notNull);
                IScope _createScope_1 = MapBasedScope.createScope(parentScope, _filter_1);
                return _createScope_1;
              }
            }
          }
        }
      }
      if (!matched) {
        if (context_1 instanceof CheckCatalog) {
          final CheckCatalog context_3 = (CheckCatalog) context_1;
          matched=true;
          boolean _operator_equals_2 = ObjectExtensions.operator_equals(reference, Literals.CHECK_CATALOG__GRAMMAR);
          if (_operator_equals_2) {
            {
              final Registry reg = Registry.INSTANCE;
              Map<String,Object> _extensionToFactoryMap = reg.getExtensionToFactoryMap();
              Set<String> _keySet = _extensionToFactoryMap.keySet();
              final Function1<String,IEObjectDescription> _function_3 = new Function1<String,IEObjectDescription>() {
                  public IEObjectDescription apply(final String e) {
                    IEObjectDescription _xblockexpression = null;
                    {
                      String _operator_plus = StringExtensions.operator_plus("foo:/foo.", e);
                      URI _createURI = URI.createURI(_operator_plus);
                      final URI dummyUri = _createURI;
                      IEObjectDescription _xtrycatchfinallyexpression = null;
                      try {
                        {
                          IResourceServiceProvider _resourceServiceProvider = reg.getResourceServiceProvider(dummyUri);
                          IGrammarAccess _get = _resourceServiceProvider.<IGrammarAccess>get(org.eclipse.xtext.IGrammarAccess.class);
                          Grammar _grammar = _get.getGrammar();
                          final Grammar g = _grammar;
                          String _name = g.getName();
                          QualifiedName _create = QualifiedName.create(_name);
                          IEObjectDescription _create_1 = EObjectDescription.create(_create, g);
                          return _create_1;
                        }
                      } catch (final Exception ex) {
                        _xtrycatchfinallyexpression = null;
                      }
                      _xblockexpression = (_xtrycatchfinallyexpression);
                    }
                    return _xblockexpression;
                  }
                };
              Collection<IEObjectDescription> _transform_2 = Collections2.<String, IEObjectDescription>transform(_keySet, new Function<String,IEObjectDescription>() {
                  public IEObjectDescription apply(String from) {
                    return _function_3.apply(from);
                  }
              });
              final Collection<IEObjectDescription> descriptions_2 = _transform_2;
              Predicate<IEObjectDescription> _notNull_1 = Predicates.<IEObjectDescription>notNull();
              Iterable<IEObjectDescription> _filter_2 = Iterables.<IEObjectDescription>filter(descriptions_2, _notNull_1);
              IScope _createScope_2 = MapBasedScope.createScope(IScope.NULLSCOPE, _filter_2);
              return _createScope_2;
            }
          }
        }
      }
      IScope _scope_1 = super.getScope(context, reference);
      return _scope_1;
  }
  
  public EClass classForJvmType(final EObject context, final JvmType jvmType) {
      CheckCatalog _containerOfType = EcoreUtil2.<CheckCatalog>getContainerOfType(context, com.avaloq.tools.dslsdk.check.check.CheckCatalog.class);
      Iterable<EPackage> _ePackagesForCheckCatalog = this.ePackagesForCheckCatalog(_containerOfType);
      final Function1<EPackage,Boolean> _function = new Function1<EPackage,Boolean>() {
          public Boolean apply(final EPackage e) {
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(e, null);
            return ((Boolean)_operator_notEquals);
          }
        };
      Iterable<EPackage> _filter = IterableExtensions.<EPackage>filter(_ePackagesForCheckCatalog, _function);
      final Iterable<EPackage> packages = _filter;
      for (final EPackage p : packages) {
        EList<EClassifier> _eClassifiers = p.getEClassifiers();
        for (final EClassifier c : _eClassifiers) {
          boolean _operator_and = false;
          if (!(c instanceof EClass)) {
            _operator_and = false;
          } else {
            String _instanceClassName = c.getInstanceClassName();
            String _qualifiedName = jvmType.getQualifiedName();
            boolean _equals = _instanceClassName.equals(_qualifiedName);
            _operator_and = BooleanExtensions.operator_and((c instanceof EClass), _equals);
          }
          if (_operator_and) {
            return ((EClass) c);
          }
        }
      }
      return null;
  }
  
  /**
   * Gets a list of EPackage instances.
   */
  public Iterable<EPackage> ePackagesForCheckCatalog(final CheckCatalog catalog) {
      Grammar _grammar = catalog.getGrammar();
      final Grammar grammar = _grammar;
      boolean _operator_equals = ObjectExtensions.operator_equals(grammar, null);
      if (_operator_equals) {
        return Collections.EMPTY_LIST;
      } else {
        {
          EList<AbstractMetamodelDeclaration> _metamodelDeclarations = grammar.getMetamodelDeclarations();
          final Function1<AbstractMetamodelDeclaration,EPackage> _function = new Function1<AbstractMetamodelDeclaration,EPackage>() {
              public EPackage apply(final AbstractMetamodelDeclaration m) {
                EPackage _ePackage = m.getEPackage();
                return _ePackage;
              }
            };
          Collection<EPackage> _transform = Collections2.<AbstractMetamodelDeclaration, EPackage>transform(_metamodelDeclarations, new Function<AbstractMetamodelDeclaration,EPackage>() {
              public EPackage apply(AbstractMetamodelDeclaration from) {
                return _function.apply(from);
              }
          });
          final Collection<EPackage> declarations = _transform;
          final Function1<EPackage,String> _function_1 = new Function1<EPackage,String>() {
              public String apply(final EPackage d) {
                String _nsURI = d.getNsURI();
                return _nsURI;
              }
            };
          Collection<String> _transform_1 = Collections2.<EPackage, String>transform(declarations, new Function<EPackage,String>() {
              public String apply(EPackage from) {
                return _function_1.apply(from);
              }
          });
          final Collection<String> nsUris = _transform_1;
          final Function1<String,EPackage> _function_2 = new Function1<String,EPackage>() {
              public EPackage apply(final String u) {
                EPackage _ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage(u);
                return _ePackage;
              }
            };
          Collection<EPackage> _transform_2 = Collections2.<String, EPackage>transform(nsUris, new Function<String,EPackage>() {
              public EPackage apply(String from) {
                return _function_2.apply(from);
              }
          });
          final Function1<EPackage,Boolean> _function_3 = new Function1<EPackage,Boolean>() {
              public Boolean apply(final EPackage e) {
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(e, null);
                return ((Boolean)_operator_notEquals);
              }
            };
          Iterable<EPackage> _filter = IterableExtensions.<EPackage>filter(_transform_2, _function_3);
          final Iterable<EPackage> registeredPackages = _filter;
          boolean _isEmpty = IterableExtensions.isEmpty(registeredPackages);
          if (_isEmpty) {
            return declarations;
          } else {
            return registeredPackages;
          }
        }
      }
  }
  
  public IScope createLocalVarScope(final IScope parent, final LocalVariableScopeContext scopeContext) {
      EObject _context = scopeContext.getContext();
      final EObject context = _context;
      boolean matched = false;
      if (!matched) {
        if (context instanceof Check) {
          final Check context_1 = (Check) context;
          matched=true;
          {
            EList<FormalParameter> _formalParameters = context_1.getFormalParameters();
            final Function1<FormalParameter,IEObjectDescription> _function = new Function1<FormalParameter,IEObjectDescription>() {
                public IEObjectDescription apply(final FormalParameter parameter) {
                  IEObjectDescription _createIEObjectDescription = CheckScopeProvider.this.createIEObjectDescription(parameter);
                  return _createIEObjectDescription;
                }
              };
            List<IEObjectDescription> _map = ListExtensions.<FormalParameter, IEObjectDescription>map(_formalParameters, _function);
            final List<IEObjectDescription> descriptions = _map;
            IScope _createLocalVarScope = super.createLocalVarScope(parent, scopeContext);
            IScope _createScope = MapBasedScope.createScope(_createLocalVarScope, descriptions);
            return _createScope;
          }
        }
      }
      if (!matched) {
        if (context instanceof Context) {
          final Context context_2 = (Context) context;
          matched=true;
          {
            JvmTypeReference _contextType = context_2.getContextType();
            JvmType _type = _contextType==null?(JvmType)null:_contextType.getType();
            final JvmType jvmType = _type;
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(jvmType, null);
            if (_operator_notEquals) {
              {
                QualifiedName _xifexpression = null;
                String _it = context_2.getIt();
                boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_it, null);
                if (_operator_notEquals_1) {
                  String _it_1 = context_2.getIt();
                  QualifiedName _create = QualifiedName.create(_it_1);
                  _xifexpression = _create;
                } else {
                  _xifexpression = CheckConstants.QNIT;
                }
                final QualifiedName thisVar = _xifexpression;
                IScope _createLocalVarScope_1 = super.createLocalVarScope(parent, scopeContext);
                IEObjectDescription _create_1 = EObjectDescription.create(thisVar, jvmType);
                Set<IEObjectDescription> _singleton = Collections.<IEObjectDescription>singleton(_create_1);
                SimpleScope _simpleScope = new SimpleScope(_createLocalVarScope_1, _singleton);
                return _simpleScope;
              }
            }
          }
        }
      }
      IScope _createLocalVarScope_2 = super.createLocalVarScope(parent, scopeContext);
      return _createLocalVarScope_2;
  }
  
  public IEObjectDescription createIEObjectDescription(final FormalParameter formalParameter) {
    JvmFormalParameter _parameter = formalParameter.getParameter();
    String _name = _parameter.getName();
    QualifiedName _create = QualifiedName.create(_name);
    JvmFormalParameter _parameter_1 = formalParameter.getParameter();
    IEObjectDescription _create_1 = EObjectDescription.create(_create, _parameter_1, null);
    return _create_1;
  }
}
