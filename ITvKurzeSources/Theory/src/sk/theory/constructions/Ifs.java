package sk.theory.constructions;

public class Ifs {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// najjednoduchsi jednoriadkovy zapis
		if (x > y)
			System.out.println("x je viac ako y");
		if (x < y)
			System.out.println("x je menej ako y");

		System.out.println("--------------------");

		if (x > y) {
			// blok kodu
			System.out.println("x je viac ako y");
			System.out.println("bla bla bla");
		}

		if (x < y) {
			// blok kodu
			System.out.println("x je menej ako y");
			System.out.println("bla bla bla");
		}


		// ternarny operator

		// min value example
		int minVal, a = 3, b = 2;
		minVal = a < b ? a : b;
		System.out.println("min = " + minVal);

		// absolute value example
		a = -10;
		int absValue = (a < 0) ? -a : a;
		System.out.println("abs = " + absValue);

		// result is assigned the value 1.0
		float result = true ? 1.0f : 2.0f;
		System.out.println("float = " + result);

		// result is assigned the value "Sorry Dude, it's false"
		String s = false ? "Dude, that was true" : "Sorry Dude, it's false";
		System.out.println(s);

		// example using the ternary operator on the rhs, in a string
		int z = 5;
		String out = "There " + (z > 1 ? " are " + z + " cookies" : "is one cookie") + " in the jar.";
		System.out.println(out);

	}


}
