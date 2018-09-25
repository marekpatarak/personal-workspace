package sk.itvkurze.webinar26_JSwing_9_borders;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class HlavneOkno extends JFrame {

	private PlochaTextAutoScrollBar plochaTextu;
	private PanelNastroje panelNastroje;
	private Formular formular;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		setLayout(new BorderLayout());

		plochaTextu = new PlochaTextAutoScrollBar();
		panelNastroje = new PanelNastroje();
		formular = new Formular();

		// nasetovanie TextListeneru, instanciovanie pomocou anonymnej triedy
		panelNastroje.setTextListener(new TextListener() {

			@Override
			public void nastavText(String text) {
				plochaTextu.vlozText(text);
			}
		});

		add(plochaTextu, BorderLayout.CENTER);
		add(panelNastroje, BorderLayout.NORTH);
		add(formular, BorderLayout.WEST);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
