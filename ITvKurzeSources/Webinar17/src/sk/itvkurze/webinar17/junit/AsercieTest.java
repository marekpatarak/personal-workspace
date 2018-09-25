package sk.itvkurze.webinar17.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AsercieTest {

	@Test
	public void test() {
		String str1 = "junit";
		String str2 = "junit";
		String str3 = "test";
		String str4 = "test";
		String str5 = null;
		int cislo1 = 1;
		int cislo2 = 1;
		int[] celeCisla1 = { 1, 2, 3 };
		int[] celeCisla2 = { 1, 2, 3 };

		assertEquals(str1, str2); // equals() - porovnavame hodnoty objektov

		assertSame(str3, str4); // == - testujeme cu ukazujeme na rovnaky objekt v pamati

		assertNotEquals(str1, str3);

		assertNotSame(str1, str3);

		assertNotNull(str1);

		assertNull(str5);

		assertTrue(cislo1 == cislo2);

		assertArrayEquals(celeCisla1, celeCisla2);

	}
}
