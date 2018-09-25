package sk.itvkurze.webinar24._01_kruhovy_zasobnik;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class KruhovyZasobnikTest
{
	private KruhovyZasobnik zasobnik = new KruhovyZasobnik(2);
	
	@Test
	public void testVkladaniaPrvku() {
		assertTrue(zasobnik.vloz(1));
	}
	
	@Test
	public void testOdoberaniaPrvku() {
		assertTrue(zasobnik.vloz(1));
		assertEquals(1, zasobnik.vyber());
		assertNull(zasobnik.vyber());
	}
	
	@Test
	public void testVlozeniaPrvkuDoPlnehoZasobnika() {
		assertTrue(zasobnik.vloz(1));
		assertTrue(zasobnik.vloz(2));
		assertFalse(zasobnik.vloz(3));
	}
	
	@Test
	public void testVyberPrvkuZprazdnehoZasobnik() {
		assertNull(zasobnik.vyber());
	}
	
	@Test
	public void testRecyklovanostiZasobnika() {
		assertTrue(zasobnik.vloz(1));			
		assertTrue(zasobnik.vloz(2));
		assertEquals(1, zasobnik.vyber());
		assertTrue(zasobnik.vloz(3));
		assertEquals(2, zasobnik.vyber());
		assertEquals(3, zasobnik.vyber());
	}
}
