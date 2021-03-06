package sk.itvkurze.webinar25._02_generika_a_metody;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import sk.itvkurze.webinar25._01_implementacia_generickeho_typu.KomparatorPodlaVeku;
import sk.itvkurze.webinar25._01_implementacia_generickeho_typu.Osoba;

// ak vytvrame genericku triedu, typ pride hned za nazov triedy
// v pripade metod, typ je zlava pred navratovym typom
public class TriedenieSGenerickouMetodou
{
	public static void main(String[] args)
	{
		Osoba peter_kovac = new Osoba("Peter Kovac", 33);
		Osoba emil_horvath = new Osoba("Emil Horvath", 22);
		Osoba jakub_novak = new Osoba("Jakub Novak", 42);
		
		List<Osoba> osoby = new ArrayList<>();
		osoby.add(peter_kovac);
		osoby.add(emil_horvath);
		osoby.add(jakub_novak);
		
		// ak navratovy typ metody zmenieme na T, mozeme rovnako odstranit aj explicitne pretypovanie
		// opat chybu z runtime sme presunuli do fazy kompilacie, pri pokuse o pouzitie typovo nevhodneho komparatoru
		final Osoba najmladsiaOsoba = min(osoby, new KomparatorPodlaVeku());
//		final Osoba najmladsiaOsoba = (Osoba) min(osoby, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2)
//			{
//				return 0;
//			}
//		});
		
		System.out.println("Najmladsia osoba: " + najmladsiaOsoba);
		
		// a to zme si spravili skutocne genericku, t.j. metodu pouzitelnu pre akykolvek typ T, ktory vieme zotriedit
		// si teraz ukazmee na priklade s cislami
		
		List<Integer> cisla = new ArrayList<>();
		cisla.add(1);
		cisla.add(2);
		cisla.add(3);
		
		System.out.println("Najmensie cislo: " + min(cisla, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return Integer.compare(o1, o2);
			}
		}));
		
		// alebo v Java 8 by sme to vedeli zapisat tzv. one-linerom :-)
		System.out.println("Najmensie cislo: " + min(cisla, Integer::compareTo));
		
		// vidime, ze sme si naprogramovali univerzalnu metodu a sucasne je to typovo bezpecne riesenie
	}
	
	// genericky typ sa viaze len na konkretnu metodu
	public static <T> T min(List<T> zoznam, Comparator<T> komparator)
	{
		if (zoznam.isEmpty())
		{
			throw new IllegalArgumentException("Zoznam je prazdny, nemozem najst minimum");
		}
		
		T najmensiPrvok = zoznam.get(0);
		
		for (int i = 1; i < zoznam.size(); i++)
		{
			final T prvok = zoznam.get(i);
			if (komparator.compare(prvok, najmensiPrvok) < 0) 
			{
				najmensiPrvok = prvok;
			}
		}
		
		return najmensiPrvok;
	}
}
