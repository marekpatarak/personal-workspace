package sk.itvkurze.zadanie14_5;

import java.util.Scanner;

public class GeometriaUtilsTester {

	public static void main(String[] args) {
		double r, v;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj polomer: ");
		r = scanner.nextDouble();
		System.out.println("Zadaj vysku: ");
		v = scanner.nextDouble();

		System.out.println("Objem gule je: " + GeometriaUtils.vypocitajObjemGule(r));
		System.out.println("Povrch gule je: " + GeometriaUtils.vypocitajPovrchGule(r));
		System.out.println("--------------------------------------------------------");
		System.out.println("Objem valca je: " + GeometriaUtils.vypocitajObjemValca(r, v));
		System.out.println("Povrch valca je: " + GeometriaUtils.vypocitajPovrchValca(r, v));
		System.out.println("--------------------------------------------------------");
		System.out.println("Objem kuzela je: " + GeometriaUtils.vypocitajObjemRotacnehoKuzela(r, v));
		System.out.println("Povrch kuzela je: " + GeometriaUtils.vypocitajPovrchRotacnehoKuzela(r, v));

	}

}
