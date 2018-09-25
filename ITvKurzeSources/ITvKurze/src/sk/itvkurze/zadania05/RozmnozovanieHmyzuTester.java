package sk.itvkurze.zadania05;

public class RozmnozovanieHmyzuTester {

	public static void main(String[] args) {
		RozmnozovanieHmyzu termity = new RozmnozovanieHmyzu(1000);

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 1000");

		// 1.kolo
		termity.rozmnoz();

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 2000");

		termity.aplikujPostrek();

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 1800");

		// 2.kolo
		termity.rozmnoz();

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 3600");

		termity.aplikujPostrek();

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 3240");

		// 3.kolo
		termity.rozmnoz();

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 6480");

		termity.aplikujPostrek();

		System.out.println("Aktualny stav populacie hmyzu: " + termity.getPopulacia());
		System.out.println("Ocakavany stav populacie hmyzu: 5832");

	}

}
