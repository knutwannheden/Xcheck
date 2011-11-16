/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.checkcfg.checkcfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgFactory
 * @model kind="package"
 * @generated
 */
public interface CheckcfgPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "checkcfg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.avaloq.com/tools/dslsdk/checkcfg/CheckCfg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "checkcfg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheckcfgPackage eINSTANCE = com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl <em>Check Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getCheckConfiguration()
	 * @generated
	 */
	int CHECK_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONFIGURATION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Catalog Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONFIGURATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Check Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCatalogImpl <em>Configured Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCatalogImpl
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getConfiguredCatalog()
	 * @generated
	 */
	int CONFIGURED_CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CATALOG__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Check Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CATALOG__CHECK_CONFIGURATIONS = 1;

	/**
	 * The number of structural features of the '<em>Configured Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CATALOG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCheckImpl <em>Configured Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCheckImpl
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getConfiguredCheck()
	 * @generated
	 */
	int CONFIGURED_CHECK = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CHECK__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CHECK__CHECK = 1;

	/**
	 * The feature id for the '<em><b>Parameter Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CHECK__PARAMETER_CONFIGURATIONS = 2;

	/**
	 * The number of structural features of the '<em>Configured Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_CHECK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredParameterImpl <em>Configured Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredParameterImpl
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getConfiguredParameter()
	 * @generated
	 */
	int CONFIGURED_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER__NEW_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Configured Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURED_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind <em>Severity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getSeverityKind()
	 * @generated
	 */
	int SEVERITY_KIND = 4;


	/**
	 * Returns the meta object for class '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration <em>Check Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Configuration</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration
	 * @generated
	 */
	EClass getCheckConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getLabel()
	 * @see #getCheckConfiguration()
	 * @generated
	 */
	EAttribute getCheckConfiguration_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getCatalogConfigurations <em>Catalog Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog Configurations</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getCatalogConfigurations()
	 * @see #getCheckConfiguration()
	 * @generated
	 */
	EReference getCheckConfiguration_CatalogConfigurations();

	/**
	 * Returns the meta object for the attribute '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getName()
	 * @see #getCheckConfiguration()
	 * @generated
	 */
	EAttribute getCheckConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog <em>Configured Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Catalog</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog
	 * @generated
	 */
	EClass getConfiguredCatalog();

	/**
	 * Returns the meta object for the reference '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catalog</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog#getCatalog()
	 * @see #getConfiguredCatalog()
	 * @generated
	 */
	EReference getConfiguredCatalog_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog#getCheckConfigurations <em>Check Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Configurations</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog#getCheckConfigurations()
	 * @see #getConfiguredCatalog()
	 * @generated
	 */
	EReference getConfiguredCatalog_CheckConfigurations();

	/**
	 * Returns the meta object for class '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck <em>Configured Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Check</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck
	 * @generated
	 */
	EClass getConfiguredCheck();

	/**
	 * Returns the meta object for the attribute '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getSeverity()
	 * @see #getConfiguredCheck()
	 * @generated
	 */
	EAttribute getConfiguredCheck_Severity();

	/**
	 * Returns the meta object for the reference '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Check</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getCheck()
	 * @see #getConfiguredCheck()
	 * @generated
	 */
	EReference getConfiguredCheck_Check();

	/**
	 * Returns the meta object for the containment reference list '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getParameterConfigurations <em>Parameter Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Configurations</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getParameterConfigurations()
	 * @see #getConfiguredCheck()
	 * @generated
	 */
	EReference getConfiguredCheck_ParameterConfigurations();

	/**
	 * Returns the meta object for class '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter <em>Configured Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configured Parameter</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter
	 * @generated
	 */
	EClass getConfiguredParameter();

	/**
	 * Returns the meta object for the reference '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter#getParameter()
	 * @see #getConfiguredParameter()
	 * @generated
	 */
	EReference getConfiguredParameter_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Value</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter#getNewValue()
	 * @see #getConfiguredParameter()
	 * @generated
	 */
	EReference getConfiguredParameter_NewValue();

	/**
	 * Returns the meta object for enum '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind <em>Severity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Kind</em>'.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind
	 * @generated
	 */
	EEnum getSeverityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CheckcfgFactory getCheckcfgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl <em>Check Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getCheckConfiguration()
		 * @generated
		 */
		EClass CHECK_CONFIGURATION = eINSTANCE.getCheckConfiguration();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONFIGURATION__LABEL = eINSTANCE.getCheckConfiguration_Label();

		/**
		 * The meta object literal for the '<em><b>Catalog Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS = eINSTANCE.getCheckConfiguration_CatalogConfigurations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONFIGURATION__NAME = eINSTANCE.getCheckConfiguration_Name();

		/**
		 * The meta object literal for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCatalogImpl <em>Configured Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCatalogImpl
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getConfiguredCatalog()
		 * @generated
		 */
		EClass CONFIGURED_CATALOG = eINSTANCE.getConfiguredCatalog();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_CATALOG__CATALOG = eINSTANCE.getConfiguredCatalog_Catalog();

		/**
		 * The meta object literal for the '<em><b>Check Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_CATALOG__CHECK_CONFIGURATIONS = eINSTANCE.getConfiguredCatalog_CheckConfigurations();

		/**
		 * The meta object literal for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCheckImpl <em>Configured Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredCheckImpl
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getConfiguredCheck()
		 * @generated
		 */
		EClass CONFIGURED_CHECK = eINSTANCE.getConfiguredCheck();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURED_CHECK__SEVERITY = eINSTANCE.getConfiguredCheck_Severity();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_CHECK__CHECK = eINSTANCE.getConfiguredCheck_Check();

		/**
		 * The meta object literal for the '<em><b>Parameter Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_CHECK__PARAMETER_CONFIGURATIONS = eINSTANCE.getConfiguredCheck_ParameterConfigurations();

		/**
		 * The meta object literal for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredParameterImpl <em>Configured Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.ConfiguredParameterImpl
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getConfiguredParameter()
		 * @generated
		 */
		EClass CONFIGURED_PARAMETER = eINSTANCE.getConfiguredParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_PARAMETER__PARAMETER = eINSTANCE.getConfiguredParameter_Parameter();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURED_PARAMETER__NEW_VALUE = eINSTANCE.getConfiguredParameter_NewValue();

		/**
		 * The meta object literal for the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind <em>Severity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind
		 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckcfgPackageImpl#getSeverityKind()
		 * @generated
		 */
		EEnum SEVERITY_KIND = eINSTANCE.getSeverityKind();

	}

} //CheckcfgPackage
