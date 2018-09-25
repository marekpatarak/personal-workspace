package sk.itvkurze.zadania05;

public class SporiaciUcet {
	private double stavUctu;
	private double urokovaSadzba;

	public SporiaciUcet(double stavUctu, double sadzba) {
		this.stavUctu = stavUctu;
		this.urokovaSadzba = sadzba;
	}

	public double getStavUctu() {
		return stavUctu;
	}

	public void vkladUcet(double vklad) {
		this.stavUctu += vklad;
	}

	public void vyberUcet(double vyber) {
		this.stavUctu -= vyber;
	}

	public void zapisUrok() {
		this.stavUctu += (this.stavUctu * this.urokovaSadzba / 100);
	}

}
