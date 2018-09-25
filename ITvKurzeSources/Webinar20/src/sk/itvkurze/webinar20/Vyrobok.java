package sk.itvkurze.webinar20;

public class Vyrobok {

	private final String nazov;
	private final int vaha;

	public Vyrobok(String nazov, int vaha) {
		this.nazov = nazov;
		this.vaha = vaha;
	}

	public String getNazov() {
		return nazov;
	}

	public int getVaha() {
		return vaha;
	}

	@Override
	public String toString() {
		return "Vyrobok {nazov = " + nazov + ", vaha = " + vaha;
	}

}
