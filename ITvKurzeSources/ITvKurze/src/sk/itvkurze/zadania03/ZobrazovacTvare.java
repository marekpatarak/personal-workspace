package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class ZobrazovacTvare {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		// a)
		okno.setSize(300, 400);

		// b)
		okno.setTitle("Tvar mimozemstana");

		// c)
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// vytvorime si object triedy KomponentaTvar a pridame ho do okna
		// nasej grafickej aplikacie
		KomponentaTvar komponentaTvar = new KomponentaTvar();
		okno.add(komponentaTvar);

		// d)
		okno.setVisible(true);
	}
}

