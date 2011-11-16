/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.checkcfg.checkcfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getLabel <em>Label</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getCatalogConfigurations <em>Catalog Configurations</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getCheckConfiguration()
 * @model
 * @generated
 */
public interface CheckConfiguration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getCheckConfiguration_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Catalog Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Configurations</em>' containment reference list.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getCheckConfiguration_CatalogConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredCatalog> getCatalogConfigurations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getCheckConfiguration_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // CheckConfiguration
