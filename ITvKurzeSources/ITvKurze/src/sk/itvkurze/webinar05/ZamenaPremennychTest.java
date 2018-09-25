package sk.itvkurze.webinar05;

public class ZamenaPremennychTest {
	
	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		System.out.println("Premenna a = " + a);
		System.out.println("Premenna b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Premenna a po vymene = " + a);
		System.out.println("Premenna b po vymene = " + b);

	}
}
