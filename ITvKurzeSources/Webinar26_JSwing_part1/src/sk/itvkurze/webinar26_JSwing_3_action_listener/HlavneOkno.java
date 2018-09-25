package sk.itvkurze.webinar26_JSwing_3_action_listener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class HlavneOkno extends JFrame {

	private JButton tlacitko;
	private JTextArea plochaTextu;

	public HlavneOkno() {
		// volanie konstruktora nadtriedy JFrame
		super("Graficka aplikacia");

		setLayout(new BorderLayout());

		tlacitko = new JButton("Klikni");

		// pridanie ActionListeneru na tlacitko pomocou anonymnej triedy
		// anonymna trieda preto lebo potrebujeme mat v tomto pripade k dispozicii
		// TextAreu
		// do ktorej chceme zapisovat
		// ulohou ActionListenera je odchytavanie ActionEventov
		tlacitko.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plochaTextu.append("Klikol som \n");

			}
		});

		plochaTextu = new JTextArea();

		add(plochaTextu, BorderLayout.CENTER);
		add(tlacitko, BorderLayout.SOUTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
