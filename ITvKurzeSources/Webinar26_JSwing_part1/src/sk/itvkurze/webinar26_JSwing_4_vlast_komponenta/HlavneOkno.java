package sk.itvkurze.webinar26_JSwing_4_vlast_komponenta;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HlavneOkno extends JFrame {

	private JButton tlacitko;
	// vlastny typ JPanelu so scrollbarmi
	private PlochaTextAutoScrollBar plochaTextu;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		// nastavenie Layoutu HlavnehoOkna
		setLayout(new BorderLayout());

		tlacitko = new JButton("Klikni");
		tlacitko.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// volanie vlastnej metody v triede PlochaTextAutoScrollbar
				// namiesto append
				plochaTextu.vlozText("Klikol som \n");

			}
		});

		plochaTextu = new PlochaTextAutoScrollBar();

		add(plochaTextu, BorderLayout.CENTER);
		add(tlacitko, BorderLayout.SOUTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
