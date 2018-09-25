package sk.itvkurze.zadanie14_8;

public class MeracPrevyseniaTester {

	public static void main(String[] args) {

		MeracPrevysenia merac = new MeracPrevysenia();
		merac.setAktualPoloha(-2);
		merac.setPrevysenieMetre(2250);

		System.out.println("Prevysenie je " + merac.getPrevyseniePerc() + " percent");
	}

}
