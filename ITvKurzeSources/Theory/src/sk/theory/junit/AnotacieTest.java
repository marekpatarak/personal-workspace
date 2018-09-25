package sk.theory.junit;

// it is necessary to add JUnit Library
// right click on package >> build path >> configure build path >> Libraries >> add library >> JUnit
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnotacieTest {

	// object instantiation e.g. class ArrayList for testing
	private ArrayList zoznamTestov;

	// Code executed before the first test method
	@BeforeClass
	public static void spustiRazPredVsetkymiTestami() {
		System.out.println("@BeforeClass: spustiRazPredVsetkymiTestami");
	}

	// Code executed before each test
	@Before
	public void spustiPredKazdouTestovacouMetodou() {
		zoznamTestov = new ArrayList();
		System.out.println("@Before: pustiPredKazdouTestovacouMetodou");
	}

	// Code executed after the last test method
	@AfterClass
	public static void spustiRazZaVsetkymiTestami() {
		System.out.println("@AfterClass: spustiRazZaVsetkymiTestami");
	}

	// Code executed after each test
	@After
	public void spustiPoKazdejMetode() {
		zoznamTestov.clear();
		System.out.println("@After: spustiPoKazdejMetode");
	}

	// Code that tests one thing
	@Test
	public void testPrazdnejKolekcie() {
		assertTrue(zoznamTestov.isEmpty());
		System.out.println("@Test: testPrazdnejKolekcie()");
	}

	// Code that tests another thing
	@Test
	public void testJednoprvkovejKolekcie() {
		zoznamTestov.add("test 1");
		assertEquals(1, zoznamTestov.size());
		System.out.println("@Test: testJednoprvkovejKolekcie()");
	}

	// test method ignored by compiler, used when we want to exclude particular test
	// method

	@Ignore
	@Test
	public void testIgnorovanejTestovacejMetody() {
		System.out.println("@Test @Ignore: testIgnorovanejTestovacejMetody");
	}
}
