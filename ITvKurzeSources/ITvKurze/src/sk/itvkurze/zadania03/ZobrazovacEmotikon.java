package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class ZobrazovacEmotikon {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(400, 400);

		okno.setTitle("Zobrazovac emotikonu");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaEmotikon komponentaEmotikon = new KomponentaEmotikon();
		okno.add(komponentaEmotikon);

		okno.setVisible(true);
	}
}

