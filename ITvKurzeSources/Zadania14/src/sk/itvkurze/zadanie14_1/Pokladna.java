package sk.itvkurze.zadanie14_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pokladna {
	protected static final String uctJednotka = "Tesco s.r.o.\nRaèianska 66\n89323 Bratislava";
	protected static final String pobocka = "pobocka Petrzalka";
	private Map<String, Tovar> katalog;
	protected List<Polozka> aktNakup;
	protected List<Ucet> ucty;
	protected Map<Platidlo, Integer> stavHotovKusy, aktPlatba;

	public Pokladna() {
		this.katalog = new HashMap<>();
		this.aktNakup = new ArrayList<>();
		this.ucty = new ArrayList<>();
		this.stavHotovKusy = new HashMap<>();
		for (Platidlo platidlo : Platidlo.values()) {
			this.stavHotovKusy.put(platidlo, 0);
		}

	}

	// METODY KATALOG
	// metoda nacitava katalog produktov z externej "databazy"
	public void nacitajKatalog(String link) {
		this.katalog = InputReader.readInput(link);
	}

	// metoda pridava objekt triedy Tovar do katalogu Pokladne
	public void pridajDoKatalogu(String ID, Tovar tovar) {
		this.katalog.put(ID, tovar);

	}

	// metoda odobera objekt triedy Tovar do katalogu Pokladne
	public void odoberZKatalogu(String ID) {
		this.katalog.remove(ID);

	}

	public int getPocetNakupov() {
		return ucty.size();
	}

	public void vypisStavPokladne() {
		System.out.println("*******************  Stav pokladne  ************************");
		System.out.println("Pokladna: " + pobocka);
		System.out.println("Pocet nakupov: " + getPocetNakupov());
		System.out.println("Aktualny stav kosika: ");
		this.vypisKosik();
		System.out.println("Aktualny stav hotovosti: ");
		for (Platidlo platidlo : Platidlo.values()) {
			System.out.println(platidlo + ": " + this.stavHotovKusy.get(platidlo) + " ks");
		}
		System.out.println("Suma hotovosti:" + getStavPokladneCash());

	}

	public void dotujPokladnuCash(Platidlo platidlo, Integer pocet) {
		stavHotovKusy.put(platidlo, pocet);
	}

	public double getStavPokladneCash() {
		double stavPokladneCash = 0;

		for (Platidlo platidlo : Platidlo.values()) {
			stavPokladneCash += getSumaPlatidlo(platidlo, stavHotovKusy.get(platidlo));
		}
		return stavPokladneCash;
	}



	// metoda pridava objekt Polozka do kosika Pokladne
	public void pridajDoKosika(String ID, int pocet) {
		Tovar tovar = this.katalog.get(ID);
		Polozka polozka = new Polozka(tovar, pocet);
		aktNakup.add(polozka);

	}

	// metoda odobera objekt Polozka z kosika Pokladne
	public void odoberZKosika(int index) {
		aktNakup.remove(index);

	}

	public void vyprazdniKosik() {
		aktNakup.clear();
	}


	public void vypisKatalog() {

		for (String string : katalog.keySet()) {
			System.out.println(katalog.get(string).nazov);
		}

	}

	public void vystavUcet() {
		if (this.getSumaPlatby() < this.getSumaKosik()) {

			System.out.println("Nedostatocna platba");

		} else {

			Ucet ucet = new Ucet();
			this.ucty.add(ucet);
			ucet.vypisUcet();
			double vydavok = this.getSumaPlatby() - this.getSumaKosik();

			vyprazdniKosik();

		}
	}

	public void vypisKosik() {
		System.out.println("*******************Polozky v kosiku**********************");
		for (Polozka polozka : this.aktNakup) {
			System.out.println("Pol.è." + (this.aktNakup.indexOf(polozka) + 1) + " " + polozka.toString());
		}
		System.out.println("Celkova suma kosika: " + String.format("%.2f", this.getSumaKosik()) + " EUR s DPH");
		System.out.println("*********************************************************");
	}

	public double getSumaKosik() {
		double suma = 0;
		for (Polozka polozka : this.aktNakup) {
			suma += polozka.getCenaDPH();
		}

		return suma;
	}


	///////////////////////////////////////////////////////////////////////

	public double getSumaPlatidlo(Platidlo typ, int pocet) {
		switch (typ) {
		case jedenCent:
			return pocet * 0.01;
		case dvaCent:
			return pocet * 0.02;
		case patCent:
			return pocet * 0.05;
		case desatCent:
			return pocet * 0.1;
		case dvadsatCent:
			return pocet * 0.2;
		case patdesiatCent:
			return pocet * 0.5;
		case jedenEur:
			return pocet * 1;
		case dvaEur:
			return pocet * 2;
		case patEur:
			return pocet * 5;
		case desatEur:
			return pocet * 10;
		case dvadsatEur:
			return pocet * 20;
		case patdesiatEur:
			return pocet * 50;
		case stoEur:
			return pocet * 100;
		case dvestoEur:
			return pocet * 200;
		case patstoEur:
			return pocet * 500;
		default:
			return 0;
		}
	}

	public void prijmiPlatbuCash(Platidlo typ, int pocet) {
		this.aktPlatba.put(typ, pocet);
	}

	public double getSumaPlatby() {
		double sumaPlatba = 0;

		for (Platidlo platidlo : aktPlatba.keySet()) {
			sumaPlatba += getSumaPlatidlo(platidlo, aktPlatba.get(platidlo));
		}
		return sumaPlatba;
	}


	public void prijmiPlatbuKartou() {

	}


	public void datVydavok(double vydavok) {

		return 0;
	}

}

enum Platidlo {
	jedenCent, dvaCent, patCent, desatCent, dvadsatCent, patdesiatCent, jedenEur, dvaEur, patEur, desatEur, dvadsatEur, patdesiatEur, stoEur, dvestoEur, patstoEur
}
