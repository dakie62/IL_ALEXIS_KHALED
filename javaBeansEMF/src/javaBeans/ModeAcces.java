/**
 */
package javaBeans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mode Acces</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see javaBeans.JavaBeansPackage#getModeAcces()
 * @model
 * @generated
 */
public enum ModeAcces implements Enumerator {
	/**
	 * The '<em><b>Publique</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIQUE(0, "publique", "publique"),

	/**
	 * The '<em><b>Privee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVEE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVEE(1, "privee", "privee"),

	/**
	 * The '<em><b>Protege</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTEGE_VALUE
	 * @generated
	 * @ordered
	 */
	PROTEGE(2, "protege", "protege");

	/**
	 * The '<em><b>Publique</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publique</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIQUE
	 * @model name="publique"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIQUE_VALUE = 0;

	/**
	 * The '<em><b>Privee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Privee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVEE
	 * @model name="privee"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVEE_VALUE = 1;

	/**
	 * The '<em><b>Protege</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protege</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTEGE
	 * @model name="protege"
	 * @generated
	 * @ordered
	 */
	public static final int PROTEGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mode Acces</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModeAcces[] VALUES_ARRAY =
		new ModeAcces[] {
			PUBLIQUE,
			PRIVEE,
			PROTEGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mode Acces</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModeAcces> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mode Acces</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeAcces get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModeAcces result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode Acces</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeAcces getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModeAcces result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode Acces</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModeAcces get(int value) {
		switch (value) {
			case PUBLIQUE_VALUE: return PUBLIQUE;
			case PRIVEE_VALUE: return PRIVEE;
			case PROTEGE_VALUE: return PROTEGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModeAcces(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModeAcces
