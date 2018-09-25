package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class FarbyDemo {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(400, 400);

		okno.setTitle("Farby");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaFarby komponentaFarby = new KomponentaFarby();
		okno.add(komponentaFarby);

		okno.setVisible(true);
	}
}

