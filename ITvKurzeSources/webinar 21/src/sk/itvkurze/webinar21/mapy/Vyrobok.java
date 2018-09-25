package sk.itvkurze.webinar21.mapy;

import static java.util.Comparator.comparing;

import java.util.Comparator;

public class Vyrobok {

	public static final Comparator<Vyrobok> PODLA_MENA = comparing(Vyrobok::getNazov);
	public static final Comparator<Vyrobok> PODLA_VAHY = comparing(Vyrobok::getVaha);

	private final int id;
	private final String nazov;
	private final int vaha;

	public Vyrobok(final int id, final String nazov, final int vaha) {
		this.id = id;
		this.nazov = nazov;
		this.vaha = vaha;
	}

	public int getId() {
		return this.id;
	}

	public String getNazov() {
		return this.nazov;
	}

	public int getVaha() {
		return this.vaha;
	}

	@Override
	public String toString()
	{
		return "Vyrobok {id=" + id + ", nazov=" + nazov + ", vaha=" + vaha + "}";
	}

}
