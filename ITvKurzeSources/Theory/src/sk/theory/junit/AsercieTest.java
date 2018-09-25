package sk.theory.junit;

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
		int cislo2 = 2;
		int[] celeCisla1 = { 1, 2, 3 };
		int[] celeCisla2 = { 1, 2, 4 };

		// equals() - porovnavame hodnoty objektov
		assertEquals(str1, str2);

		// == - testujeme c ukazujeme na rovnaky objekt v pamati
		assertSame(str3, str4);

		// !equals() - porovnavame hodnoty objektov, ci nie su rovnake
		assertNotEquals(str1, str3);

		// !== - testujeme ci neukazujeme na rovnaky objekt v pamati
		assertNotSame(str1, str3);

		// !equals() - porovnavame hodnoty objektov, ci nie su rovnake
		assertEquals(str1, str1);

		// !== - testujeme ci neukazujeme na rovnaky objekt v pamati
		assertSame("junit", "junit");

		// testujeme ci objekt nie je null
		assertNotNull(str1);

		// testujeme ci objekt je null
		assertNull(str5);

		// testujeme ci je podmienka true
		assertTrue(cislo1 != cislo2);

		// testujeme ci su polia rovnake
		assertArrayEquals(celeCisla1, celeCisla1);
		
	}
}
