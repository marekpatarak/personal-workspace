package sk.itvkurze.zadanie26_6;


public class SporiaciUcet extends BankovyUcet {
	private double urokovaSadzba;

	public SporiaciUcet(double urokovaSadzba) {
		this.urokovaSadzba = urokovaSadzba;
	}

	public void pripisUrok() {
		double urok = this.zostatok * this.urokovaSadzba / 100;
		this.zostatok += urok;
	}
}
