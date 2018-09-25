package sk.itvkurze.webinar20;

import java.util.Comparator;

public class Vyrobok {

	private String nazov;
	private int vaha;

	public static final PodlaHmotnosti PODLA_HMOTNOSTI = new PodlaHmotnosti();

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

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public void setVaha(int vaha) {
		this.vaha = vaha;
	}

	@Override
	public String toString() {
		return "Vyrobok {nazov=" + nazov + ", vaha=" + vaha + "}";
	}

	private static class PodlaHmotnosti implements Comparator<Vyrobok> {

		@Override
		public int compare(Vyrobok o1, Vyrobok o2) {
			if (o1.getVaha() < o2.getVaha()) {
				return -1;
			} else if (o1.getVaha() == o2.getVaha()) {
				return 0;
			}
			return 1;

			// kratsi zapis :-)
			// return Integer.compare(o1.getVaha(), o2.getVaha());
		}
	}
}
