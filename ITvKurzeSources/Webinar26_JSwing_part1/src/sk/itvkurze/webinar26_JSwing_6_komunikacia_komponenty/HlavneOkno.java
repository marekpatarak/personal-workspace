package sk.itvkurze.webinar26_JSwing_6_komunikacia_komponenty;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class HlavneOkno extends JFrame {

	private PlochaTextAutoScrollBar plochaTextuScrollBar;
	private PanelNastroje panelNastroje;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		setLayout(new BorderLayout());

		plochaTextuScrollBar = new PlochaTextAutoScrollBar();
		panelNastroje = new PanelNastroje();

		// volanie vlastnej metody def v triede PanelNastroje
		// nastavenie plochyTextuScrollBar do PanelNastrojov
		// robime to preto, lebo sa potrebujeme dostat k akciam buttonov
		// ktore su v ramci PaneluNastrojov
		panelNastroje.setTextPanel(plochaTextuScrollBar);

		add(plochaTextuScrollBar, BorderLayout.CENTER);
		add(panelNastroje, BorderLayout.NORTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
