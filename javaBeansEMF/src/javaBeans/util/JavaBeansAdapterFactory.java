/**
 */
package javaBeans.util;

import javaBeans.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see javaBeans.JavaBeansPackage
 * @generated
 */
public class JavaBeansAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaBeansPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBeansAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaBeansPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaBeansSwitch<Adapter> modelSwitch =
		new JavaBeansSwitch<Adapter>() {
			@Override
			public Adapter caseEvenement(Evenement object) {
				return createEvenementAdapter();
			}
			@Override
			public Adapter caseProprieteBean(ProprieteBean object) {
				return createProprieteBeanAdapter();
			}
			@Override
			public Adapter caseElementModele(ElementModele object) {
				return createElementModeleAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseProprietePrimitive(ProprietePrimitive object) {
				return createProprietePrimitiveAdapter();
			}
			@Override
			public Adapter casePropriete(Propriete object) {
				return createProprieteAdapter();
			}
			@Override
			public Adapter caseArchive(Archive object) {
				return createArchiveAdapter();
			}
			@Override
			public Adapter caseMethode(Methode object) {
				return createMethodeAdapter();
			}
			@Override
			public Adapter casePaquetage(Paquetage object) {
				return createPaquetageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.Evenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.Evenement
	 * @generated
	 */
	public Adapter createEvenementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.ProprieteBean <em>Propriete Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.ProprieteBean
	 * @generated
	 */
	public Adapter createProprieteBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.ElementModele <em>Element Modele</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.ElementModele
	 * @generated
	 */
	public Adapter createElementModeleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.ProprietePrimitive <em>Propriete Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.ProprietePrimitive
	 * @generated
	 */
	public Adapter createProprietePrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.Propriete
	 * @generated
	 */
	public Adapter createProprieteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.Archive
	 * @generated
	 */
	public Adapter createArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.Methode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.Methode
	 * @generated
	 */
	public Adapter createMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaBeans.Paquetage <em>Paquetage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaBeans.Paquetage
	 * @generated
	 */
	public Adapter createPaquetageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaBeansAdapterFactory
