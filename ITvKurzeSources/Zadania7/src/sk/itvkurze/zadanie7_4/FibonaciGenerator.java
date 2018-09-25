package sk.itvkurze.zadanie7_4;

public class FibonaciGenerator {

	public int generujNteCislo(int n) {
		int clenNminus1 = 0;
		int clenN = 1;

		for (int i = 0; i <= n - 2; i++) {
			clenN = clenN + clenNminus1;
			clenNminus1 = clenN - clenNminus1;
		}
		return clenN;
	}
}
