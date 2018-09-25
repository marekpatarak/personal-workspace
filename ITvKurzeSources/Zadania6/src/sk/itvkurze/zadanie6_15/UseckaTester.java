package sk.itvkurze.zadanie6_15;

public class UseckaTester {

	public static void main(String[] args) {
		Usecka usecka1 = new Usecka(1, 1, 0.5);
		Usecka usecka2 = new Usecka(1, 1, 1, 2);
		Usecka usecka3 = new Usecka(0.5, -1);
		Usecka usecka4 = new Usecka(1);

		System.out.println(usecka1.rovnaSa(usecka2));
		System.out.println("Ocakavana hodnota: false");
		System.out.println(usecka2.rovnaSa(usecka4));
		System.out.println("Ocakavana hodnota: true");
		System.out.println(usecka1.pretina(usecka2));
		System.out.println("Ocakavana hodnota: true");
		System.out.println(usecka1.pretina(usecka3));
		System.out.println("Ocakavana hodnota: false");

	}

}
