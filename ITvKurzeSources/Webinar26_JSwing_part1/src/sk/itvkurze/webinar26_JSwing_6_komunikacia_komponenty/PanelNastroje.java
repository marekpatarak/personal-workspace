package sk.itvkurze.webinar26_JSwing_6_komunikacia_komponenty;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelNastroje extends JPanel implements ActionListener {

	private JButton okTlacitko;
	private JButton zrusTlacitko;
	private PlochaTextAutoScrollBar textArea;

	public PanelNastroje() {
		// nastavenie ActionListenera na tlacitka
		// samotna trieda PanelNastroje implementuje ActionListener, preto this
		okTlacitko = new JButton("OK");
		okTlacitko.addActionListener(this);
		zrusTlacitko = new JButton("Zrus");
		zrusTlacitko.addActionListener(this);

		// setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new FlowLayout());

		add(okTlacitko);
		add(zrusTlacitko);
	}

	// setter pre pripojenie PlochyTextScrollBaru k PaneluNastrojov
	public void setTextPanel(PlochaTextAutoScrollBar textArea) {
		this.textArea = textArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// overenie ci objekt ktory spustil event bol JButton
		if (e.getSource() instanceof JButton) {

			// zistenie ktory objekt na zaciatku spustil event
		JButton stlaceneTlacitko = (JButton) e.getSource();

		if (stlaceneTlacitko == okTlacitko) {
			textArea.vlozText("Klikol si na tlacitko OK \n");

		} else if (stlaceneTlacitko == zrusTlacitko) {
			textArea.vlozText("Klikol si na tlacitko zrus \n");
		}
		}
	}
}
