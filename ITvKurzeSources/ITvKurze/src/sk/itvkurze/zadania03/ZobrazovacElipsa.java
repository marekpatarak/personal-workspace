package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class ZobrazovacElipsa {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(300, 300);

		okno.setTitle("Zobrazovac elipsy");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaElipsa komponentaElipsa = new KomponentaElipsa();
		okno.add(komponentaElipsa);

		okno.setVisible(true);
	}
}

