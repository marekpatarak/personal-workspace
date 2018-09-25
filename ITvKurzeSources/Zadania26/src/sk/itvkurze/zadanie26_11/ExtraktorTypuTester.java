package sk.itvkurze.zadanie26_11;

public class ExtraktorTypuTester {

	public static void main(String[] args) {
		ExtraktorTypu<Integer> extraktor = new ExtraktorTypu<>(55);
		extraktor.zobrazTyp();

		int data = extraktor.getHodnota();
		System.out.println("Data: " + data);
		System.out.println("Ocakavane data: 55");

		ExtraktorTypu<String> extraktor2 = new ExtraktorTypu<>("Java");
		extraktor2.zobrazTyp();

		String data2 = extraktor2.getHodnota();
		System.out.println("Data: " + data2);
		System.out.println("Ocakavane data: Java");
	}

}
