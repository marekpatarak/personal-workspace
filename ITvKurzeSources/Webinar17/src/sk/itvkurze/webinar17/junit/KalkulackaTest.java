package sk.itvkurze.webinar17.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sk.itvkurze.webinar17.Kalkulacka;

public class KalkulackaTest {


	@Test
	public void testSpocitaj() {
		Kalkulacka kalkulacka = new Kalkulacka();
		int sucet = kalkulacka.spocitaj(2, 5);
		int ocakavanyVysledok = 8;

		System.out.println("@Test spocitaj(): " + sucet + " == " + ocakavanyVysledok);
		assertEquals(ocakavanyVysledok, sucet);
	}
}
