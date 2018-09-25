package sk.itvkurze.zadania05;

import javax.swing.JFrame;

public class ZobrazovacBullsEye {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(400, 400);

		okno.setTitle("Zobrazovac BullsEye");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaBullsEye komponentaBullsEye = new KomponentaBullsEye();
		okno.add(komponentaBullsEye);

		okno.setVisible(true);
	}
}

