package sk.itvkurze.zadania03;

import java.awt.Rectangle;

public class ZobrazovacPrieniku {

	public static void main(String[] args) {

		// vytvorenie objektov obdlznik1 a obdlznik2
		Rectangle obdlznik1 = new Rectangle(0, 3, 4, 3);
		Rectangle obdlznik2 = new Rectangle(1, 5, 4, 3);
		System.out.println("Prvy obdlznik je:" + obdlznik1);
		System.out.println("Druhy obdlznik je:" + obdlznik2);

		Rectangle prienik = obdlznik1.intersection(obdlznik2);
		System.out.println("Prienikovy obdlznik je:" + prienik);


		/*
		 * prienikovy obdlznik je prazdny ak je jeho sirka mensia alebo rovna nule alebo
		 * je jeho vyska mensia alebo rovna nule, dalo by sa to samozrejme aj inak :)
		 */
		if (prienik.width <= 0 || prienik.height <= 0) {
			System.out.println("Prienikovy obdlznik je prazdny");
		}

	}

}
