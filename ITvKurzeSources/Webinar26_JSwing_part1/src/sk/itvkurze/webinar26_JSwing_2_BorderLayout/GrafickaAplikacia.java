package sk.itvkurze.webinar26_JSwing_2_BorderLayout;

import javax.swing.SwingUtilities;

public class GrafickaAplikacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pouzitie vo viacvlaknovych aplikaciach
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// HlavneOkno dedi od JFrame, setup je v konstruktore HlavneOkno
				new HlavneOkno();
			}
		});

	}

}
