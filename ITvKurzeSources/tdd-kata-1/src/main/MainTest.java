package main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	public void testEmptyString() throws Exception {
		String str = "";

		assertEquals(0, Main.add(str));
	}

	@Test
	public void testOneCharString() throws Exception {
		String str = "3";

		assertEquals(3, Main.add(str));
	}

	@Test
	public void testTwoCharString() throws Exception {
		String str = "4,5";

		assertEquals(9, Main.add(str));
	}

	@Test
	public void testUnlimitedCharString() throws Exception {
		String str = "4\n5\n6\n7";

		assertEquals(22, Main.add(str));
	}

	@Test
	public void testValidateValid() {
		String str = "//;\n2;3";

		assertTrue(Main.validate(str));

		str = "//,\n2,3";

		assertTrue(Main.validate(str));
	}

	@Test
	public void testValidateInvalid() {
		String str = "//;\n2,3";

		assertFalse(Main.validate(str));

	}



}
