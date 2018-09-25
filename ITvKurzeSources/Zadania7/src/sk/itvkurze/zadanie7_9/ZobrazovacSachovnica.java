package sk.itvkurze.zadanie7_9;

import javax.swing.JFrame;

public class ZobrazovacSachovnica {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("Sachovnica");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaSachovnica komponentaSachovnica = new KomponentaSachovnica();
		okno.add(komponentaSachovnica);

		okno.setVisible(true);
	}
}

