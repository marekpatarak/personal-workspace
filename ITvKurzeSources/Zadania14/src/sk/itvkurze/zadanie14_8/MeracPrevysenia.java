package sk.itvkurze.zadanie14_8;

public class MeracPrevysenia {

	private double pociatPoloha, aktualPoloha;
	private double prevysenieMetre;

	public MeracPrevysenia() {
		this.pociatPoloha = 0;
		this.aktualPoloha = 0;
		this.prevysenieMetre = 0;
	}

	public double getPrevyseniePerc() {
		if (this.aktualPoloha == 0 || this.prevysenieMetre == 0) {
			System.out.println("Nebol zadany niektory zo vstupov alebo boli vstupy neplatne");
			return 0;
		} else {

		return (this.prevysenieMetre / (this.aktualPoloha - this.pociatPoloha)) * 100;
		}
	}

	public void setAktualPoloha(double aktPoloha) {
		if (aktPoloha < this.pociatPoloha || aktPoloha < 0) {
			System.out.println("Neplatny vstup");
		} else {
			this.aktualPoloha = aktPoloha;
		}
	}

	public void setPrevysenieMetre(double prevysenieMetre) {
		if (prevysenieMetre < 0) {
			System.out.println("Neplatny vstup");
		} else {
			this.prevysenieMetre = prevysenieMetre;
		}
	}


}
