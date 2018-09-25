package sk.itvkurze.zadania05;

public class VyrobokTester {

	public static void main(String[] args) {
		// vytvorenie vyrobkov
		Vyrobok vyrobok1 = new Vyrobok("Chladnicka", 199.99);
		Vyrobok vyrobok2 = new Vyrobok("Mraznicka", 159.99);

		// vypisanie vyrobkov
		vyrobok1.vypisVyrobok();
		vyrobok2.vypisVyrobok();

		// znizenie cien o 5 eur
		vyrobok1.znizCenu(5);
		vyrobok2.znizCenu(5);

		// vypisanie vyrobkov
		vyrobok1.vypisVyrobok();
		vyrobok2.vypisVyrobok();

		// znizenie cien o 5 eur
		vyrobok1.znizCenu(9.8);
		vyrobok2.znizCenu(5.5);

		// vypisanie vyrobkov
		vyrobok1.vypisVyrobok();
		vyrobok2.vypisVyrobok();
	}

}
