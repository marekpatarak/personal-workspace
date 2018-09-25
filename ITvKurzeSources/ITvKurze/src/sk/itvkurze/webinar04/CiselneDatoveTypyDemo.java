package sk.itvkurze.webinar04;

public class CiselneDatoveTypyDemo {
	public static void main(String[] args) {
		DatoveTypy datoveTypy = new DatoveTypy();
		datoveTypy.vypisRozsahy();
	}
}

class DatoveTypy {

	// ciselne datove typy - celociselne

	int a = 100;
	long b = -500;
	byte c = 50;
	short d = 600;
	byte x = (byte) d; // explicitna konverzia datoveho typu
	long y = a; // implicitna konverzia datoveho typu

	// ciselne datove typy - cisla s desatinnou ciarkou (realne cisla)

	float e = 100.55F;
	double f = 500.66;

	public void vypisRozsahy() {
		System.out.println("Dolna hranica int: " + Integer.MIN_VALUE);
		System.out.println("Horna hranica int: " + Integer.MAX_VALUE);
		System.out.println("Dolna hranica long: " + Long.MIN_VALUE);
		System.out.println("Horna hranica long: " + Long.MAX_VALUE);
		System.out.println("Dolna hranica byte: " + Byte.MIN_VALUE);
		System.out.println("Horna hranica byte: " + Byte.MAX_VALUE);
		System.out.println("Dolna hranica short: " + Short.MIN_VALUE);
		System.out.println("Horna hranica short: " + Short.MAX_VALUE);
		System.out.println("Dolna hranica float: " + Float.MIN_VALUE);
		System.out.println("Horna hranica float: " + Float.MAX_VALUE);
		System.out.println("Dolna hranica double: " + Double.MIN_VALUE);
		System.out.println("Horna hranica double: " + Double.MAX_VALUE);
	}

}
