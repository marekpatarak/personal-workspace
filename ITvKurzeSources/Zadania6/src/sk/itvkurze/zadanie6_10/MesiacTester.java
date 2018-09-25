package sk.itvkurze.zadanie6_10;

import java.util.Scanner;

public class MesiacTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj poradove cislo mesiaca (1-12)");
		Mesiac mesiac = new Mesiac(scanner.nextInt());

		if (mesiac.getPocetDni() == 28) {
			System.out.println(
					mesiac.getPocetDni() + " dni alebo v prestupnom roku " + (mesiac.getPocetDni() + 1) + " dni");

		} else {

			System.out.println(mesiac.getPocetDni() + " dni");

		}

	}

}
