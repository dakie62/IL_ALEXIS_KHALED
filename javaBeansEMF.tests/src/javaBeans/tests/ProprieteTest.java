/**
 */
package javaBeans.tests;

import javaBeans.JavaBeansFactory;
import javaBeans.Propriete;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propriete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProprieteTest extends ElementModeleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProprieteTest.class);
	}

	/**
	 * Constructs a new Propriete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprieteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Propriete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Propriete getFixture() {
		return (Propriete)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaBeansFactory.eINSTANCE.createPropriete());
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

} //ProprieteTest
