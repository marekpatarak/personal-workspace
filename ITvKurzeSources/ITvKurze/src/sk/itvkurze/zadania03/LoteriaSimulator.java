package sk.itvkurze.zadania03;

import java.util.Random;

import javax.swing.JOptionPane;

//deklaracia triedy LoteriaSimulator s dvomi polami a velkostou poli
public class LoteriaSimulator {
	public int[] tipy;
	public int[] tahy;
	public int velkost;

	// konsttuktor vytvarajuci objekt loterie o n velkosti
	public LoteriaSimulator(int n) {
		this.tipy = new int[n];
		this.tahy = new int[n];
		this.velkost = n;

	}

	// metoda kontrolujuca duplikaty v ramci tipov resp. tahov
	private boolean ifDuplicates(int[] pole, int j) {
		boolean check = false;
		for (int i = j - 1; i >= 0; i--) {

			if (pole[j] == pole[i]) {
				check = true;
				break;
			}
		}
		return check;
	}

	// metoda pre natahanie vstupov
	public void nacitajTipy() {
		for (int i = 0; i < this.velkost; i++) {

			this.tipy[i] = Integer.valueOf(JOptionPane.showInputDialog("Vloz " + (i + 1) + ". cislo od 1 do 20"));

			if (this.tipy[i] > 20 || this.tipy[i] < 1) {
				System.out.println("Cislo mimo rozsah, vloz znovu");
				i--;
				continue;
			}

			if (i > 0) {
				if (ifDuplicates(this.tipy, i)) {
					System.out.println("Tipy musia byt navzajom rozne, vloz znovu");
					i--;
				}

			}
		}

	}

	// metoda pre generovanie tahov
	public void generujTahy() {
		Random generator = new Random();
		
		for (int i = 0; i < this.velkost; i++) {
			this.tahy[i] = generator.nextInt(20) + 1;

			if (i > 0) {
				if (ifDuplicates(this.tahy, i)) {
					i--;
				}

			}
		}
	}

	// metoda vyhodnocujuca objekt loterie
	public void vyhodnotLoteriu(LoteriaSimulator loteria) {
		loteria.vypisTipy();
		loteria.vypisTahy();

		int m = 0;
		for (int i = 0; i < this.velkost; i++) {
			for (int j = 0; j < this.velkost; j++) {
				if (loteria.tipy[i] == loteria.tahy[j]) {
					m++;
				}
			}
		}
		if (this.velkost - m == 0) {
			System.out.println("Si milionar !!");
		} else {
			if (this.velkost - m == 1) {
				System.out.println("Vyhravas 2. cenu!");
			} else {
				if (this.velkost - m == 2) {
					System.out.println("Vyhravas 3. cenu!");
				} else {
					System.out.println("Skus to znovu");
				}
			}
		}

		}

	// metoda na vypisanie tipov z pola
	private void vypisTipy() {
		System.out.println("Vase tipy:");
		for (int i = 0; i < this.velkost; i++) {
			System.out.print(this.tipy[i] + " ");

		}
		System.out.println();
	}

	// metoda na vypisanie tahov z pola
	private void vypisTahy() {
		System.out.println("Vyzrebovane cisla:");
		for (int i = 0; i < this.velkost; i++) {
			System.out.print(this.tahy[i] + " ");
		}
		System.out.println();
	}

}
