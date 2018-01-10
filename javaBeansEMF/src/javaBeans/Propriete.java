/**
 */
package javaBeans;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propriete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.Propriete#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getPropriete()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='conventionNommage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot conventionNommage='self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()'"
 * @generated
 */
public interface Propriete extends ElementModele {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * The literals are from the enumeration {@link javaBeans.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see javaBeans.Property
	 * @see #setProperty(Property)
	 * @see javaBeans.JavaBeansPackage#getPropriete_Property()
	 * @model required="true"
	 *        extendedMetaData="processing='skip'"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link javaBeans.Propriete#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see javaBeans.Property
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // Propriete
