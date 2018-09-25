package sk.itvkurze.webinar25._02_generika_a_metody;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import sk.itvkurze.webinar25._01_implementacia_generickeho_typu.KomparatorPodlaVeku;
import sk.itvkurze.webinar25._01_implementacia_generickeho_typu.Osoba;

// Bez pouzitia generik, mame opat typovo nebeznecny kod
// Implementujme si napr. anonymny komparator celych cisel
public class Triedenie
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
		
		// final Osoba najmladsiaOsoba = (Osoba) min(osoby, new KomparatorPodlaVeku());
		final Osoba najmladsiaOsoba = (Osoba) min(osoby, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return 0;
			}
		});
		
		System.out.println("Najmladsia osoba: " + najmladsiaOsoba);
	}
	
	public static Object min(List zoznam, Comparator komparator)
	{
		if (zoznam.isEmpty())
		{
			throw new IllegalArgumentException("Zoznam je prazdny, nemozem najst minimum");
		}
		
		Object najmensiPrvok = zoznam.get(0);
		
		for (int i = 1; i < zoznam.size(); i++)
		{
			final Object prvok = zoznam.get(i);
			if (komparator.compare(prvok, najmensiPrvok) < 0) 
			{
				najmensiPrvok = prvok;
			}
		}
		
		return najmensiPrvok;
	}
}
