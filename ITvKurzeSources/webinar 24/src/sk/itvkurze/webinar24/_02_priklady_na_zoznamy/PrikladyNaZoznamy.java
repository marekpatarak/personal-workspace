package sk.itvkurze.webinar24._02_priklady_na_zoznamy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sk.itvkurze.webinar24._02_problemy_s_poliami.Osoba;

public class PrikladyNaZoznamy
{
	public static void main(String[] args)
	{
		Osoba peter_kovac = new Osoba("Peter Kovac", 33);
		Osoba miro_ivanov = new Osoba("Miroslav Ivanov", 21);
		
		// od verzie jdk 7, nemusime na pravej strane zadavat typ, typ bude automaticky odvodeny, type inference
		List<Osoba> osoby = new ArrayList<>();
		osoby.add(peter_kovac);
		osoby.add(miro_ivanov);
		
		System.out.println(osoby);
		
		osoby.add(new Osoba("Peter Ocenas", 100));
		
		System.out.println(osoby);
		
		// mame typovo bezpecny kod
		// osoby.add(4);
		
		// zistime si velkost
		System.out.println(osoby.size());
		
		// vyberieme elementy na zaklade indexu
		System.out.println(osoby.get(0));
		
		// ziskame 3. osobu nasledne testneme ci sa tam nachadza
		Osoba osoba3 = osoby.get(2); 
		System.out.println(osoby.contains(osoba3));
		
		// prechadzanie kolekciou pomocou indexov
		System.out.println("... Iterovanie kolekciou pomocou indexov ...");
		for (int i = 0; i < osoby.size(); i++) 
		{
			Osoba osoba = osoby.get(i);
			System.out.println(osoba);
		}
		
		// prechadzanie kolekciou pomocou iteratora
		System.out.println("... Iterovanie kolekciou pomocou iteratora ...");
		final Iterator<Osoba> iterator = osoby.iterator();
		while(iterator.hasNext())			// hasNext() - vrati true ak sa v zozname nachadza nejaky prvok
		{
			Osoba osoba = iterator.next();      // next() - vyera zo zonamu prvy prvok v poradi
			System.out.println(osoba);
		}
		
		// prechadzanie kolekciou pomocou for-each cyklu
		// v Jdk 5 spolu s generikami nam pribudol aj for-each cyklus
		System.out.println("... Iterovanie kolekciou pomocou for-each cyklu ...");
		for(Osoba osoba : osoby) {
			System.out.println(osoba);
		}
	}
}
