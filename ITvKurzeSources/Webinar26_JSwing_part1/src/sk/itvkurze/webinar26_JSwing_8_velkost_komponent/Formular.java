package sk.itvkurze.webinar26_JSwing_8_velkost_komponent;

import java.awt.Dimension;

import javax.swing.JPanel;

public class Formular extends JPanel {

	public Formular() {
		// nastavovanie rozmerov componentu
		Dimension rozmery = getPreferredSize();
		rozmery.width = 250;
		setPreferredSize(rozmery);
	}
}
