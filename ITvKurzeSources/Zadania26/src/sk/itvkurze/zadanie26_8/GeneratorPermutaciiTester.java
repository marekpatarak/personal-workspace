package sk.itvkurze.zadanie26_8;

import java.util.ArrayList;
import java.util.List;

public class GeneratorPermutaciiTester {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>();
		data.add("a");
		data.add("b");
		data.add("c");

		GeneratorPermutacii<String> generator = new GeneratorPermutacii<>(data);
		List<List<String>> vsetkyPermutacie = generator.getPermutacie();
		System.out.println(generator.getFactorial(4));
		System.out.println(vsetkyPermutacie.get(0));
		System.out.println("Ocakavana hodnota: [a, b, c]");
		System.out.println(vsetkyPermutacie.get(1));
		System.out.println("Ocakavana hodnota: [a, c, b]");
		System.out.println(vsetkyPermutacie.get(2));
		System.out.println("Ocakavana hodnota: [b, a, c]");
		System.out.println(vsetkyPermutacie.size());
		System.out.println("Ocakavana hodnota: 6");
	}

}
