package sk.itvkurze.webinar26_JSwing_3_action_listener;

import javax.swing.SwingUtilities;

public class GrafickaAplikacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pouzitie vo viacvlaknovych aplikaciach
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new HlavneOkno();
			}
		});

	}

}
