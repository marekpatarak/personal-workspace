package sk.itvkurze.zadanie7_2;

public class StrelaProjektiluTester {

	public static void main(String[] args) {

		StrelaProjektilu projektil = new StrelaProjektilu(100);

		for (int i = 1; projektil.getAktRychlost() >= 0; i++) {
			projektil.posunSimulacia();

			if (i % 100 == 0 || projektil.getAktRychlost() == 0) {
				System.out.println("Aktualna rychlost (simulacia): " + projektil.getAktRychlost());
				System.out.println("Aktualna pozicia (simulacia): " + projektil.getAktPozicia());
				System.out.println("Aktualny cas: " + projektil.getAktCas());
				System.out.println("Aktualna pozicia (vypocet): " + projektil.posunVypocet());
				System.out.println("--------------------------------------------");
			}

		}
	}
}

