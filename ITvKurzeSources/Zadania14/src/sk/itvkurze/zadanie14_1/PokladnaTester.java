package sk.itvkurze.zadanie14_1;

public class PokladnaTester {

	public static void main(String[] args) {

		Pokladna pokladna = new Pokladna("pobocka Petrzalka");
		pokladna.nacitajKatalog("C://workspace/Zadania14/src/sk/itvkurze/zadanie14_1/katalog.txt");
		pokladna.pridajDoKatalogu("0006", new Tovar("0006", "Rajo maslo", 3.50, 10.00));
		pokladna.vypisKatalog();






	}

}
