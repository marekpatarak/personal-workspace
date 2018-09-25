package sk.theory.constructions;

public class Switchs {

	public static void main(String[] args) {
		// switch moze byt kontrolovany integerom Stringom alebo Enumom

		// kontrola integerom
		int i = 1;

		switch (i) {
		case 1:
			System.out.println("true");
			break;
		case 0:
			System.out.println("false");
			break;
		default:
			System.out.println("default");
			break;

		}

		// kontrola Stringom
		String str = "true";

		switch (str) {
		case "true":
			System.out.println(1);
			break;
		case "false":
			System.out.println(0);
			break;
		default:
			System.out.println(-1);
			break;

		}

		// kontrola Enumom

		Farba farba = Farba.CIERNA;

		switch (farba) {
		case BIELA:
			System.out.println(1);
			break;
		case CIERNA:
			System.out.println(0);
			break;
		default:
			System.out.println(-1);
			break;

		}

	}

	public enum Farba {
		BIELA, CIERNA;
	}

}
