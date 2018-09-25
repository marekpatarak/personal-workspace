package hackerman.thirtydaysofcode;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 2; i++) {
			if (isPrimeComplex(i)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}

	}

	public static int[] getPrimesArr(int n) {
		int[] pole = new int[(int) Math.sqrt(n)];
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (isPrime(i)) {
				pole[i] = i;
			}
		}
		return pole;
	}

	public static boolean isPrimeComplex(int n) {
		if (n == 1)
			return false;
		int[] pole = getPrimesArr(n);

		for (int i = 0; i < pole.length; i++) {
			if (pole[i] != 0) {
				if (n % pole[i] == 0) {
					return false;
				}

			}
		}
		return true;
	}


	public static boolean isPrime(int n) {
		int divis = 0;
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				divis++;
				if (divis > 2)
					return false;
			}
		}
		return true;
	}
}
