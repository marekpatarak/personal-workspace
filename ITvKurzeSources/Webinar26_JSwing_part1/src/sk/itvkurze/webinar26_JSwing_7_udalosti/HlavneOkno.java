package sk.itvkurze.webinar26_JSwing_7_udalosti;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class HlavneOkno extends JFrame {

	private PlochaTextAutoScrollBar plochaTextu;
	private PanelNastroje panelNastroje;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		setLayout(new BorderLayout());


		plochaTextu = new PlochaTextAutoScrollBar();
		panelNastroje = new PanelNastroje();

		// nasetovanie TextListeneru, instanciovanie pomocou anonymnej triedy
		panelNastroje.setTextListener(new TextListener() {

			@Override
			public void nastavText(String text) {
				plochaTextu.vlozText(text);
			}
		});

		add(plochaTextu, BorderLayout.CENTER);
		add(panelNastroje, BorderLayout.NORTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
