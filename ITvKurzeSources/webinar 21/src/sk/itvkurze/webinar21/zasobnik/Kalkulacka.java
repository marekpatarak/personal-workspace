package sk.itvkurze.webinar21.zasobnik;

import java.util.ArrayDeque;
import java.util.Deque;

/*
  1
  -
  3
  +
  2
  +
  4 
 */
public class Kalkulacka {

	/**
	 * Vyhodnoti vstup tak, ze rozdeli vstup na tokeny, t.j. elementy ci uz cisla
	 * alebo operacie
	 * 
	 * @param vstup
	 *            data ktore reprezentuju cisla a operacie
	 * @return vysledna hodnota
	 */
	public int vyhodnot(final String vstup) {
		final Deque<String> zasobnik = new ArrayDeque<>();
		final String[] tokeny = vstup.split(" ");
		for (String token : tokeny) {
			zasobnik.add(token);
		}

		while (zasobnik.size() > 1) {
			final int lavyOperand = Integer.parseInt(zasobnik.pop());
			final String operacia = zasobnik.pop();
			final int pravyOperand = Integer.parseInt(zasobnik.pop());

			int vysledok = 0;
			switch (operacia) {
			case "+":
				vysledok = lavyOperand + pravyOperand;
				break;
			case "-":
				vysledok = lavyOperand - pravyOperand;
				break;
			}

			zasobnik.push(String.valueOf(vysledok));
		}
		return Integer.parseInt(zasobnik.pop());
	}
}
