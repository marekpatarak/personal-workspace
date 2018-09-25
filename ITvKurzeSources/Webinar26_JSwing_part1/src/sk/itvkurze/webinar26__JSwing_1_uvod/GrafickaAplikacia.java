package sk.itvkurze.webinar26__JSwing_1_uvod;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GrafickaAplikacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pouzitie vo viacvlaknovych aplikaciach
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// vytvorenie objektu oknaw
				JFrame okno = new JFrame("Graficka apka");
				// nastavenie vysky a sirky okna
				okno.setSize(400, 400);
				// nastavenie viditelnosti okna
				okno.setVisible(true);
				// nastavenie akcie po zatvoreni okna
				okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// ak null, vycentrovane na stred monitora
				okno.setLocationRelativeTo(null);
				// nastavenie resizovatelnosti okna
				okno.setResizable(false);

			}
		});

	}

}
