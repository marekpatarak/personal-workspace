package sk.itvkurze.zadania05;

import javax.swing.JFrame;

public class ZobrazovacDomu {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(600, 600);

		okno.setTitle("Domy");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaDom komponentaDom = new KomponentaDom();
		okno.add(komponentaDom);

		okno.setVisible(true);
	}
}

