package sk.itvkurze.webinar25._04_surove_typy_legacy_kod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// nas kod nepouziva generika, je zavisly na collection frameworku a sucasne
// v pohode ho vieme skompilovat a spustit s jdk 8
public class LegacyKod
{
	public static void main(String[] args)
	{
		// List - surovy typ, ktory je i nadalej podporovany kvoli spatnej kompatibilite
		// s tzv. legacy kodom, alebo legacy kniznicami
		// musime mat na pamati, surovy typ nie je to iste ako List<Object>, zistime to nasledovne
		
		
		// List<Object> zoznam = new ArrayList<>();
		List zoznam = new ArrayList();
		zoznam.add("jeden");
		// zoznam.add(1);
		// zoznam.add(new Object());
		
		List<String> retazce = zoznam;		// nekompatibilne typy
		
		// pouzivanie legacy kodu v jdk 8
		List<String> retazce2 = new ArrayList<>();
		naplnZoznam(retazce2);
		System.out.println(retazce2);
		
		// ak by sme chceli preiterovat takyto zoznam, hitneme class cast exception
		
		// v jdk 1.4 sme nemali dostupny foreach ceyklus, iterovali sme pomocou
		// iteratora
		Iterator iterator = zoznam.iterator();
		while (iterator.hasNext())
		{
			final Object prvok = iterator.next();
			System.out.println(prvok);
		}
	}
	
	public static void naplnZoznam(List zoznam)
	{
		zoznam.add("test");
	}
}
