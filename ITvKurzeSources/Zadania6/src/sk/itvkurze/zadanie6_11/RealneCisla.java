package sk.itvkurze.zadanie6_11;

public class RealneCisla {

	public boolean suZhodnePoZaohkruhleni(double cislo1, double cislo2) {
		boolean suZhodne = false;
		double roundOff1 = zaokruhliNaDveDesatinne(cislo1);
		double roundOff2 = zaokruhliNaDveDesatinne(cislo2);

		if (roundOff1 == roundOff2) {
			suZhodne = true;
			return suZhodne;
		} else
			return suZhodne;
	}

	public boolean lisiaSaOMenejAkoEpsilon(double cislo1, double cislo2) {
		boolean lisiaSaOMenej = false;

		if (Math.abs(cislo1 - cislo2) < 0.01) {
			lisiaSaOMenej = true;
			return lisiaSaOMenej;
		} else
			return lisiaSaOMenej;
	}

	private double zaokruhliNaDveDesatinne(double cislo) {
		return Math.round(cislo * 100.0) / 100.0;
	}

}
