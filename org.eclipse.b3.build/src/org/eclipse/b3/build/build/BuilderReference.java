/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BParameterList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builder Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuilderReference#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderReference#getBuilderName <em>Builder Name</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuilderReference#getRequiredCapability <em>Required Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderReference()
 * @model
 * @generated
 */
public interface BuilderReference extends BuildResultReference {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(BParameterList)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderReference_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	BParameterList getParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderReference#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(BParameterList value);

	/**
	 * Returns the value of the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder Name</em>' attribute.
	 * @see #setBuilderName(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderReference_BuilderName()
	 * @model
	 * @generated
	 */
	String getBuilderName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderReference#getBuilderName <em>Builder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder Name</em>' attribute.
	 * @see #getBuilderName()
	 * @generated
	 */
	void setBuilderName(String value);

	/**
	 * Returns the value of the '<em><b>Required Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability</em>' containment reference.
	 * @see #setRequiredCapability(RequiredCapability)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuilderReference_RequiredCapability()
	 * @model containment="true"
	 * @generated
	 */
	RequiredCapability getRequiredCapability();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuilderReference#getRequiredCapability <em>Required Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability</em>' containment reference.
	 * @see #getRequiredCapability()
	 * @generated
	 */
	void setRequiredCapability(RequiredCapability value);

} // BuilderReference
