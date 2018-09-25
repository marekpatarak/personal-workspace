package sk.itvkurze.webinar05;

//vysvetlenie vysledneho typu operacie dvoch operandov rozneho datoveho typu
public class OperacieSDatTypmi {

	public static void main(String[] args) {
		int a = 5;
		short b = 10;
		// nemoze byt nizsi typ vyslednej premennej iba vyssi
		int vysledok = a + b;

		byte c = 10;
		short m = 15;
		// prava strana nie je typu byte ani short, automaticky je to int
		int vysledok2 = c + m;

		int x = 100;
		long n = 200;
		// vysledna nie je int ale long lebo je to vyssi typ
		long vysledok3 = x + n;

		float x1 = 55.5f;
		double x2 = 100.5;
		// vysledna premenna musi byt double lebo je to vyssi typ
		double vysledok4 = x1 + x2;

		float x3 = 100.5f;
		int x4 = 4;
		// vysledna premenna je typu float, ale moze byt aj double lebo je vacsi typ
		float vysledok5 = x3 + x4;

	}

}
