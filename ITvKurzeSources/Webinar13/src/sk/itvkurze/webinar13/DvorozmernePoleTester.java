package sk.itvkurze.webinar13;

import java.util.Random;

public class DvorozmernePoleTester {

	public static void main(String[] args) {

		int[][] kinosala = vytvorKinosalu(4, 4);
		naplnKinosalu(kinosala);
		
		for (int i = 0; i < kinosala[0].length; i++) {
			for (int j = 0; j < kinosala[1].length; j++) {
				System.out.println("pole " + kinosala[i][j]);
			}
		}
		System.out.println(vypocitajVekovyPriemer(kinosala));
		
		

	}

	private static int[][] vytvorKinosalu(int i, int j) {
		int[][] kinosala = new int[i][j];
		return kinosala;
	}

	private static int[][] naplnKinosalu(int[][] kinosala) {
		Random random = new Random();

		for (int i = 0; i < kinosala[0].length; i++) {
			for (int j = 0; j < kinosala[1].length; j++) {
				kinosala[i][j] = random.nextInt(87) + 18;
			}
		}
		return kinosala;

	}

	private static int vypocitajVekovyPriemer(int[][] kinosala) {
		int sucet = 0;
		for (int i = 0; i < kinosala[0].length; i++) {
			for (int j = 0; j < kinosala[1].length; j++) {
				sucet += kinosala[i][j];
			}
		}
		return sucet / kinosala.length / kinosala.length;

	}

}
