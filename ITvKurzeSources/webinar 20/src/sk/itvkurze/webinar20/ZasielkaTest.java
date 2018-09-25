package sk.itvkurze.webinar20;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static sk.itvkurze.webinar20.Inventar.dvere;
import static sk.itvkurze.webinar20.Inventar.okno;
import static sk.itvkurze.webinar20.Inventar.stol;

import org.junit.Test;

public class ZasielkaTest {

	private Zasielka zasielka = new Zasielka();

	@Test
	public void testPridajVyrobok() throws Exception {
		zasielka.pridajVyrobok(dvere);
		zasielka.pridajVyrobok(okno);

		assertThat(zasielka, contains(dvere, okno));
	}

	@Test
	public void testNahradVyrobok() throws Exception {
		zasielka.pridajVyrobok(okno);
		zasielka.pridajVyrobok(dvere);

		zasielka.nahradVyrobok(dvere, stol);

		assertThat(zasielka, contains(okno, stol));
	}

	@Test
	public void testNahradChybajuciVyrobok() throws Exception {
		zasielka.pridajVyrobok(okno);

		zasielka.nahradVyrobok(dvere, stol);
		assertThat(zasielka, contains(okno));
	}

	@Test
	public void testRozdeleniaVyrobkovPodlaHmotnosti() throws Exception {
		zasielka.pridajVyrobok(okno);
		zasielka.pridajVyrobok(dvere);
		zasielka.pridajVyrobok(stol);

		zasielka.priprav();

		assertThat(zasielka.getLahsieVyrobky(), contains(stol));
		assertThat(zasielka.getTazssieVyrobky(), contains(okno, dvere));
	}
}
