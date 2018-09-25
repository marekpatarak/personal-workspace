package sk.itvkurze.webinar20;

import java.util.Arrays;

public class ProblemysSPoliami {
	
	public static void main(String[] args) {

	Vyrobok dvere = new Vyrobok ("drevene dvere", 35);
	Vyrobok okno = new Vyrobok("Plastove okno", 25);
	
		// 1 vytvorime pole vyrobkov
	Vyrobok[] vyrobky = {dvere, okno};
	
		// 2 vypisat obsah pola
		System.out.println(Arrays.toString(vyrobky));

		// 3 pridanie dalsich prvkov do pola
		Vyrobok stol = new Vyrobok("Skleneny stol", 10);
		vyrobky = vlozVyrobok(stol, vyrobky);
		System.out.println(Arrays.toString(vyrobky));

		// 4 duplicity

	}
	
	private static Vyrobok[] vlozVyrobok(Vyrobok vyrobok, Vyrobok[] vyrobky) {
		int velkost = vyrobky.length;
		Vyrobok[] novePole = Arrays.copyOf(vyrobky, velkost + 1);
		novePole[velkost] = vyrobok;
		return novePole;
	}
}
