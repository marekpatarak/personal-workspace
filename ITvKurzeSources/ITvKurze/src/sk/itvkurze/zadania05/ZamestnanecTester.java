package sk.itvkurze.zadania05;

public class ZamestnanecTester {

	public static void main(String[] args) {
		Zamestnanec novyZamestnanec = new Zamestnanec("Marek Patarák", 1300);

		// vypisanie mena zamestnanca
		System.out.println("Meno noveho zamestnanca je: " + novyZamestnanec.getMeno());
		System.out.println("Ocakavany vystup je: Marek Patarák");

		// vypisanie platu zamestnanca
		System.out.println("Plat noveho zamestnanca je: " + novyZamestnanec.getPlat() + " EUR");
		System.out.println("Ocakavany vystup je: 1300 EUR");

		// navysenie a vypisanie platu zamestnanca
		novyZamestnanec.navysPlat(10);
		System.out.println("Plat noveho zamestnanca po 1.roku je: " + novyZamestnanec.getPlat() + " EUR");
		System.out.println("Ocakavany vystup je: 1430 EUR");

		// navysenie a vypisanie platu zamestnanca
		novyZamestnanec.navysPlat(20);
		System.out.println("Plat noveho zamestnanca po 2. roku je: " + novyZamestnanec.getPlat() + " EUR");
		System.out.println("Ocakavany vystup je: 1716 EUR");
	}

}
