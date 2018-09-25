package sk.itvkurze.zadania05;

import javax.swing.JFrame;

public class ZobrazovacStlpce {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(1280, 800);

		okno.setTitle("Stlpcove grafy");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaStlpec komponentaStlpec = new KomponentaStlpec();
		okno.add(komponentaStlpec);

		okno.setVisible(true);
	}
}

