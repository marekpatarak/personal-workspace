package sk.itvkurze.webinar25._01_reverzny_komparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sk.itvkurze.webinar25._01_implementacia_generickeho_typu.KomparatorPodlaVeku;
import sk.itvkurze.webinar25._01_implementacia_generickeho_typu.Osoba;

public class TriedenieTest
{
	public static void main(String[] args)
	{
		Osoba igor_kovac = new Osoba("Igor Kovac", 25);
		Osoba emil_horvath = new Osoba("Emil Horvath", 33);
		Osoba peter_kovac = new Osoba("Peter Kovac", 19);
		
		List<Osoba> osoby = new ArrayList<>();
		osoby.add(igor_kovac);
		osoby.add(emil_horvath);
		osoby.add(peter_kovac);
		
		System.out.println(osoby);
		
		// reverzny komparator
		
		final KomparatorPodlaVeku komparatorPodlaVeku = new KomparatorPodlaVeku();
		final ReverznyKomparator<Osoba> reverznyKomparator = new ReverznyKomparator<>(komparatorPodlaVeku);
		
		Collections.sort(osoby, reverznyKomparator);
		System.out.println("... triedim osoby podla veku od najstarsej osoby ...");
		System.out.println(osoby);
		
		List<Integer> cisla = new ArrayList<>();
		cisla.add(1);
		cisla.add(50);
		cisla.add(7);
		cisla.add(15);
		
		final Comparator<Integer> komparatorCisel = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2)
			{
				return Integer.compare(o1, o2);
			}
		};
		
		System.out.println("Nezotriedene cisla: " + cisla);
		
		Collections.sort(cisla, komparatorCisel);
		System.out.println("Zotriedene cisla od najmensieho: " + cisla);
		
		Collections.sort(cisla, new ReverznyKomparator<>(komparatorCisel));
		System.out.println("Zotriedene cisla od najvacsieho: " + cisla);
	}
}

