package sk.itvkurze.webinar21.listy;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> studenti = new ArrayList<String>(2);

		studenti.add("janko");
		studenti.add("janko");
		studenti.add("janko");

		System.out.println(studenti);

		System.out.println(new HashSet<>(studenti));
	}
}
