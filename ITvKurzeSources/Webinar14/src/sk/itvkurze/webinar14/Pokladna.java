package sk.itvkurze.webinar14;

/**
 * Trieda Pokladna nacita objekt z triedy Tovar, zaroven moze prijat hotovost a
 * vypisat sumar nakupu
 */

public class Pokladna {
	/**
	 * vsetky atributy triedy su private, aby k nim nebol pristup mimo triedy
	 * Tovar[] kosik: predstavuje pole objektov typu Tovar, ide o nakupny kosik
	 * aktualneho nakupu double sumaDennyObrat: predstavuje celkovu sumu vsetkych
	 * nakupov double sumaAktKosik: suma aktualneho nakupu (tovarov v kosiku) int
	 * pocetTovarovAktKosik: pocet tovarov aktualne v kosiku int pocetNakupov:
	 * celkovy pocet vsetkych nakupov HotovOperacia stavBankoviek : stav
	 * jednotlivych platidiel (bankoviek a minci) v pokladni
	 */

	private Tovar[] kosik;
	private double sumaDennyObrat, sumaAktKosik;
	private int pocetTovarovAktKosik, pocetNakupov;
	private double cashAktStav;
	private HotovOperacia stavBankoviek;

	/**
	 * parametricky konstruktor v ramci ktore sa inicializuju atributy,
	 * stavBankoviek podla potreby
	 */
	public Pokladna() {
		this.pocetTovarovAktKosik = 0;
		this.pocetNakupov = 0;
		this.kosik = new Tovar[1000];
		this.sumaAktKosik = 0;
		this.sumaDennyObrat = 0;
		this.stavBankoviek = new HotovOperacia(2, 4, 6, 8, 10, 12, 14, 16, 18);
		this.cashAktStav = this.stavBankoviek.spocitajOperaciu();
	}

	/**
	 * Getre pre class atributy
	 */
	public double getTotalObrat() {
		return sumaDennyObrat;
	}

	public int getPocetTovarov() {
		return pocetTovarovAktKosik;
	}

	public int getPocetNakupov() {
		return pocetNakupov;
	}

	public double getCashAktStav() {
		return cashAktStav;
	}

	/**
	 * Public metoda volana na objekt nacita objekt z triedy Tovar do akt kosika
	 */
	public void nacitajTovar(Tovar tovar) {
		this.sumaAktKosik += tovar.cena;
		this.kosik[pocetTovarovAktKosik] = tovar;
		this.pocetTovarovAktKosik++;
	}

	/**
	 * Public void metoda volana na objekt vypise akt obsah kosika a celkovu sumu
	 */
	public void vypisObsahKosika() {

		for (int i = 0; i < this.pocetTovarovAktKosik; i++) {
			System.out.println(this.kosik[i].znacka + " " + this.kosik[i].typ + " " + this.kosik[i].cena);
		}
		System.out.println("Suma celkom: " + this.sumaAktKosik);
	}

	/**
	 * Public void metoda volana na objekt zvysi pocetNakupov vypise porad cislo
	 * uctu a pocet poloziek na ucte vypsie obsah kosika resp uctu pripocita sumu v
	 * kosiku k dennemu obratu zresetuje pokladnu
	 */

	private void vystavUcet() {
		this.pocetNakupov++;
		System.out.println("Ucet c." + getPocetNakupov());
		System.out.println("Pocet poloziek: " + getPocetTovarov());
		this.vypisObsahKosika();
		this.sumaDennyObrat += this.sumaAktKosik;
		this.resetPokladne();
	}

	/**
	 * Public void metoda prijima ako parametre pocty jednotlivych platidiel vytvara
	 * objekt platba typu HotovOperacia, vypocita zaplatenu sumu a sumu vydavku
	 * validuje platbu (ci su hodnoty vsetkych platidiel >= 0 a ci je platba
	 * dostatocna pre akt nakup) zavola metodu vystavUcet() na uzavretie uctu
	 * pripocita prijate platidla k akt stavu v pokladni vypise zaplatenu sumu a
	 * skladbu platidiel zavolanim metody vypisOperaciu()
	 * 
	 * vytvara novy objekt vydavok typu HotovOperacia zavolanim metody
	 * generujVydavok() vypise sumu vydavku a skladbu platidiel zavolanim metody
	 * vypisOperaciu() odpocita vydane platidla od akt stavu v pokladni bankovky k
	 * akt stavom bankoviek vypocita vydavok, vypise vydavok pripocita rozdiel medzi
	 * platbou a vydavkom zresetuje pokladnu
	 */
	public void zaplat(int pocet500, int pocet200, int pocet100, int pocet50, int pocet20, int pocet10, int pocet5,
			int pocet2, int pocet1) {

		HotovOperacia platba = new HotovOperacia(pocet500, pocet200, pocet100, pocet50, pocet20, pocet10, pocet5,
				pocet2, pocet1);
		double sumaPlatba = platba.spocitajOperaciu();
		double sumaVydavok = sumaPlatba - this.sumaAktKosik;

		if (platba.jePlatna() && sumaPlatba >= this.sumaAktKosik && this.sumaAktKosik > 0) {

			this.cashAktStav += this.sumaAktKosik;
			vystavUcet();
			this.stavBankoviek.pripocitajBankovky(platba);
			System.out.println("Zaplatené: " + sumaPlatba);
			platba.vypisOperaciu();

			HotovOperacia vydavok = generujVydavok(sumaVydavok);
			System.out.println("Vydavok: " + sumaVydavok);
			vydavok.vypisOperaciu();

			this.stavBankoviek.odpocitajBankovky(vydavok);
			System.out.println();

		} else {

			System.out.println("V kosiku nie je ziadny tovar alebo bola vlozena nepovolena alebo nedostatocna platba");
		}
	}


	/**
	 * private metoda s navratovym typom HotovOperacia prijima ako parameter sumu
	 * vydavku typu double vracia objekt triedy HotovOperacia, reprezentaciu sumy
	 * vydavku v pracuje len s celymi cislami
	 */
	private HotovOperacia generujVydavok(double sumaVydavok) {

		int medzisucet = (int) sumaVydavok;
		HotovOperacia vydavok = new HotovOperacia(0, 0, 0, 0, 0, 0, 0, 0, 0);

		while (medzisucet > 0) {
			if (medzisucet / 500 > 0) {
				vydavok.pocet500 = medzisucet / 500;
				medzisucet -= vydavok.pocet500 * 500;
			} else {
				if (medzisucet / 200 > 0) {
					vydavok.pocet200 = medzisucet / 200;
					medzisucet -= vydavok.pocet200 * 200;
				} else {
					if (medzisucet / 100 > 0) {
						vydavok.pocet100 = medzisucet / 100;
						medzisucet -= vydavok.pocet100 * 100;
					} else {
						if (medzisucet / 50 > 0) {
							vydavok.pocet50 = medzisucet / 50;
							medzisucet -= vydavok.pocet50 * 50;
						} else {
							if (medzisucet / 20 > 0) {
								vydavok.pocet20 = medzisucet / 20;
								medzisucet -= vydavok.pocet20 * 20;
							} else {
								if (medzisucet / 10 > 0) {
									vydavok.pocet10 = medzisucet / 10;
									medzisucet -= vydavok.pocet10 * 10;
								} else {
									if (medzisucet / 5 > 0) {
										vydavok.pocet5 = medzisucet / 5;
										medzisucet -= vydavok.pocet5 * 5;
									} else {
										if (medzisucet / 2 > 0) {
											vydavok.pocet2 = medzisucet / 2;
											medzisucet -= vydavok.pocet2 * 2;
										} else {
											if (medzisucet / 1 > 0) {
												vydavok.pocet1 = medzisucet / 1;
												medzisucet -= vydavok.pocet1 * 1;
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}
		return vydavok;
	}


	/**
	 * Metoda vypise sumar nakupu na std.output
	 */
	public void vypisSumar() {
		System.out.println("Celkovy denny obrat je: " + getTotalObrat());
		System.out.println("Celkovy pocet transakcii je: " + getPocetNakupov());
		System.out.println("Priemerna hodnota nakupu je: " + getTotalObrat() / getPocetNakupov());
		System.out.println("Aktualny stav v pokladni je: " + getCashAktStav());

	}

	/**
	 * Metoda zresetuje class atributy
	 */
	public void resetPokladne() {
		this.sumaAktKosik = 0;
		this.pocetTovarovAktKosik = 0;
		this.kosik = new Tovar[1000];
	}

}
