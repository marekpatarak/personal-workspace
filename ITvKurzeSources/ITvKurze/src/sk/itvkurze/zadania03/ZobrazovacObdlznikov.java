package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class ZobrazovacObdlznikov {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		// a)
		okno.setSize(300, 400);

		// b) doplnenie o bonus
		okno.setTitle("Dva obdlzniky + BONUS");

		// c)
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// vytvorime si object triedy KomponentaObdlznik a pridame ho do okna
		// nasej grafickej aplikacie
		KomponentaObdlznik komponentaObdlznik = new KomponentaObdlznik();
		okno.add(komponentaObdlznik);

		// d)
		okno.setVisible(true);
	}
}

