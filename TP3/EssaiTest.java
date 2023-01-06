//package testEssai;

import essai.Essai;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

/*ATTENTION: rajouter les imports nécessaires pour vos tests*/
/* nécessaire pour les timeout */
/* importer les assertions utilisées */
/* importer les annotations utilisées*/

class EssaiTestEtu {

	Essai essai;  //à initialiser avant chaque test!!!
	Essai essai1;
	Essai essai2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		/*
		 * ajouter un message
		 */
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		/*
		 * ajouter un message
		 */
	}

	@BeforeEach
	void setUp() throws Exception {
		/*
		 * ajouter un message
		 */
		essai = new Essai(0.0);
		essai1 = new Essai(0.0);
		essai2 = new Essai(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 * ajouter un message
		 */
	}

	/*
	 * désactiver ce test
	 */
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	/*
	 * un exemple de test pour le getter
	 */
	@Test()
	public final void testGetVal(){
		double val = essai.getVal();
		double expected = 0.0;
		assertTrue(val == expected);
	}

	/*
	 * un exemple de test pour le setter
	 */
	@Test()
	public final void testSetVal(){
		essai.setVal(2.0);
		double val = essai.getVal();
		double expected = 2.0;
		assertTrue(val == expected);
	}

	/*
	 * un exemple de test pour l'inverse
	 */
	@Test()
	public final void testInverse(){
		essai.setVal(2.0);
		double val = essai.inverserVal();
		double expected = 1/ 2.0;
		assertTrue(val == expected);
	}
	
	/*
	 * Ecrire un test vérifiant que diviser par zéro lève une exception
	 */
	@Disabled
	public final void testExceptionInverse(){
		fail("NYI");
	}
	
	/*
	 * Ecrire un test qui échoue si le calcul avec infinite prend trop de temps 
	 */
	@Disabled
	public final void testTimeoutInfinite(){
		assertTimeoutPreemptively(Duration.ofMillis(100), ()->{essai.infinite();});
	}
		
}
