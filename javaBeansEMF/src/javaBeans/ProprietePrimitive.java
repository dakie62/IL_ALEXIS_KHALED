/**
 */
package javaBeans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propriete Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.ProprietePrimitive#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getProprietePrimitive()
 * @model
 * @generated
 */
public interface ProprietePrimitive extends Propriete {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The literals are from the enumeration {@link javaBeans.Primitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see javaBeans.Primitive
	 * @see #setPrimitive(Primitive)
	 * @see javaBeans.JavaBeansPackage#getProprietePrimitive_Primitive()
	 * @model
	 * @generated
	 */
	Primitive getPrimitive();

	/**
	 * Sets the value of the '{@link javaBeans.ProprietePrimitive#getPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see javaBeans.Primitive
	 * @see #getPrimitive()
	 * @generated
	 */
	void setPrimitive(Primitive value);

} // ProprietePrimitive
