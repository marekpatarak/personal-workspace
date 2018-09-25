package sk.itvkurze.zadanie14_7;

import java.util.Scanner;

public class GeometriaTester {

	public static void main(String[] args) {

		// paramA >> polomer pri guli, valci a kuzeli, poloos A pri elipse
		// paramB >> vyska pri valci a kuzeli, poloos B pri elipse

		double paramA, paramB;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj parameter A: ");
		paramA = scanner.nextDouble();
		System.out.println("Zadaj parameter B: ");
		paramB = scanner.nextDouble();

		Tvar3D gula = new Gula(paramA);
		Tvar3D kuzel = new Kuzel(paramA, paramB);
		Tvar3D valec = new Valec(paramA, paramB);
		Tvar2D elipsa = new Elipsa(paramA, paramB);

		gula.vypisAtributy();
		System.out.println("--------------------------------------------------------");
		kuzel.vypisAtributy();
		System.out.println("--------------------------------------------------------");
		valec.vypisAtributy();
		System.out.println("--------------------------------------------------------");
		elipsa.vypisAtributy();
	}

}
