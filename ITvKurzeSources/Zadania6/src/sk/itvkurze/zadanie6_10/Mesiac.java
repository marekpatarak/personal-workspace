package sk.itvkurze.zadanie6_10;

public class Mesiac {
	int[] pocetDni = { 28, 30, 31 };
	int poradCislo;

	public Mesiac(int porad) {
		this.poradCislo = porad;
	}

	public int getPocetDni() {

		if (this.poradCislo == 4 || this.poradCislo == 6 || this.poradCislo == 9 || this.poradCislo == 11) {
			return pocetDni[1];
		} else {
			if (this.poradCislo == 2) {
				return pocetDni[0];
			} else
				return pocetDni[2];
		}
	}

}
