package sk.itvkurze.webinar26_JSwing_5_panel_nastroje;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelNastroje extends JPanel {

	private JButton okTlacitko;
	private JButton zrusTlacitko;

	public PanelNastroje() {
		okTlacitko = new JButton("OK");
		zrusTlacitko = new JButton("Zrus");

		// iny typ Layoutu
		// pre JPanel je FlowLayout defaultny
		// setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new FlowLayout());

		add(okTlacitko);
		add(zrusTlacitko);
	}
}
