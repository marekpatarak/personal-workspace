package sk.itvkurze.zadania01;

public class SucetZlomkov {

	public static void main(String[] args) {
		double x = 0;
		int n = 8;
		for (double i = 1; i <= n; i++) {
			x = x + 1 / i;
		}
		System.out.println("Sucet prvych " + n + " zlomkov je " + x);

	}

}
