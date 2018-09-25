package sk.itvkurze.zadania03;

import javax.swing.JOptionPane;

public class LoteriaSimulatorTester {

	public static void main(String[] args) {
		boolean on = true;
		int velkost = 0;

		while (on) {
			int n = Integer.valueOf(JOptionPane.showInputDialog("Na kolko cisel chces loteriu hrat ? (od 6 do 10)"));

			if (n < 6 || n > 10) {
				System.out.println("Hra je mozna so 6 az 10 cislami");

			} else {
				on = false;
				velkost = n;
			}
		}

		LoteriaSimulator keno = new LoteriaSimulator(velkost);

		keno.nacitajTipy();
		keno.generujTahy();

		keno.vyhodnotLoteriu(keno);

	}
}


