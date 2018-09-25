package sk.itvkurze.zadania05;

public class Motyl {
	int poloha;
	boolean smer; // vpravo je true, vlavo je false

	public Motyl(int pociatocnaPoloha) {
		this.poloha = pociatocnaPoloha;
		this.smer = true;
	}

	public void zmenSmer() {
		this.smer = !this.smer;
	}

	public void let() {
		if (smer == true) {
			this.poloha++;
		} else {
			this.poloha--;
		}
	}

	public int getPoloha() {
		return this.poloha;
	}
}
