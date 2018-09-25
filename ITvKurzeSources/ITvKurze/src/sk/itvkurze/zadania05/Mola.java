package sk.itvkurze.zadania05;

public class Mola {
	double poloha;

	public Mola(double pociatocnaPoloha) {
		this.poloha = pociatocnaPoloha;
	}

	public void letZaSvetlom(double poziciaSvetla) {
		this.poloha -= (this.poloha - poziciaSvetla) / 2;
		}

	public double getPoloha() {
		return this.poloha;
	}
}
