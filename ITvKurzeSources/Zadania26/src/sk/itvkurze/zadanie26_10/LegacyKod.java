package sk.itvkurze.zadanie26_10;

import java.util.ArrayList;
import java.util.List;

public class LegacyKod {

	public static void main(String[] args) {

		List zoznam = new ArrayList();

		zoznam.add("java");
		zoznam.add("C#");
		zoznam.add("PHP");
		zoznam.add("C++");
		zoznam.add("Python");



		for (int i = 0; i < zoznam.size(); i++) {
			String str = (String) zoznam.get(i);
			System.out.println(str);

			// keby sa to priamo vypisovalo, zozerie to aj int aj boolean
			// System.out.println(zoznam.get(i));
		}

	}


}
