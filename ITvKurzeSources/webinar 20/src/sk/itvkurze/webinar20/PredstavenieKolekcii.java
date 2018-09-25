package sk.itvkurze.webinar20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PredstavenieKolekcii {

	public static void main(String[] args) {
		Vyrobok dvere = new Vyrobok("Drevene dvere", 35);
		Vyrobok okno = new Vyrobok("Plastove okno", 25);
		Vyrobok stol = new Vyrobok("Skleneny stol", 10);

		Collection<Vyrobok> vyrobky = new ArrayList<>();
		vyrobky.add(dvere);
		vyrobky.add(okno);
		vyrobky.add(stol);

		ArrayList<Vyrobok> vyrobky2 = new ArrayList<>();
		vyrobky2.addAll(vyrobky);

		System.out.println("Priemerna vaha vyrobkov: " + getPriemernaVaha(vyrobky2));

		// System.out.println(vyrobky);

		// 1) prechadzanie prvkov kolekcie pomocou iteratora
		// Iterator<Vyrobok> vyrobokIterator = vyrobky.iterator();
		// while (vyrobokIterator.hasNext()) {
		// Vyrobok aktualnyVyrobok = vyrobokIterator.next();
		// System.out.println(aktualnyVyrobok);
		// }
		//
		// // 2) prechadzanie prvkov kolekcie pomocou cyklu foreach
		// for (Vyrobok vyrobok : vyrobky) {
		// System.out.println(vyrobok);
		// }

		// 3) vypis vyrobky, ktore maju vacsiu hmotnost ako 20 kg, a ak ma vyrobok menej
		// kilogramov, tak ho z kolekcie zmaz

		System.out.println("Stav kolekcie pred zmazanim: " + vyrobky);

		Iterator<Vyrobok> vyrobokIterator = vyrobky.iterator();
		while (vyrobokIterator.hasNext()) {
			Vyrobok aktualnyVyrobok = vyrobokIterator.next();

			if (aktualnyVyrobok.getVaha() > 20) {
				System.out.println(aktualnyVyrobok);
			} else {
				vyrobokIterator.remove();
				// vyrobky.clear();
				// vyrobky.add(new Vyrobok("sdfasd", 100));
			}
		}

		for (Vyrobok vyrobok : vyrobky) {
			vyrobok.setNazov(vyrobok.getNazov().toLowerCase());
		}

		System.out.println(vyrobky);

		System.out.println("Aktualna velkost kolekcie: " + vyrobky.size()); // ocakavame 2
		System.out.println("Je kolekcia prazdna? " + vyrobky.isEmpty());
		System.out.println("Obsahuje kolekcia dvere? " + vyrobky.contains(dvere));
		System.out.println("Obsahuje kolekcia stol? " + vyrobky.contains(stol));

		Collection<Vyrobok> dalsieVyrbky = new ArrayList<>();
		dalsieVyrbky.add(dvere);
		dalsieVyrbky.add(okno);

		System.out.println("Obsahuje povodna kolekcia vyrobky aj dalsie vyrobky? " + vyrobky.containsAll(dalsieVyrbky));

		System.out.println("Podarilo sa z kolekcie vyrobky zmazat dvere? " + vyrobky.remove(dvere));
		System.out.println("Podarilo sa z kolekcie vyrobky zmazat dvere? " + vyrobky.remove(dvere));

		vyrobky.removeAll(dalsieVyrbky);
		vyrobky.retainAll(dalsieVyrbky);
	}

	private static double getPriemernaVaha(List<Vyrobok> vyrobky) {
		double priemernaVaha = 0;

		if (vyrobky instanceof ArrayList) {
			ArrayList<Vyrobok> pomocnePole = (ArrayList<Vyrobok>) vyrobky;
			pomocnePole.set(0, new Vyrobok("testovaci vyrobo", 99));
		} else if (vyrobky instanceof LinkedList) {
			// ...
		}

		for (Vyrobok vyrobok : vyrobky) {
			priemernaVaha += vyrobok.getVaha();
		}

		return priemernaVaha / vyrobky.size();
	}
}
