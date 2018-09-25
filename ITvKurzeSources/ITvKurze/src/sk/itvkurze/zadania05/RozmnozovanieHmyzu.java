package sk.itvkurze.zadania05;

public class RozmnozovanieHmyzu {
	private double populacia;

	public RozmnozovanieHmyzu(double pociatPopulacia) {
		this.populacia = pociatPopulacia;
	}

	public void rozmnoz() {
		this.populacia += this.populacia;
	}

	public void aplikujPostrek() {
		this.populacia = this.populacia * 0.9;
	}

	public double getPopulacia() {
		return this.populacia;
	}
}
