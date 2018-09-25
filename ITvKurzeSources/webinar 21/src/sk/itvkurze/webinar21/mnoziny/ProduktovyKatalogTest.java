package sk.itvkurze.webinar21.mnoziny;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static sk.itvkurze.webinar21.mnoziny.Inventar.*;

public class ProduktovyKatalogTest {

	@Test
	public void testUlozeniaUnikatnychVyrobkov() throws Exception {
		ProduktovyKatalog katalog = new ProduktovyKatalog();

		katalog.jeDodavany(hornbach);
		katalog.jeDodavany(obi);

		assertThat(katalog, containsInAnyOrder(dvere, okno, stol));
		assertThat(katalog, contains(stol, okno, dvere));
	}

	@Test
	public void testNajdeniaLahkychVyrobkov() throws Exception {
		ProduktovyKatalog katalog = new ProduktovyKatalog();

		katalog.jeDodavany(hornbach);
		katalog.jeDodavany(obi);

		assertThat(katalog.getLahkeVyrobky(), contains(stol));

	}

	@Test
	public void testNajdeniaTazkychVyrobkov() throws Exception {
		ProduktovyKatalog katalog = new ProduktovyKatalog();

		katalog.jeDodavany(hornbach);
		katalog.jeDodavany(obi);

		assertThat(katalog.getTazkeVyrobky(), containsInAnyOrder(dvere, okno));
		assertThat(katalog.getTazkeVyrobky(), contains(okno, dvere));
	}
}
