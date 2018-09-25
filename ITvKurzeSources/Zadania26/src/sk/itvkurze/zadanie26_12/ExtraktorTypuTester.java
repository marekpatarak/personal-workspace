package sk.itvkurze.zadanie26_12;

public class ExtraktorTypuTester {

	public static void main(String[] args) {
		ExtraktorTypu<Integer, String> extraktor = new ExtraktorTypu<>(66, "kava");
		extraktor.zobrazTypy();

		int prvyClen = extraktor.getPrvyClen();
		System.out.println("Prvy clen: " + prvyClen);
		System.out.println("Ocakavane data: 66");

		String druhyClen = extraktor.getDruhyClen();
		System.out.println("Druhy clen: " + druhyClen);
		System.out.println("Ocakavane data: kava");
	}

}
