package sk.itvkurze.webinar20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PredstavenieKolekcii {

	public static void main(String[] args) {
		Vyrobok dvere = new Vyrobok("drevene dvere", 35);
		Vyrobok okno = new Vyrobok("Plastove okno", 25);
		Vyrobok stol = new Vyrobok("Skleneny stol", 10);

		Collection<Vyrobok> vyrobky = new ArrayList<Vyrobok>();
		vyrobky.add(dvere);
		vyrobky.add(okno);
		vyrobky.add(stol);

		System.out.println(vyrobky);

		// iterovanie pomocou iteratora (treba pouzit ak chceme naraz menit aj iterovat
		// kolekciu)
		Iterator<Vyrobok> vyrobokIterator = vyrobky.iterator();

		while (vyrobokIterator.hasNext()) {
			Vyrobok aktVyrobok = vyrobokIterator.next();
			System.out.println(aktVyrobok);
		}

		// iterovanie pomocou foreach

		for (Vyrobok vyrobok : vyrobky) {
			System.out.println(vyrobok);
		}

		System.out.println(vyrobky.size());
		System.out.println(vyrobky.isEmpty());
		System.out.println(vyrobky.contains(dvere));

		Collection<Vyrobok> dalsieVyrobky = new ArrayList<Vyrobok>();
		dalsieVyrobky.add(dvere);
		dalsieVyrobky.add(okno);

		System.out.println(vyrobky.containsAll(dalsieVyrobky));

		vyrobky.remove(dvere);
		vyrobky.removeAll(dalsieVyrobky);

	}

}
