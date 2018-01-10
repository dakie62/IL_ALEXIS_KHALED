/**
 */
package javaBeans.tests;

import javaBeans.JavaBeansFactory;
import javaBeans.ProprietePrimitive;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propriete Primitive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProprietePrimitiveTest extends ProprieteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProprietePrimitiveTest.class);
	}

	/**
	 * Constructs a new Propriete Primitive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprietePrimitiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Propriete Primitive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProprietePrimitive getFixture() {
		return (ProprietePrimitive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaBeansFactory.eINSTANCE.createProprietePrimitive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProprietePrimitiveTest
