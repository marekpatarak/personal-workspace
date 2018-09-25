package sk.itvkurze.zadanie14_6;

import java.util.Scanner;

public class GeometriaTester {

	public static void main(String[] args) {

		double r, v;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj polomer: ");
		r = scanner.nextDouble();
		System.out.println("Zadaj vysku: ");
		v = scanner.nextDouble();

		Tvar gula = new Gula(r);
		Tvar kuzel = new Kuzel(r, v);
		Tvar valec = new Valec(r, v);

		System.out.println("Objem gule je: " + gula.getObjem());
		System.out.println("Povrch gule je: " + gula.getPovrch());
		System.out.println("--------------------------------------------------------");
		System.out.println("Objem valca je: " + valec.getObjem());
		System.out.println("Povrch valca je: " + valec.getPovrch());
		System.out.println("--------------------------------------------------------");
		System.out.println("Objem kuzela je: " + kuzel.getObjem());
		System.out.println("Povrch kuzela je: " + kuzel.getPovrch());
	}

}
