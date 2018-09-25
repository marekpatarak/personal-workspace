package sk.itvkurze.zadanie6_8;

public class KalkulackaDane {
	double[] sadzbyZenaty = { 0.15, 0.1, 0.1 };
	double[] sadzbySlobodny = { 0.20, 0.25, 0.3 };
	int[] hranice = { 0, 6000, 12000 };

	public KalkulackaDane() {

	}

	public double getDan(double prijem, String stav) {
		double dan = 0;
		if (stav.equals("zenaty") || stav.equals("vydata")) {
			if (prijem >= hranice[0] && prijem <= hranice[1]) {
				dan = prijem * sadzbyZenaty[0];
			} else {
				if (prijem > hranice[1]) {
					dan = prijem * sadzbyZenaty[1];
				}
			}
		}

		if (stav.equals("slobodny") || stav.equals("slobodna")) {
			if (prijem >= hranice[0] && prijem <= hranice[1]) {
				dan = prijem * sadzbySlobodny[0];
			} else {
				if (prijem > hranice[1] && prijem <= hranice[2]) {
					dan = prijem * sadzbySlobodny[1];
				} else {
					if (prijem > hranice[2]) {
						dan = prijem * sadzbySlobodny[2];
					}
				}
			}
		}
		return dan;
	}
}
