package sk.itvkurze.webinar25._01_implementacia_generickeho_typu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrikladSListom
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
		
		// povedzme ze si chceme tieto osoby zotriedit podla veku
		// Comparator genericke rozhranie s jednou generickou metodou
		// metode odovzdame genericky zoznam osob a vlastny komparator
		Collections.sort(osoby, new KomparatorPodlaVeku());

		System.out.println("... triedim osoby podla veku od najmladsej ...");
		System.out.println(osoby);
		
		System.out.println("... triedim osoby podla veku od najstarsej ...");
		Collections.sort(osoby,  new Comparator<Osoba>() {
			
			@Override
			public int compare(Osoba o1, Osoba o2)
			{
				return -1 * Integer.compare(o1.getVek(), o2.getVek());
			}
		});
		System.out.println(osoby);
	}
}
