package sk.itvkurze.webinar18.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sk.itvkurze.webinar18.impl.Osoba;

public class OsobaTest {

	@Rule
	public ExpectedException vynimka = ExpectedException.none();

	@Test
	public void testOsobySoZaporVekom() {
		vynimka.expect(IllegalArgumentException.class);
		vynimka.expectMessage("Neplatny vek");

		new Osoba("Igor", "Kovac", -99);
	}

}
