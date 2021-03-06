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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.util.WorkflowLogResetter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.util.WorkflowStateInitializer;
import org.eclipse.emf.mwe.ewm.workflow.runtime.util.WorkflowStateResetter;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Context</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getActiveComponents <em>Active Components</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getExecutionInfo <em>Execution Info</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParentContext <em>Parent Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext()
 * @model kind="class"
 * @generated
 */
public class WorkflowContext extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowParameter, EObject> parameters;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowState> states;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowLog> log;

	/**
	 * The default value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowLogEntryType LOG_LEVEL_EDEFAULT = WorkflowLogEntryType.ERROR;

	/**
	 * The cached value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected WorkflowLogEntryType logLevel = LOG_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponent workflow;

	/**
	 * The cached value of the '{@link #getActiveComponents() <em>Active Components</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActiveComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowComponent> activeComponents;

	/**
	 * The cached value of the '{@link #getExecutionInfo() <em>Execution Info</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExecutionInfo()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowComponentExecutionInfo> executionInfo;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentContext() <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentContext()
	 * @generated
	 * @ordered
	 */
	protected WorkflowContext parentContext;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowContext()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RuntimePackage.Literals.WORKFLOW_CONTEXT;
	}

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_Parameters()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	public EMap<WorkflowParameter, EObject> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EcoreEMap<WorkflowParameter,EObject>(RuntimePackage.Literals.WORKFLOW_PARAMETER_MAP, WorkflowParameterMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * Returns the value of the '<em><b>States</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_States()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState>"
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowState> getStates()
	{
		if (states == null)
		{
			states = new EcoreEMap<WorkflowComponent,WorkflowState>(RuntimePackage.Literals.WORKFLOW_STATE_MAP, WorkflowStateMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Log</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_Log()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog>"
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowLog> getLog()
	{
		if (log == null)
		{
			log = new EcoreEMap<WorkflowComponent,WorkflowLog>(RuntimePackage.Literals.WORKFLOW_LOG_MAP, WorkflowLogMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__LOG);
		}
		return log;
	}

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Log Level</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #setLogLevel(WorkflowLogEntryType)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_LogLevel()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowLogEntryType getLogLevel()
	{
		return logLevel;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #getLogLevel()
	 * @generated NOT
	 */
	public void setLogLevel(WorkflowLogEntryType newLogLevel)
	{
		WorkflowLogEntryType oldLogLevel = logLevel;
		logLevel = newLogLevel == null ? LOG_LEVEL_EDEFAULT : newLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL, oldLogLevel, logLevel));

		for (WorkflowLog log : getLog().values())
			log.setLogLevel(newLogLevel);
	}

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(WorkflowComponent)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_Workflow()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowComponent getWorkflow()
	{
		if (workflow != null && workflow.eIsProxy())
		{
			InternalEObject oldWorkflow = (InternalEObject)workflow;
			workflow = (WorkflowComponent)eResolveProxy(oldWorkflow);
			if (workflow != oldWorkflow)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW, oldWorkflow, workflow));
			}
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent basicGetWorkflow()
	{
		return workflow;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	public void setWorkflow(WorkflowComponent newWorkflow)
	{
		WorkflowComponent oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW, oldWorkflow, workflow));
	}

	/**
	 * Returns the value of the '<em><b>Active Components</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Components</em>' reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Components</em>' reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_ActiveComponents()
	 * @model
	 * @generated
	 */
	public EList<WorkflowComponent> getActiveComponents()
	{
		if (activeComponents == null)
		{
			activeComponents = new EObjectResolvingEList<WorkflowComponent>(WorkflowComponent.class, this, RuntimePackage.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS);
		}
		return activeComponents;
	}

	/**
	 * Returns the value of the '<em><b>Execution Info</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Info</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Info</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_ExecutionInfo()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfoMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo>"
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowComponentExecutionInfo> getExecutionInfo()
	{
		if (executionInfo == null)
		{
			executionInfo = new EcoreEMap<WorkflowComponent,WorkflowComponentExecutionInfo>(RuntimePackage.Literals.WORKFLOW_COMPONENT_EXECUTION_INFO_MAP, WorkflowComponentExecutionInfoMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO);
		}
		return executionInfo;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_Name()
	 * @model required="true"
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_CONTEXT__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' reference.
	 * @see #setParentContext(WorkflowContext)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_ParentContext()
	 * @model
	 * @generated
	 */
	public WorkflowContext getParentContext()
	{
		if (parentContext != null && parentContext.eIsProxy())
		{
			InternalEObject oldParentContext = (InternalEObject)parentContext;
			parentContext = (WorkflowContext)eResolveProxy(oldParentContext);
			if (parentContext != oldParentContext)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.WORKFLOW_CONTEXT__PARENT_CONTEXT, oldParentContext, parentContext));
			}
		}
		return parentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContext basicGetParentContext()
	{
		return parentContext;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParentContext <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' reference.
	 * @see #getParentContext()
	 * @generated
	 */
	public void setParentContext(WorkflowContext newParentContext)
	{
		WorkflowContext oldParentContext = parentContext;
		parentContext = newParentContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_CONTEXT__PARENT_CONTEXT, oldParentContext, parentContext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true"
	 * @generated NOT
	 */
	public void clearLog(WorkflowComponent component)
	{
		WorkflowLog log = getLog().get(component);

		if (log != null)
			log.getEntries().clear();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException" parameterRequired="true"
	 * @generated NOT
	 */
	public EObject getParameterValue(WorkflowParameter parameter) throws WorkflowRuntimeException
	{
		EObject currentValue = getParameters().get(parameter);
		WorkflowContext parent = getParentContext();
		
		while(currentValue == null && parent != null)
		{
			currentValue = parent.getParameters().get(parameter);
			parent = parent.getParentContext();
		}
		
		if(currentValue instanceof WorkflowParameterValueProxy)
		{
			WorkflowParameterValueProxy proxy = (WorkflowParameterValueProxy) currentValue;
			return proxy.getTarget();
		}
		
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true"
	 * @generated NOT
	 */
	public WorkflowState getState(WorkflowComponent component)
	{
		return getStates().get(component);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" messageRequired="true"
	 * @generated NOT
	 */
	public void logError(WorkflowComponent component, String message)
	{
		WorkflowLog log = getLog(component);
		log.logError(message);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" messageRequired="true"
	 * @generated NOT
	 */
	public void logWarning(WorkflowComponent component, String message)
	{
		WorkflowLog log = getLog(component);
		log.logWarning(message);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" messageRequired="true"
	 * @generated NOT
	 */
	public void logInfo(WorkflowComponent component, String message)
	{
		WorkflowLog log = getLog(component);
		log.logInfo(message);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" messageRequired="true"
	 * @generated NOT
	 */
	public void logDebug(WorkflowComponent component, String message)
	{
		WorkflowLog log = getLog(component);
		log.logDebug(message);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" exceptionDataType="org.eclipse.emf.mwe.ewm.workflow.runtime.Exception" exceptionRequired="true"
	 * @generated NOT
	 */
	public void logException(WorkflowComponent component, Exception exception)
	{
		WorkflowLog log = getLog(component);
		log.logException(exception);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model exceptions="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException" parameterRequired="true" valueRequired="true"
	 * @generated NOT
	 */
	public void setParameterValue(WorkflowParameter parameter, EObject value) throws WorkflowRuntimeException
	{
		EObject currentValue = getParameters().get(parameter);
		
		if(currentValue instanceof WorkflowParameterValueProxy)
		{
			WorkflowParameterValueProxy proxy = (WorkflowParameterValueProxy) currentValue;
			proxy.setTarget(value);
		}
		else
			getParameters().put(parameter, value);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" stateRequired="true"
	 * @generated NOT
	 */
	public void setState(WorkflowComponent component, WorkflowState state)
	{
		getStates().put(component, state);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public void reset(WorkflowComponent component)
	{
		resetState(component);
		resetLog(component);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public void resetState(WorkflowComponent component)
	{
		WorkflowStateResetter resetter = new WorkflowStateResetter(this);
		resetter.doSwitch(component);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public void resetLog(WorkflowComponent component)
	{
		WorkflowLogResetter resetter = new WorkflowLogResetter(this);
		resetter.doSwitch(component);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true" executionInfoRequired="true"
	 * @generated NOT
	 */
	public void setExecutionInfo(WorkflowComponent component, WorkflowComponentExecutionInfo executionInfo)
	{
		getExecutionInfo().put(component, executionInfo);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public void initializeState()
	{
		WorkflowStateInitializer initializer = new WorkflowStateInitializer(this);
		initializer.doSwitch(getWorkflow());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model componentRequired="true"
	 * @generated NOT
	 */
	public WorkflowComponentExecutionInfo getExecutionInfo(WorkflowComponent component)
	{
		return getExecutionInfo().get(component);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO:
				return ((InternalEList<?>)getExecutionInfo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				if (coreType) return getStates();
				else return getStates().map();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				if (coreType) return getLog();
				else return getLog().map();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				return getLogLevel();
			case RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW:
				if (resolve) return getWorkflow();
				return basicGetWorkflow();
			case RuntimePackage.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS:
				return getActiveComponents();
			case RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO:
				if (coreType) return getExecutionInfo();
				else return getExecutionInfo().map();
			case RuntimePackage.WORKFLOW_CONTEXT__NAME:
				return getName();
			case RuntimePackage.WORKFLOW_CONTEXT__PARENT_CONTEXT:
				if (resolve) return getParentContext();
				return basicGetParentContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				((EStructuralFeature.Setting)getStates()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				((EStructuralFeature.Setting)getLog()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				setLogLevel((WorkflowLogEntryType)newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW:
				setWorkflow((WorkflowComponent)newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS:
				getActiveComponents().clear();
				getActiveComponents().addAll((Collection<? extends WorkflowComponent>)newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO:
				((EStructuralFeature.Setting)getExecutionInfo()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__NAME:
				setName((String)newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__PARENT_CONTEXT:
				setParentContext((WorkflowContext)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				getParameters().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				getStates().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				getLog().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				setLogLevel(LOG_LEVEL_EDEFAULT);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW:
				setWorkflow((WorkflowComponent)null);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS:
				getActiveComponents().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO:
				getExecutionInfo().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__PARENT_CONTEXT:
				setParentContext((WorkflowContext)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				return states != null && !states.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				return log != null && !log.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				return logLevel != LOG_LEVEL_EDEFAULT;
			case RuntimePackage.WORKFLOW_CONTEXT__WORKFLOW:
				return workflow != null;
			case RuntimePackage.WORKFLOW_CONTEXT__ACTIVE_COMPONENTS:
				return activeComponents != null && !activeComponents.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__EXECUTION_INFO:
				return executionInfo != null && !executionInfo.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RuntimePackage.WORKFLOW_CONTEXT__PARENT_CONTEXT:
				return parentContext != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (logLevel: ");
		result.append(logLevel);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	private WorkflowLog getLog(WorkflowComponent component)
	{
		WorkflowLog componentLog = getLog().get(component);

		if(componentLog == null)
		{
			componentLog = RuntimeFactory.eINSTANCE.createWorkflowLog();
			componentLog.setLogLevel(getLogLevel());
			getLog().put(component, componentLog);
		}
		
		return componentLog;
	}
} // WorkflowContext
