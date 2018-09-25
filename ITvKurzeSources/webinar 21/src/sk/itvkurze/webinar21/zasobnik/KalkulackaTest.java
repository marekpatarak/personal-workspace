package sk.itvkurze.webinar21.zasobnik;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KalkulackaTest {

	Kalkulacka kalkulacka = new Kalkulacka();

	@Test
	public void testVyhodnoteniaKonstant() {
		int vysledok = kalkulacka.vyhodnot("1");
		assertEquals(1, vysledok);
	}

	@Test
	public void testScitovania() {
		int vysledok = kalkulacka.vyhodnot("1 + 2");
		assertEquals(3, vysledok);
	}

	@Test
	public void tesetOdcitania() {
		int vysledok = kalkulacka.vyhodnot("1 - 2");
		assertEquals(-1, vysledok);
	}

	@Test
	public void testZlozitejsiehoVyrazu() {
		int vysledok = kalkulacka.vyhodnot("1 - 3 + 2 + 4");
		assertEquals(4, vysledok);
	}
}
