/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.checkcfg.checkcfg;

import com.avaloq.tools.dslsdk.check.check.Check;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configured Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getSeverity <em>Severity</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getCheck <em>Check</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getParameterConfigurations <em>Parameter Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getConfiguredCheck()
 * @model
 * @generated
 */
public interface ConfiguredCheck extends EObject
{
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getConfiguredCheck_Severity()
	 * @model
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' reference.
	 * @see #setCheck(Check)
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getConfiguredCheck_Check()
	 * @model
	 * @generated
	 */
	Check getCheck();

	/**
	 * Sets the value of the '{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck#getCheck <em>Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(Check value);

	/**
	 * Returns the value of the '<em><b>Parameter Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Configurations</em>' containment reference list.
	 * @see com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage#getConfiguredCheck_ParameterConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfiguredParameter> getParameterConfigurations();

} // ConfiguredCheck
