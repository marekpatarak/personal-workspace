package sk.itvkurze.zadanie7_8;

import javax.swing.JFrame;

public class ZobrazovacOpilec {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(825, 850);

		okno.setTitle("Opilec");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaOpilec komponentaOpilec = new KomponentaOpilec();
		okno.add(komponentaOpilec);

		okno.setVisible(true);
	}
}

