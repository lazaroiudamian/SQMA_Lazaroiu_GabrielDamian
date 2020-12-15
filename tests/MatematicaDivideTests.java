package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Matematica;

public class MatematicaDivideTests {
	Matematica mate;

	@Before
	public void setUp() {
		mate = new Matematica();
	}

	@Test
	public void testRaportCorect() {

		double rezultat = mate.raport(12, 3);
		double rezultatAsteptat = 4;
		assertEquals(rezultatAsteptat, rezultat, 0.1);
	}

	@Test
	public void testRaportExceptie() {
		try {
			mate.raport(34, 0);
			fail("Metoda nu arunca exceptie");
		} catch (IllegalArgumentException er) {

		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRaportExceptieJUnit4() {
		mate.raport(45, 0);
	}

	@Test
	public void testRaportVirgulaMobila() {
		double rezultat = mate.raport(15, 4);
		double rezultatAsteptat = 3.75;
		assertEquals(rezultatAsteptat, rezultat, 0.1);
	}
}
