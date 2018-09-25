package sk.itvkurze.zadania05;

public class BankovyUcet {
	private double stavUctu;
	private int pocetTrans;

	public BankovyUcet() {
		this.stavUctu = 10;
	}

	public BankovyUcet(double stavUctu) {
		this.stavUctu = stavUctu + 10;
	}

	public double getStavUctu() {
		return this.stavUctu;
	}

	public int getPocetTrans() {
		return this.pocetTrans;
	}

	public void vkladUcet(double vklad) {
		if (vklad <= 0) {
			System.out.println("Nepovoleny vklad, suma vkladu musi byt vacsia ako 0 EUR");
		} else {

		this.stavUctu += vklad;
		this.zauctujPoplatok(1);
		this.zvysPocetTrans();
		}
	}


	public void vyberUcet(double vyber) {
		if (vyber <= 0) {
			System.out.println("Nepovoleny vyber, suma vyberu musi byt vacsia ako 0 EUR");
		} else {

			if ((this.stavUctu - vyber) < 0) {
				System.out.println("Nepovoleny vyber, zostatok po transakcii musi byt rovna alebo vacsi ako 0 EUR");
			} else {

		this.stavUctu -= vyber;
		this.zauctujPoplatok(2);
		this.zvysPocetTrans();
			}
		}
	}

	private void zauctujPoplatok(double poplatok) {
		this.stavUctu -= poplatok;
	}

	private void zvysPocetTrans() {
		this.pocetTrans++;
	}

	public void zapisUrok(double sadzba) {
		this.stavUctu += this.stavUctu * sadzba / 100;
		this.zvysPocetTrans();
	}

}
