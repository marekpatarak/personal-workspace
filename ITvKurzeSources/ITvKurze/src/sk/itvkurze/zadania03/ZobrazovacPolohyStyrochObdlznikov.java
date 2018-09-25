package sk.itvkurze.zadania03;

import java.awt.Rectangle;

public class ZobrazovacPolohyStyrochObdlznikov {

	public static void main(String[] args) {

		// vytvorenie objektu obdlznik
		Rectangle obdlznik = new Rectangle(0, 0, 5, 3);
		System.out.println(obdlznik);

		// posun x o sirku obdlznika doprava
		obdlznik.translate(obdlznik.width, 0);
		System.out.println(obdlznik);

		// posun y o vysku obdlznika dole
		obdlznik.translate(0, -obdlznik.height);
		System.out.println(obdlznik);

		// posun x o sirku obdlznika dolava
		obdlznik.translate(-obdlznik.width, 0);
		System.out.println(obdlznik);

	}

}
