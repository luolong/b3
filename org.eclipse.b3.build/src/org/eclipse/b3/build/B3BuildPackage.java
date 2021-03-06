/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build;

import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.b3.build.B3BuildFactory
 * @model kind="package"
 * @generated
 */
public interface B3BuildPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildUnitImpl <em>Build Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildUnitImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildUnit()
		 * @generated
		 */
		EClass BUILD_UNIT = eINSTANCE.getBuildUnit();

		/**
		 * The meta object literal for the '<em><b>Builders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__BUILDERS = eINSTANCE.getBuildUnit_Builders();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_UNIT__DOCUMENTATION = eINSTANCE.getBuildUnit_Documentation();

		/**
		 * The meta object literal for the '<em><b>Execution Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_UNIT__EXECUTION_MODE = eINSTANCE.getBuildUnit_ExecutionMode();

		/**
		 * The meta object literal for the '<em><b>Meta Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__META_REQUIRED_CAPABILITIES = eINSTANCE.getBuildUnit_MetaRequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__IMPLEMENTS = eINSTANCE.getBuildUnit_Implements();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__CONCERNS = eINSTANCE.getBuildUnit_Concerns();

		/**
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__DEFAULT_PROPERTIES = eINSTANCE.getBuildUnit_DefaultProperties();

		/**
		 * The meta object literal for the '<em><b>Synchronizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__SYNCHRONIZATIONS = eINSTANCE.getBuildUnit_Synchronizations();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__REPOSITORIES = eINSTANCE.getBuildUnit_Repositories();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__CONTAINERS = eINSTANCE.getBuildUnit_Containers();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__PROPERTY_SETS = eINSTANCE.getBuildUnit_PropertySets();

		/**
		 * The meta object literal for the '<em><b>Source Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_UNIT__SOURCE_LOCATION = eINSTANCE.getBuildUnit_SourceLocation();

		/**
		 * The meta object literal for the '<em><b>Output Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_UNIT__OUTPUT_LOCATION = eINSTANCE.getBuildUnit_OutputLocation();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__PROVIDERS = eINSTANCE.getBuildUnit_Providers();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__PARENT = eINSTANCE.getBuildUnit_Parent();

		/**
		 * The meta object literal for the '<em><b>Fragment Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_UNIT__FRAGMENT_HOSTS = eINSTANCE.getBuildUnit_FragmentHosts();

		/**
		 * The meta object literal for the '<em><b>Platform Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_UNIT__PLATFORM_FILTER = eINSTANCE.getBuildUnit_PlatformFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.IBuilder <em>IBuilder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.IBuilder
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIBuilder()
		 * @generated
		 */
		EClass IBUILDER = eINSTANCE.getIBuilder();

		/**
		 * The meta object literal for the '<em><b>Postcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__POSTCOND_EXPR = eINSTANCE.getIBuilder_PostcondExpr();

		/**
		 * The meta object literal for the '<em><b>Precond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__PRECOND_EXPR = eINSTANCE.getIBuilder_PrecondExpr();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__INPUT = eINSTANCE.getIBuilder_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__OUTPUT = eINSTANCE.getIBuilder_Output();

		/**
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__DEFAULT_PROPERTIES = eINSTANCE.getIBuilder_DefaultProperties();

		/**
		 * The meta object literal for the '<em><b>Postinputcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__POSTINPUTCOND_EXPR = eINSTANCE.getIBuilder_PostinputcondExpr();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IBUILDER__UNIT_TYPE = eINSTANCE.getIBuilder_UnitType();

		/**
		 * The meta object literal for the '<em><b>Explicit Unit Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__EXPLICIT_UNIT_TYPE = eINSTANCE.getIBuilder_ExplicitUnitType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILDER__SOURCE = eINSTANCE.getIBuilder_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderImpl <em>Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilder()
		 * @generated
		 */
		EClass BUILDER = eINSTANCE.getBuilder();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderJavaImpl <em>Builder Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderJavaImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderJava()
		 * @generated
		 */
		EClass BUILDER_JAVA = eINSTANCE.getBuilderJava();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderWrapperImpl <em>Builder Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderWrapperImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderWrapper()
		 * @generated
		 */
		EClass BUILDER_WRAPPER = eINSTANCE.getBuilderWrapper();

		/**
		 * The meta object literal for the '<em><b>Input Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__INPUT_ADVISED = eINSTANCE.getBuilderWrapper_InputAdvised();

		/**
		 * The meta object literal for the '<em><b>Output Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__OUTPUT_ADVISED = eINSTANCE.getBuilderWrapper_OutputAdvised();

		/**
		 * The meta object literal for the '<em><b>Unit Type Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__UNIT_TYPE_ADVISED = eINSTANCE.getBuilderWrapper_UnitTypeAdvised();

		/**
		 * The meta object literal for the '<em><b>Provides Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__PROVIDES_ADVISED = eINSTANCE.getBuilderWrapper_ProvidesAdvised();

		/**
		 * The meta object literal for the '<em><b>Default Properties Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED = eINSTANCE.getBuilderWrapper_DefaultPropertiesAdvised();

		/**
		 * The meta object literal for the '<em><b>Source Advised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_WRAPPER__SOURCE_ADVISED = eINSTANCE.getBuilderWrapper_SourceAdvised();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BeeModelImpl <em>Bee Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BeeModelImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBeeModel()
		 * @generated
		 */
		EClass BEE_MODEL = eINSTANCE.getBeeModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__IMPORTS = eINSTANCE.getBeeModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__FUNCTIONS = eINSTANCE.getBeeModel_Functions();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__CONCERNS = eINSTANCE.getBeeModel_Concerns();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__PROPERTY_SETS = eINSTANCE.getBeeModel_PropertySets();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__REPOSITORIES = eINSTANCE.getBeeModel_Repositories();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__PROVIDERS = eINSTANCE.getBeeModel_Providers();

		/**
		 * The meta object literal for the '<em><b>Default Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL__DEFAULT_PROPERTIES = eINSTANCE.getBeeModel_DefaultProperties();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BeeHiveImpl <em>Bee Hive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BeeHiveImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBeeHive()
		 * @generated
		 */
		EClass BEE_HIVE = eINSTANCE.getBeeHive();

		/**
		 * The meta object literal for the '<em><b>Bee Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_HIVE__BEE_MODELS = eINSTANCE.getBeeHive_BeeModels();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_HIVE__PARENT = eINSTANCE.getBeeHive_Parent();

		/**
		 * The meta object literal for the '<em><b>Resolutions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BEE_HIVE__RESOLUTIONS = eINSTANCE.getBeeHive_Resolutions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.ResolutionInfoImpl <em>Resolution Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.ResolutionInfoImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getResolutionInfo()
		 * @generated
		 */
		EClass RESOLUTION_INFO = eINSTANCE.getResolutionInfo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOLUTION_INFO__STATUS = eINSTANCE.getResolutionInfo_Status();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.EffectiveFacadeImpl <em>Effective Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.EffectiveFacadeImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveFacade()
		 * @generated
		 */
		EClass EFFECTIVE_FACADE = eINSTANCE.getEffectiveFacade();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl <em>Effective Unit Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveUnitFacade()
		 * @generated
		 */
		EClass EFFECTIVE_UNIT_FACADE = eINSTANCE.getEffectiveUnitFacade();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__UNIT = eINSTANCE.getEffectiveUnitFacade_Unit();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_ProvidedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_RequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Meta Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_MetaRequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Unit Required Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_UNIT_FACADE__UNIT_REQUIRED_CAPABILITIES = eINSTANCE.getEffectiveUnitFacade_UnitRequiredCapabilities();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.EffectiveRequirementFacadeImpl <em>Effective Requirement Facade</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.EffectiveRequirementFacadeImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveRequirementFacade()
		 * @generated
		 */
		EClass EFFECTIVE_REQUIREMENT_FACADE = eINSTANCE.getEffectiveRequirementFacade();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_REQUIREMENT_FACADE__REQUIREMENT = eINSTANCE.getEffectiveRequirementFacade_Requirement();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.EffectiveCapabilityFacadeImpl <em>Effective Capability Facade</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.EffectiveCapabilityFacadeImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveCapabilityFacade()
		 * @generated
		 */
		EClass EFFECTIVE_CAPABILITY_FACADE = eINSTANCE.getEffectiveCapabilityFacade();

		/**
		 * The meta object literal for the '<em><b>Provided Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY = eINSTANCE.getEffectiveCapabilityFacade_ProvidedCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderCallFacadeImpl <em>Builder Call Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderCallFacadeImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderCallFacade()
		 * @generated
		 */
		EClass BUILDER_CALL_FACADE = eINSTANCE.getBuilderCallFacade();

		/**
		 * The meta object literal for the '<em><b>Builder Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CALL_FACADE__BUILDER_REFERENCE = eINSTANCE.getBuilderCallFacade_BuilderReference();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CALL_FACADE__ALIASES = eINSTANCE.getBuilderCallFacade_Aliases();

		/**
		 * The meta object literal for the '<em><b>Required Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CALL_FACADE__REQUIRED_CAPABILITY = eINSTANCE.getBuilderCallFacade_RequiredCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.EffectiveBuilderCallFacadeImpl <em>Effective Builder Call Facade</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.EffectiveBuilderCallFacadeImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveBuilderCallFacade()
		 * @generated
		 */
		EClass EFFECTIVE_BUILDER_CALL_FACADE = eINSTANCE.getEffectiveBuilderCallFacade();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.IBuildUnitContainer <em>IBuild Unit Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.IBuildUnitContainer
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIBuildUnitContainer()
		 * @generated
		 */
		EClass IBUILD_UNIT_CONTAINER = eINSTANCE.getIBuildUnitContainer();

		/**
		 * The meta object literal for the '<em><b>Build Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IBUILD_UNIT_CONTAINER__BUILD_UNITS = eINSTANCE.getIBuildUnitContainer_BuildUnits();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.FragmentHostImpl <em>Fragment Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.FragmentHostImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getFragmentHost()
		 * @generated
		 */
		EClass FRAGMENT_HOST = eINSTANCE.getFragmentHost();

		/**
		 * The meta object literal for the '<em><b>Host Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FRAGMENT_HOST__HOST_REQUIREMENTS = eINSTANCE.getFragmentHost_HostRequirements();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.UnitParameterDeclarationImpl <em>Unit Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.UnitParameterDeclarationImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitParameterDeclaration()
		 * @generated
		 */
		EClass UNIT_PARAMETER_DECLARATION = eINSTANCE.getUnitParameterDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildSetImpl <em>Build Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildSetImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildSet()
		 * @generated
		 */
		EClass BUILD_SET = eINSTANCE.getBuildSet();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_SET__PATH_VECTORS = eINSTANCE.getBuildSet_PathVectors();

		/**
		 * The meta object literal for the '<em><b>Value Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_SET__VALUE_MAP = eINSTANCE.getBuildSet_ValueMap();

		/**
		 * The meta object literal for the '<em><b>Path Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_SET__PATH_ITERATOR = eINSTANCE.getBuildSet_PathIterator();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildResultContextImpl <em>Build Result Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildResultContextImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildResultContext()
		 * @generated
		 */
		EClass BUILD_RESULT_CONTEXT = eINSTANCE.getBuildResultContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.OutputPredicateImpl <em>Output Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.OutputPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getOutputPredicate()
		 * @generated
		 */
		EClass OUTPUT_PREDICATE = eINSTANCE.getOutputPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.SourcePredicateImpl <em>Source Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.SourcePredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getSourcePredicate()
		 * @generated
		 */
		EClass SOURCE_PREDICATE = eINSTANCE.getSourcePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildUnitRepositoryImpl <em>Build Unit Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildUnitRepositoryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildUnitRepository()
		 * @generated
		 */
		EClass BUILD_UNIT_REPOSITORY = eINSTANCE.getBuildUnitRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.CompoundBuildUnitRepositoryImpl <em>Compound Build Unit Repository</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.CompoundBuildUnitRepositoryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCompoundBuildUnitRepository()
		 * @generated
		 */
		EClass COMPOUND_BUILD_UNIT_REPOSITORY = eINSTANCE.getCompoundBuildUnitRepository();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES = eINSTANCE.getCompoundBuildUnitRepository_Repositories();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.CompoundFirstFoundRepositoryImpl
		 * <em>Compound First Found Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.CompoundFirstFoundRepositoryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCompoundFirstFoundRepository()
		 * @generated
		 */
		EClass COMPOUND_FIRST_FOUND_REPOSITORY = eINSTANCE.getCompoundFirstFoundRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.ExecutionStackRepositoryImpl <em>Execution Stack Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.ExecutionStackRepositoryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getExecutionStackRepository()
		 * @generated
		 */
		EClass EXECUTION_STACK_REPOSITORY = eINSTANCE.getExecutionStackRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BeeModelRepositoryImpl <em>Bee Model Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BeeModelRepositoryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBeeModelRepository()
		 * @generated
		 */
		EClass BEE_MODEL_REPOSITORY = eINSTANCE.getBeeModelRepository();

		/**
		 * The meta object literal for the '<em><b>Bee Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEE_MODEL_REPOSITORY__BEE_MODELS = eINSTANCE.getBeeModelRepository_BeeModels();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.repository.IBuildUnitRepository <em>IBuild Unit Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.repository.IBuildUnitRepository
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIBuildUnitRepository()
		 * @generated
		 */
		EClass IBUILD_UNIT_REPOSITORY = eINSTANCE.getIBuildUnitRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.UnitResolutionInfoImpl <em>Unit Resolution Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.UnitResolutionInfoImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitResolutionInfo()
		 * @generated
		 */
		EClass UNIT_RESOLUTION_INFO = eINSTANCE.getUnitResolutionInfo();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_RESOLUTION_INFO__UNIT = eINSTANCE.getUnitResolutionInfo_Unit();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_RESOLUTION_INFO__CONTEXT = eINSTANCE.getUnitResolutionInfo_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.SwitchUnitProviderImpl <em>Switch Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.SwitchUnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getSwitchUnitProvider()
		 * @generated
		 */
		EClass SWITCH_UNIT_PROVIDER = eINSTANCE.getSwitchUnitProvider();

		/**
		 * The meta object literal for the '<em><b>Repo Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SWITCH_UNIT_PROVIDER__REPO_SWITCH = eINSTANCE.getSwitchUnitProvider_RepoSwitch();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.RepositoryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY__ADDRESS = eINSTANCE.getRepository_Address();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY__BRANCHES = eINSTANCE.getRepository_Branches();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY__DOCUMENTATION = eINSTANCE.getRepository_Documentation();

		/**
		 * The meta object literal for the '<em><b>Handler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPOSITORY__HANDLER_TYPE = eINSTANCE.getRepository_HandlerType();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY__OPTIONS = eINSTANCE.getRepository_Options();

		/**
		 * The meta object literal for the '<em><b>Build Unit Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY__BUILD_UNIT_REPOSITORY = eINSTANCE.getRepository_BuildUnitRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BranchImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>Branch Point Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_POINT_TYPE = eINSTANCE.getBranch_BranchPointType();

		/**
		 * The meta object literal for the '<em><b>Branch Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BRANCH__BRANCH_POINT = eINSTANCE.getBranch_BranchPoint();

		/**
		 * The meta object literal for the '<em><b>Checkout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__CHECKOUT = eINSTANCE.getBranch_Checkout();

		/**
		 * The meta object literal for the '<em><b>Accept Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__ACCEPT_DIRTY = eINSTANCE.getBranch_AcceptDirty();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__UPDATE = eINSTANCE.getBranch_Update();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__REPLACE = eINSTANCE.getBranch_Replace();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BRANCH__INCLUDE = eINSTANCE.getBranch_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BRANCH__EXCLUDE = eINSTANCE.getBranch_Exclude();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__DOCUMENTATION = eINSTANCE.getBranch_Documentation();

		/**
		 * The meta object literal for the '<em><b>Merge Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BRANCH__MERGE_STRATEGY = eINSTANCE.getBranch_MergeStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.DelegatingUnitProviderImpl <em>Delegating Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.DelegatingUnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getDelegatingUnitProvider()
		 * @generated
		 */
		EClass DELEGATING_UNIT_PROVIDER = eINSTANCE.getDelegatingUnitProvider();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DELEGATING_UNIT_PROVIDER__DELEGATE = eINSTANCE.getDelegatingUnitProvider_Delegate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.RepoOptionImpl <em>Repo Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.RepoOptionImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRepoOption()
		 * @generated
		 */
		EClass REPO_OPTION = eINSTANCE.getRepoOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REPO_OPTION__NAME = eINSTANCE.getRepoOption_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPO_OPTION__EXPR = eINSTANCE.getRepoOption_Expr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.UnitRepositoryDescriptionImpl <em>Unit Repository Description</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.UnitRepositoryDescriptionImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitRepositoryDescription()
		 * @generated
		 */
		EClass UNIT_REPOSITORY_DESCRIPTION = eINSTANCE.getUnitRepositoryDescription();

		/**
		 * The meta object literal for the '<em><b>Evaluated Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS = eINSTANCE.getUnitRepositoryDescription_EvaluatedOptions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildCallOnSelectedRequirementsImpl
		 * <em>Build Call On Selected Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildCallOnSelectedRequirementsImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallOnSelectedRequirements()
		 * @generated
		 */
		EClass BUILD_CALL_ON_SELECTED_REQUIREMENTS = eINSTANCE.getBuildCallOnSelectedRequirements();

		/**
		 * The meta object literal for the '<em><b>Required Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE = eINSTANCE.getBuildCallOnSelectedRequirements_RequiredPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderInputNameDecoratorImpl <em>Builder Input Name Decorator</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderInputNameDecoratorImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputNameDecorator()
		 * @generated
		 */
		EClass BUILDER_INPUT_NAME_DECORATOR = eINSTANCE.getBuilderInputNameDecorator();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderInputContextDecoratorImpl
		 * <em>Builder Input Context Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderInputContextDecoratorImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputContextDecorator()
		 * @generated
		 */
		EClass BUILDER_INPUT_CONTEXT_DECORATOR = eINSTANCE.getBuilderInputContextDecorator();

		/**
		 * The meta object literal for the '<em><b>With Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR = eINSTANCE.getBuilderInputContextDecorator_WithExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderInputConditionImpl <em>Builder Input Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderInputConditionImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputCondition()
		 * @generated
		 */
		EClass BUILDER_INPUT_CONDITION = eINSTANCE.getBuilderInputCondition();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_INPUT_CONDITION__COND_EXPR = eINSTANCE.getBuilderInputCondition_CondExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildCallMultipleImpl <em>Build Call Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildCallMultipleImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallMultiple()
		 * @generated
		 */
		EClass BUILD_CALL_MULTIPLE = eINSTANCE.getBuildCallMultiple();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildCallSingleImpl <em>Build Call Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildCallSingleImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallSingle()
		 * @generated
		 */
		EClass BUILD_CALL_SINGLE = eINSTANCE.getBuildCallSingle();

		/**
		 * The meta object literal for the '<em><b>Required Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_CALL_SINGLE__REQUIRED_CAPABILITY = eINSTANCE.getBuildCallSingle_RequiredCapability();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildCallOnDeclaredRequirementImpl
		 * <em>Build Call On Declared Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildCallOnDeclaredRequirementImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallOnDeclaredRequirement()
		 * @generated
		 */
		EClass BUILD_CALL_ON_DECLARED_REQUIREMENT = eINSTANCE.getBuildCallOnDeclaredRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Capability Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION = eINSTANCE.getBuildCallOnDeclaredRequirement_RequiredCapabilityDeclaration();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildCallOnReferencedRequirementImpl
		 * <em>Build Call On Referenced Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildCallOnReferencedRequirementImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallOnReferencedRequirement()
		 * @generated
		 */
		EClass BUILD_CALL_ON_REFERENCED_REQUIREMENT = eINSTANCE.getBuildCallOnReferencedRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Capability Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE = eINSTANCE.getBuildCallOnReferencedRequirement_RequiredCapabilityReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderInputGroupImpl <em>Builder Input Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderInputGroupImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputGroup()
		 * @generated
		 */
		EClass BUILDER_INPUT_GROUP = eINSTANCE.getBuilderInputGroup();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.IEffectiveFacade <em>IEffective Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.IEffectiveFacade
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIEffectiveFacade()
		 * @generated
		 */
		EClass IEFFECTIVE_FACADE = eINSTANCE.getIEffectiveFacade();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IEFFECTIVE_FACADE__CONTEXT = eINSTANCE.getIEffectiveFacade_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.MergeConflictStrategy <em>Merge Conflict Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.MergeConflictStrategy
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getMergeConflictStrategy()
		 * @generated
		 */
		EEnum MERGE_CONFLICT_STRATEGY = eINSTANCE.getMergeConflictStrategy();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_REPOSITORY_DESCRIPTION__REPOSITORY = eINSTANCE.getUnitRepositoryDescription_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.BranchPointType <em>Branch Point Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.BranchPointType
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBranchPointType()
		 * @generated
		 */
		EEnum BRANCH_POINT_TYPE = eINSTANCE.getBranchPointType();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.TriState <em>Tri State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.TriState
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getTriState()
		 * @generated
		 */
		EEnum TRI_STATE = eINSTANCE.getTriState();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.VersionedCapabilityImpl <em>Versioned Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.VersionedCapabilityImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getVersionedCapability()
		 * @generated
		 */
		EClass VERSIONED_CAPABILITY = eINSTANCE.getVersionedCapability();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VERSIONED_CAPABILITY__VERSION = eINSTANCE.getVersionedCapability_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.CapabilityImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAPABILITY__NAME_SPACE = eINSTANCE.getCapability_NameSpace();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAPABILITY__COND_EXPR = eINSTANCE.getCapability_CondExpr();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.RequiredCapabilityImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRequiredCapability()
		 * @generated
		 */
		EClass REQUIRED_CAPABILITY = eINSTANCE.getRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REQUIRED_CAPABILITY__VERSION_RANGE = eINSTANCE.getRequiredCapability_VersionRange();

		/**
		 * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REQUIRED_CAPABILITY__GREEDY = eINSTANCE.getRequiredCapability_Greedy();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REQUIRED_CAPABILITY__MAX = eINSTANCE.getRequiredCapability_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REQUIRED_CAPABILITY__MIN = eINSTANCE.getRequiredCapability_Min();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.ConditionalPathVectorImpl <em>Conditional Path Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.ConditionalPathVectorImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getConditionalPathVector()
		 * @generated
		 */
		EClass CONDITIONAL_PATH_VECTOR = eINSTANCE.getConditionalPathVector();

		/**
		 * The meta object literal for the '<em><b>Cond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONDITIONAL_PATH_VECTOR__COND_EXPR = eINSTANCE.getConditionalPathVector_CondExpr();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONDITIONAL_PATH_VECTOR__PATH_VECTORS = eINSTANCE.getConditionalPathVector_PathVectors();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.PathVectorImpl <em>Path Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.PathVectorImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathVector()
		 * @generated
		 */
		EClass PATH_VECTOR = eINSTANCE.getPathVector();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PATH_VECTOR__BASE_PATH = eINSTANCE.getPathVector_BasePath();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PATH_VECTOR__PATHS = eINSTANCE.getPathVector_Paths();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.SynchronizationImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Builder Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SYNCHRONIZATION__BUILDER_QUERIES = eINSTANCE.getSynchronization_BuilderQueries();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.UnitProviderImpl <em>Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.UnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitProvider()
		 * @generated
		 */
		EClass UNIT_PROVIDER = eINSTANCE.getUnitProvider();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNIT_PROVIDER__DOCUMENTATION = eINSTANCE.getUnitProvider_Documentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.RepositoryUnitProviderImpl <em>Repository Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.RepositoryUnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRepositoryUnitProvider()
		 * @generated
		 */
		EClass REPOSITORY_UNIT_PROVIDER = eINSTANCE.getRepositoryUnitProvider();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY_UNIT_PROVIDER__REPOSITORY = eINSTANCE.getRepositoryUnitProvider_Repository();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY_UNIT_PROVIDER__OPTIONS = eINSTANCE.getRepositoryUnitProvider_Options();

		/**
		 * The meta object literal for the '<em><b>Build Unit Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY = eINSTANCE.getRepositoryUnitProvider_BuildUnitRepository();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.CompoundUnitProviderImpl <em>Compound Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.CompoundUnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCompoundUnitProvider()
		 * @generated
		 */
		EClass COMPOUND_UNIT_PROVIDER = eINSTANCE.getCompoundUnitProvider();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPOUND_UNIT_PROVIDER__PROVIDERS = eINSTANCE.getCompoundUnitProvider_Providers();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.FirstFoundUnitProviderImpl <em>First Found Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.FirstFoundUnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getFirstFoundUnitProvider()
		 * @generated
		 */
		EClass FIRST_FOUND_UNIT_PROVIDER = eINSTANCE.getFirstFoundUnitProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BestFoundUnitProviderImpl <em>Best Found Unit Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BestFoundUnitProviderImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBestFoundUnitProvider()
		 * @generated
		 */
		EClass BEST_FOUND_UNIT_PROVIDER = eINSTANCE.getBestFoundUnitProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.ContainerConfigurationImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getContainerConfiguration()
		 * @generated
		 */
		EClass CONTAINER_CONFIGURATION = eINSTANCE.getContainerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONTAINER_CONFIGURATION__DOCUMENTATION = eINSTANCE.getContainerConfiguration_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONTAINER_CONFIGURATION__NAME = eINSTANCE.getContainerConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Agent Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER_CONFIGURATION__AGENT_TYPE = eINSTANCE.getContainerConfiguration_AgentType();

		/**
		 * The meta object literal for the '<em><b>Context Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONTAINER_CONFIGURATION__CONTEXT_BLOCK = eINSTANCE.getContainerConfiguration_ContextBlock();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuildConcernContextImpl <em>Build Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuildConcernContextImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildConcernContext()
		 * @generated
		 */
		EClass BUILD_CONCERN_CONTEXT = eINSTANCE.getBuildConcernContext();

		/**
		 * The meta object literal for the '<em><b>Default Properties Removals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = eINSTANCE.getBuildConcernContext_DefaultPropertiesRemovals();

		/**
		 * The meta object literal for the '<em><b>Default Properties Additions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = eINSTANCE.getBuildConcernContext_DefaultPropertiesAdditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.RequiresPredicateImpl <em>Requires Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.RequiresPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRequiresPredicate()
		 * @generated
		 */
		EClass REQUIRES_PREDICATE = eINSTANCE.getRequiresPredicate();

		/**
		 * The meta object literal for the '<em><b>Capability Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REQUIRES_PREDICATE__CAPABILITY_PREDICATE = eINSTANCE.getRequiresPredicate_CapabilityPredicate();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute REQUIRES_PREDICATE__META = eINSTANCE.getRequiresPredicate_Meta();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.CapabilityPredicateImpl <em>Capability Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.CapabilityPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCapabilityPredicate()
		 * @generated
		 */
		EClass CAPABILITY_PREDICATE = eINSTANCE.getCapabilityPredicate();

		/**
		 * The meta object literal for the '<em><b>Version Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CAPABILITY_PREDICATE__VERSION_RANGE = eINSTANCE.getCapabilityPredicate_VersionRange();

		/**
		 * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAPABILITY_PREDICATE__NAME_PREDICATE = eINSTANCE.getCapabilityPredicate_NamePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Space Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE = eINSTANCE.getCapabilityPredicate_NameSpacePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.ImplementsPredicateImpl <em>Implements Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.ImplementsPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getImplementsPredicate()
		 * @generated
		 */
		EClass IMPLEMENTS_PREDICATE = eINSTANCE.getImplementsPredicate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPLEMENTS_PREDICATE__TYPE = eINSTANCE.getImplementsPredicate_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.ProvidesPredicateImpl <em>Provides Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.ProvidesPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getProvidesPredicate()
		 * @generated
		 */
		EClass PROVIDES_PREDICATE = eINSTANCE.getProvidesPredicate();

		/**
		 * The meta object literal for the '<em><b>Capability Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROVIDES_PREDICATE__CAPABILITY_PREDICATE = eINSTANCE.getProvidesPredicate_CapabilityPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.NameSpacePredicateImpl <em>Name Space Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.NameSpacePredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getNameSpacePredicate()
		 * @generated
		 */
		EClass NAME_SPACE_PREDICATE = eINSTANCE.getNameSpacePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAME_SPACE_PREDICATE__NAME_SPACE = eINSTANCE.getNameSpacePredicate_NameSpace();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.UnitNamePredicateImpl <em>Unit Name Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.UnitNamePredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitNamePredicate()
		 * @generated
		 */
		EClass UNIT_NAME_PREDICATE = eINSTANCE.getUnitNamePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderNamePredicateImpl <em>Builder Name Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderNamePredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderNamePredicate()
		 * @generated
		 */
		EClass BUILDER_NAME_PREDICATE = eINSTANCE.getBuilderNamePredicate();

		/**
		 * The meta object literal for the '<em><b>Name Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_NAME_PREDICATE__NAME_PREDICATE = eINSTANCE.getBuilderNamePredicate_NamePredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.InputPredicateImpl <em>Input Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.InputPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getInputPredicate()
		 * @generated
		 */
		EClass INPUT_PREDICATE = eINSTANCE.getInputPredicate();

		/**
		 * The meta object literal for the '<em><b>Capability Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INPUT_PREDICATE__CAPABILITY_PREDICATE = eINSTANCE.getInputPredicate_CapabilityPredicate();

		/**
		 * The meta object literal for the '<em><b>Builder Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INPUT_PREDICATE__BUILDER_PREDICATE = eINSTANCE.getInputPredicate_BuilderPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.UnitConcernContextImpl <em>Unit Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.UnitConcernContextImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitConcernContext()
		 * @generated
		 */
		EClass UNIT_CONCERN_CONTEXT = eINSTANCE.getUnitConcernContext();

		/**
		 * The meta object literal for the '<em><b>Builder Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS = eINSTANCE.getUnitConcernContext_BuilderContexts();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__QUERY = eINSTANCE.getUnitConcernContext_Query();

		/**
		 * The meta object literal for the '<em><b>Requires Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS = eINSTANCE.getUnitConcernContext_RequiresRemovals();

		/**
		 * The meta object literal for the '<em><b>Provides Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS = eINSTANCE.getUnitConcernContext_ProvidesRemovals();

		/**
		 * The meta object literal for the '<em><b>Source Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNIT_CONCERN_CONTEXT__SOURCE_LOCATION = eINSTANCE.getUnitConcernContext_SourceLocation();

		/**
		 * The meta object literal for the '<em><b>Output Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION = eINSTANCE.getUnitConcernContext_OutputLocation();

		/**
		 * The meta object literal for the '<em><b>Required Predicates Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS = eINSTANCE.getUnitConcernContext_RequiredPredicatesRemovals();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl <em>Builder Concern Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderConcernContextImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderConcernContext()
		 * @generated
		 */
		EClass BUILDER_CONCERN_CONTEXT = eINSTANCE.getBuilderConcernContext();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__QUERY = eINSTANCE.getBuilderConcernContext_Query();

		/**
		 * The meta object literal for the '<em><b>Input Additions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS = eINSTANCE.getBuilderConcernContext_InputAdditions();

		/**
		 * The meta object literal for the '<em><b>Input Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS = eINSTANCE.getBuilderConcernContext_InputRemovals();

		/**
		 * The meta object literal for the '<em><b>Output Additions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS = eINSTANCE.getBuilderConcernContext_OutputAdditions();

		/**
		 * The meta object literal for the '<em><b>Output Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS = eINSTANCE.getBuilderConcernContext_OutputRemovals();

		/**
		 * The meta object literal for the '<em><b>Func Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__FUNC_EXPR = eINSTANCE.getBuilderConcernContext_FuncExpr();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__VAR_ARGS = eINSTANCE.getBuilderConcernContext_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__PARAMETERS = eINSTANCE.getBuilderConcernContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>Match Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS = eINSTANCE.getBuilderConcernContext_MatchParameters();

		/**
		 * The meta object literal for the '<em><b>Remove Pre Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION = eINSTANCE.getBuilderConcernContext_RemovePreCondition();

		/**
		 * The meta object literal for the '<em><b>Remove Post Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION = eINSTANCE.getBuilderConcernContext_RemovePostCondition();

		/**
		 * The meta object literal for the '<em><b>Remove Post Input Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION = eINSTANCE.getBuilderConcernContext_RemovePostInputCondition();

		/**
		 * The meta object literal for the '<em><b>Precond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__PRECOND_EXPR = eINSTANCE.getBuilderConcernContext_PrecondExpr();

		/**
		 * The meta object literal for the '<em><b>Postcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR = eINSTANCE.getBuilderConcernContext_PostcondExpr();

		/**
		 * The meta object literal for the '<em><b>Postinputcond Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR = eINSTANCE.getBuilderConcernContext_PostinputcondExpr();

		/**
		 * The meta object literal for the '<em><b>Provides Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS = eINSTANCE.getBuilderConcernContext_ProvidesRemovals();

		/**
		 * The meta object literal for the '<em><b>Output Annotations Removals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS = eINSTANCE.getBuilderConcernContext_OutputAnnotationsRemovals();

		/**
		 * The meta object literal for the '<em><b>Output Annotation Additions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS = eINSTANCE.getBuilderConcernContext_OutputAnnotationAdditions();

		/**
		 * The meta object literal for the '<em><b>Source Removals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS = eINSTANCE.getBuilderConcernContext_SourceRemovals();

		/**
		 * The meta object literal for the '<em><b>Source Additions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS = eINSTANCE.getBuilderConcernContext_SourceAdditions();

		/**
		 * The meta object literal for the '<em><b>Source Annotations Removals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS = eINSTANCE.getBuilderConcernContext_SourceAnnotationsRemovals();

		/**
		 * The meta object literal for the '<em><b>Source Annotation Additions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS = eINSTANCE.getBuilderConcernContext_SourceAnnotationAdditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.PathGroupPredicateImpl <em>Path Group Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.PathGroupPredicateImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathGroupPredicate()
		 * @generated
		 */
		EClass PATH_GROUP_PREDICATE = eINSTANCE.getPathGroupPredicate();

		/**
		 * The meta object literal for the '<em><b>Path Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATH_GROUP_PREDICATE__PATH_VECTOR = eINSTANCE.getPathGroupPredicate_PathVector();

		/**
		 * The meta object literal for the '<em><b>Path Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATH_GROUP_PREDICATE__PATH_PATTERN = eINSTANCE.getPathGroupPredicate_PathPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.AliasedRequiredCapabilityImpl <em>Aliased Required Capability</em>}'
		 * class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.AliasedRequiredCapabilityImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getAliasedRequiredCapability()
		 * @generated
		 */
		EClass ALIASED_REQUIRED_CAPABILITY = eINSTANCE.getAliasedRequiredCapability();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ALIASED_REQUIRED_CAPABILITY__ALIAS = eINSTANCE.getAliasedRequiredCapability_Alias();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.IRequiredCapabilityContainer
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIRequiredCapabilityContainer()
		 * @generated
		 */
		EClass IREQUIRED_CAPABILITY_CONTAINER = eINSTANCE.getIRequiredCapabilityContainer();

		/**
		 * The meta object literal for the '<em><b>Required Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES = eINSTANCE.getIRequiredCapabilityContainer_RequiredCapabilities();

		/**
		 * The meta object literal for the '<em><b>Required Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES = eINSTANCE.getIRequiredCapabilityContainer_RequiredPredicates();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.IProvidedCapabilityContainer
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIProvidedCapabilityContainer()
		 * @generated
		 */
		EClass IPROVIDED_CAPABILITY_CONTAINER = eINSTANCE.getIProvidedCapabilityContainer();

		/**
		 * The meta object literal for the '<em><b>Provided Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES = eINSTANCE.getIProvidedCapabilityContainer_ProvidedCapabilities();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderQueryImpl <em>Builder Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderQueryImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderQuery()
		 * @generated
		 */
		EClass BUILDER_QUERY = eINSTANCE.getBuilderQuery();

		/**
		 * The meta object literal for the '<em><b>Builder Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_QUERY__BUILDER_QUERIES = eINSTANCE.getBuilderQuery_BuilderQueries();

		/**
		 * The meta object literal for the '<em><b>Unit Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_QUERY__UNIT_QUERY = eINSTANCE.getBuilderQuery_UnitQuery();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderInputImpl <em>Builder Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderInputImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInput()
		 * @generated
		 */
		EClass BUILDER_INPUT = eINSTANCE.getBuilderInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.PathGroupImpl <em>Path Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.PathGroupImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathGroup()
		 * @generated
		 */
		EClass PATH_GROUP = eINSTANCE.getPathGroup();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATH_GROUP__ANNOTATIONS = eINSTANCE.getPathGroup_Annotations();

		/**
		 * The meta object literal for the '<em><b>Path Vectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PATH_GROUP__PATH_VECTORS = eINSTANCE.getPathGroup_PathVectors();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderInputDecoratorImpl <em>Builder Input Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderInputDecoratorImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputDecorator()
		 * @generated
		 */
		EClass BUILDER_INPUT_DECORATOR = eINSTANCE.getBuilderInputDecorator();

		/**
		 * The meta object literal for the '<em><b>Builder Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_INPUT_DECORATOR__BUILDER_INPUT = eINSTANCE.getBuilderInputDecorator_BuilderInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.b3.build.impl.BuilderCallImpl <em>Builder Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.impl.BuilderCallImpl
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderCall()
		 * @generated
		 */
		EClass BUILDER_CALL = eINSTANCE.getBuilderCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BUILDER_CALL__PARAMETERS = eINSTANCE.getBuilderCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>Builder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BUILDER_CALL__BUILDER_NAME = eINSTANCE.getBuilderCall_BuilderName();

		/**
		 * The meta object literal for the '<em>Version Range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.VersionRange
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getVersionRange()
		 * @generated
		 */
		EDataType VERSION_RANGE = eINSTANCE.getVersionRange();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.Version
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>IStatus</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.core.runtime.IStatus
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIStatus()
		 * @generated
		 */
		EDataType ISTATUS = eINSTANCE.getIStatus();

		/**
		 * The meta object literal for the '<em>Path Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.core.iterators.PathIterator
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathIterator()
		 * @generated
		 */
		EDataType PATH_ITERATOR = eINSTANCE.getPathIterator();

		/**
		 * The meta object literal for the '<em>B3 Builder Job</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.b3.build.core.B3BuilderJob
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getB3BuilderJob()
		 * @generated
		 */
		EDataType B3_BUILDER_JOB = eINSTANCE.getB3BuilderJob();

		/**
		 * The meta object literal for the '<em>IMatch Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.expression.IMatchExpression
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIMatchExpression()
		 * @generated
		 */
		EDataType IMATCH_EXPRESSION = eINSTANCE.getIMatchExpression();

		/**
		 * The meta object literal for the '<em>IInstallable Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit
		 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIInstallableUnit()
		 * @generated
		 */
		EDataType IINSTALLABLE_UNIT = eINSTANCE.getIInstallableUnit();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "build";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://b3build/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	B3BuildPackage eINSTANCE = org.eclipse.b3.build.impl.B3BuildPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.CapabilityImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = B3backendPackage.INAMED_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME_SPACE = B3backendPackage.INAMED_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__COND_EXPR = B3backendPackage.INAMED_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = B3backendPackage.INAMED_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.VersionedCapabilityImpl <em>Versioned Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.VersionedCapabilityImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getVersionedCapability()
	 * @generated
	 */
	int VERSIONED_CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__NAME_SPACE = CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__COND_EXPR = CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY__VERSION = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSIONED_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildUnitImpl <em>Build Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildUnitImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildUnit()
	 * @generated
	 */
	int BUILD_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__NAME = VERSIONED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__NAME_SPACE = VERSIONED_CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__COND_EXPR = VERSIONED_CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__VERSION = VERSIONED_CAPABILITY__VERSION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__FUNCTIONS = VERSIONED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REQUIRED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REQUIRED_PREDICATES = VERSIONED_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PROVIDED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__VAR_NAME = VERSIONED_CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__BUILDERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__DOCUMENTATION = VERSIONED_CAPABILITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__EXECUTION_MODE = VERSIONED_CAPABILITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__META_REQUIRED_CAPABILITIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__IMPLEMENTS = VERSIONED_CAPABILITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONCERNS = VERSIONED_CAPABILITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__DEFAULT_PROPERTIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__SYNCHRONIZATIONS = VERSIONED_CAPABILITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__REPOSITORIES = VERSIONED_CAPABILITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__CONTAINERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PROPERTY_SETS = VERSIONED_CAPABILITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__SOURCE_LOCATION = VERSIONED_CAPABILITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__OUTPUT_LOCATION = VERSIONED_CAPABILITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PROVIDERS = VERSIONED_CAPABILITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PARENT = VERSIONED_CAPABILITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Fragment Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__FRAGMENT_HOSTS = VERSIONED_CAPABILITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Platform Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__PLATFORM_FILTER = VERSIONED_CAPABILITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Build Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT_FEATURE_COUNT = VERSIONED_CAPABILITY_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderImpl <em>Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilder()
	 * @generated
	 */
	int BUILDER = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderJavaImpl <em>Builder Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderJavaImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderJava()
	 * @generated
	 */
	int BUILDER_JAVA = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderInputImpl <em>Builder Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderInputImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInput()
	 * @generated
	 */
	int BUILDER_INPUT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.PathGroupImpl <em>Path Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.PathGroupImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathGroup()
	 * @generated
	 */
	int PATH_GROUP = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.RequiredCapabilityImpl <em>Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.RequiredCapabilityImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRequiredCapability()
	 * @generated
	 */
	int REQUIRED_CAPABILITY = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.PathVectorImpl <em>Path Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.PathVectorImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathVector()
	 * @generated
	 */
	int PATH_VECTOR = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.SynchronizationImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.ContainerConfigurationImpl <em>Container Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.ContainerConfigurationImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getContainerConfiguration()
	 * @generated
	 */
	int CONTAINER_CONFIGURATION = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildConcernContextImpl <em>Build Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildConcernContextImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildConcernContext()
	 * @generated
	 */
	int BUILD_CONCERN_CONTEXT = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.RequiresPredicateImpl <em>Requires Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.RequiresPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRequiresPredicate()
	 * @generated
	 */
	int REQUIRES_PREDICATE = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.CapabilityPredicateImpl <em>Capability Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.CapabilityPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCapabilityPredicate()
	 * @generated
	 */
	int CAPABILITY_PREDICATE = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.ImplementsPredicateImpl <em>Implements Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.ImplementsPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getImplementsPredicate()
	 * @generated
	 */
	int IMPLEMENTS_PREDICATE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.ProvidesPredicateImpl <em>Provides Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.ProvidesPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getProvidesPredicate()
	 * @generated
	 */
	int PROVIDES_PREDICATE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.NameSpacePredicateImpl <em>Name Space Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.NameSpacePredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getNameSpacePredicate()
	 * @generated
	 */
	int NAME_SPACE_PREDICATE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.UnitNamePredicateImpl <em>Unit Name Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.UnitNamePredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitNamePredicate()
	 * @generated
	 */
	int UNIT_NAME_PREDICATE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderNamePredicateImpl <em>Builder Name Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderNamePredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderNamePredicate()
	 * @generated
	 */
	int BUILDER_NAME_PREDICATE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.InputPredicateImpl <em>Input Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.InputPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getInputPredicate()
	 * @generated
	 */
	int INPUT_PREDICATE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.UnitConcernContextImpl <em>Unit Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.UnitConcernContextImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitConcernContext()
	 * @generated
	 */
	int UNIT_CONCERN_CONTEXT = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderConcernContextImpl <em>Builder Concern Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderConcernContextImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderConcernContext()
	 * @generated
	 */
	int BUILDER_CONCERN_CONTEXT = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.AliasedRequiredCapabilityImpl <em>Aliased Required Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.AliasedRequiredCapabilityImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getAliasedRequiredCapability()
	 * @generated
	 */
	int ALIASED_REQUIRED_CAPABILITY = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.IRequiredCapabilityContainer
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIRequiredCapabilityContainer()
	 * @generated
	 */
	int IREQUIRED_CAPABILITY_CONTAINER = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.IProvidedCapabilityContainer
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIProvidedCapabilityContainer()
	 * @generated
	 */
	int IPROVIDED_CAPABILITY_CONTAINER = 32;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES = 0;

	/**
	 * The number of structural features of the '<em>IProvided Capability Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.IBuilder <em>IBuilder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.IBuilder
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIBuilder()
	 * @generated
	 */
	int IBUILDER = 1;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PROVIDED_CAPABILITIES = IPROVIDED_CAPABILITY_CONTAINER__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__VISIBILITY = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__FINAL = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__EXECUTION_MODE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__NAME = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__GUARD = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__EXCEPTION_TYPES = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__TYPE_PARAMETERS = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PARAMETERS = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__VAR_ARGS = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__DOCUMENTATION = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__RETURN_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__TYPE_CALCULATOR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__CONTAINER = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__CLASS_FUNCTION = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__VARARG_ARRAY_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__POSTCOND_EXPR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__PRECOND_EXPR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__INPUT = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__OUTPUT = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__DEFAULT_PROPERTIES = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__POSTINPUTCOND_EXPR = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__UNIT_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__EXPLICIT_UNIT_TYPE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER__SOURCE = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>IBuilder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILDER_FEATURE_COUNT = IPROVIDED_CAPABILITY_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Builder Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP__PATH_VECTORS = 1;

	/**
	 * The number of structural features of the '<em>Path Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderInputDecoratorImpl <em>Builder Input Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderInputDecoratorImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputDecorator()
	 * @generated
	 */
	int BUILDER_INPUT_DECORATOR = 5;

	/**
	 * The feature id for the '<em><b>Builder Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_DECORATOR__BUILDER_INPUT = BUILDER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Input Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_DECORATOR_FEATURE_COUNT = BUILDER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderCallImpl <em>Builder Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderCallImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderCall()
	 * @generated
	 */
	int BUILDER_CALL = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL__PARAMETERS = BUILDER_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL__BUILDER_NAME = BUILDER_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Builder Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL_FEATURE_COUNT = BUILDER_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__NAME_SPACE = CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__COND_EXPR = CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__VERSION_RANGE = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__GREEDY = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__MAX = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY__MIN = CAPABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRED_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.ConditionalPathVectorImpl <em>Conditional Path Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.ConditionalPathVectorImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getConditionalPathVector()
	 * @generated
	 */
	int CONDITIONAL_PATH_VECTOR = 9;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PATH_VECTOR__COND_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PATH_VECTOR__PATH_VECTORS = 1;

	/**
	 * The number of structural features of the '<em>Conditional Path Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_PATH_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__PATHS = 0;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR__BASE_PATH = 1;

	/**
	 * The number of structural features of the '<em>Path Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Builder Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__BUILDER_QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.UnitProviderImpl <em>Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.UnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitProvider()
	 * @generated
	 */
	int UNIT_PROVIDER = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PROVIDER__DOCUMENTATION = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PROVIDER_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.RepositoryUnitProviderImpl <em>Repository Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.RepositoryUnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRepositoryUnitProvider()
	 * @generated
	 */
	int REPOSITORY_UNIT_PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_UNIT_PROVIDER__DOCUMENTATION = UNIT_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_UNIT_PROVIDER__REPOSITORY = UNIT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_UNIT_PROVIDER__OPTIONS = UNIT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Build Unit Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_UNIT_PROVIDER__BUILD_UNIT_REPOSITORY = UNIT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repository Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_UNIT_PROVIDER_FEATURE_COUNT = UNIT_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.CompoundUnitProviderImpl <em>Compound Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.CompoundUnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCompoundUnitProvider()
	 * @generated
	 */
	int COMPOUND_UNIT_PROVIDER = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_UNIT_PROVIDER__DOCUMENTATION = UNIT_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_UNIT_PROVIDER__PROVIDERS = UNIT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_UNIT_PROVIDER_FEATURE_COUNT = UNIT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.FirstFoundUnitProviderImpl <em>First Found Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.FirstFoundUnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getFirstFoundUnitProvider()
	 * @generated
	 */
	int FIRST_FOUND_UNIT_PROVIDER = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIRST_FOUND_UNIT_PROVIDER__DOCUMENTATION = COMPOUND_UNIT_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIRST_FOUND_UNIT_PROVIDER__PROVIDERS = COMPOUND_UNIT_PROVIDER__PROVIDERS;

	/**
	 * The number of structural features of the '<em>First Found Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIRST_FOUND_UNIT_PROVIDER_FEATURE_COUNT = COMPOUND_UNIT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BestFoundUnitProviderImpl <em>Best Found Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BestFoundUnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBestFoundUnitProvider()
	 * @generated
	 */
	int BEST_FOUND_UNIT_PROVIDER = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEST_FOUND_UNIT_PROVIDER__DOCUMENTATION = COMPOUND_UNIT_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEST_FOUND_UNIT_PROVIDER__PROVIDERS = COMPOUND_UNIT_PROVIDER__PROVIDERS;

	/**
	 * The number of structural features of the '<em>Best Found Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEST_FOUND_UNIT_PROVIDER_FEATURE_COUNT = COMPOUND_UNIT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Agent Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__AGENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Context Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION__CONTEXT_BLOCK = 3;

	/**
	 * The number of structural features of the '<em>Container Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__FUNCTIONS = B3backendPackage.BCONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__DOCUMENTATION = B3backendPackage.BCONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Build Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CONCERN_CONTEXT_FEATURE_COUNT = B3backendPackage.BCONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PREDICATE__CAPABILITY_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PREDICATE__META = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requires Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE__VERSION_RANGE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE__NAME_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Space Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_PREDICATE__TYPE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implements Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PREDICATE__CAPABILITY_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provides Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROVIDES_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_PREDICATE__NAME_SPACE = 0;

	/**
	 * The number of structural features of the '<em>Name Space Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE__VERSION_RANGE = CAPABILITY_PREDICATE__VERSION_RANGE;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE__NAME_PREDICATE = CAPABILITY_PREDICATE__NAME_PREDICATE;

	/**
	 * The feature id for the '<em><b>Name Space Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE__NAME_SPACE_PREDICATE = CAPABILITY_PREDICATE__NAME_SPACE_PREDICATE;

	/**
	 * The number of structural features of the '<em>Unit Name Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_NAME_PREDICATE_FEATURE_COUNT = CAPABILITY_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_NAME_PREDICATE__NAME_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Name Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_NAME_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capability Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT_PREDICATE__CAPABILITY_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT_PREDICATE__BUILDER_PREDICATE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INPUT_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__FUNCTIONS = BUILD_CONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__DOCUMENTATION = BUILD_CONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__PROVIDED_CAPABILITIES = BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS;

	/**
	 * The feature id for the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__REQUIRED_CAPABILITIES = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Builder Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__BUILDER_CONTEXTS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__QUERY = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requires Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__REQUIRES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provides Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__PROVIDES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__SOURCE_LOCATION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__OUTPUT_LOCATION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Required Predicates Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT__REQUIRED_PREDICATES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Unit Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_CONCERN_CONTEXT_FEATURE_COUNT = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__FUNCTIONS = BUILD_CONCERN_CONTEXT__FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__DOCUMENTATION = BUILD_CONCERN_CONTEXT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PROVIDED_CAPABILITIES = BUILD_CONCERN_CONTEXT__PROVIDED_CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_REMOVALS;

	/**
	 * The feature id for the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS = BUILD_CONCERN_CONTEXT__DEFAULT_PROPERTIES_ADDITIONS;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__QUERY = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Additions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__INPUT_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__INPUT_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Additions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__OUTPUT_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__OUTPUT_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__FUNC_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__VAR_ARGS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PARAMETERS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Match Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__MATCH_PARAMETERS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Remove Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__REMOVE_PRE_CONDITION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Remove Post Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__REMOVE_POST_CONDITION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Remove Post Input Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__REMOVE_POST_INPUT_CONDITION = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PRECOND_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__POSTCOND_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__POSTINPUTCOND_EXPR = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Provides Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__PROVIDES_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Output Annotations Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATIONS_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Output Annotation Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__OUTPUT_ANNOTATION_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Source Removals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__SOURCE_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Source Additions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__SOURCE_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Source Annotations Removals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATIONS_REMOVALS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Source Annotation Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT__SOURCE_ANNOTATION_ADDITIONS = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Builder Concern Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CONCERN_CONTEXT_FEATURE_COUNT = BUILD_CONCERN_CONTEXT_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.PathGroupPredicateImpl <em>Path Group Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.PathGroupPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathGroupPredicate()
	 * @generated
	 */
	int PATH_GROUP_PREDICATE = 29;

	/**
	 * The feature id for the '<em><b>Path Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP_PREDICATE__PATH_VECTOR = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP_PREDICATE__PATH_PATTERN = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Group Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PATH_GROUP_PREDICATE_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__NAME = REQUIRED_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__NAME_SPACE = REQUIRED_CAPABILITY__NAME_SPACE;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__COND_EXPR = REQUIRED_CAPABILITY__COND_EXPR;

	/**
	 * The feature id for the '<em><b>Version Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__VERSION_RANGE = REQUIRED_CAPABILITY__VERSION_RANGE;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__GREEDY = REQUIRED_CAPABILITY__GREEDY;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__MAX = REQUIRED_CAPABILITY__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__MIN = REQUIRED_CAPABILITY__MIN;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY__ALIAS = REQUIRED_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aliased Required Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALIASED_REQUIRED_CAPABILITY_FEATURE_COUNT = REQUIRED_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Required Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY_CONTAINER__REQUIRED_PREDICATES = 1;

	/**
	 * The number of structural features of the '<em>IRequired Capability Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IREQUIRED_CAPABILITY_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderQueryImpl <em>Builder Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderQueryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderQuery()
	 * @generated
	 */
	int BUILDER_QUERY = 33;

	/**
	 * The feature id for the '<em><b>Builder Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_QUERY__BUILDER_QUERIES = 0;

	/**
	 * The feature id for the '<em><b>Unit Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_QUERY__UNIT_QUERY = 1;

	/**
	 * The number of structural features of the '<em>Builder Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_QUERY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__VISIBILITY = B3backendPackage.B3_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__FINAL = B3backendPackage.B3_FUNCTION__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__EXECUTION_MODE = B3backendPackage.B3_FUNCTION__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__NAME = B3backendPackage.B3_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__GUARD = B3backendPackage.B3_FUNCTION__GUARD;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__EXCEPTION_TYPES = B3backendPackage.B3_FUNCTION__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__TYPE_PARAMETERS = B3backendPackage.B3_FUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__PARAMETERS = B3backendPackage.B3_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__VAR_ARGS = B3backendPackage.B3_FUNCTION__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__DOCUMENTATION = B3backendPackage.B3_FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__RETURN_TYPE = B3backendPackage.B3_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__TYPE_CALCULATOR = B3backendPackage.B3_FUNCTION__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__CONTAINER = B3backendPackage.B3_FUNCTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__CLASS_FUNCTION = B3backendPackage.B3_FUNCTION__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__VARARG_ARRAY_TYPE = B3backendPackage.B3_FUNCTION__VARARG_ARRAY_TYPE;

	/**
	 * The feature id for the '<em><b>Func Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__FUNC_EXPR = B3backendPackage.B3_FUNCTION__FUNC_EXPR;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__PROVIDED_CAPABILITIES = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__POSTCOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__PRECOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__INPUT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__OUTPUT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__DEFAULT_PROPERTIES = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__POSTINPUTCOND_EXPR = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__UNIT_TYPE = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__EXPLICIT_UNIT_TYPE = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER__SOURCE = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_FEATURE_COUNT = B3backendPackage.B3_FUNCTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__VISIBILITY = B3backendPackage.BJAVA_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__FINAL = B3backendPackage.BJAVA_FUNCTION__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__EXECUTION_MODE = B3backendPackage.BJAVA_FUNCTION__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__NAME = B3backendPackage.BJAVA_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__GUARD = B3backendPackage.BJAVA_FUNCTION__GUARD;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__EXCEPTION_TYPES = B3backendPackage.BJAVA_FUNCTION__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__TYPE_PARAMETERS = B3backendPackage.BJAVA_FUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PARAMETERS = B3backendPackage.BJAVA_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__VAR_ARGS = B3backendPackage.BJAVA_FUNCTION__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__DOCUMENTATION = B3backendPackage.BJAVA_FUNCTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__RETURN_TYPE = B3backendPackage.BJAVA_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__TYPE_CALCULATOR = B3backendPackage.BJAVA_FUNCTION__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CONTAINER = B3backendPackage.BJAVA_FUNCTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CLASS_FUNCTION = B3backendPackage.BJAVA_FUNCTION__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__VARARG_ARRAY_TYPE = B3backendPackage.BJAVA_FUNCTION__VARARG_ARRAY_TYPE;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__METHOD = B3backendPackage.BJAVA_FUNCTION__METHOD;

	/**
	 * The feature id for the '<em><b>Call Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__CALL_TYPE = B3backendPackage.BJAVA_FUNCTION__CALL_TYPE;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PARAMETER_TYPES = B3backendPackage.BJAVA_FUNCTION__PARAMETER_TYPES;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PARAMETER_NAMES = B3backendPackage.BJAVA_FUNCTION__PARAMETER_NAMES;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PROVIDED_CAPABILITIES = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__POSTCOND_EXPR = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__PRECOND_EXPR = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__INPUT = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__OUTPUT = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__DEFAULT_PROPERTIES = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__POSTINPUTCOND_EXPR = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__UNIT_TYPE = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__EXPLICIT_UNIT_TYPE = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA__SOURCE = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Builder Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_JAVA_FEATURE_COUNT = B3backendPackage.BJAVA_FUNCTION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderWrapperImpl <em>Builder Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderWrapperImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderWrapper()
	 * @generated
	 */
	int BUILDER_WRAPPER = 36;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VISIBILITY = B3backendPackage.BFUNCTION_WRAPPER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__FINAL = B3backendPackage.BFUNCTION_WRAPPER__FINAL;

	/**
	 * The feature id for the '<em><b>Execution Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__EXECUTION_MODE = B3backendPackage.BFUNCTION_WRAPPER__EXECUTION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__NAME = B3backendPackage.BFUNCTION_WRAPPER__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__GUARD = B3backendPackage.BFUNCTION_WRAPPER__GUARD;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__EXCEPTION_TYPES = B3backendPackage.BFUNCTION_WRAPPER__EXCEPTION_TYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__TYPE_PARAMETERS = B3backendPackage.BFUNCTION_WRAPPER__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PARAMETERS = B3backendPackage.BFUNCTION_WRAPPER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VAR_ARGS = B3backendPackage.BFUNCTION_WRAPPER__VAR_ARGS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__DOCUMENTATION = B3backendPackage.BFUNCTION_WRAPPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__RETURN_TYPE = B3backendPackage.BFUNCTION_WRAPPER__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Type Calculator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__TYPE_CALCULATOR = B3backendPackage.BFUNCTION_WRAPPER__TYPE_CALCULATOR;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__CONTAINER = B3backendPackage.BFUNCTION_WRAPPER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Class Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__CLASS_FUNCTION = B3backendPackage.BFUNCTION_WRAPPER__CLASS_FUNCTION;

	/**
	 * The feature id for the '<em><b>Vararg Array Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VARARG_ARRAY_TYPE = B3backendPackage.BFUNCTION_WRAPPER__VARARG_ARRAY_TYPE;

	/**
	 * The feature id for the '<em><b>Around Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__AROUND_EXPR = B3backendPackage.BFUNCTION_WRAPPER__AROUND_EXPR;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__ORIGINAL = B3backendPackage.BFUNCTION_WRAPPER__ORIGINAL;

	/**
	 * The feature id for the '<em><b>Parameter Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PARAMETER_MAP = B3backendPackage.BFUNCTION_WRAPPER__PARAMETER_MAP;

	/**
	 * The feature id for the '<em><b>Varargs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__VARARGS_NAME = B3backendPackage.BFUNCTION_WRAPPER__VARARGS_NAME;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PROVIDED_CAPABILITIES = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__POSTCOND_EXPR = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PRECOND_EXPR = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__INPUT = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__OUTPUT = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__DEFAULT_PROPERTIES = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Postinputcond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__POSTINPUTCOND_EXPR = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__UNIT_TYPE = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Explicit Unit Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__EXPLICIT_UNIT_TYPE = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__SOURCE = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Input Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__INPUT_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__OUTPUT_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unit Type Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__UNIT_TYPE_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Provides Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__PROVIDES_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Default Properties Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__DEFAULT_PROPERTIES_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Source Advised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER__SOURCE_ADVISED = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Builder Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_WRAPPER_FEATURE_COUNT = B3backendPackage.BFUNCTION_WRAPPER_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BeeModelImpl <em>Bee Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BeeModelImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBeeModel()
	 * @generated
	 */
	int BEE_MODEL = 37;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__EXPRESSIONS = B3backendPackage.BCHAINED_EXPRESSION__EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Build Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__BUILD_UNITS = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__IMPORTS = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__FUNCTIONS = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__CONCERNS = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__PROPERTY_SETS = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__REPOSITORIES = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__PROVIDERS = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL__DEFAULT_PROPERTIES = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Bee Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL_FEATURE_COUNT = B3backendPackage.BCHAINED_EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BeeHiveImpl <em>Bee Hive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BeeHiveImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBeeHive()
	 * @generated
	 */
	int BEE_HIVE = 38;

	/**
	 * The feature id for the '<em><b>Bee Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE__BEE_MODELS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Resolutions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE__RESOLUTIONS = 2;

	/**
	 * The number of structural features of the '<em>Bee Hive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_HIVE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.ResolutionInfoImpl <em>Resolution Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.ResolutionInfoImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getResolutionInfo()
	 * @generated
	 */
	int RESOLUTION_INFO = 39;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_INFO__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Resolution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_INFO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.IEffectiveFacade <em>IEffective Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.IEffectiveFacade
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIEffectiveFacade()
	 * @generated
	 */
	int IEFFECTIVE_FACADE = 71;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IEFFECTIVE_FACADE__CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>IEffective Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IEFFECTIVE_FACADE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.EffectiveFacadeImpl <em>Effective Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.EffectiveFacadeImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveFacade()
	 * @generated
	 */
	int EFFECTIVE_FACADE = 40;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_FACADE__CONTEXT = IEFFECTIVE_FACADE__CONTEXT;

	/**
	 * The number of structural features of the '<em>Effective Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_FACADE_FEATURE_COUNT = IEFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl <em>Effective Unit Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.EffectiveUnitFacadeImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveUnitFacade()
	 * @generated
	 */
	int EFFECTIVE_UNIT_FACADE = 41;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__UNIT = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__PROVIDED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__REQUIRED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meta Required Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__META_REQUIRED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Required Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE__UNIT_REQUIRED_CAPABILITIES = EFFECTIVE_FACADE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Effective Unit Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_UNIT_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.EffectiveRequirementFacadeImpl <em>Effective Requirement Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.EffectiveRequirementFacadeImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveRequirementFacade()
	 * @generated
	 */
	int EFFECTIVE_REQUIREMENT_FACADE = 42;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_REQUIREMENT_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_REQUIREMENT_FACADE__REQUIREMENT = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effective Requirement Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_REQUIREMENT_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.EffectiveCapabilityFacadeImpl <em>Effective Capability Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.EffectiveCapabilityFacadeImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveCapabilityFacade()
	 * @generated
	 */
	int EFFECTIVE_CAPABILITY_FACADE = 43;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_CAPABILITY_FACADE__CONTEXT = EFFECTIVE_FACADE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Provided Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_CAPABILITY_FACADE__PROVIDED_CAPABILITY = EFFECTIVE_FACADE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effective Capability Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_CAPABILITY_FACADE_FEATURE_COUNT = EFFECTIVE_FACADE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderCallFacadeImpl <em>Builder Call Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderCallFacadeImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderCallFacade()
	 * @generated
	 */
	int BUILDER_CALL_FACADE = 44;

	/**
	 * The feature id for the '<em><b>Builder Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL_FACADE__BUILDER_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL_FACADE__ALIASES = 1;

	/**
	 * The feature id for the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL_FACADE__REQUIRED_CAPABILITY = 2;

	/**
	 * The number of structural features of the '<em>Builder Call Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_CALL_FACADE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.EffectiveBuilderCallFacadeImpl <em>Effective Builder Call Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.EffectiveBuilderCallFacadeImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getEffectiveBuilderCallFacade()
	 * @generated
	 */
	int EFFECTIVE_BUILDER_CALL_FACADE = 72;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildSetImpl <em>Build Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildSetImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildSet()
	 * @generated
	 */
	int BUILD_SET = 45;

	/**
	 * The feature id for the '<em><b>Path Vectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_SET__PATH_VECTORS = B3backendPackage.ITYPED_VALUE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_SET__VALUE_MAP = B3backendPackage.ITYPED_VALUE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_SET__PATH_ITERATOR = B3backendPackage.ITYPED_VALUE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Build Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_SET_FEATURE_COUNT = B3backendPackage.ITYPED_VALUE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildResultContextImpl <em>Build Result Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildResultContextImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildResultContext()
	 * @generated
	 */
	int BUILD_RESULT_CONTEXT = 46;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__PARENT_CONTEXT = B3backendPackage.BINNER_CONTEXT__PARENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Value Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__VALUE_MAP = B3backendPackage.BINNER_CONTEXT__VALUE_MAP;

	/**
	 * The feature id for the '<em><b>Func Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__FUNC_STORE = B3backendPackage.BINNER_CONTEXT__FUNC_STORE;

	/**
	 * The feature id for the '<em><b>Effective Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__EFFECTIVE_CONCERNS = B3backendPackage.BINNER_CONTEXT__EFFECTIVE_CONCERNS;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__PROGRESS_MONITOR = B3backendPackage.BINNER_CONTEXT__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Injector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__INJECTOR = B3backendPackage.BINNER_CONTEXT__INJECTOR;

	/**
	 * The feature id for the '<em><b>Outer Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT__OUTER_CONTEXT = B3backendPackage.BINNER_CONTEXT__OUTER_CONTEXT;

	/**
	 * The number of structural features of the '<em>Build Result Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_RESULT_CONTEXT_FEATURE_COUNT = B3backendPackage.BINNER_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.OutputPredicateImpl <em>Output Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.OutputPredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getOutputPredicate()
	 * @generated
	 */
	int OUTPUT_PREDICATE = 47;

	/**
	 * The feature id for the '<em><b>Path Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PREDICATE__PATH_VECTOR = PATH_GROUP_PREDICATE__PATH_VECTOR;

	/**
	 * The feature id for the '<em><b>Path Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PREDICATE__PATH_PATTERN = PATH_GROUP_PREDICATE__PATH_PATTERN;

	/**
	 * The number of structural features of the '<em>Output Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PREDICATE_FEATURE_COUNT = PATH_GROUP_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.SourcePredicateImpl <em>Source Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.SourcePredicateImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getSourcePredicate()
	 * @generated
	 */
	int SOURCE_PREDICATE = 48;

	/**
	 * The feature id for the '<em><b>Path Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_PREDICATE__PATH_VECTOR = PATH_GROUP_PREDICATE__PATH_VECTOR;

	/**
	 * The feature id for the '<em><b>Path Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_PREDICATE__PATH_PATTERN = PATH_GROUP_PREDICATE__PATH_PATTERN;

	/**
	 * The number of structural features of the '<em>Source Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_PREDICATE_FEATURE_COUNT = PATH_GROUP_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.repository.IBuildUnitRepository <em>IBuild Unit Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.repository.IBuildUnitRepository
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIBuildUnitRepository()
	 * @generated
	 */
	int IBUILD_UNIT_REPOSITORY = 54;

	/**
	 * The number of structural features of the '<em>IBuild Unit Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILD_UNIT_REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildUnitRepositoryImpl <em>Build Unit Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildUnitRepositoryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildUnitRepository()
	 * @generated
	 */
	int BUILD_UNIT_REPOSITORY = 49;

	/**
	 * The number of structural features of the '<em>Build Unit Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT_REPOSITORY_FEATURE_COUNT = IBUILD_UNIT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.CompoundBuildUnitRepositoryImpl <em>Compound Build Unit Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.CompoundBuildUnitRepositoryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCompoundBuildUnitRepository()
	 * @generated
	 */
	int COMPOUND_BUILD_UNIT_REPOSITORY = 50;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Build Unit Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BUILD_UNIT_REPOSITORY_FEATURE_COUNT = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.CompoundFirstFoundRepositoryImpl <em>Compound First Found Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.CompoundFirstFoundRepositoryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getCompoundFirstFoundRepository()
	 * @generated
	 */
	int COMPOUND_FIRST_FOUND_REPOSITORY = 51;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRST_FOUND_REPOSITORY__REPOSITORIES = COMPOUND_BUILD_UNIT_REPOSITORY__REPOSITORIES;

	/**
	 * The number of structural features of the '<em>Compound First Found Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRST_FOUND_REPOSITORY_FEATURE_COUNT = COMPOUND_BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.ExecutionStackRepositoryImpl <em>Execution Stack Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.ExecutionStackRepositoryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getExecutionStackRepository()
	 * @generated
	 */
	int EXECUTION_STACK_REPOSITORY = 52;

	/**
	 * The number of structural features of the '<em>Execution Stack Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STACK_REPOSITORY_FEATURE_COUNT = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BeeModelRepositoryImpl <em>Bee Model Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BeeModelRepositoryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBeeModelRepository()
	 * @generated
	 */
	int BEE_MODEL_REPOSITORY = 53;

	/**
	 * The feature id for the '<em><b>Bee Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL_REPOSITORY__BEE_MODELS = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bee Model Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEE_MODEL_REPOSITORY_FEATURE_COUNT = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.UnitResolutionInfoImpl <em>Unit Resolution Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.UnitResolutionInfoImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitResolutionInfo()
	 * @generated
	 */
	int UNIT_RESOLUTION_INFO = 55;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOLUTION_INFO__STATUS = RESOLUTION_INFO__STATUS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOLUTION_INFO__UNIT = RESOLUTION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOLUTION_INFO__CONTEXT = RESOLUTION_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Resolution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_RESOLUTION_INFO_FEATURE_COUNT = RESOLUTION_INFO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.SwitchUnitProviderImpl <em>Switch Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.SwitchUnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getSwitchUnitProvider()
	 * @generated
	 */
	int SWITCH_UNIT_PROVIDER = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_UNIT_PROVIDER__DOCUMENTATION = UNIT_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Repo Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_UNIT_PROVIDER__REPO_SWITCH = UNIT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_UNIT_PROVIDER_FEATURE_COUNT = UNIT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.RepositoryImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BRANCHES = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOCUMENTATION = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HANDLER_TYPE = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPTIONS = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Build Unit Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BUILD_UNIT_REPOSITORY = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ADDRESS = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = B3backendPackage.BEXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BranchImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Branch Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_POINT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__EXCLUDE = 4;

	/**
	 * The feature id for the '<em><b>Branch Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_POINT = 5;

	/**
	 * The feature id for the '<em><b>Merge Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__MERGE_STRATEGY = 6;

	/**
	 * The feature id for the '<em><b>Checkout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__CHECKOUT = 7;

	/**
	 * The feature id for the '<em><b>Accept Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__ACCEPT_DIRTY = 8;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__UPDATE = 9;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH__REPLACE = 10;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.DelegatingUnitProviderImpl <em>Delegating Unit Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.DelegatingUnitProviderImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getDelegatingUnitProvider()
	 * @generated
	 */
	int DELEGATING_UNIT_PROVIDER = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATING_UNIT_PROVIDER__DOCUMENTATION = UNIT_PROVIDER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATING_UNIT_PROVIDER__DELEGATE = UNIT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delegating Unit Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELEGATING_UNIT_PROVIDER_FEATURE_COUNT = UNIT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.RepoOptionImpl <em>Repo Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.RepoOptionImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getRepoOption()
	 * @generated
	 */
	int REPO_OPTION = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPO_OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPO_OPTION__EXPR = 1;

	/**
	 * The number of structural features of the '<em>Repo Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REPO_OPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.UnitRepositoryDescriptionImpl <em>Unit Repository Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.UnitRepositoryDescriptionImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitRepositoryDescription()
	 * @generated
	 */
	int UNIT_REPOSITORY_DESCRIPTION = 61;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORY_DESCRIPTION__REPOSITORY = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evaluated Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORY_DESCRIPTION__EVALUATED_OPTIONS = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Repository Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_REPOSITORY_DESCRIPTION_FEATURE_COUNT = BUILD_UNIT_REPOSITORY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildCallMultipleImpl <em>Build Call Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallMultipleImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallMultiple()
	 * @generated
	 */
	int BUILD_CALL_MULTIPLE = 66;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_MULTIPLE__PARAMETERS = BUILDER_CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_MULTIPLE__BUILDER_NAME = BUILDER_CALL__BUILDER_NAME;

	/**
	 * The number of structural features of the '<em>Build Call Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_MULTIPLE_FEATURE_COUNT = BUILDER_CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildCallOnSelectedRequirementsImpl <em>Build Call On Selected Requirements</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallOnSelectedRequirementsImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallOnSelectedRequirements()
	 * @generated
	 */
	int BUILD_CALL_ON_SELECTED_REQUIREMENTS = 62;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_SELECTED_REQUIREMENTS__PARAMETERS = BUILD_CALL_MULTIPLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_SELECTED_REQUIREMENTS__BUILDER_NAME = BUILD_CALL_MULTIPLE__BUILDER_NAME;

	/**
	 * The feature id for the '<em><b>Required Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_SELECTED_REQUIREMENTS__REQUIRED_PREDICATE = BUILD_CALL_MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Call On Selected Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_SELECTED_REQUIREMENTS_FEATURE_COUNT = BUILD_CALL_MULTIPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderInputNameDecoratorImpl <em>Builder Input Name Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderInputNameDecoratorImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputNameDecorator()
	 * @generated
	 */
	int BUILDER_INPUT_NAME_DECORATOR = 63;

	/**
	 * The feature id for the '<em><b>Builder Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_NAME_DECORATOR__BUILDER_INPUT = BUILDER_INPUT_DECORATOR__BUILDER_INPUT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_NAME_DECORATOR__NAME = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Input Name Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_NAME_DECORATOR_FEATURE_COUNT = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderInputContextDecoratorImpl <em>Builder Input Context Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderInputContextDecoratorImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputContextDecorator()
	 * @generated
	 */
	int BUILDER_INPUT_CONTEXT_DECORATOR = 64;

	/**
	 * The feature id for the '<em><b>Builder Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_CONTEXT_DECORATOR__BUILDER_INPUT = BUILDER_INPUT_DECORATOR__BUILDER_INPUT;

	/**
	 * The feature id for the '<em><b>With Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_CONTEXT_DECORATOR__WITH_EXPR = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Input Context Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_CONTEXT_DECORATOR_FEATURE_COUNT = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderInputConditionImpl <em>Builder Input Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderInputConditionImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputCondition()
	 * @generated
	 */
	int BUILDER_INPUT_CONDITION = 65;

	/**
	 * The feature id for the '<em><b>Builder Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_CONDITION__BUILDER_INPUT = BUILDER_INPUT_DECORATOR__BUILDER_INPUT;

	/**
	 * The feature id for the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_CONDITION__COND_EXPR = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Builder Input Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_CONDITION_FEATURE_COUNT = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildCallSingleImpl <em>Build Call Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallSingleImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallSingle()
	 * @generated
	 */
	int BUILD_CALL_SINGLE = 67;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_SINGLE__PARAMETERS = BUILDER_CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_SINGLE__BUILDER_NAME = BUILDER_CALL__BUILDER_NAME;

	/**
	 * The feature id for the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_SINGLE__REQUIRED_CAPABILITY = BUILDER_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Call Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_SINGLE_FEATURE_COUNT = BUILDER_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildCallOnDeclaredRequirementImpl <em>Build Call On Declared Requirement</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallOnDeclaredRequirementImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallOnDeclaredRequirement()
	 * @generated
	 */
	int BUILD_CALL_ON_DECLARED_REQUIREMENT = 68;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_DECLARED_REQUIREMENT__PARAMETERS = BUILD_CALL_SINGLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_DECLARED_REQUIREMENT__BUILDER_NAME = BUILD_CALL_SINGLE__BUILDER_NAME;

	/**
	 * The feature id for the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY = BUILD_CALL_SINGLE__REQUIRED_CAPABILITY;

	/**
	 * The feature id for the '<em><b>Required Capability Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_DECLARED_REQUIREMENT__REQUIRED_CAPABILITY_DECLARATION = BUILD_CALL_SINGLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Call On Declared Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_DECLARED_REQUIREMENT_FEATURE_COUNT = BUILD_CALL_SINGLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuildCallOnReferencedRequirementImpl
	 * <em>Build Call On Referenced Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuildCallOnReferencedRequirementImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuildCallOnReferencedRequirement()
	 * @generated
	 */
	int BUILD_CALL_ON_REFERENCED_REQUIREMENT = 69;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_REFERENCED_REQUIREMENT__PARAMETERS = BUILD_CALL_SINGLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Builder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_REFERENCED_REQUIREMENT__BUILDER_NAME = BUILD_CALL_SINGLE__BUILDER_NAME;

	/**
	 * The feature id for the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY = BUILD_CALL_SINGLE__REQUIRED_CAPABILITY;

	/**
	 * The feature id for the '<em><b>Required Capability Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_REFERENCED_REQUIREMENT__REQUIRED_CAPABILITY_REFERENCE = BUILD_CALL_SINGLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Call On Referenced Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILD_CALL_ON_REFERENCED_REQUIREMENT_FEATURE_COUNT = BUILD_CALL_SINGLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.BuilderInputGroupImpl <em>Builder Input Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.BuilderInputGroupImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBuilderInputGroup()
	 * @generated
	 */
	int BUILDER_INPUT_GROUP = 70;

	/**
	 * The feature id for the '<em><b>Builder Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_GROUP__BUILDER_INPUT = BUILDER_INPUT_DECORATOR__BUILDER_INPUT;

	/**
	 * The number of structural features of the '<em>Builder Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUILDER_INPUT_GROUP_FEATURE_COUNT = BUILDER_INPUT_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Builder Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_CALL_FACADE__BUILDER_REFERENCE = BUILDER_CALL_FACADE__BUILDER_REFERENCE;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_CALL_FACADE__ALIASES = BUILDER_CALL_FACADE__ALIASES;

	/**
	 * The feature id for the '<em><b>Required Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_CALL_FACADE__REQUIRED_CAPABILITY = BUILDER_CALL_FACADE__REQUIRED_CAPABILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_CALL_FACADE__CONTEXT = BUILDER_CALL_FACADE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effective Builder Call Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_BUILDER_CALL_FACADE_FEATURE_COUNT = BUILDER_CALL_FACADE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.IBuildUnitContainer <em>IBuild Unit Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.IBuildUnitContainer
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIBuildUnitContainer()
	 * @generated
	 */
	int IBUILD_UNIT_CONTAINER = 73;

	/**
	 * The feature id for the '<em><b>Build Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILD_UNIT_CONTAINER__BUILD_UNITS = 0;

	/**
	 * The number of structural features of the '<em>IBuild Unit Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IBUILD_UNIT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.FragmentHostImpl <em>Fragment Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.FragmentHostImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getFragmentHost()
	 * @generated
	 */
	int FRAGMENT_HOST = 74;

	/**
	 * The feature id for the '<em><b>Host Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__HOST_REQUIREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Fragment Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.impl.UnitParameterDeclarationImpl <em>Unit Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.impl.UnitParameterDeclarationImpl
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getUnitParameterDeclaration()
	 * @generated
	 */
	int UNIT_PARAMETER_DECLARATION = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PARAMETER_DECLARATION__NAME = B3backendPackage.BPARAMETER_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PARAMETER_DECLARATION__TYPE = B3backendPackage.BPARAMETER_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PARAMETER_DECLARATION__FINAL = B3backendPackage.BPARAMETER_DECLARATION__FINAL;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PARAMETER_DECLARATION__IMMUTABLE = B3backendPackage.BPARAMETER_DECLARATION__IMMUTABLE;

	/**
	 * The number of structural features of the '<em>Unit Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNIT_PARAMETER_DECLARATION_FEATURE_COUNT = B3backendPackage.BPARAMETER_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.MergeConflictStrategy <em>Merge Conflict Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.MergeConflictStrategy
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getMergeConflictStrategy()
	 * @generated
	 */
	int MERGE_CONFLICT_STRATEGY = 76;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.BranchPointType <em>Branch Point Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.BranchPointType
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getBranchPointType()
	 * @generated
	 */
	int BRANCH_POINT_TYPE = 77;

	/**
	 * The meta object id for the '{@link org.eclipse.b3.build.TriState <em>Tri State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.TriState
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getTriState()
	 * @generated
	 */
	int TRI_STATE = 78;

	/**
	 * The meta object id for the '<em>Version Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.VersionRange
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getVersionRange()
	 * @generated
	 */
	int VERSION_RANGE = 79;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 80;

	/**
	 * The meta object id for the '<em>IStatus</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.runtime.IStatus
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIStatus()
	 * @generated
	 */
	int ISTATUS = 81;

	/**
	 * The meta object id for the '<em>Path Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.core.iterators.PathIterator
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getPathIterator()
	 * @generated
	 */
	int PATH_ITERATOR = 82;

	/**
	 * The meta object id for the '<em>B3 Builder Job</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.b3.build.core.B3BuilderJob
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getB3BuilderJob()
	 * @generated
	 */
	int B3_BUILDER_JOB = 83;

	/**
	 * The meta object id for the '<em>IMatch Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.expression.IMatchExpression
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIMatchExpression()
	 * @generated
	 */
	int IMATCH_EXPRESSION = 84;

	/**
	 * The meta object id for the '<em>IInstallable Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit
	 * @see org.eclipse.b3.build.impl.B3BuildPackageImpl#getIInstallableUnit()
	 * @generated
	 */
	int IINSTALLABLE_UNIT = 85;

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.AliasedRequiredCapability <em>Aliased Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aliased Required Capability</em>'.
	 * @see org.eclipse.b3.build.AliasedRequiredCapability
	 * @generated
	 */
	EClass getAliasedRequiredCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.AliasedRequiredCapability#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.b3.build.AliasedRequiredCapability#getAlias()
	 * @see #getAliasedRequiredCapability()
	 * @generated
	 */
	EAttribute getAliasedRequiredCapability_Alias();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.build.core.B3BuilderJob <em>B3 Builder Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>B3 Builder Job</em>'.
	 * @see org.eclipse.b3.build.core.B3BuilderJob
	 * @model instanceClass="org.eclipse.b3.build.core.B3BuilderJob" serializeable="false"
	 * @generated
	 */
	EDataType getB3BuilderJob();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	B3BuildFactory getB3BuildFactory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BeeHive <em>Bee Hive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bee Hive</em>'.
	 * @see org.eclipse.b3.build.BeeHive
	 * @generated
	 */
	EClass getBeeHive();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.BeeHive#getBeeModels <em>Bee Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Bee Models</em>'.
	 * @see org.eclipse.b3.build.BeeHive#getBeeModels()
	 * @see #getBeeHive()
	 * @generated
	 */
	EReference getBeeHive_BeeModels();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.BeeHive#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.b3.build.BeeHive#getParent()
	 * @see #getBeeHive()
	 * @generated
	 */
	EReference getBeeHive_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BeeHive#getResolutions <em>Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Resolutions</em>'.
	 * @see org.eclipse.b3.build.BeeHive#getResolutions()
	 * @see #getBeeHive()
	 * @generated
	 */
	EAttribute getBeeHive_Resolutions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BeeModel <em>Bee Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bee Model</em>'.
	 * @see org.eclipse.b3.build.BeeModel
	 * @generated
	 */
	EClass getBeeModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BeeModel#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getConcerns()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Concerns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BeeModel#getDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getDefaultProperties()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_DefaultProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BeeModel#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getFunctions()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BeeModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getImports()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BeeModel#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getPropertySets()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_PropertySets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BeeModel#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getProviders()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Providers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BeeModel#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.eclipse.b3.build.BeeModel#getRepositories()
	 * @see #getBeeModel()
	 * @generated
	 */
	EReference getBeeModel_Repositories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BeeModelRepository <em>Bee Model Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bee Model Repository</em>'.
	 * @see org.eclipse.b3.build.BeeModelRepository
	 * @generated
	 */
	EClass getBeeModelRepository();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.BeeModelRepository#getBeeModels <em>Bee Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Bee Models</em>'.
	 * @see org.eclipse.b3.build.BeeModelRepository#getBeeModels()
	 * @see #getBeeModelRepository()
	 * @generated
	 */
	EReference getBeeModelRepository_BeeModels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BestFoundUnitProvider <em>Best Found Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Best Found Unit Provider</em>'.
	 * @see org.eclipse.b3.build.BestFoundUnitProvider
	 * @generated
	 */
	EClass getBestFoundUnitProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see org.eclipse.b3.build.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getAcceptDirty <em>Accept Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Accept Dirty</em>'.
	 * @see org.eclipse.b3.build.Branch#getAcceptDirty()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_AcceptDirty();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.Branch#getBranchPoint <em>Branch Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Branch Point</em>'.
	 * @see org.eclipse.b3.build.Branch#getBranchPoint()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_BranchPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getBranchPointType <em>Branch Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Branch Point Type</em>'.
	 * @see org.eclipse.b3.build.Branch#getBranchPointType()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_BranchPointType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getCheckout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Checkout</em>'.
	 * @see org.eclipse.b3.build.Branch#getCheckout()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Checkout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.Branch#getDocumentation()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.Branch#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see org.eclipse.b3.build.Branch#getExclude()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Exclude();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.Branch#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.eclipse.b3.build.Branch#getInclude()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getMergeStrategy <em>Merge Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Merge Strategy</em>'.
	 * @see org.eclipse.b3.build.Branch#getMergeStrategy()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_MergeStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see org.eclipse.b3.build.Branch#getReplace()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Replace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Branch#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see org.eclipse.b3.build.Branch#getUpdate()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Update();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.b3.build.BranchPointType <em>Branch Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Branch Point Type</em>'.
	 * @see org.eclipse.b3.build.BranchPointType
	 * @generated
	 */
	EEnum getBranchPointType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildCallMultiple <em>Build Call Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Call Multiple</em>'.
	 * @see org.eclipse.b3.build.BuildCallMultiple
	 * @generated
	 */
	EClass getBuildCallMultiple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildCallOnDeclaredRequirement <em>Build Call On Declared Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Call On Declared Requirement</em>'.
	 * @see org.eclipse.b3.build.BuildCallOnDeclaredRequirement
	 * @generated
	 */
	EClass getBuildCallOnDeclaredRequirement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.b3.build.BuildCallOnDeclaredRequirement#getRequiredCapabilityDeclaration <em>Required Capability Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Required Capability Declaration</em>'.
	 * @see org.eclipse.b3.build.BuildCallOnDeclaredRequirement#getRequiredCapabilityDeclaration()
	 * @see #getBuildCallOnDeclaredRequirement()
	 * @generated
	 */
	EReference getBuildCallOnDeclaredRequirement_RequiredCapabilityDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildCallOnReferencedRequirement <em>Build Call On Referenced Requirement</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Call On Referenced Requirement</em>'.
	 * @see org.eclipse.b3.build.BuildCallOnReferencedRequirement
	 * @generated
	 */
	EClass getBuildCallOnReferencedRequirement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.BuildCallOnReferencedRequirement#getRequiredCapabilityReference
	 * <em>Required Capability Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Required Capability Reference</em>'.
	 * @see org.eclipse.b3.build.BuildCallOnReferencedRequirement#getRequiredCapabilityReference()
	 * @see #getBuildCallOnReferencedRequirement()
	 * @generated
	 */
	EReference getBuildCallOnReferencedRequirement_RequiredCapabilityReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildCallOnSelectedRequirements <em>Build Call On Selected Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Call On Selected Requirements</em>'.
	 * @see org.eclipse.b3.build.BuildCallOnSelectedRequirements
	 * @generated
	 */
	EClass getBuildCallOnSelectedRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuildCallOnSelectedRequirements#getRequiredPredicate
	 * <em>Required Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Required Predicate</em>'.
	 * @see org.eclipse.b3.build.BuildCallOnSelectedRequirements#getRequiredPredicate()
	 * @see #getBuildCallOnSelectedRequirements()
	 * @generated
	 */
	EReference getBuildCallOnSelectedRequirements_RequiredPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildCallSingle <em>Build Call Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Call Single</em>'.
	 * @see org.eclipse.b3.build.BuildCallSingle
	 * @generated
	 */
	EClass getBuildCallSingle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.BuildCallSingle#getRequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Required Capability</em>'.
	 * @see org.eclipse.b3.build.BuildCallSingle#getRequiredCapability()
	 * @see #getBuildCallSingle()
	 * @generated
	 */
	EReference getBuildCallSingle_RequiredCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildConcernContext <em>Build Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Concern Context</em>'.
	 * @see org.eclipse.b3.build.BuildConcernContext
	 * @generated
	 */
	EClass getBuildConcernContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuildConcernContext#getDefaultPropertiesAdditions
	 * <em>Default Properties Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Default Properties Additions</em>'.
	 * @see org.eclipse.b3.build.BuildConcernContext#getDefaultPropertiesAdditions()
	 * @see #getBuildConcernContext()
	 * @generated
	 */
	EReference getBuildConcernContext_DefaultPropertiesAdditions();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.BuildConcernContext#getDefaultPropertiesRemovals
	 * <em>Default Properties Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Default Properties Removals</em>'.
	 * @see org.eclipse.b3.build.BuildConcernContext#getDefaultPropertiesRemovals()
	 * @see #getBuildConcernContext()
	 * @generated
	 */
	EAttribute getBuildConcernContext_DefaultPropertiesRemovals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.Builder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder</em>'.
	 * @see org.eclipse.b3.build.Builder
	 * @generated
	 */
	EClass getBuilder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderCall <em>Builder Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Call</em>'.
	 * @see org.eclipse.b3.build.BuilderCall
	 * @generated
	 */
	EClass getBuilderCall();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderCall#getBuilderName <em>Builder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Builder Name</em>'.
	 * @see org.eclipse.b3.build.BuilderCall#getBuilderName()
	 * @see #getBuilderCall()
	 * @generated
	 */
	EAttribute getBuilderCall_BuilderName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see org.eclipse.b3.build.BuilderCall#getParameters()
	 * @see #getBuilderCall()
	 * @generated
	 */
	EReference getBuilderCall_Parameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderCallFacade <em>Builder Call Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Call Facade</em>'.
	 * @see org.eclipse.b3.build.BuilderCallFacade
	 * @generated
	 */
	EClass getBuilderCallFacade();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.BuilderCallFacade#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see org.eclipse.b3.build.BuilderCallFacade#getAliases()
	 * @see #getBuilderCallFacade()
	 * @generated
	 */
	EAttribute getBuilderCallFacade_Aliases();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.BuilderCallFacade#getBuilderReference <em>Builder Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Builder Reference</em>'.
	 * @see org.eclipse.b3.build.BuilderCallFacade#getBuilderReference()
	 * @see #getBuilderCallFacade()
	 * @generated
	 */
	EReference getBuilderCallFacade_BuilderReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.BuilderCallFacade#getRequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Required Capability</em>'.
	 * @see org.eclipse.b3.build.BuilderCallFacade#getRequiredCapability()
	 * @see #getBuilderCallFacade()
	 * @generated
	 */
	EReference getBuilderCallFacade_RequiredCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderConcernContext <em>Builder Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Concern Context</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext
	 * @generated
	 */
	EClass getBuilderConcernContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getFuncExpr <em>Func Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Func Expr</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getFuncExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_FuncExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getInputAdditions
	 * <em>Input Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Input Additions</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getInputAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_InputAdditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getInputRemovals
	 * <em>Input Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Input Removals</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getInputRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_InputRemovals();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderConcernContext#isMatchParameters <em>Match Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Match Parameters</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#isMatchParameters()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_MatchParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAdditions
	 * <em>Output Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Output Additions</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getOutputAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_OutputAdditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationAdditions
	 * <em>Output Annotation Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Output Annotation Additions</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_OutputAnnotationAdditions();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationsRemovals
	 * <em>Output Annotations Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Output Annotations Removals</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getOutputAnnotationsRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_OutputAnnotationsRemovals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getOutputRemovals
	 * <em>Output Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Output Removals</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getOutputRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_OutputRemovals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getParameters
	 * <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getParameters()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getPostcondExpr
	 * <em>Postcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Postcond Expr</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getPostcondExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_PostcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getPostinputcondExpr
	 * <em>Postinputcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Postinputcond Expr</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getPostinputcondExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_PostinputcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getPrecondExpr <em>Precond Expr</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Precond Expr</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getPrecondExpr()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_PrecondExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getProvidesRemovals
	 * <em>Provides Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Provides Removals</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getProvidesRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_ProvidesRemovals();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getQuery()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePostCondition
	 * <em>Remove Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Remove Post Condition</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#isRemovePostCondition()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_RemovePostCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePostInputCondition
	 * <em>Remove Post Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Remove Post Input Condition</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#isRemovePostInputCondition()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_RemovePostInputCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderConcernContext#isRemovePreCondition
	 * <em>Remove Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Remove Pre Condition</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#isRemovePreCondition()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_RemovePreCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAdditions
	 * <em>Source Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Source Additions</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getSourceAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_SourceAdditions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationAdditions
	 * <em>Source Annotation Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source Annotation Additions</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationAdditions()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_SourceAnnotationAdditions();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationsRemovals
	 * <em>Source Annotations Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Source Annotations Removals</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getSourceAnnotationsRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_SourceAnnotationsRemovals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderConcernContext#getSourceRemovals
	 * <em>Source Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Source Removals</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#getSourceRemovals()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EReference getBuilderConcernContext_SourceRemovals();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderConcernContext#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see org.eclipse.b3.build.BuilderConcernContext#isVarArgs()
	 * @see #getBuilderConcernContext()
	 * @generated
	 */
	EAttribute getBuilderConcernContext_VarArgs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderInput <em>Builder Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Input</em>'.
	 * @see org.eclipse.b3.build.BuilderInput
	 * @generated
	 */
	EClass getBuilderInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderInputCondition <em>Builder Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Input Condition</em>'.
	 * @see org.eclipse.b3.build.BuilderInputCondition
	 * @generated
	 */
	EClass getBuilderInputCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderInputCondition#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.BuilderInputCondition#getCondExpr()
	 * @see #getBuilderInputCondition()
	 * @generated
	 */
	EReference getBuilderInputCondition_CondExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderInputContextDecorator <em>Builder Input Context Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Input Context Decorator</em>'.
	 * @see org.eclipse.b3.build.BuilderInputContextDecorator
	 * @generated
	 */
	EClass getBuilderInputContextDecorator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderInputContextDecorator#getWithExpr <em>With Expr</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>With Expr</em>'.
	 * @see org.eclipse.b3.build.BuilderInputContextDecorator#getWithExpr()
	 * @see #getBuilderInputContextDecorator()
	 * @generated
	 */
	EReference getBuilderInputContextDecorator_WithExpr();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderInputDecorator <em>Builder Input Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Input Decorator</em>'.
	 * @see org.eclipse.b3.build.BuilderInputDecorator
	 * @generated
	 */
	EClass getBuilderInputDecorator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderInputDecorator#getBuilderInput
	 * <em>Builder Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Builder Input</em>'.
	 * @see org.eclipse.b3.build.BuilderInputDecorator#getBuilderInput()
	 * @see #getBuilderInputDecorator()
	 * @generated
	 */
	EReference getBuilderInputDecorator_BuilderInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderInputGroup <em>Builder Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Input Group</em>'.
	 * @see org.eclipse.b3.build.BuilderInputGroup
	 * @generated
	 */
	EClass getBuilderInputGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderInputNameDecorator <em>Builder Input Name Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Input Name Decorator</em>'.
	 * @see org.eclipse.b3.build.BuilderInputNameDecorator
	 * @generated
	 */
	EClass getBuilderInputNameDecorator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderJava <em>Builder Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Java</em>'.
	 * @see org.eclipse.b3.build.BuilderJava
	 * @generated
	 */
	EClass getBuilderJava();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderNamePredicate <em>Builder Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Name Predicate</em>'.
	 * @see org.eclipse.b3.build.BuilderNamePredicate
	 * @generated
	 */
	EClass getBuilderNamePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderNamePredicate#getNamePredicate
	 * <em>Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name Predicate</em>'.
	 * @see org.eclipse.b3.build.BuilderNamePredicate#getNamePredicate()
	 * @see #getBuilderNamePredicate()
	 * @generated
	 */
	EReference getBuilderNamePredicate_NamePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderQuery <em>Builder Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Query</em>'.
	 * @see org.eclipse.b3.build.BuilderQuery
	 * @generated
	 */
	EClass getBuilderQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuilderQuery#getBuilderQueries
	 * <em>Builder Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Builder Queries</em>'.
	 * @see org.eclipse.b3.build.BuilderQuery#getBuilderQueries()
	 * @see #getBuilderQuery()
	 * @generated
	 */
	EReference getBuilderQuery_BuilderQueries();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuilderQuery#getUnitQuery <em>Unit Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Unit Query</em>'.
	 * @see org.eclipse.b3.build.BuilderQuery#getUnitQuery()
	 * @see #getBuilderQuery()
	 * @generated
	 */
	EReference getBuilderQuery_UnitQuery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuilderWrapper <em>Builder Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Builder Wrapper</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper
	 * @generated
	 */
	EClass getBuilderWrapper();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderWrapper#isDefaultPropertiesAdvised
	 * <em>Default Properties Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Default Properties Advised</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper#isDefaultPropertiesAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_DefaultPropertiesAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderWrapper#isInputAdvised <em>Input Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Input Advised</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper#isInputAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_InputAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderWrapper#isOutputAdvised <em>Output Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Output Advised</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper#isOutputAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_OutputAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderWrapper#isProvidesAdvised <em>Provides Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Provides Advised</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper#isProvidesAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_ProvidesAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderWrapper#isSourceAdvised <em>Source Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Advised</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper#isSourceAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_SourceAdvised();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuilderWrapper#isUnitTypeAdvised <em>Unit Type Advised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit Type Advised</em>'.
	 * @see org.eclipse.b3.build.BuilderWrapper#isUnitTypeAdvised()
	 * @see #getBuilderWrapper()
	 * @generated
	 */
	EAttribute getBuilderWrapper_UnitTypeAdvised();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildResultContext <em>Build Result Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Result Context</em>'.
	 * @see org.eclipse.b3.build.BuildResultContext
	 * @generated
	 */
	EClass getBuildResultContext();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildSet <em>Build Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Set</em>'.
	 * @see org.eclipse.b3.build.BuildSet
	 * @generated
	 */
	EClass getBuildSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildSet#getPathIterator <em>Path Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Path Iterator</em>'.
	 * @see org.eclipse.b3.build.BuildSet#getPathIterator()
	 * @see #getBuildSet()
	 * @generated
	 */
	EAttribute getBuildSet_PathIterator();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.BuildSet#getPathVectors <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.BuildSet#getPathVectors()
	 * @see #getBuildSet()
	 * @generated
	 */
	EReference getBuildSet_PathVectors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildSet#getValueMap <em>Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value Map</em>'.
	 * @see org.eclipse.b3.build.BuildSet#getValueMap()
	 * @see #getBuildSet()
	 * @generated
	 */
	EAttribute getBuildSet_ValueMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildUnit <em>Build Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Unit</em>'.
	 * @see org.eclipse.b3.build.BuildUnit
	 * @generated
	 */
	EClass getBuildUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.BuildUnit#getBuilders <em>Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Builders</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getBuilders()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Builders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getConcerns()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Concerns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getContainers()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Containers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.BuildUnit#getDefaultProperties <em>Default Properties</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getDefaultProperties()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_DefaultProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildUnit#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getDocumentation()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildUnit#getExecutionMode <em>Execution Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Execution Mode</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getExecutionMode()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_ExecutionMode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getFragmentHosts <em>Fragment Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Fragment Hosts</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getFragmentHosts()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_FragmentHosts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getImplements()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getMetaRequiredCapabilities
	 * <em>Meta Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Meta Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getMetaRequiredCapabilities()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_MetaRequiredCapabilities();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildUnit#getOutputLocation <em>Output Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Output Location</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getOutputLocation()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_OutputLocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.BuildUnit#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getParent()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildUnit#getPlatformFilter <em>Platform Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Platform Filter</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getPlatformFilter()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_PlatformFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getPropertySets()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_PropertySets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getProviders()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Providers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getRepositories()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Repositories();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.BuildUnit#getSourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Location</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getSourceLocation()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_SourceLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.BuildUnit#getSynchronizations
	 * <em>Synchronizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Synchronizations</em>'.
	 * @see org.eclipse.b3.build.BuildUnit#getSynchronizations()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Synchronizations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.BuildUnitRepository <em>Build Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Build Unit Repository</em>'.
	 * @see org.eclipse.b3.build.BuildUnitRepository
	 * @generated
	 */
	EClass getBuildUnitRepository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.eclipse.b3.build.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.Capability#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.Capability#getCondExpr()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_CondExpr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Capability#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.eclipse.b3.build.Capability#getNameSpace()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_NameSpace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.CapabilityPredicate <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.CapabilityPredicate
	 * @generated
	 */
	EClass getCapabilityPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.CapabilityPredicate#getNamePredicate
	 * <em>Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name Predicate</em>'.
	 * @see org.eclipse.b3.build.CapabilityPredicate#getNamePredicate()
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	EReference getCapabilityPredicate_NamePredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.CapabilityPredicate#getNameSpacePredicate
	 * <em>Name Space Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name Space Predicate</em>'.
	 * @see org.eclipse.b3.build.CapabilityPredicate#getNameSpacePredicate()
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	EReference getCapabilityPredicate_NameSpacePredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.CapabilityPredicate#getVersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version Range</em>'.
	 * @see org.eclipse.b3.build.CapabilityPredicate#getVersionRange()
	 * @see #getCapabilityPredicate()
	 * @generated
	 */
	EAttribute getCapabilityPredicate_VersionRange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.CompoundBuildUnitRepository <em>Compound Build Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Compound Build Unit Repository</em>'.
	 * @see org.eclipse.b3.build.CompoundBuildUnitRepository
	 * @generated
	 */
	EClass getCompoundBuildUnitRepository();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.CompoundBuildUnitRepository#getRepositories <em>Repositories</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Repositories</em>'.
	 * @see org.eclipse.b3.build.CompoundBuildUnitRepository#getRepositories()
	 * @see #getCompoundBuildUnitRepository()
	 * @generated
	 */
	EReference getCompoundBuildUnitRepository_Repositories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.CompoundFirstFoundRepository <em>Compound First Found Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Compound First Found Repository</em>'.
	 * @see org.eclipse.b3.build.CompoundFirstFoundRepository
	 * @generated
	 */
	EClass getCompoundFirstFoundRepository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.CompoundUnitProvider <em>Compound Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Compound Unit Provider</em>'.
	 * @see org.eclipse.b3.build.CompoundUnitProvider
	 * @generated
	 */
	EClass getCompoundUnitProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.CompoundUnitProvider#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see org.eclipse.b3.build.CompoundUnitProvider#getProviders()
	 * @see #getCompoundUnitProvider()
	 * @generated
	 */
	EReference getCompoundUnitProvider_Providers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.ConditionalPathVector <em>Conditional Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Conditional Path Vector</em>'.
	 * @see org.eclipse.b3.build.ConditionalPathVector
	 * @generated
	 */
	EClass getConditionalPathVector();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.ConditionalPathVector#getCondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cond Expr</em>'.
	 * @see org.eclipse.b3.build.ConditionalPathVector#getCondExpr()
	 * @see #getConditionalPathVector()
	 * @generated
	 */
	EReference getConditionalPathVector_CondExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.ConditionalPathVector#getPathVectors
	 * <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.ConditionalPathVector#getPathVectors()
	 * @see #getConditionalPathVector()
	 * @generated
	 */
	EReference getConditionalPathVector_PathVectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.ContainerConfiguration <em>Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Container Configuration</em>'.
	 * @see org.eclipse.b3.build.ContainerConfiguration
	 * @generated
	 */
	EClass getContainerConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.ContainerConfiguration#getAgentType <em>Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Agent Type</em>'.
	 * @see org.eclipse.b3.build.ContainerConfiguration#getAgentType()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EReference getContainerConfiguration_AgentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.ContainerConfiguration#getContextBlock
	 * <em>Context Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Context Block</em>'.
	 * @see org.eclipse.b3.build.ContainerConfiguration#getContextBlock()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EReference getContainerConfiguration_ContextBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.ContainerConfiguration#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.ContainerConfiguration#getDocumentation()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EAttribute getContainerConfiguration_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.ContainerConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.ContainerConfiguration#getName()
	 * @see #getContainerConfiguration()
	 * @generated
	 */
	EAttribute getContainerConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.DelegatingUnitProvider <em>Delegating Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Delegating Unit Provider</em>'.
	 * @see org.eclipse.b3.build.DelegatingUnitProvider
	 * @generated
	 */
	EClass getDelegatingUnitProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.DelegatingUnitProvider#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see org.eclipse.b3.build.DelegatingUnitProvider#getDelegate()
	 * @see #getDelegatingUnitProvider()
	 * @generated
	 */
	EReference getDelegatingUnitProvider_Delegate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.EffectiveBuilderCallFacade <em>Effective Builder Call Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Effective Builder Call Facade</em>'.
	 * @see org.eclipse.b3.build.EffectiveBuilderCallFacade
	 * @generated
	 */
	EClass getEffectiveBuilderCallFacade();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.EffectiveCapabilityFacade <em>Effective Capability Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Effective Capability Facade</em>'.
	 * @see org.eclipse.b3.build.EffectiveCapabilityFacade
	 * @generated
	 */
	EClass getEffectiveCapabilityFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.EffectiveCapabilityFacade#getProvidedCapability
	 * <em>Provided Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Provided Capability</em>'.
	 * @see org.eclipse.b3.build.EffectiveCapabilityFacade#getProvidedCapability()
	 * @see #getEffectiveCapabilityFacade()
	 * @generated
	 */
	EReference getEffectiveCapabilityFacade_ProvidedCapability();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.EffectiveFacade <em>Effective Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Effective Facade</em>'.
	 * @see org.eclipse.b3.build.EffectiveFacade
	 * @generated
	 */
	EClass getEffectiveFacade();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.EffectiveRequirementFacade <em>Effective Requirement Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Effective Requirement Facade</em>'.
	 * @see org.eclipse.b3.build.EffectiveRequirementFacade
	 * @generated
	 */
	EClass getEffectiveRequirementFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.EffectiveRequirementFacade#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.eclipse.b3.build.EffectiveRequirementFacade#getRequirement()
	 * @see #getEffectiveRequirementFacade()
	 * @generated
	 */
	EReference getEffectiveRequirementFacade_Requirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.EffectiveUnitFacade <em>Effective Unit Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Effective Unit Facade</em>'.
	 * @see org.eclipse.b3.build.EffectiveUnitFacade
	 * @generated
	 */
	EClass getEffectiveUnitFacade();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.EffectiveUnitFacade#getMetaRequiredCapabilities
	 * <em>Meta Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Meta Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.EffectiveUnitFacade#getMetaRequiredCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_MetaRequiredCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.EffectiveUnitFacade#getProvidedCapabilities
	 * <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see org.eclipse.b3.build.EffectiveUnitFacade#getProvidedCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_ProvidedCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.EffectiveUnitFacade#getRequiredCapabilities
	 * <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.EffectiveUnitFacade#getRequiredCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_RequiredCapabilities();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.EffectiveUnitFacade#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.b3.build.EffectiveUnitFacade#getUnit()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_Unit();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.b3.build.EffectiveUnitFacade#getUnitRequiredCapabilities
	 * <em>Unit Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Unit Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.EffectiveUnitFacade#getUnitRequiredCapabilities()
	 * @see #getEffectiveUnitFacade()
	 * @generated
	 */
	EReference getEffectiveUnitFacade_UnitRequiredCapabilities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.ExecutionStackRepository <em>Execution Stack Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Execution Stack Repository</em>'.
	 * @see org.eclipse.b3.build.ExecutionStackRepository
	 * @generated
	 */
	EClass getExecutionStackRepository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.FirstFoundUnitProvider <em>First Found Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>First Found Unit Provider</em>'.
	 * @see org.eclipse.b3.build.FirstFoundUnitProvider
	 * @generated
	 */
	EClass getFirstFoundUnitProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.FragmentHost <em>Fragment Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Fragment Host</em>'.
	 * @see org.eclipse.b3.build.FragmentHost
	 * @generated
	 */
	EClass getFragmentHost();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.FragmentHost#getHostRequirements
	 * <em>Host Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Host Requirements</em>'.
	 * @see org.eclipse.b3.build.FragmentHost#getHostRequirements()
	 * @see #getFragmentHost()
	 * @generated
	 */
	EReference getFragmentHost_HostRequirements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.IBuilder <em>IBuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IBuilder</em>'.
	 * @see org.eclipse.b3.build.IBuilder
	 * @generated
	 */
	EClass getIBuilder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Default Properties</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getDefaultProperties()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_DefaultProperties();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getExplicitUnitType <em>Explicit Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Explicit Unit Type</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getExplicitUnitType()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_ExplicitUnitType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getInput()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getOutput()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_Output();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getPostcondExpr <em>Postcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Postcond Expr</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getPostcondExpr()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_PostcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getPostinputcondExpr <em>Postinputcond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Postinputcond Expr</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getPostinputcondExpr()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_PostinputcondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getPrecondExpr <em>Precond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Precond Expr</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getPrecondExpr()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_PrecondExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.IBuilder#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getSource()
	 * @see #getIBuilder()
	 * @generated
	 */
	EReference getIBuilder_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.IBuilder#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see org.eclipse.b3.build.IBuilder#getUnitType()
	 * @see #getIBuilder()
	 * @generated
	 */
	EAttribute getIBuilder_UnitType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.IBuildUnitContainer <em>IBuild Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IBuild Unit Container</em>'.
	 * @see org.eclipse.b3.build.IBuildUnitContainer
	 * @generated
	 */
	EClass getIBuildUnitContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.IBuildUnitContainer#getBuildUnits <em>Build Units</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Build Units</em>'.
	 * @see org.eclipse.b3.build.IBuildUnitContainer#getBuildUnits()
	 * @see #getIBuildUnitContainer()
	 * @generated
	 */
	EReference getIBuildUnitContainer_BuildUnits();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.repository.IBuildUnitRepository <em>IBuild Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IBuild Unit Repository</em>'.
	 * @see org.eclipse.b3.build.repository.IBuildUnitRepository
	 * @model instanceClass="org.eclipse.b3.build.repository.IBuildUnitRepository"
	 * @generated
	 */
	EClass getIBuildUnitRepository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.IEffectiveFacade <em>IEffective Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IEffective Facade</em>'.
	 * @see org.eclipse.b3.build.IEffectiveFacade
	 * @generated
	 */
	EClass getIEffectiveFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.IEffectiveFacade#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.b3.build.IEffectiveFacade#getContext()
	 * @see #getIEffectiveFacade()
	 * @generated
	 */
	EReference getIEffectiveFacade_Context();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.IInstallableUnit <em>IInstallable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IInstallable Unit</em>'.
	 * @see org.eclipse.equinox.p2.metadata.IInstallableUnit
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.IInstallableUnit"
	 * @generated
	 */
	EDataType getIInstallableUnit();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.expression.IMatchExpression <em>IMatch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IMatch Expression</em>'.
	 * @see org.eclipse.equinox.p2.metadata.expression.IMatchExpression
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.expression.IMatchExpression" typeParameters="T"
	 * @generated
	 */
	EDataType getIMatchExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.ImplementsPredicate <em>Implements Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Implements Predicate</em>'.
	 * @see org.eclipse.b3.build.ImplementsPredicate
	 * @generated
	 */
	EClass getImplementsPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.ImplementsPredicate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.b3.build.ImplementsPredicate#getType()
	 * @see #getImplementsPredicate()
	 * @generated
	 */
	EReference getImplementsPredicate_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.InputPredicate <em>Input Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Input Predicate</em>'.
	 * @see org.eclipse.b3.build.InputPredicate
	 * @generated
	 */
	EClass getInputPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.InputPredicate#getBuilderPredicate
	 * <em>Builder Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Builder Predicate</em>'.
	 * @see org.eclipse.b3.build.InputPredicate#getBuilderPredicate()
	 * @see #getInputPredicate()
	 * @generated
	 */
	EReference getInputPredicate_BuilderPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.InputPredicate#getCapabilityPredicate
	 * <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.InputPredicate#getCapabilityPredicate()
	 * @see #getInputPredicate()
	 * @generated
	 */
	EReference getInputPredicate_CapabilityPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.IProvidedCapabilityContainer <em>IProvided Capability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IProvided Capability Container</em>'.
	 * @see org.eclipse.b3.build.IProvidedCapabilityContainer
	 * @generated
	 */
	EClass getIProvidedCapabilityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.IProvidedCapabilityContainer#getProvidedCapabilities
	 * <em>Provided Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Provided Capabilities</em>'.
	 * @see org.eclipse.b3.build.IProvidedCapabilityContainer#getProvidedCapabilities()
	 * @see #getIProvidedCapabilityContainer()
	 * @generated
	 */
	EReference getIProvidedCapabilityContainer_ProvidedCapabilities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.IRequiredCapabilityContainer <em>IRequired Capability Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IRequired Capability Container</em>'.
	 * @see org.eclipse.b3.build.IRequiredCapabilityContainer
	 * @generated
	 */
	EClass getIRequiredCapabilityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.IRequiredCapabilityContainer#getRequiredCapabilities
	 * <em>Required Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Required Capabilities</em>'.
	 * @see org.eclipse.b3.build.IRequiredCapabilityContainer#getRequiredCapabilities()
	 * @see #getIRequiredCapabilityContainer()
	 * @generated
	 */
	EReference getIRequiredCapabilityContainer_RequiredCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.IRequiredCapabilityContainer#getRequiredPredicates
	 * <em>Required Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Required Predicates</em>'.
	 * @see org.eclipse.b3.build.IRequiredCapabilityContainer#getRequiredPredicates()
	 * @see #getIRequiredCapabilityContainer()
	 * @generated
	 */
	EReference getIRequiredCapabilityContainer_RequiredPredicates();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IStatus <em>IStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IStatus</em>'.
	 * @see org.eclipse.core.runtime.IStatus
	 * @model instanceClass="org.eclipse.core.runtime.IStatus"
	 * @generated
	 */
	EDataType getIStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.b3.build.MergeConflictStrategy <em>Merge Conflict Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Merge Conflict Strategy</em>'.
	 * @see org.eclipse.b3.build.MergeConflictStrategy
	 * @generated
	 */
	EEnum getMergeConflictStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.NameSpacePredicate <em>Name Space Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name Space Predicate</em>'.
	 * @see org.eclipse.b3.build.NameSpacePredicate
	 * @generated
	 */
	EClass getNameSpacePredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.NameSpacePredicate#getNameSpace <em>Name Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name Space</em>'.
	 * @see org.eclipse.b3.build.NameSpacePredicate#getNameSpace()
	 * @see #getNameSpacePredicate()
	 * @generated
	 */
	EAttribute getNameSpacePredicate_NameSpace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.OutputPredicate <em>Output Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Output Predicate</em>'.
	 * @see org.eclipse.b3.build.OutputPredicate
	 * @generated
	 */
	EClass getOutputPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.PathGroup <em>Path Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Path Group</em>'.
	 * @see org.eclipse.b3.build.PathGroup
	 * @generated
	 */
	EClass getPathGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.PathGroup#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see org.eclipse.b3.build.PathGroup#getAnnotations()
	 * @see #getPathGroup()
	 * @generated
	 */
	EReference getPathGroup_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.PathGroup#getPathVectors <em>Path Vectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Path Vectors</em>'.
	 * @see org.eclipse.b3.build.PathGroup#getPathVectors()
	 * @see #getPathGroup()
	 * @generated
	 */
	EReference getPathGroup_PathVectors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.PathGroupPredicate <em>Path Group Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Path Group Predicate</em>'.
	 * @see org.eclipse.b3.build.PathGroupPredicate
	 * @generated
	 */
	EClass getPathGroupPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.PathGroupPredicate#getPathPattern <em>Path Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Path Pattern</em>'.
	 * @see org.eclipse.b3.build.PathGroupPredicate#getPathPattern()
	 * @see #getPathGroupPredicate()
	 * @generated
	 */
	EReference getPathGroupPredicate_PathPattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.PathGroupPredicate#getPathVector <em>Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Path Vector</em>'.
	 * @see org.eclipse.b3.build.PathGroupPredicate#getPathVector()
	 * @see #getPathGroupPredicate()
	 * @generated
	 */
	EReference getPathGroupPredicate_PathVector();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.b3.build.core.iterators.PathIterator <em>Path Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Path Iterator</em>'.
	 * @see org.eclipse.b3.build.core.iterators.PathIterator
	 * @model instanceClass="org.eclipse.b3.build.core.iterators.PathIterator"
	 * @generated
	 */
	EDataType getPathIterator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.PathVector <em>Path Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Path Vector</em>'.
	 * @see org.eclipse.b3.build.PathVector
	 * @generated
	 */
	EClass getPathVector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.PathVector#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see org.eclipse.b3.build.PathVector#getBasePath()
	 * @see #getPathVector()
	 * @generated
	 */
	EAttribute getPathVector_BasePath();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.b3.build.PathVector#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see org.eclipse.b3.build.PathVector#getPaths()
	 * @see #getPathVector()
	 * @generated
	 */
	EAttribute getPathVector_Paths();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.ProvidesPredicate <em>Provides Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Provides Predicate</em>'.
	 * @see org.eclipse.b3.build.ProvidesPredicate
	 * @generated
	 */
	EClass getProvidesPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.ProvidesPredicate#getCapabilityPredicate
	 * <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.ProvidesPredicate#getCapabilityPredicate()
	 * @see #getProvidesPredicate()
	 * @generated
	 */
	EReference getProvidesPredicate_CapabilityPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.RepoOption <em>Repo Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repo Option</em>'.
	 * @see org.eclipse.b3.build.RepoOption
	 * @generated
	 */
	EClass getRepoOption();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.RepoOption#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclipse.b3.build.RepoOption#getExpr()
	 * @see #getRepoOption()
	 * @generated
	 */
	EReference getRepoOption_Expr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.RepoOption#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.RepoOption#getName()
	 * @see #getRepoOption()
	 * @generated
	 */
	EAttribute getRepoOption_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.eclipse.b3.build.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.Repository#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.eclipse.b3.build.Repository#getAddress()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.Repository#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.eclipse.b3.build.Repository#getBranches()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Branches();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.Repository#getBuildUnitRepository <em>Build Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Build Unit Repository</em>'.
	 * @see org.eclipse.b3.build.Repository#getBuildUnitRepository()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_BuildUnitRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Repository#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.Repository#getDocumentation()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Repository#getHandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Handler Type</em>'.
	 * @see org.eclipse.b3.build.Repository#getHandlerType()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_HandlerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.b3.build.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.Repository#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.eclipse.b3.build.Repository#getOptions()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Options();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.RepositoryUnitProvider <em>Repository Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Repository Unit Provider</em>'.
	 * @see org.eclipse.b3.build.RepositoryUnitProvider
	 * @generated
	 */
	EClass getRepositoryUnitProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.RepositoryUnitProvider#getBuildUnitRepository
	 * <em>Build Unit Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Build Unit Repository</em>'.
	 * @see org.eclipse.b3.build.RepositoryUnitProvider#getBuildUnitRepository()
	 * @see #getRepositoryUnitProvider()
	 * @generated
	 */
	EReference getRepositoryUnitProvider_BuildUnitRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.RepositoryUnitProvider#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.eclipse.b3.build.RepositoryUnitProvider#getOptions()
	 * @see #getRepositoryUnitProvider()
	 * @generated
	 */
	EReference getRepositoryUnitProvider_Options();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.RepositoryUnitProvider#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.eclipse.b3.build.RepositoryUnitProvider#getRepository()
	 * @see #getRepositoryUnitProvider()
	 * @generated
	 */
	EReference getRepositoryUnitProvider_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.RequiredCapability <em>Required Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Required Capability</em>'.
	 * @see org.eclipse.b3.build.RequiredCapability
	 * @generated
	 */
	EClass getRequiredCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.RequiredCapability#isGreedy <em>Greedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Greedy</em>'.
	 * @see org.eclipse.b3.build.RequiredCapability#isGreedy()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EAttribute getRequiredCapability_Greedy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.RequiredCapability#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.b3.build.RequiredCapability#getMax()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EAttribute getRequiredCapability_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.RequiredCapability#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.b3.build.RequiredCapability#getMin()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EAttribute getRequiredCapability_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.RequiredCapability#getVersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version Range</em>'.
	 * @see org.eclipse.b3.build.RequiredCapability#getVersionRange()
	 * @see #getRequiredCapability()
	 * @generated
	 */
	EAttribute getRequiredCapability_VersionRange();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.RequiresPredicate <em>Requires Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Requires Predicate</em>'.
	 * @see org.eclipse.b3.build.RequiresPredicate
	 * @generated
	 */
	EClass getRequiresPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.RequiresPredicate#getCapabilityPredicate
	 * <em>Capability Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Capability Predicate</em>'.
	 * @see org.eclipse.b3.build.RequiresPredicate#getCapabilityPredicate()
	 * @see #getRequiresPredicate()
	 * @generated
	 */
	EReference getRequiresPredicate_CapabilityPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.RequiresPredicate#isMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see org.eclipse.b3.build.RequiresPredicate#isMeta()
	 * @see #getRequiresPredicate()
	 * @generated
	 */
	EAttribute getRequiresPredicate_Meta();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.ResolutionInfo <em>Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resolution Info</em>'.
	 * @see org.eclipse.b3.build.ResolutionInfo
	 * @generated
	 */
	EClass getResolutionInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.ResolutionInfo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.b3.build.ResolutionInfo#getStatus()
	 * @see #getResolutionInfo()
	 * @generated
	 */
	EAttribute getResolutionInfo_Status();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.SourcePredicate <em>Source Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source Predicate</em>'.
	 * @see org.eclipse.b3.build.SourcePredicate
	 * @generated
	 */
	EClass getSourcePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.SwitchUnitProvider <em>Switch Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Switch Unit Provider</em>'.
	 * @see org.eclipse.b3.build.SwitchUnitProvider
	 * @generated
	 */
	EClass getSwitchUnitProvider();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.SwitchUnitProvider#getRepoSwitch <em>Repo Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Repo Switch</em>'.
	 * @see org.eclipse.b3.build.SwitchUnitProvider#getRepoSwitch()
	 * @see #getSwitchUnitProvider()
	 * @generated
	 */
	EReference getSwitchUnitProvider_RepoSwitch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see org.eclipse.b3.build.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.Synchronization#getBuilderQueries
	 * <em>Builder Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Builder Queries</em>'.
	 * @see org.eclipse.b3.build.Synchronization#getBuilderQueries()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_BuilderQueries();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.b3.build.TriState <em>Tri State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Tri State</em>'.
	 * @see org.eclipse.b3.build.TriState
	 * @generated
	 */
	EEnum getTriState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.UnitConcernContext <em>Unit Concern Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Concern Context</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext
	 * @generated
	 */
	EClass getUnitConcernContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.UnitConcernContext#getBuilderContexts
	 * <em>Builder Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Builder Contexts</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getBuilderContexts()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_BuilderContexts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.UnitConcernContext#getOutputLocation <em>Output Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Output Location</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getOutputLocation()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EAttribute getUnitConcernContext_OutputLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.UnitConcernContext#getProvidesRemovals
	 * <em>Provides Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Provides Removals</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getProvidesRemovals()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_ProvidesRemovals();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.b3.build.UnitConcernContext#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getQuery()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.UnitConcernContext#getRequiredPredicatesRemovals
	 * <em>Required Predicates Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Required Predicates Removals</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getRequiredPredicatesRemovals()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_RequiredPredicatesRemovals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.b3.build.UnitConcernContext#getRequiresRemovals
	 * <em>Requires Removals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Requires Removals</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getRequiresRemovals()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EReference getUnitConcernContext_RequiresRemovals();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.UnitConcernContext#getSourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Source Location</em>'.
	 * @see org.eclipse.b3.build.UnitConcernContext#getSourceLocation()
	 * @see #getUnitConcernContext()
	 * @generated
	 */
	EAttribute getUnitConcernContext_SourceLocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.UnitNamePredicate <em>Unit Name Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Name Predicate</em>'.
	 * @see org.eclipse.b3.build.UnitNamePredicate
	 * @generated
	 */
	EClass getUnitNamePredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.UnitParameterDeclaration <em>Unit Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Parameter Declaration</em>'.
	 * @see org.eclipse.b3.build.UnitParameterDeclaration
	 * @generated
	 */
	EClass getUnitParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.UnitProvider <em>Unit Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Provider</em>'.
	 * @see org.eclipse.b3.build.UnitProvider
	 * @generated
	 */
	EClass getUnitProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.UnitProvider#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.b3.build.UnitProvider#getDocumentation()
	 * @see #getUnitProvider()
	 * @generated
	 */
	EAttribute getUnitProvider_Documentation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.UnitRepositoryDescription <em>Unit Repository Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Repository Description</em>'.
	 * @see org.eclipse.b3.build.UnitRepositoryDescription
	 * @generated
	 */
	EClass getUnitRepositoryDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.UnitRepositoryDescription#getEvaluatedOptions
	 * <em>Evaluated Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Evaluated Options</em>'.
	 * @see org.eclipse.b3.build.UnitRepositoryDescription#getEvaluatedOptions()
	 * @see #getUnitRepositoryDescription()
	 * @generated
	 */
	EAttribute getUnitRepositoryDescription_EvaluatedOptions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.UnitRepositoryDescription#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.eclipse.b3.build.UnitRepositoryDescription#getRepository()
	 * @see #getUnitRepositoryDescription()
	 * @generated
	 */
	EReference getUnitRepositoryDescription_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.UnitResolutionInfo <em>Unit Resolution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unit Resolution Info</em>'.
	 * @see org.eclipse.b3.build.UnitResolutionInfo
	 * @generated
	 */
	EClass getUnitResolutionInfo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.UnitResolutionInfo#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.b3.build.UnitResolutionInfo#getContext()
	 * @see #getUnitResolutionInfo()
	 * @generated
	 */
	EReference getUnitResolutionInfo_Context();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.b3.build.UnitResolutionInfo#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.b3.build.UnitResolutionInfo#getUnit()
	 * @see #getUnitResolutionInfo()
	 * @generated
	 */
	EReference getUnitResolutionInfo_Unit();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.eclipse.equinox.p2.metadata.Version
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.b3.build.VersionedCapability <em>Versioned Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Versioned Capability</em>'.
	 * @see org.eclipse.b3.build.VersionedCapability
	 * @generated
	 */
	EClass getVersionedCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.b3.build.VersionedCapability#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.b3.build.VersionedCapability#getVersion()
	 * @see #getVersionedCapability()
	 * @generated
	 */
	EAttribute getVersionedCapability_Version();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.equinox.p2.metadata.VersionRange <em>Version Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Version Range</em>'.
	 * @see org.eclipse.equinox.p2.metadata.VersionRange
	 * @model instanceClass="org.eclipse.equinox.p2.metadata.VersionRange"
	 * @generated
	 */
	EDataType getVersionRange();

} // B3BuildPackage
