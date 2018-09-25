package w3school.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercises {

	public static void main(String[] args) {

		// 1. vytvorit kolekciu ArrayList
		// pridat nejake prvky
		// vypisat kolekciu

		List<String> colors = new ArrayList<>();
		colors.add("black");
		colors.add("white");
		colors.add("red");
		colors.add("blue");
		colors.add("green");

		System.out.println("Exercise 1");
		System.out.println(colors);

		// 2. iterovat cez prvky kolekcie

		System.out.println("Exercise 2");
		for (String string : colors) {
			System.out.print(string + " ");
		}
		System.out.println();

		// 3. pridanie prvku na 1.poziciu

		System.out.println("Exercise 3");
		colors.add(0, "yellow");
		System.out.println(colors);

		// 4. ziskanie prvku kolekcie z daneho indexu
		System.out.println("Exercise 4");
		System.out.println(colors.get(3)); // prvok z indexu 3, ocakavame "red"

		// 5. zmena daneho prvku kolekcie inym prvkom
		System.out.println("Exercise 5");
		colors.set(0, "orange");
		System.out.println(colors);

		// 6. odstranenie 3 prvku z kolekcie
		System.out.println("Exercise 6");
		colors.remove(2); // ocavakame zmazanie "white"
		System.out.println(colors);

		// 7. najdenie daneho prvku v kolekcii
		System.out.println("Exercise 7");
		System.out.println("obsahuje kolekcia white " + colors.contains("white")); // ocakavame false
		System.out.println("obsahuje kolekcia black " + colors.contains("black")); // ocakavame true

		// 8. sort danej kolekcie pomocou komparatora (v tomto pripade podla dlzky
		// zostupne)
		System.out.println("Exercise 8");
		final podlaDlzky PODLA_DLZKY_ZOSTUPNE = new podlaDlzky();
		colors.sort(PODLA_DLZKY_ZOSTUPNE);
		System.out.println(colors);

		// sort pomocou reverzneho comparatora vytvoreneho z comparatora
		// PODLA_DLZKY_ZOSTUPNE
		final Comparator<String> podlaDlzkyVzostupne = PODLA_DLZKY_ZOSTUPNE.reversed();
		colors.sort(podlaDlzkyVzostupne);
		System.out.println(colors);

		// sort pomocou metody z Collections (default podla abecedy)
		Collections.sort(colors);
		System.out.println(colors);

		// 9. kopirovanie jednej kolekcie Arraylist do druhej
		// kopirovanie pridanim vsetkych prvkov do prazdnej kolekcie
		List<String> colors2 = new ArrayList<>();
		colors2.addAll(colors);
		System.out.println("Exercise 9");
		System.out.println(colors);
		System.out.println(colors2);

		// kopirovanie pomocou Collections.copy(), prepise prvky, ak je destination
		// vacsie ako source, ostatne neriesi
		colors2.sort(podlaDlzkyVzostupne);
		Collections.copy(colors, colors2);
		System.out.println(colors);
		System.out.println(colors2);

		// 10. shuffle elements in arraylist
		Collections.shuffle(colors);
		Collections.shuffle(colors);
		System.out.println("Exercise 10");
		System.out.println(colors);

		// 11. reverse elements in arraylist
		System.out.println("Exercise 11");
		Collections.reverse(colors);
		System.out.println(colors);

		// 12. extract portion from arraylist
		System.out.println("Exercise 12");
		System.out.println(colors.subList(2, 5));

		// 13. compare two arraylist
		System.out.println("Exercise 13");
		System.out.println(colors);
		System.out.println(colors2);
		Iterator<String> iterator = colors.iterator();
		Iterator<String> iterator2 = colors2.iterator();

		while (iterator.hasNext()) {
			String aktPrvokColors1 = iterator.next();
			String aktPrvokColors2 = iterator2.next();

			if (aktPrvokColors1.equals(aktPrvokColors2)) {
				System.out.println("Prvky s indexom " + colors.indexOf(aktPrvokColors1) + " Equals");
			} else {
				System.out.println("Prvky s indexom " + colors.indexOf(aktPrvokColors1) + " Not Equals");
			}
		}

		// 14. swap elements in arraylist
		System.out.println("Exercise 14");
		System.out.println(colors);
		Collections.swap(colors, 0, 4);
		System.out.println(colors);

		// 15. join two arraylist
		System.out.println("Exercise 15");
		colors.addAll(colors.size(), colors2);
		System.out.println(colors);

		// 16. clone arraylist into another
		// clone() je sucastou ArrayList classy, objekt musi byt typu ArrayList aby bola
		// metoda dostupna

		System.out.println("Exercise 16");
		ArrayList<String> colors3 = new ArrayList<>();
		for (String string : colors) {
			colors3.add(string);
		}
		ArrayList<String> colors4 = (ArrayList<String>) colors3.clone();
		System.out.println("Povodny arraylist: " + colors3);
		System.out.println("Clone arraylist: " + colors4);

		// 17. empty an arraylist
		System.out.println("Exercise 17");
		System.out.println("Povodny arraylist: " + colors4);
		colors4.clear();
		System.out.println("cleared arraylist:" + colors4);

		// 18. check if arraylist is empty
		System.out.println("Exercise 18");
		System.out.println("arraylist colors3 is empty?: " + colors3.isEmpty()); // expected false
		System.out.println("arraylist colors4 is empty?: " + colors4.isEmpty()); // expected true

		// 19. trim to size
		System.out.println("Exercise 19");
		colors3.trimToSize();
		System.out.println(colors3);

		// 20. increase size of an arraylist
		System.out.println("Exercise 20");
		System.out.println(colors3);
		colors3.ensureCapacity(20);
		colors3.add("purple");
		System.out.println(colors3);

		// 21. replace second element of an arraylist with specified element
		System.out.println("Exercise 21");
		System.out.println(colors3);
		colors3.set(1, "pink");
		System.out.println(colors3);

		// 22. print all elements using elements position
		System.out.println("Exercise 22");
		for (int i = 0; i < colors3.size(); i++) {
			System.out.print(colors3.get(i) + " ");
		}

		System.out.println();
		System.out.println("//////////////////////////");
		// pomocou iteratora
		Iterator<String> iterator3 = colors3.iterator();
		while (iterator3.hasNext()) {
			System.out.print(iterator3.next() + " ");
		}

		System.out.println();
		System.out.println("//////////////////////////");
		// pomocou foreach
		for (String string : colors3) {
			System.out.print(string + " ");
		}
	}


	private static class podlaDlzky implements Comparator<String> {

		@Override
		public int compare(String arg0, String arg1) {
			if (arg0.length() > arg1.length()) {
				return -1;
			} else if (arg0.length() == arg1.length()) {
				return 0;
			}
			return 1;
		}

	}
}

