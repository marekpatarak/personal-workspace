package sk.itvkurze.zadanie14_1;

/**
 * objekty triedy HotovOperacia predstavuju hotovostne operacie s bankovkami a
 * mincami ako napr platba a vydavok, ale mozu predstavovat aj akt stav
 * bankoviek a minci v pokladni
 */

public class HotovOperacia {
	/**
	 * atributy triedy su pocty jednotlivych bankoviek a minci v ramci operacie
	 */
	int pocet500, pocet200, pocet100, pocet50, pocet20, pocet10, pocet5, pocet2, pocet1;

	/**
	 * parametricky konstruktor pre vytvorenie objektu triedy HotovOperacia
	 */
	public HotovOperacia(int pocet500, int pocet200, int pocet100, int pocet50, int pocet20, int pocet10, int pocet5,
			int pocet2, int pocet1) {
		this.pocet500 = pocet500;
		this.pocet200 = pocet200;
		this.pocet100 = pocet100;
		this.pocet50 = pocet50;
		this.pocet20 = pocet20;
		this.pocet10 = pocet10;
		this.pocet5 = pocet5;
		this.pocet2 = pocet2;
		this.pocet1 = pocet1;
	}

	/**
	 * bezparametricky konstruktor pre vytvorenie objektu triedy HotovOperacia,
	 * nemusi byt
	 */
	public HotovOperacia() {
		this.pocet500 = 0;
		this.pocet200 = 0;
		this.pocet100 = 0;
		this.pocet50 = 0;
		this.pocet20 = 0;
		this.pocet10 = 0;
		this.pocet5 = 0;
		this.pocet2 = 0;
		this.pocet1 = 0;
	}

	/**
	 * metoda volana nad objektom triedy HotovOperacia, vracia sumu bankoviek a
	 * minci typu double
	 */
	public double spocitajOperaciu() {
		double sumaPlatba = this.pocet500 * 500 + this.pocet200 * 200 + this.pocet100 * 100 + this.pocet50 * 50
				+ this.pocet20 * 20 + this.pocet10 * 10 + this.pocet5 * 5 + this.pocet2 * 2 + this.pocet1 * 1;

		return sumaPlatba;
	}

	/**
	 * metoda volana nad objektom triedy HotovOperacia, vypise pocty bankoviek a
	 * minci v ramci daneho objektu
	 */
	public void vypisOperaciu() {
		System.out.print("Pocet 500 EUR: " + this.pocet500);
		System.out.print("; 200 EUR: " + this.pocet200);
		System.out.print("; 100 EUR: " + this.pocet100);
		System.out.print("; 50 EUR: " + this.pocet50);
		System.out.print("; 20 EUR: " + this.pocet20);
		System.out.print("; 10 EUR: " + this.pocet10);
		System.out.print("; 5 EUR: " + this.pocet5);
		System.out.print("; 2 EUR: " + this.pocet2);
		System.out.println("; 1 EUR: " + this.pocet1);

	}

	/**
	 * metoda volana nad objektom triedy HotovOperacia, pripocitava pocty bankoviek
	 * a minci jedneho objektu k druhemu
	 */
	public void pripocitajBankovky(HotovOperacia operacia) {
		this.pocet500 += operacia.pocet500;
		this.pocet200 += operacia.pocet200;
		this.pocet100 += operacia.pocet100;
		this.pocet50 += operacia.pocet50;
		this.pocet20 += operacia.pocet20;
		this.pocet10 += operacia.pocet10;
		this.pocet5 += operacia.pocet5;
		this.pocet2 += operacia.pocet2;
		this.pocet1 += operacia.pocet1;

	}

	/**
	 * metoda volana nad objektom triedy HotovOperacia, odpocitava pocty bankoviek a
	 * minci jedneho objektu od druheho
	 */
	public void odpocitajBankovky(HotovOperacia operacia) {
		this.pocet500 -= operacia.pocet500;
		this.pocet200 -= operacia.pocet200;
		this.pocet100 -= operacia.pocet100;
		this.pocet50 -= operacia.pocet50;
		this.pocet20 -= operacia.pocet20;
		this.pocet10 -= operacia.pocet10;
		this.pocet5 -= operacia.pocet5;
		this.pocet2 -= operacia.pocet2;
		this.pocet1 -= operacia.pocet1;

	}

	/**
	 * metoda volana nad objektom triedy HotovOperacia, validuje platbu overuje ci
	 * platba neobsahuje zaporny pocet niektorej z bankoviek alebo minci
	 */
	public boolean jePlatna() {
		if (this.pocet500 < 0 || this.pocet200 < 0 || this.pocet100 < 0 || this.pocet50 < 0 || this.pocet20 < 0
				|| this.pocet10 < 0 || this.pocet5 < 0 || this.pocet2 < 0 || this.pocet1 < 0) {
			return false;
		}
		return true;
	}

}
