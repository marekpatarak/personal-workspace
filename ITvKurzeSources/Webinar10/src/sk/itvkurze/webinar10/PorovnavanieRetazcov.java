package sk.itvkurze.webinar10;

public class PorovnavanieRetazcov {

	public static void main(String[] args) {
		// v tomto pripade prebieha optimalizacia pamate
		// ak nie je pouzity konstruktor, t.j. realne v pamati sa vytvori iba jeden
		// objekt
		// nie dva
		String a = "test";
		String b = "test";

		// referencia a nam ukazuje na rovnaky objekt ako referencia b
		// je to iba porovnanie referencii a nie objektov

		if (a == b) {
			System.out.println("a == b ");
		}

		// spravne porovnanie retazcov
		if (a.equals(b)) {

		}
	}

}
