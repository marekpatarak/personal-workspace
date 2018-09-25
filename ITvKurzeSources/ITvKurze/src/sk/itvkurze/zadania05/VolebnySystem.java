package sk.itvkurze.zadania05;

public class VolebnySystem {
	private int hlasyPravice;
	private int hlasyLavice;

	public VolebnySystem() {
		this.hlasyLavice = 0;
		this.hlasyPravice = 0;
	}

	public void hlasujLavica() {
		this.hlasyLavice++;
	}

	public void hlasujPravica() {
		this.hlasyPravice++;
	}

	private int getStavPravice() {
		return this.hlasyPravice;
	}

	private int getStavLavice() {
		return this.hlasyLavice;
	}

	private void setStavLavice(int stav) {
		this.hlasyLavice = 0;
	}

	private void setStavPravice(int stav) {
		this.hlasyPravice = 0;
	}

	public void zresetujStav() {
		this.setStavLavice(0);
		this.setStavPravice(0);
	}

	public void vypisAktStav() {
		System.out.println("Aktualny stav hlasov pravice: " + this.getStavPravice());
		System.out.println("Aktualny stav hlasov lavice: " + this.getStavLavice());

	}

}
