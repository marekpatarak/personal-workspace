package sk.itvkurze.webinar02;

public class OsobaTester {

	public static void main(String[] args) {
		Osoba osoba1;
		Osoba osoba2;
		Osoba osoba3;

		osoba1 = new Osoba();
		osoba1.meno = "Marek";
		osoba1.priezvisko = "Patarak";
		osoba1.vek = 27;
		osoba1.vyska = 197.05;
		osoba1.jeZena = false;
		osoba1.jeVydata = false;

		System.out.println("Meno osoby: " + osoba1.meno);
	}

}
