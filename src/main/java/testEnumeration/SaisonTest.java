package testEnumeration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SaisonTest {
	
	@Test
	public void test_getSaison1() {
		Saison saison = Saison.getSaison("Printemps");
		assertEquals(Saison.PRINTEMPS, saison);
		
	}

	@Test
	public void test_getSaison2() {
		Saison saison = Saison.getSaison("tarte au pomme");
		assertEquals(Saison.PRINTEMPS, saison);
		
	}
	
	@Test
	public void test_getSaison3() {
		Saison saison = Saison.getSaison(null);
		assertEquals(Saison.PRINTEMPS, saison);
		
	}
}
