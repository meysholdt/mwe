/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrchestrationItemProviderAdapterFactory.java,v 1.6 2010/01/03 21:25:07 bhunt Exp $
 */
package org.eclipse.emf.mwe.ewm.workflow.orchestration.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.mwe.ewm.provider.WorkflowEditPlugin;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.util.OrchestrationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrationItemProviderAdapterFactory extends OrchestrationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(WorkflowEditPlugin.INSTANCE, OrchestrationPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowSerialOrchestrationStrategyItemProvider workflowSerialOrchestrationStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowSerialOrchestrationStrategyAdapter()
	{
		if (workflowSerialOrchestrationStrategyItemProvider == null)
		{
			workflowSerialOrchestrationStrategyItemProvider = new WorkflowSerialOrchestrationStrategyItemProvider(this);
		}

		return workflowSerialOrchestrationStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowComponentOrchestrationStrategyItemProvider workflowComponentOrchestrationStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowComponentOrchestrationStrategyAdapter()
	{
		if (workflowComponentOrchestrationStrategyItemProvider == null)
		{
			workflowComponentOrchestrationStrategyItemProvider = new WorkflowComponentOrchestrationStrategyItemProvider(this);
		}

		return workflowComponentOrchestrationStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLoopComponentOrchestrationStrategyItemProvider workflowLoopComponentOrchestrationStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowLoopComponentOrchestrationStrategyAdapter()
	{
		if (workflowLoopComponentOrchestrationStrategyItemProvider == null)
		{
			workflowLoopComponentOrchestrationStrategyItemProvider = new WorkflowLoopComponentOrchestrationStrategyItemProvider(this);
		}

		return workflowLoopComponentOrchestrationStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRerunPredicateItemProvider workflowRerunPredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowRerunPredicateAdapter()
	{
		if (workflowRerunPredicateItemProvider == null)
		{
			workflowRerunPredicateItemProvider = new WorkflowRerunPredicateItemProvider(this);
		}

		return workflowRerunPredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterPredicateItemProvider workflowParameterPredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowParameterPredicateAdapter()
	{
		if (workflowParameterPredicateItemProvider == null)
		{
			workflowParameterPredicateItemProvider = new WorkflowParameterPredicateItemProvider(this);
		}

		return workflowParameterPredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowPredicateORItemProvider workflowPredicateORItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowPredicateORAdapter()
	{
		if (workflowPredicateORItemProvider == null)
		{
			workflowPredicateORItemProvider = new WorkflowPredicateORItemProvider(this);
		}

		return workflowPredicateORItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowPredicateANDItemProvider workflowPredicateANDItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowPredicateANDAdapter()
	{
		if (workflowPredicateANDItemProvider == null)
		{
			workflowPredicateANDItemProvider = new WorkflowPredicateANDItemProvider(this);
		}

		return workflowPredicateANDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLoopCountPredicateItemProvider workflowLoopCountPredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowLoopCountPredicateAdapter()
	{
		if (workflowLoopCountPredicateItemProvider == null)
		{
			workflowLoopCountPredicateItemProvider = new WorkflowLoopCountPredicateItemProvider(this);
		}

		return workflowLoopCountPredicateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders()
	{
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
	{
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator()
	{
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose()
	{
		if (workflowSerialOrchestrationStrategyItemProvider != null) workflowSerialOrchestrationStrategyItemProvider.dispose();
		if (workflowComponentOrchestrationStrategyItemProvider != null) workflowComponentOrchestrationStrategyItemProvider.dispose();
		if (workflowLoopComponentOrchestrationStrategyItemProvider != null) workflowLoopComponentOrchestrationStrategyItemProvider.dispose();
		if (workflowRerunPredicateItemProvider != null) workflowRerunPredicateItemProvider.dispose();
		if (workflowParameterPredicateItemProvider != null) workflowParameterPredicateItemProvider.dispose();
		if (workflowPredicateORItemProvider != null) workflowPredicateORItemProvider.dispose();
		if (workflowPredicateANDItemProvider != null) workflowPredicateANDItemProvider.dispose();
		if (workflowLoopCountPredicateItemProvider != null) workflowLoopCountPredicateItemProvider.dispose();
	}

}
