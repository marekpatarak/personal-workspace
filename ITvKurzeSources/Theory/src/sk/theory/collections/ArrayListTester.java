package sk.theory.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTester {

	public static void main(String[] args) {
		
		// vytvorenie kolekcie
		// typ(interface) <typPrvkov> nazovKolekcie = new KonkretnaImplementacia <moze
		// sa pisat typ prvkov ale nemusi> ();

		List<String> kolekciaStr = new ArrayList<>();

		String prvok1 = "prvok1";
		String prvok2 = "prvok2";

		kolekciaStr.add(prvok1);
		System.out.println("kolekcia po pridani prvku 1");
		System.out.println(kolekciaStr);

		kolekciaStr.add(prvok2);
		System.out.println("kolekcia po pridani prvku 2");
		System.out.println(kolekciaStr);

		kolekciaStr.remove(prvok1);
		System.out.println("kolekcia po odobrati prvku 1");
		System.out.println(kolekciaStr);

		kolekciaStr.add(prvok2); // ArrayList resp. List umoznuje duplikaty
		System.out.println("kolekcia po pridani znovu prvku 2");
		System.out.println(kolekciaStr);

		System.out.println("test ci kolekcia obsahuje prvok 1");
		System.out.println(kolekciaStr.contains(prvok1));

		System.out.println("test ci kolekcia obsahuje prvok 2");
		System.out.println(kolekciaStr.contains(prvok2));

		// pristupenie k prvku na indexe 0, citanie, k dispozicii v ramci interface List
		System.out.println(kolekciaStr.get(0));

		// pristupenie k prvku na indexe 1, zapisovanie, k dispozicii v ramci interface
		// List
		kolekciaStr.set(1, "prvok3");
		System.out.println(kolekciaStr.get(1));

		// metoda vracia pole objektov kolekcie
		Object[] poleStr = kolekciaStr.toArray();

		kolekciaStr.add("prvok 4");
		kolekciaStr.add("prvok 5");

		// subList od indexu x (included) po index y (excluded)
		System.out.println(kolekciaStr.subList(1, 4));

		// iterovanie pomocou iteratora (interface), vhodne riesenie pri akejkolvek
		// ZMENE (zmena poctu prvkov, pozicia) kolekcie
		// Iterator<typKolekcie> nazovKolekcie

		Iterator<String> kolekciaIterator = kolekciaStr.iterator();
		System.out.println("Iterovanie pomocou iteratora: ");
		while (kolekciaIterator.hasNext()) {
			System.out.println(kolekciaIterator.next());
		}

		// prechadzanie prvkov kolekcie pomocu foreach, vhodne pri iba prechadzani
		// (CITANI) kolekcie alebo ZMENE objektov v kolekcii
		System.out.println("Iterovanie pomocou foreach: ");
		for (String string : kolekciaStr) {
			System.out.println(string);
		}

		// kontrola v pripade generickeho riesenia pomocou Collection<> ci sa jedna o
		// instanciu konkretnej implementacie
		System.out.println("je kolekciaStr instancia ArrayList? " + (kolekciaStr instanceof ArrayList));
		// should be true
		System.out.println("je kolekciaStr instancia LinkedList? " + (kolekciaStr instanceof LinkedList));
		// should be false

	}

}

