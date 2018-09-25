package sk.itvkurze.webinar18.test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class NazovMetodyRuleTest {

	@Rule
	public TestName nazov = new TestName();

	@Test
	public void testMetoda1() {
		System.out.println(nazov.getMethodName());
		assertEquals("testMetoda1", nazov.getMethodName());
	}

	@Test
	public void testMetoda2() {
		System.out.println(nazov.getMethodName());
		assertEquals("testMetoda2", nazov.getMethodName());
	}

}
