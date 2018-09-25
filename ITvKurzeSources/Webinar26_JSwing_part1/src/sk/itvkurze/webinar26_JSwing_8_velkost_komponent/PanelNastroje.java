package sk.itvkurze.webinar26_JSwing_8_velkost_komponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelNastroje extends JPanel implements ActionListener {

	private JButton okTlacitko;
	private JButton zrusTlacitko;
	private TextListener listener;

	public PanelNastroje() {
		okTlacitko = new JButton("OK");
		okTlacitko.addActionListener(this);
		zrusTlacitko = new JButton("Zrus");
		zrusTlacitko.addActionListener(this);

		// setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new FlowLayout());

		add(okTlacitko);
		add(zrusTlacitko);
	}

	// setter na nastavenie listeneru
	public void setTextListener(TextListener listener) {
		this.listener = listener;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		JButton stlaceneTlacitko = (JButton) e.getSource();

		if (stlaceneTlacitko == okTlacitko) {

			// pre istotu kontrola ci nie je listener null, zvykne sa robit
			if (listener != null) {

				listener.nastavText("Klikol si na tlacitko OK \n");
			}
		} else if (stlaceneTlacitko == zrusTlacitko) {

			if (listener != null) {

				listener.nastavText("Klikol si na tlacitko zrus \n");
			}
		}
	}
}
