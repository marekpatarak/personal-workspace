package sk.itvkurze.zadanie6_7;

import java.util.Scanner;


public class TriedicStringovTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Zadaj tri retazce na porovnanie (po kazdom cisle odenteruj)");
		MnozinaStringov mnozina = new MnozinaStringov(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

		mnozina.zorad();

		System.out.println("Najkratsi retazec: " + mnozina.getNajkratsiRetazec());
		System.out.println("Prostredny retazec: " + mnozina.getProstrednyRetazec());
		System.out.println("Najdlhsi retazec: " + mnozina.getNajdlhsiRetazec());

	}

}
