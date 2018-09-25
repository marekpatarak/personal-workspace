package sk.itvkurze.zadanie7_6;

public class PrvocislaGenerator {

	private boolean otestujPrvoCislo(int prv) {
		int pocetDel = 0;

		for (int i = 1; i <= prv; i++) {
			if (prv % i == 0) {
				pocetDel++;
				if (pocetDel > 2) {
					return false;
				}

			}
		}
		return true;
	}

	public void najdiPrvocisla(int n) {

		for (int i = 2; i <= n; i++) {
			if (this.otestujPrvoCislo(i)) {
				System.out.println(i);
			}
		}
	}
}
