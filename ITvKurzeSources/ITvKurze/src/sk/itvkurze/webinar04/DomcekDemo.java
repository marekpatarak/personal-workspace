package sk.itvkurze.webinar04;

import javax.swing.JFrame;

public class DomcekDemo {

	public static void main(String[] args) {
		JFrame oknoAp = new JFrame();

		oknoAp.setSize(800, 600);
		oknoAp.setTitle("Domcek Demo");

		oknoAp.setLocationRelativeTo(null);

		oknoAp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Domcek domcek = new Domcek();
		oknoAp.add(domcek);

		oknoAp.setVisible(true);
	}

}
