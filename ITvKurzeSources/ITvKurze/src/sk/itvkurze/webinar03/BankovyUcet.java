package sk.itvkurze.webinar03;

public class BankovyUcet {
	String nazovUctu;
	double stavUctu;

	public BankovyUcet() {
		nazovUctu = "Bezny ucet";
		stavUctu = 5;
	}

	public BankovyUcet(String nazovUctu) {
		this.nazovUctu = nazovUctu;
		this.stavUctu = 0;

	}

	public BankovyUcet(String nazovUctu, double stavUctu) {
		this.nazovUctu = nazovUctu;
		this.stavUctu = stavUctu;

	}

	public void vypisInfo() {
		System.out.println("Nazov uctu:" + this.nazovUctu + ", stav uctu:" + this.stavUctu);
	}

}


