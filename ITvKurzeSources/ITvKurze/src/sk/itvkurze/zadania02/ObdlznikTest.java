package sk.itvkurze.zadania02;

public class ObdlznikTest {

	public static void main(String[] args) {
		Obdlznik obdlznik3 = new Obdlznik(4, 2);

		System.out.println("Strana A obdlznika je: " + obdlznik3.getStranaA());
		System.out.println("Strana B obdlznika je: " + obdlznik3.getStranaB());
		System.out.println("Obsah obdlznika je: " + obdlznik3.getObsah());
		System.out.println("Obvod obdlznika je: " + obdlznik3.getObvod());
		System.out.println("Ocakavany obsah je: " + 4 * 2);
		System.out.println("Ocakavany obvod je: " + (4 + 4 + 2 + 2));
	}

}
