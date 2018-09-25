package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class ZobrazovacMeno {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(275, 200);

		okno.setTitle("Zobrazovac mena");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaMeno komponentaMeno = new KomponentaMeno();
		okno.add(komponentaMeno);

		okno.setVisible(true);
	}
}

