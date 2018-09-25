package sk.itvkurze.webinar03;

public class BankovyUcetTester {

	public static void main(String[] args) {
		BankovyUcet ucetKatka = new BankovyUcet();
		System.out.println(ucetKatka.nazovUctu);
		System.out.println(ucetKatka.stavUctu);

		ucetKatka.nazovUctu = "Ucet pre mladych";
		ucetKatka.stavUctu = 1000;

		System.out.println(ucetKatka.nazovUctu);
		System.out.println(ucetKatka.stavUctu);

		// beznyUcet = null;

		// System.out.println(beznyUcet.nazovUctu);
		// System.out.println(beznyUcet.stavUctu);

		BankovyUcet ucetJanko;
		ucetJanko = ucetKatka;

		System.out.println(ucetJanko.nazovUctu);
		System.out.println(ucetJanko.stavUctu);

		ucetJanko.stavUctu = ucetJanko.stavUctu - 500;

		System.out.println(ucetKatka.stavUctu);
		System.out.println(ucetJanko.stavUctu);

		ucetKatka.stavUctu += 1200;
		System.out.println(ucetKatka.stavUctu);
		System.out.println(ucetJanko.stavUctu);

	}

}
