package sk.itvkurze.zadania05;

import javax.swing.JFrame;

public class ZobrazovacOlympKruhy {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("Olympijske kruhy");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaOlympKruhy komponentaOH = new KomponentaOlympKruhy();
		okno.add(komponentaOH);

		okno.setVisible(true);
	}
}

