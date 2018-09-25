package sk.itvkurze.webinar21.prioritna_fronta;

public class Poziadavka {

	private final Zakaznik zakaznik;
	private final TypProblemu typProblemu;

	public Poziadavka(final Zakaznik zakaznik, final TypProblemu typProblemu) {
		this.zakaznik = zakaznik;
		this.typProblemu = typProblemu;
	}

	public Zakaznik getZakaznik() {
		return this.zakaznik;
	}

	public TypProblemu getTypProblemu() {
		return this.typProblemu;
	}

	@Override
	public String toString() {
		return "Poziadavka {zakaznik=" + zakaznik + ", typProblemu=" + typProblemu + "}";
	}
}
