package sk.itvkurze.zadanie7_7;

import java.util.Random;

public class MnozinaDat {
	public int[] pole = new int[100];

	public void generujMnozinu() {
		Random random = new Random();

		for (int i = 0; i <= 99; i++) {
			this.pole[i] = random.nextInt(999);
		}
	}
}

