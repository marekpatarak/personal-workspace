package sk.itvkurze.zadania03;

import javax.swing.JFrame;

public class ZobrazovacStvorcov {

	public static void main(String[] args) {
		JFrame okno = new JFrame();

		okno.setSize(400, 400);

		okno.setTitle("Zobrazovac stvorcov");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaStvorec komponentaStvorec = new KomponentaStvorec();
		okno.add(komponentaStvorec);

		okno.setVisible(true);
	}
}

