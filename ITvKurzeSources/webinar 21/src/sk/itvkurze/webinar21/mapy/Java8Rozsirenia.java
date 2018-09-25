package sk.itvkurze.webinar21.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Java8Rozsirenia
{
	public static void main(String[] args)
	{
		final Vyrobok defaultnyVyrobok = new Vyrobok(-1, "Cokolvek zakaznik chce", 100);

		final Map<Integer, Vyrobok> idNaVyrobok = new HashMap<>();
		idNaVyrobok.put(1, Inventar.dvere);
		idNaVyrobok.put(2, Inventar.okno);
		idNaVyrobok.put(3, Inventar.stol);

		// 1) get() - > null
		Vyrobok vysledok = idNaVyrobok.get(10); // kedze element s takym klucom sa v mape nenachadza
		System.out.println(vysledok); // dostanem null

		// 2) getOrDefault()
		Vyrobok vysledok2 = idNaVyrobok.getOrDefault(10, defaultnyVyrobok);
		System.out.println(vysledok2);
		System.out.println(idNaVyrobok.get(10));
		System.out.println();

		// 3) replace()
		Vyrobok vysledok3 = idNaVyrobok.replace(1, new Vyrobok(1, "Bezpecnostne dvere Sherlock", 50));
		System.out.println(vysledok3);
		System.out.println(idNaVyrobok.get(1));

		// 4) replace() neexistujuci kluc
		Vyrobok vysledok4 = idNaVyrobok.replace(4, new Vyrobok(4, "Bezpecnostne dvere XYZ", 50));
		System.out.println(vysledok4);
		System.out.println(idNaVyrobok.get(4));

		// 5) replaceAll()
		System.out.println(idNaVyrobok);

		idNaVyrobok.replaceAll(
				(id, povodnyVyrobok) -> new Vyrobok(id, povodnyVyrobok.getNazov(), povodnyVyrobok.getVaha() + 10));
		System.out.println(idNaVyrobok);

		// 6) computeIfAbsent() neexistujuci kluc
		Vyrobok vysledok5 = idNaVyrobok.computeIfAbsent(10, (id) -> new Vyrobok(id, "Defaultny Vyrobok", 10));
		System.out.println("Vysledok 5: " + vysledok5);
		System.out.println(idNaVyrobok.get(10));

		// 7) computeIfAbsent() existujuci kluc
		Vyrobok vysledok6 = idNaVyrobok.computeIfAbsent(2, (id) -> new Vyrobok(id, "Defaultny Vyrobok", 10));
		System.out.println("Vysledok 6: " + vysledok6);
		System.out.println(idNaVyrobok.get(2));

		// 8) foreach cyklus java 8
		idNaVyrobok.forEach((kluc, hodnota) -> System.out.println(kluc + " -> " + hodnota));

		// 9 for cyklus
		for (Entry<Integer, Vyrobok> zaznam : idNaVyrobok.entrySet())
		{
			System.out.println(zaznam.getKey() + " -> " + zaznam.getValue());
		}
	}
}
