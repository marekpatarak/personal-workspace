package sk.itvkurze.webinar17.junit;

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

	private ArrayList zoznamTestov;

	@BeforeClass
	public static void spustiRazPredVsetkymiTestami() {
		System.out.println("@BeforeClass: spustiRazPredVsetkymiTestami");
	}

	@Before
	public void spustiPredKazdouTestovacouMetodou() {
		zoznamTestov = new ArrayList();
		System.out.println("@Before: pustiPredKazdouTestovacouMetodou");
	}

	@AfterClass
	public static void spustiRazZaVsetkymiTestami() {
		System.out.println("@AfterClass: spustiRazZaVsetkymiTestami");
	}

	@After
	public void spustiPoKazdejMetode() {
		zoznamTestov.clear();
		System.out.println("@After: spustiPoKazdejMetode");
	}

	@Test
	public void testPrazdnejKolekcie() {
		assertTrue(zoznamTestov.isEmpty());
		System.out.println("@Test: testPrazdnejKolekcie()");
	}

	@Test
	public void testJednoprvkovejKolekcie() {
		zoznamTestov.add("test 1");
		assertEquals(1, zoznamTestov.size());
		System.out.println("@Test: testJednoprvkovejKolekcie()");
	}

	@Ignore
	@Test
	public void testIgnorovanejTestovacejMetody() {
		System.out.println("@Test @Ignore: testIgnorovanejTestovacejMetody");
	}
}
