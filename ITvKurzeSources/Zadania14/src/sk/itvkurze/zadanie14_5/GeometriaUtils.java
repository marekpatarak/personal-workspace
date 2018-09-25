package sk.itvkurze.zadanie14_5;

public class GeometriaUtils {

	public static double vypocitajObjemGule(double r) {
		return roundUp(((4 * Math.PI) / 3) * Math.pow(r, 3));
	}

	public static double vypocitajPovrchGule(double r) {
		return roundUp((4 * Math.PI) * Math.pow(r, 2));
	}

	public static double vypocitajObjemValca(double r, double v) {
		return roundUp(Math.PI * r * r * v);
	}

	public static double vypocitajPovrchValca(double r, double v) {
		return roundUp((Math.PI * r * r * 2) + (2 * Math.PI * r * v));
	}

	public static double vypocitajObjemRotacnehoKuzela(double r, double v) {
		return roundUp((Math.PI * r * r * v) / 3);
	}

	public static double vypocitajPovrchRotacnehoKuzela(double r, double v) {
		return roundUp((Math.PI * r * r) + ((Math.sqrt((r * r) + (v * v)) * r * Math.PI)));
	}

	static double roundUp(double vstup) {
		double round = 100 * vstup;
		round = Math.round(round);
		return round / 100;
	}
}
