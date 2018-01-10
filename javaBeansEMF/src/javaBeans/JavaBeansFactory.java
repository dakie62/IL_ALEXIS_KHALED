/**
 */
package javaBeans;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see javaBeans.JavaBeansPackage
 * @generated
 */
public interface JavaBeansFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaBeansFactory eINSTANCE = javaBeans.impl.JavaBeansFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evenement</em>'.
	 * @generated
	 */
	Evenement createEvenement();

	/**
	 * Returns a new object of class '<em>Propriete Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriete Bean</em>'.
	 * @generated
	 */
	ProprieteBean createProprieteBean();

	/**
	 * Returns a new object of class '<em>Element Modele</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Modele</em>'.
	 * @generated
	 */
	ElementModele createElementModele();

	/**
	 * Returns a new object of class '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant</em>'.
	 * @generated
	 */
	Composant createComposant();

	/**
	 * Returns a new object of class '<em>Propriete Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriete Primitive</em>'.
	 * @generated
	 */
	ProprietePrimitive createProprietePrimitive();

	/**
	 * Returns a new object of class '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriete</em>'.
	 * @generated
	 */
	Propriete createPropriete();

	/**
	 * Returns a new object of class '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive</em>'.
	 * @generated
	 */
	Archive createArchive();

	/**
	 * Returns a new object of class '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methode</em>'.
	 * @generated
	 */
	Methode createMethode();

	/**
	 * Returns a new object of class '<em>Paquetage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paquetage</em>'.
	 * @generated
	 */
	Paquetage createPaquetage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaBeansPackage getJavaBeansPackage();

} //JavaBeansFactory
