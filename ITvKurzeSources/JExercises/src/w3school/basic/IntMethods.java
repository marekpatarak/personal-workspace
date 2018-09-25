package w3school.basic;

public class IntMethods {
	public static long Factorial(int input) {
		int n = input;
		long m = n;

		for (int i = 1; i <= (n - 1); i++) {
			m = m * (n - i);
		}

		return m;
	}
}
