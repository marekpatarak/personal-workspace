package sk.itvkurze.zadanie6_5;

public class AkostTovaru {

	private double prelozPismeno(String pismeno) {

		switch (pismeno) {
		case "A":
			return 4.0;
		case "B":
			return 3.0;
		case "C":
			return 2.0;
		case "D":
			return 1.0;
		case "F":
			return 0.0;
		default:
			return -1.0;
		}
	}

	private double zmenHodnotu(String pism, String znak, double hodnota) {

		if (pism.equals("A")) {
			if (znak.equals("+"))
				hodnota += 0;

			if (znak.equals("-"))
				hodnota -= 0.3;

			if (!znak.equals("-") && !znak.equals("+"))
				hodnota = -1;

		} else {

			if (znak.equals("+"))
				hodnota += 0.3;

			if (znak.equals("-"))
				hodnota -= 0.3;

			if (!znak.equals("-") && !znak.equals("+"))
				hodnota = -1;
		}
		return hodnota;
	}

	private double prelozPostFix(String postfix) {

		String pism = postfix.substring(0, 1);
		String znak = postfix.substring(1, 2);
		double ciasHodnota = this.prelozPismeno(pism);

		switch (pism) {
		case "A":
			return this.zmenHodnotu(pism, znak, ciasHodnota);

		case "F":
			return -1.0;

		case "B":
			return this.zmenHodnotu(pism, znak, ciasHodnota);

		case "C":
			return this.zmenHodnotu(pism, znak, ciasHodnota);

		case "D":
			return this.zmenHodnotu(pism, znak, ciasHodnota);

		default:
			return -1.0;

		}

	}

	public void vypisStupenAkostiTovaru(String vstup) {
		if (this.getStupenAkostiTovaru(vstup) < 0) {
			System.out.println("Neplatny vstup");
		} else {
			System.out.println("Tovar zodpoveda akosti: " + this.getStupenAkostiTovaru(vstup));
		}
	}

	public double getStupenAkostiTovaru(String stupen) {

		if (stupen.length() == 2) {
			return this.prelozPostFix(stupen);
		} else {
			if (stupen.length() == 1) {
				return this.prelozPismeno(stupen);
			} else {
				return -1;

			}
		}
	}
}



