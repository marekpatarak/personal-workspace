package sk.itvkurze.webinar25._01_ohranicenie_typu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ZotriedenaDvojicaTest
{
	@Test
	public void testHodnotVSpravnomPoradi() 
	{
		ZotriedenaDvojica<Integer> cisla = new ZotriedenaDvojica<>(1, 2);
		assertEquals(1, cisla.getPrvyClen().intValue());
		assertEquals(2, cisla.getDruhyClen().intValue());
	}
	
	@Test
	public void testHodnoutVNespravnomPoradi() 
	{
		ZotriedenaDvojica<Integer> cisla = new ZotriedenaDvojica<>(2, 1);
		assertEquals(1, cisla.getPrvyClen().intValue());
		assertEquals(2, cisla.getDruhyClen().intValue());
	}
	
	@Test
	public void test_triedenia_studentov_na_zaklade_priemeru_znamok_v_spravnom_poradi() 
	{
		Student student1 = new Student();
		student1.setPriemerZnamok(1.67);
		Student student2 = new Student();
		student2.setPriemerZnamok(2.23);
		
		double epsilon = 0.01;
		final double prvyPriemer = 1.67;
		final double durhyPrimer = 2.23;
		
		ZotriedenaDvojica<Student> studenti = new ZotriedenaDvojica<>(student1, student2);
		assertTrue(prvyPriemer - studenti.getPrvyClen().getPriemerZnamok() <= epsilon);
		assertTrue(durhyPrimer - studenti.getDruhyClen().getPriemerZnamok() <= epsilon);
	}
	
	@Test
	public void testTriedeniaStudentovNaZakladePriemeruZnamok_v_nespravnomPoradi()
	{
		Student student1 = new Student();
		student1.setPriemerZnamok(1.67);
		Student student2 = new Student();
		student2.setPriemerZnamok(2.23);
		
		double epsilon = 0.01;
		final double prvyPriemer = 1.67;
		final double durhyPrimer = 2.23;
		
		ZotriedenaDvojica<Student> studenti = new ZotriedenaDvojica<>(student2, student1);
		assertTrue(prvyPriemer - studenti.getPrvyClen().getPriemerZnamok() <= epsilon);
		assertTrue(durhyPrimer - studenti.getDruhyClen().getPriemerZnamok() <= epsilon);
	}
}
