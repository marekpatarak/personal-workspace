package sk.itvkurze.webinar26_JSwing_2_BorderLayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class HlavneOkno extends JFrame {

	private JButton tlacitko;
	private JTextArea plochaTextu;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		// nastavenie Layoutu
		setLayout(new BorderLayout());

		// vytvorenie objektov tlacitka a plochy textu
		tlacitko = new JButton("Klikni");
		plochaTextu = new JTextArea();

		// pridanie objektov tlacitka a plochy textu do HlavnehoOkna (JFrame)
		add(plochaTextu, BorderLayout.SOUTH);
		add(tlacitko, BorderLayout.NORTH);

		// setup HlavnehoOkna
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
