/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public class RuntimePackage extends EPackageImpl
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/emf/mwe/ewm/workflow/runtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.eclipse.emf.mwe.ewm.workflow.runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimePackage eINSTANCE = org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext <em>Workflow Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext()
	 * @generated
	 */
	public static final int WORKFLOW_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__STATES = 1;

	/**
	 * The feature id for the '<em><b>Log</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__LOG = 2;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__LOG_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__WORKFLOW = 4;

	/**
	 * The feature id for the '<em><b>Active Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__ACTIVE_COMPONENTS = 5;

	/**
	 * The feature id for the '<em><b>Execution Info</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__EXECUTION_INFO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__NAME = 7;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT__PARENT_CONTEXT = 8;

	/**
	 * The number of structural features of the '<em>Workflow Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_CONTEXT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine()
	 * @generated
	 */
	public static final int WORKFLOW_ENGINE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap <em>Workflow State Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateMap()
	 * @generated
	 */
	public static final int WORKFLOW_STATE_MAP = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap <em>Workflow Parameter Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowParameterMap()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_MAP = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResolutionStrategy()
	 * @generated
	 */
	public static final int WORKFLOW_STATE_RESOLUTION_STRATEGY = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunner()
	 * @generated
	 */
	public static final int WORKFLOW_RUNNER = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable <em>Workflow Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunnable()
	 * @generated
	 */
	public static final int WORKFLOW_RUNNABLE = 6;

	/**
	 * The number of structural features of the '<em>Workflow Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ENGINE__WORKFLOW = WORKFLOW_RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ENGINE__CONTEXT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_ENGINE_FEATURE_COUNT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow State Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_MAP_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy <em>Workflow Parameter Value Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowParameterValueProxy()
	 * @generated
	 */
	public static final int WORKFLOW_PARAMETER_VALUE_PROXY = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_VALUE_PROXY__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Workflow Parameter Value Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_PARAMETER_VALUE_PROXY_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Workflow State Resolution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_STATE_RESOLUTION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNER__CONTEXT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNER__COMPONENT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_RUNNER_FEATURE_COUNT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog <em>Workflow Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog()
	 * @generated
	 */
	public static final int WORKFLOW_LOG = 8;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG__ERRORS = 1;

	/**
	 * The feature id for the '<em><b>Warnings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG__WARNINGS = 2;

	/**
	 * The feature id for the '<em><b>Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG__INFOS = 3;

	/**
	 * The feature id for the '<em><b>Debugs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG__DEBUGS = 4;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG__LOG_LEVEL = 5;

	/**
	 * The number of structural features of the '<em>Workflow Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry <em>Workflow Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntry()
	 * @generated
	 */
	public static final int WORKFLOW_LOG_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_ENTRY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_ENTRY__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_ENTRY__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Workflow Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogMap <em>Workflow Log Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogMap
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogMap()
	 * @generated
	 */
	public static final int WORKFLOW_LOG_MAP = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Log Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_LOG_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo <em>Workflow Component Execution Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfo()
	 * @generated
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO = 11;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME = 1;

	/**
	 * The number of structural features of the '<em>Workflow Component Execution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfoMap <em>Workflow Component Execution Info Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfoMap
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfoMap()
	 * @generated
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO_MAP = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Component Execution Info Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_COMPONENT_EXECUTION_INFO_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType <em>Workflow Log Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntryType()
	 * @generated
	 */
	public static final int WORKFLOW_LOG_ENTRY_TYPE = 13;

	/**
	 * The meta object id for the '<em>Executor Service</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ExecutorService
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getExecutorService()
	 * @generated
	 */
	public static final int EXECUTOR_SERVICE = 14;

	/**
	 * The meta object id for the '<em>Workflow Runtime Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRuntimeException()
	 * @generated
	 */
	public static final int WORKFLOW_RUNTIME_EXCEPTION = 15;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getException()
	 * @generated
	 */
	public static final int EXCEPTION = 16;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getTimestamp()
	 * @generated
	 */
	public static final int TIMESTAMP = 17;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterValueProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateResolutionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentExecutionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentExecutionInfoMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workflowLogEntryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executorServiceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType workflowRuntimeExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackage()
	{
		super(eNS_URI, RuntimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init()
	{
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackage theRuntimePackage = (RuntimePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackage());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackage ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		StatePackage theStatePackage = (StatePackage)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackage ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext <em>Workflow Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext
	 * @generated
	 */
	public EClass getWorkflowContext()
	{
		return workflowContextEClass;
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParameters()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_Parameters()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>States</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getStates()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_States()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Log</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLog()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_Log()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLogLevel()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EAttribute getWorkflowContext_LogLevel()
	{
		return (EAttribute)workflowContextEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getWorkflow()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_Workflow()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getActiveComponents <em>Active Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Components</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getActiveComponents()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_ActiveComponents()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getExecutionInfo <em>Execution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Execution Info</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getExecutionInfo()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_ExecutionInfo()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getName()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EAttribute getWorkflowContext_Name()
	{
		return (EAttribute)workflowContextEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParentContext()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	public EReference getWorkflowContext_ParentContext()
	{
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Engine</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine
	 * @generated
	 */
	public EClass getWorkflowEngine()
	{
		return workflowEngineEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getWorkflow()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	public EReference getWorkflowEngine_Workflow()
	{
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getContext()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	public EReference getWorkflowEngine_Context()
	{
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow State Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent" keyRequired="true"
	 *        valueType="org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getWorkflowStateMap()
	{
		return workflowStateMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowStateMap()
	 * @generated
	 */
	public EReference getWorkflowStateMap_Key()
	{
		return (EReference)workflowStateMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowStateMap()
	 * @generated
	 */
	public EReference getWorkflowStateMap_Value()
	{
		return (EReference)workflowStateMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parameter Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter" keyRequired="true"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getWorkflowParameterMap()
	{
		return workflowParameterMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowParameterMap()
	 * @generated
	 */
	public EReference getWorkflowParameterMap_Key()
	{
		return (EReference)workflowParameterMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowParameterMap()
	 * @generated
	 */
	public EReference getWorkflowParameterMap_Value()
	{
		return (EReference)workflowParameterMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy <em>Workflow Parameter Value Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parameter Value Proxy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy
	 * @generated
	 */
	public EClass getWorkflowParameterValueProxy()
	{
		return workflowParameterValueProxyEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy#getTarget()
	 * @see #getWorkflowParameterValueProxy()
	 * @generated
	 */
	public EReference getWorkflowParameterValueProxy_Target()
	{
		return (EReference)workflowParameterValueProxyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Resolution Strategy</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy
	 * @generated
	 */
	public EClass getWorkflowStateResolutionStrategy()
	{
		return workflowStateResolutionStrategyEClass;
	}


	/**
	 * Returns the meta object for class '{@link java.lang.Runnable <em>Workflow Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	public EClass getWorkflowRunnable()
	{
		return workflowRunnableEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Runner</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner
	 * @generated
	 */
	public EClass getWorkflowRunner()
	{
		return workflowRunnerEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getContext()
	 * @see #getWorkflowRunner()
	 * @generated
	 */
	public EReference getWorkflowRunner_Context()
	{
		return (EReference)workflowRunnerEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner#getComponent()
	 * @see #getWorkflowRunner()
	 * @generated
	 */
	public EReference getWorkflowRunner_Component()
	{
		return (EReference)workflowRunnerEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog <em>Workflow Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog
	 * @generated
	 */
	public EClass getWorkflowLog()
	{
		return workflowLogEClass;
	}


	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entries</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getEntries()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	public EAttribute getWorkflowLog_Entries()
	{
		return (EAttribute)workflowLogEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getErrors()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	public EReference getWorkflowLog_Errors()
	{
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getWarnings <em>Warnings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warnings</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getWarnings()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	public EReference getWorkflowLog_Warnings()
	{
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getInfos <em>Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infos</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getInfos()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	public EReference getWorkflowLog_Infos()
	{
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getDebugs <em>Debugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Debugs</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getDebugs()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	public EReference getWorkflowLog_Debugs()
	{
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog#getLogLevel()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	public EAttribute getWorkflowLog_LogLevel()
	{
		return (EAttribute)workflowLogEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry <em>Workflow Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log Entry</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry
	 * @generated
	 */
	public EClass getWorkflowLogEntry()
	{
		return workflowLogEntryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getType()
	 * @see #getWorkflowLogEntry()
	 * @generated
	 */
	public EAttribute getWorkflowLogEntry_Type()
	{
		return (EAttribute)workflowLogEntryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getTimestamp()
	 * @see #getWorkflowLogEntry()
	 * @generated
	 */
	public EAttribute getWorkflowLogEntry_Timestamp()
	{
		return (EAttribute)workflowLogEntryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry#getMessage()
	 * @see #getWorkflowLogEntry()
	 * @generated
	 */
	public EAttribute getWorkflowLogEntry_Message()
	{
		return (EAttribute)workflowLogEntryEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow Log Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent" keyRequired="true"
	 *        valueType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getWorkflowLogMap()
	{
		return workflowLogMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowLogMap()
	 * @generated
	 */
	public EReference getWorkflowLogMap_Key()
	{
		return (EReference)workflowLogMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowLogMap()
	 * @generated
	 */
	public EReference getWorkflowLogMap_Value()
	{
		return (EReference)workflowLogMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo <em>Workflow Component Execution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Component Execution Info</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo
	 * @generated
	 */
	public EClass getWorkflowComponentExecutionInfo()
	{
		return workflowComponentExecutionInfoEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getStartTime()
	 * @see #getWorkflowComponentExecutionInfo()
	 * @generated
	 */
	public EAttribute getWorkflowComponentExecutionInfo_StartTime()
	{
		return (EAttribute)workflowComponentExecutionInfoEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo#getEndTime()
	 * @see #getWorkflowComponentExecutionInfo()
	 * @generated
	 */
	public EAttribute getWorkflowComponentExecutionInfo_EndTime()
	{
		return (EAttribute)workflowComponentExecutionInfoEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow Component Execution Info Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Component Execution Info Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent" keyRequired="true"
	 *        valueType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	public EClass getWorkflowComponentExecutionInfoMap()
	{
		return workflowComponentExecutionInfoMapEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowComponentExecutionInfoMap()
	 * @generated
	 */
	public EReference getWorkflowComponentExecutionInfoMap_Key()
	{
		return (EReference)workflowComponentExecutionInfoMapEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowComponentExecutionInfoMap()
	 * @generated
	 */
	public EReference getWorkflowComponentExecutionInfoMap_Value()
	{
		return (EReference)workflowComponentExecutionInfoMapEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType <em>Workflow Log Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workflow Log Entry Type</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @generated
	 */
	public EEnum getWorkflowLogEntryType()
	{
		return workflowLogEntryTypeEEnum;
	}


	/**
	 * Returns the meta object for data type '{@link java.util.concurrent.ExecutorService <em>Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Executor Service</em>'.
	 * @see java.util.concurrent.ExecutorService
	 * @model instanceClass="java.util.concurrent.ExecutorService"
	 * @generated
	 */
	public EDataType getExecutorService()
	{
		return executorServiceEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException <em>Workflow Runtime Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Workflow Runtime Exception</em>'.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException
	 * @model instanceClass="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException"
	 * @generated
	 */
	public EDataType getWorkflowRuntimeException()
	{
		return workflowRuntimeExceptionEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	public EDataType getException()
	{
		return exceptionEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	public EDataType getTimestamp()
	{
		return timestampEDataType;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory()
	{
		return (RuntimeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workflowContextEClass = createEClass(WORKFLOW_CONTEXT);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__PARAMETERS);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__STATES);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__LOG);
		createEAttribute(workflowContextEClass, WORKFLOW_CONTEXT__LOG_LEVEL);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__WORKFLOW);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__ACTIVE_COMPONENTS);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__EXECUTION_INFO);
		createEAttribute(workflowContextEClass, WORKFLOW_CONTEXT__NAME);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__PARENT_CONTEXT);

		workflowEngineEClass = createEClass(WORKFLOW_ENGINE);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__WORKFLOW);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__CONTEXT);

		workflowStateMapEClass = createEClass(WORKFLOW_STATE_MAP);
		createEReference(workflowStateMapEClass, WORKFLOW_STATE_MAP__KEY);
		createEReference(workflowStateMapEClass, WORKFLOW_STATE_MAP__VALUE);

		workflowParameterMapEClass = createEClass(WORKFLOW_PARAMETER_MAP);
		createEReference(workflowParameterMapEClass, WORKFLOW_PARAMETER_MAP__KEY);
		createEReference(workflowParameterMapEClass, WORKFLOW_PARAMETER_MAP__VALUE);

		workflowParameterValueProxyEClass = createEClass(WORKFLOW_PARAMETER_VALUE_PROXY);
		createEReference(workflowParameterValueProxyEClass, WORKFLOW_PARAMETER_VALUE_PROXY__TARGET);

		workflowStateResolutionStrategyEClass = createEClass(WORKFLOW_STATE_RESOLUTION_STRATEGY);

		workflowRunnableEClass = createEClass(WORKFLOW_RUNNABLE);

		workflowRunnerEClass = createEClass(WORKFLOW_RUNNER);
		createEReference(workflowRunnerEClass, WORKFLOW_RUNNER__CONTEXT);
		createEReference(workflowRunnerEClass, WORKFLOW_RUNNER__COMPONENT);

		workflowLogEClass = createEClass(WORKFLOW_LOG);
		createEAttribute(workflowLogEClass, WORKFLOW_LOG__ENTRIES);
		createEReference(workflowLogEClass, WORKFLOW_LOG__ERRORS);
		createEReference(workflowLogEClass, WORKFLOW_LOG__WARNINGS);
		createEReference(workflowLogEClass, WORKFLOW_LOG__INFOS);
		createEReference(workflowLogEClass, WORKFLOW_LOG__DEBUGS);
		createEAttribute(workflowLogEClass, WORKFLOW_LOG__LOG_LEVEL);

		workflowLogEntryEClass = createEClass(WORKFLOW_LOG_ENTRY);
		createEAttribute(workflowLogEntryEClass, WORKFLOW_LOG_ENTRY__TYPE);
		createEAttribute(workflowLogEntryEClass, WORKFLOW_LOG_ENTRY__TIMESTAMP);
		createEAttribute(workflowLogEntryEClass, WORKFLOW_LOG_ENTRY__MESSAGE);

		workflowLogMapEClass = createEClass(WORKFLOW_LOG_MAP);
		createEReference(workflowLogMapEClass, WORKFLOW_LOG_MAP__KEY);
		createEReference(workflowLogMapEClass, WORKFLOW_LOG_MAP__VALUE);

		workflowComponentExecutionInfoEClass = createEClass(WORKFLOW_COMPONENT_EXECUTION_INFO);
		createEAttribute(workflowComponentExecutionInfoEClass, WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME);
		createEAttribute(workflowComponentExecutionInfoEClass, WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME);

		workflowComponentExecutionInfoMapEClass = createEClass(WORKFLOW_COMPONENT_EXECUTION_INFO_MAP);
		createEReference(workflowComponentExecutionInfoMapEClass, WORKFLOW_COMPONENT_EXECUTION_INFO_MAP__KEY);
		createEReference(workflowComponentExecutionInfoMapEClass, WORKFLOW_COMPONENT_EXECUTION_INFO_MAP__VALUE);

		// Create enums
		workflowLogEntryTypeEEnum = createEEnum(WORKFLOW_LOG_ENTRY_TYPE);

		// Create data types
		executorServiceEDataType = createEDataType(EXECUTOR_SERVICE);
		workflowRuntimeExceptionEDataType = createEDataType(WORKFLOW_RUNTIME_EXCEPTION);
		exceptionEDataType = createEDataType(EXCEPTION);
		timestampEDataType = createEDataType(TIMESTAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStatePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowEngineEClass.getESuperTypes().add(this.getWorkflowRunnable());
		workflowRunnerEClass.getESuperTypes().add(this.getWorkflowRunnable());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowContextEClass, WorkflowContext.class, "WorkflowContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowContext_Parameters(), this.getWorkflowParameterMap(), null, "parameters", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_States(), this.getWorkflowStateMap(), null, "states", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_Log(), this.getWorkflowLogMap(), null, "log", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowContext_LogLevel(), this.getWorkflowLogEntryType(), "logLevel", null, 1, 1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_Workflow(), theWorkflowPackage.getWorkflowComponent(), null, "workflow", null, 1, 1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_ActiveComponents(), theWorkflowPackage.getWorkflowComponent(), null, "activeComponents", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_ExecutionInfo(), this.getWorkflowComponentExecutionInfoMap(), null, "executionInfo", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowContext_Name(), theEcorePackage.getEString(), "name", null, 1, 1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowContext_ParentContext(), this.getWorkflowContext(), null, "parentContext", null, 0, 1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(workflowContextEClass, null, "clearLog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowContextEClass, null, "initializeState", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, this.getWorkflowComponentExecutionInfo(), "getExecutionInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, theEcorePackage.getEObject(), "getParameterValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowParameter(), "parameter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getWorkflowRuntimeException());

		op = addEOperation(workflowContextEClass, theStatePackage.getWorkflowState(), "getState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "logError", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "logWarning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "logInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "logDebug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "logException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getException(), "exception", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "resetState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "resetLog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "setExecutionInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowComponentExecutionInfo(), "executionInfo", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowContextEClass, null, "setParameterValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowParameter(), "parameter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getWorkflowRuntimeException());

		op = addEOperation(workflowContextEClass, null, "setState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStatePackage.getWorkflowState(), "state", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowEngineEClass, WorkflowEngine.class, "WorkflowEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowEngine_Workflow(), theWorkflowPackage.getWorkflowComponent(), null, "workflow", null, 1, 1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowEngine_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workflowEngineEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workflowEngineEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowStateMapEClass, Map.Entry.class, "WorkflowStateMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowStateMap_Key(), theWorkflowPackage.getWorkflowComponent(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowStateMap_Value(), theStatePackage.getWorkflowState(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowParameterMapEClass, Map.Entry.class, "WorkflowParameterMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowParameterMap_Key(), theWorkflowPackage.getWorkflowParameter(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowParameterMap_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowParameterValueProxyEClass, WorkflowParameterValueProxy.class, "WorkflowParameterValueProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowParameterValueProxy_Target(), theEcorePackage.getEObject(), null, "target", null, 1, 1, WorkflowParameterValueProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowStateResolutionStrategyEClass, WorkflowStateResolutionStrategy.class, "WorkflowStateResolutionStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(workflowStateResolutionStrategyEClass, theStatePackage.getWorkflowState(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "workflow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRunnableEClass, Runnable.class, "WorkflowRunnable", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		addEOperation(workflowRunnableEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowRunnerEClass, WorkflowRunner.class, "WorkflowRunner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowRunner_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowRunner_Component(), theWorkflowPackage.getWorkflowComponent(), null, "component", null, 1, 1, WorkflowRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workflowRunnerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowLogEClass, WorkflowLog.class, "WorkflowLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowLog_Entries(), ecorePackage.getEFeatureMapEntry(), "entries", null, 0, -1, WorkflowLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLog_Errors(), this.getWorkflowLogEntry(), null, "errors", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLog_Warnings(), this.getWorkflowLogEntry(), null, "warnings", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLog_Infos(), this.getWorkflowLogEntry(), null, "infos", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLog_Debugs(), this.getWorkflowLogEntry(), null, "debugs", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowLog_LogLevel(), this.getWorkflowLogEntryType(), "logLevel", null, 0, 1, WorkflowLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(workflowLogEClass, null, "logError", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowLogEClass, null, "logWarning", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowLogEClass, null, "logInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowLogEClass, null, "logDebug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(workflowLogEClass, null, "logException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getException(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(workflowLogEntryEClass, WorkflowLogEntry.class, "WorkflowLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowLogEntry_Type(), this.getWorkflowLogEntryType(), "type", null, 1, 1, WorkflowLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowLogEntry_Timestamp(), this.getTimestamp(), "timestamp", null, 0, 1, WorkflowLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowLogEntry_Message(), theEcorePackage.getEString(), "message", null, 1, 1, WorkflowLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowLogMapEClass, Map.Entry.class, "WorkflowLogMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowLogMap_Key(), theWorkflowPackage.getWorkflowComponent(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowLogMap_Value(), this.getWorkflowLog(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowComponentExecutionInfoEClass, WorkflowComponentExecutionInfo.class, "WorkflowComponentExecutionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkflowComponentExecutionInfo_StartTime(), this.getTimestamp(), "startTime", null, 1, 1, WorkflowComponentExecutionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkflowComponentExecutionInfo_EndTime(), this.getTimestamp(), "endTime", null, 1, 1, WorkflowComponentExecutionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowComponentExecutionInfoMapEClass, Map.Entry.class, "WorkflowComponentExecutionInfoMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowComponentExecutionInfoMap_Key(), theWorkflowPackage.getWorkflowComponent(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflowComponentExecutionInfoMap_Value(), this.getWorkflowComponentExecutionInfo(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workflowLogEntryTypeEEnum, WorkflowLogEntryType.class, "WorkflowLogEntryType");
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.ERROR);
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.WARNING);
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.INFO);
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.DEBUG);

		// Initialize data types
		initEDataType(executorServiceEDataType, ExecutorService.class, "ExecutorService", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(workflowRuntimeExceptionEDataType, WorkflowRuntimeException.class, "WorkflowRuntimeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timestampEDataType, Timestamp.class, "Timestamp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getWorkflowLog_Entries(), 
		   source, 
		   new String[] 
		   {
			 "kind", "group"
		   });		
		addAnnotation
		  (getWorkflowLog_Errors(), 
		   source, 
		   new String[] 
		   {
			 "group", "#entries"
		   });		
		addAnnotation
		  (getWorkflowLog_Warnings(), 
		   source, 
		   new String[] 
		   {
			 "group", "#entries"
		   });		
		addAnnotation
		  (getWorkflowLog_Infos(), 
		   source, 
		   new String[] 
		   {
			 "group", "#entries"
		   });		
		addAnnotation
		  (getWorkflowLog_Debugs(), 
		   source, 
		   new String[] 
		   {
			 "group", "#entries"
		   });
	}

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
	public interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext <em>Workflow Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext()
		 * @generated
		 */
		public static final EClass WORKFLOW_CONTEXT = eINSTANCE.getWorkflowContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__PARAMETERS = eINSTANCE.getWorkflowContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__STATES = eINSTANCE.getWorkflowContext_States();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__LOG = eINSTANCE.getWorkflowContext_Log();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_CONTEXT__LOG_LEVEL = eINSTANCE.getWorkflowContext_LogLevel();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__WORKFLOW = eINSTANCE.getWorkflowContext_Workflow();

		/**
		 * The meta object literal for the '<em><b>Active Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__ACTIVE_COMPONENTS = eINSTANCE.getWorkflowContext_ActiveComponents();

		/**
		 * The meta object literal for the '<em><b>Execution Info</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__EXECUTION_INFO = eINSTANCE.getWorkflowContext_ExecutionInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_CONTEXT__NAME = eINSTANCE.getWorkflowContext_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_CONTEXT__PARENT_CONTEXT = eINSTANCE.getWorkflowContext_ParentContext();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine()
		 * @generated
		 */
		public static final EClass WORKFLOW_ENGINE = eINSTANCE.getWorkflowEngine();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_ENGINE__WORKFLOW = eINSTANCE.getWorkflowEngine_Workflow();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_ENGINE__CONTEXT = eINSTANCE.getWorkflowEngine_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap <em>Workflow State Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateMap()
		 * @generated
		 */
		public static final EClass WORKFLOW_STATE_MAP = eINSTANCE.getWorkflowStateMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_STATE_MAP__KEY = eINSTANCE.getWorkflowStateMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_STATE_MAP__VALUE = eINSTANCE.getWorkflowStateMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap <em>Workflow Parameter Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowParameterMap()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_MAP = eINSTANCE.getWorkflowParameterMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_MAP__KEY = eINSTANCE.getWorkflowParameterMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_MAP__VALUE = eINSTANCE.getWorkflowParameterMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy <em>Workflow Parameter Value Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowParameterValueProxy()
		 * @generated
		 */
		public static final EClass WORKFLOW_PARAMETER_VALUE_PROXY = eINSTANCE.getWorkflowParameterValueProxy();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_PARAMETER_VALUE_PROXY__TARGET = eINSTANCE.getWorkflowParameterValueProxy_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowStateResolutionStrategy()
		 * @generated
		 */
		public static final EClass WORKFLOW_STATE_RESOLUTION_STRATEGY = eINSTANCE.getWorkflowStateResolutionStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable <em>Workflow Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunnable()
		 * @generated
		 */
		public static final EClass WORKFLOW_RUNNABLE = eINSTANCE.getWorkflowRunnable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRunner()
		 * @generated
		 */
		public static final EClass WORKFLOW_RUNNER = eINSTANCE.getWorkflowRunner();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_RUNNER__CONTEXT = eINSTANCE.getWorkflowRunner_Context();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_RUNNER__COMPONENT = eINSTANCE.getWorkflowRunner_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog <em>Workflow Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLog()
		 * @generated
		 */
		public static final EClass WORKFLOW_LOG = eINSTANCE.getWorkflowLog();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_LOG__ENTRIES = eINSTANCE.getWorkflowLog_Entries();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOG__ERRORS = eINSTANCE.getWorkflowLog_Errors();

		/**
		 * The meta object literal for the '<em><b>Warnings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOG__WARNINGS = eINSTANCE.getWorkflowLog_Warnings();

		/**
		 * The meta object literal for the '<em><b>Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOG__INFOS = eINSTANCE.getWorkflowLog_Infos();

		/**
		 * The meta object literal for the '<em><b>Debugs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOG__DEBUGS = eINSTANCE.getWorkflowLog_Debugs();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_LOG__LOG_LEVEL = eINSTANCE.getWorkflowLog_LogLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry <em>Workflow Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntry
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntry()
		 * @generated
		 */
		public static final EClass WORKFLOW_LOG_ENTRY = eINSTANCE.getWorkflowLogEntry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_LOG_ENTRY__TYPE = eINSTANCE.getWorkflowLogEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_LOG_ENTRY__TIMESTAMP = eINSTANCE.getWorkflowLogEntry_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_LOG_ENTRY__MESSAGE = eINSTANCE.getWorkflowLogEntry_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogMap <em>Workflow Log Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogMap
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogMap()
		 * @generated
		 */
		public static final EClass WORKFLOW_LOG_MAP = eINSTANCE.getWorkflowLogMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOG_MAP__KEY = eINSTANCE.getWorkflowLogMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_LOG_MAP__VALUE = eINSTANCE.getWorkflowLogMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo <em>Workflow Component Execution Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfo()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPONENT_EXECUTION_INFO = eINSTANCE.getWorkflowComponentExecutionInfo();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_COMPONENT_EXECUTION_INFO__START_TIME = eINSTANCE.getWorkflowComponentExecutionInfo_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WORKFLOW_COMPONENT_EXECUTION_INFO__END_TIME = eINSTANCE.getWorkflowComponentExecutionInfo_EndTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfoMap <em>Workflow Component Execution Info Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfoMap
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowComponentExecutionInfoMap()
		 * @generated
		 */
		public static final EClass WORKFLOW_COMPONENT_EXECUTION_INFO_MAP = eINSTANCE.getWorkflowComponentExecutionInfoMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPONENT_EXECUTION_INFO_MAP__KEY = eINSTANCE.getWorkflowComponentExecutionInfoMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WORKFLOW_COMPONENT_EXECUTION_INFO_MAP__VALUE = eINSTANCE.getWorkflowComponentExecutionInfoMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType <em>Workflow Log Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowLogEntryType()
		 * @generated
		 */
		public static final EEnum WORKFLOW_LOG_ENTRY_TYPE = eINSTANCE.getWorkflowLogEntryType();

		/**
		 * The meta object literal for the '<em>Executor Service</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ExecutorService
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getExecutorService()
		 * @generated
		 */
		public static final EDataType EXECUTOR_SERVICE = eINSTANCE.getExecutorService();

		/**
		 * The meta object literal for the '<em>Workflow Runtime Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowRuntimeException()
		 * @generated
		 */
		public static final EDataType WORKFLOW_RUNTIME_EXCEPTION = eINSTANCE.getWorkflowRuntimeException();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getException()
		 * @generated
		 */
		public static final EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getTimestamp()
		 * @generated
		 */
		public static final EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //RuntimePackage
