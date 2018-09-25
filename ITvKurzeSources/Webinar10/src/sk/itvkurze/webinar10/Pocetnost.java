package sk.itvkurze.webinar10;

public class Pocetnost {

	public static void main(String[] args) {

		int pocet = pocetnost("ano nie ano nie ano", "ano");
		System.out.println(pocet);

		pocet = pocetnost(null, "ano");
		System.out.println(pocet);
	}

	private static int pocetnost(String retazec, String hladanyPodretazec) {
		if (retazec == null || retazec.isEmpty() || hladanyPodretazec == null || hladanyPodretazec.isEmpty()) {
			return 0;
		}
		int pocetVyskytov = 0;

		for (int pozicia = 0; (pozicia = retazec.indexOf(hladanyPodretazec, pozicia)) != -1; pocetVyskytov++) {
			pozicia += hladanyPodretazec.length();
		}

		return pocetVyskytov;
	}
}


