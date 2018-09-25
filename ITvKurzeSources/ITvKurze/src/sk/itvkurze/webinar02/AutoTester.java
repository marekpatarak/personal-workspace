package sk.itvkurze.webinar02;

public class AutoTester {

	public static void main(String[] args) {
		Auto auto = new Auto();

		vypisInfoAuto(auto);

		Auto mazda = new Auto("Mazda 6", 220, 32000);

		vypisInfoAuto(mazda);

	}

	public static void vypisInfoAuto(Auto auto) {
		System.out.println(auto.nazov);
		System.out.println(auto.cena);
		System.out.println(auto.rychlost);
	}

}
