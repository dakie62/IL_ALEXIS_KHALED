/**
 */
package javaBeans.tests;

import javaBeans.JavaBeansFactory;
import javaBeans.Paquetage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paquetage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaquetageTest extends ElementModeleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaquetageTest.class);
	}

	/**
	 * Constructs a new Paquetage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaquetageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Paquetage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Paquetage getFixture() {
		return (Paquetage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaBeansFactory.eINSTANCE.createPaquetage());
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

} //PaquetageTest
