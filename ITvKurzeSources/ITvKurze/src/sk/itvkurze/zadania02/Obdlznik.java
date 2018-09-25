package sk.itvkurze.zadania02;

public class Obdlznik {
	public int stranaA;
	public int stranaB;
	public int obvod;
	public int obsah;

	public Obdlznik(int a, int b) {
		stranaA = a;
		stranaB = b;
		obvod = vypocitajObvod(stranaA, stranaB);
		obsah = vypocitajObsah(stranaA, stranaB);
	}

	public int vypocitajObvod(int a, int b) {
		int obv;
		obv = 2 * a + 2 * b;
		return obv;
	}

	public int vypocitajObsah(int a, int b) {
		int obs;
		obs = a * b;
		return obs;
	}

	public int getStranaA() {
		return stranaA;
	}

	public int getStranaB() {
		return stranaB;
	}

	public int getObvod() {
		return obvod;
	}

	public int getObsah() {
		return obsah;
	}
}
