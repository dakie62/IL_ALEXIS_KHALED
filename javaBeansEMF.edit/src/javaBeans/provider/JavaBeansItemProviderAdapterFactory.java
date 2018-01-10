/**
 */
package javaBeans.provider;

import java.util.ArrayList;
import java.util.Collection;

import javaBeans.util.JavaBeansAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaBeansItemProviderAdapterFactory extends JavaBeansAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public JavaBeansItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.Evenement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvenementItemProvider evenementItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.Evenement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEvenementAdapter() {
		if (evenementItemProvider == null) {
			evenementItemProvider = new EvenementItemProvider(this);
		}

		return evenementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.ProprieteBean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprieteBeanItemProvider proprieteBeanItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.ProprieteBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProprieteBeanAdapter() {
		if (proprieteBeanItemProvider == null) {
			proprieteBeanItemProvider = new ProprieteBeanItemProvider(this);
		}

		return proprieteBeanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.ElementModele} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementModeleItemProvider elementModeleItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.ElementModele}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementModeleAdapter() {
		if (elementModeleItemProvider == null) {
			elementModeleItemProvider = new ElementModeleItemProvider(this);
		}

		return elementModeleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.Composant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantItemProvider composantItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.Composant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposantAdapter() {
		if (composantItemProvider == null) {
			composantItemProvider = new ComposantItemProvider(this);
		}

		return composantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.ProprietePrimitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprietePrimitiveItemProvider proprietePrimitiveItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.ProprietePrimitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProprietePrimitiveAdapter() {
		if (proprietePrimitiveItemProvider == null) {
			proprietePrimitiveItemProvider = new ProprietePrimitiveItemProvider(this);
		}

		return proprietePrimitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.Propriete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprieteItemProvider proprieteItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.Propriete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProprieteAdapter() {
		if (proprieteItemProvider == null) {
			proprieteItemProvider = new ProprieteItemProvider(this);
		}

		return proprieteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.Archive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveItemProvider archiveItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.Archive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchiveAdapter() {
		if (archiveItemProvider == null) {
			archiveItemProvider = new ArchiveItemProvider(this);
		}

		return archiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.Methode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodeItemProvider methodeItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.Methode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodeAdapter() {
		if (methodeItemProvider == null) {
			methodeItemProvider = new MethodeItemProvider(this);
		}

		return methodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link javaBeans.Paquetage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaquetageItemProvider paquetageItemProvider;

	/**
	 * This creates an adapter for a {@link javaBeans.Paquetage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaquetageAdapter() {
		if (paquetageItemProvider == null) {
			paquetageItemProvider = new PaquetageItemProvider(this);
		}

		return paquetageItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (evenementItemProvider != null) evenementItemProvider.dispose();
		if (proprieteBeanItemProvider != null) proprieteBeanItemProvider.dispose();
		if (elementModeleItemProvider != null) elementModeleItemProvider.dispose();
		if (composantItemProvider != null) composantItemProvider.dispose();
		if (proprietePrimitiveItemProvider != null) proprietePrimitiveItemProvider.dispose();
		if (proprieteItemProvider != null) proprieteItemProvider.dispose();
		if (archiveItemProvider != null) archiveItemProvider.dispose();
		if (methodeItemProvider != null) methodeItemProvider.dispose();
		if (paquetageItemProvider != null) paquetageItemProvider.dispose();
	}

}
