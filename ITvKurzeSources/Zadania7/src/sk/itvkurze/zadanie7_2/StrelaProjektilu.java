package sk.itvkurze.zadanie7_2;

public class StrelaProjektilu {
	private int pocetIteracii;
	private double pociatRychlost, aktPozicia, aktRychlost, aktCas;
	public static final double deltaT = 0.01;
	public static final double g = 9.81;

	/**
	 * Vytvara novu strelu projektilu s aktualnou pozicou 0.
	 * 
	 * @param pociatRychlost
	 *            pociatocna rychlost projektilu
	 */
	public StrelaProjektilu(double pociatRychlost) {
		setAktPozicia(0);
		setAktCas(0);
		setAktRychlost(pociatRychlost);
		setPociatRychlost(pociatRychlost);
		setPocetIteracii(0);
	}

	/**
	 * metoda posunSimulacia() zvysuje pocet iteracii nastavuje akt poziciu v ramci
	 * simulacie nastavuje akt rychlost v ramci simulacie nastavuje ubehnuty cas od
	 * zaciatku simulacie
	 */

	public void posunSimulacia() {
		setPocetIteracii(getPocetIteracii() + 1);
		setAktPozicia(getAktPozicia() + (getAktRychlost() * deltaT));
		setAktRychlost(getAktRychlost() - (g * deltaT));
		setAktCas(getPocetIteracii() * deltaT);
	}

	/**
	 * metoda posunVypocet() pocita akt poziciu vypocitanu vzorcom
	 * 
	 */

	public double posunVypocet() {
		return (-0.5 * g * Math.pow(getAktCas(), 2)) + (getPociatRychlost() * getAktCas());
	}


	/**
	 * gettre a settre
	 * 
	 */

	private void setPocetIteracii(int pocetIteracii) {
		this.pocetIteracii = pocetIteracii;
	}

	private void setPociatRychlost(double pociatRychlost) {
		this.pociatRychlost = pociatRychlost;
	}

	private void setAktPozicia(double aktPozicia) {
		this.aktPozicia = aktPozicia;
	}

	private void setAktRychlost(double aktRychlost) {
		this.aktRychlost = aktRychlost;
	}

	private void setAktCas(double aktCas) {
		this.aktCas = aktCas;
	}

	private int getPocetIteracii() {
		return pocetIteracii;
	}

	private double getPociatRychlost() {
		return pociatRychlost;
	}

	public double getAktPozicia() {
		return aktPozicia;
	}

	public double getAktRychlost() {
		return aktRychlost;
	}

	public double getAktCas() {
		return aktCas;
	}

}
