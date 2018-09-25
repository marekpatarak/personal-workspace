package sk.itvkurze.webinar26_JSwing_5_panel_nastroje;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HlavneOkno extends JFrame {

	private JButton tlacitko;
	private PlochaTextAutoScrollBar plochaTextu;
	private PanelNastroje panelNastroje;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		setLayout(new BorderLayout());

		tlacitko = new JButton("Klikni");
		tlacitko.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plochaTextu.vlozText("Klikol som \n");

			}
		});


		plochaTextu = new PlochaTextAutoScrollBar();
		panelNastroje = new PanelNastroje();

		add(plochaTextu, BorderLayout.CENTER);
		add(tlacitko, BorderLayout.SOUTH);
		add(panelNastroje, BorderLayout.NORTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
