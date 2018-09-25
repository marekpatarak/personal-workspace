package sk.itvkurze.webinar04;

public class ZnakoveDatoveTypyDemo {
	public static void main(String[] args) {
		ZnakoveDatoveTypy datoveTypy = new ZnakoveDatoveTypy();
		System.out.println("Default hodnota char: " + datoveTypy.znak);
		System.out.println("Default hodnota String: " + datoveTypy.meno);
		System.out.println("pozicia znaku 'a' " + (int) datoveTypy.c);
		System.out.println("pozicia znaku 'b' " + (int) datoveTypy.d);
	}
}

class ZnakoveDatoveTypy {

	// znakove datove typy - char - string
	char znak;
	String meno;

	char c = 'a';
	char d = 'a' + 1;

}
