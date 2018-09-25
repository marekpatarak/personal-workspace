package sk.itvkurze.zadania05;

public class AutoTester {

	public static void main(String[] args) {
		// vytvorenie auta so spotrebou 6 litrov na 100 km
		Auto nissan = new Auto(6.0);

		// tankovanie 60 litrov
		nissan.natankuj(60);

		// jazda 300 km
		nissan.jazdi(300);

		// vypisanie stavu nadrze a tachometra po 300 km
		System.out.println("Stav nadrze po 300 km je: " + nissan.getStavNadrze() + " litrov");
		System.out.println("Ocakavany vystup je: 42 litrov");
		System.out.println("Stav tachometra je: " + nissan.getStavTachometra() + " km");
		System.out.println("Ocakavany vystup je: 300 km");
		System.out.println();

		// jazda 200 km
		nissan.jazdi(200);

		// vypisanie stavu nadrze a tachometra po 500 km
		System.out.println("Stav nadrze po 500 km je: " + nissan.getStavNadrze() + " litrov");
		System.out.println("Ocakavany vystup je: 30 litrov");
		System.out.println("Stav tachometra je: " + nissan.getStavTachometra() + " km");
		System.out.println("Ocakavany vystup je: 500 km");
		System.out.println();

		// na dialnici stupla spotreba na 10 litrov na 100 km
		nissan.setSpotreba(10);

		// jazda 200 km na dialnici
		nissan.jazdi(200);

		// vypisanie stavu nadrze po 300 km na dialnici
		System.out.println(
				"Stav nadrze po 500 km na okreske a 200 km na dialnici je: " + nissan.getStavNadrze() + " litrov");
		System.out.println("Ocakavany vystup je: 10 litrov");
		System.out.println("Stav tachometra je: " + nissan.getStavTachometra() + " km");
		System.out.println("Ocakavany vystup je: 700 km");
		System.out.println();

		// pokus prejst dalsich 110 km na dialnici
		nissan.jazdi(110);
		System.out.println("Stav nadrze je " + nissan.getStavNadrze() + " litrov");
		System.out.println("Ocakavany vystup je: 0 litrov");
		System.out.println("Stav tachometra je: " + nissan.getStavTachometra() + " km");
		System.out.println("Ocakavany vystup je: 800 km");
		System.out.println();

		// pokus jazdit dalej
		nissan.jazdi(10);
		System.out.println("Stav nadrze je " + nissan.getStavNadrze() + " litrov");
		System.out.println("Ocakavany vystup je: 0 litrov");
		System.out.println("Stav tachometra je: " + nissan.getStavTachometra() + " km");
		System.out.println("Ocakavany vystup je: 800 km");

	}

}
