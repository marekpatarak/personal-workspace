package sk.itvkurze.zadania05;

import javax.swing.JFrame;

public class ZobrazovacPismena {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("HELLO");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaPismena komponentaPismena = new KomponentaPismena();
		okno.add(komponentaPismena);

		okno.setVisible(true);
	}
}

