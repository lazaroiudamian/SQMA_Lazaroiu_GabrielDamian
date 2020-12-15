package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Matematica;

public class MatematicaSumTests {
	Matematica mate;

	@Before
	public void setUp() {
		mate = new Matematica();
	}

	@Test
	public void testSumaCorectitudine() {
		int rezultat = mate.suma(3, 12);
		int rezultatAsteptat = 15;
		assertEquals(rezultatAsteptat, rezultat);
	}
}
