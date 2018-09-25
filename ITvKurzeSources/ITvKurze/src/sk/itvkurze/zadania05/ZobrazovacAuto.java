package sk.itvkurze.zadania05;

import javax.swing.JFrame;

public class ZobrazovacAuto {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("Auta");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaAuto komponentaAuto = new KomponentaAuto();
		okno.add(komponentaAuto);

		okno.setVisible(true);
	}
}

