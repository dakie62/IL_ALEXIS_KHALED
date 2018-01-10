/**
 */
package javaBeans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.Methode#getModeAcces <em>Mode Acces</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getMethode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='conventionNommage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot conventionNommage='self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()'"
 * @generated
 */
public interface Methode extends ElementModele {
	/**
	 * Returns the value of the '<em><b>Mode Acces</b></em>' attribute.
	 * The literals are from the enumeration {@link javaBeans.ModeAcces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Acces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Acces</em>' attribute.
	 * @see javaBeans.ModeAcces
	 * @see #setModeAcces(ModeAcces)
	 * @see javaBeans.JavaBeansPackage#getMethode_ModeAcces()
	 * @model required="true"
	 * @generated
	 */
	ModeAcces getModeAcces();

	/**
	 * Sets the value of the '{@link javaBeans.Methode#getModeAcces <em>Mode Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Acces</em>' attribute.
	 * @see javaBeans.ModeAcces
	 * @see #getModeAcces()
	 * @generated
	 */
	void setModeAcces(ModeAcces value);

} // Methode
