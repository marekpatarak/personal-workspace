package sk.itvkurze.zadania03;

public class RozsirenyEnkoderZnakovTester {

	public static void main(String[] args) {
		String sample = new String("anakonda");
		
		System.out.println("Testovaci string: " + sample);
		System.out.println("Ocakavany vystup: onokando");
		sample = sample.replace('o', 'x');
		sample = sample.replace('a', 'o');
		sample = sample.replace("x", "a");
		
		System.out.println("Aktualny vystup: " + sample);

	}

}
