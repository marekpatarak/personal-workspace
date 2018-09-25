package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean validate(String str) {

		if (str.length() == 1 && str.matches("\\d")) {
			return true;
		} else {
			String delim = str.substring(2, 3);

			if (str.matches("(\\/{2})(" + delim + ")\\n(\\d{1,}\\2){1,}\\d{1,2}")
				|| str.matches("(\\d{1,}[\\n,]){1,}\\d{1,}")) {
			return true;
			} else {
				return false;
			}
		}
	}

	public static int add(String str) throws Exception {

		if (str.length() == 0)
			return 0;

		if (Main.validate(str)) {

			int sum = 0;
			for (int i = 0; i < str.length(); i++) {

				try {
					sum += Integer.valueOf(str.substring(i, i + 1));

				} catch (NumberFormatException e) {

				}
			}

			return sum;
		} else {
			throw new Exception("Invalid input");
		}

		}
}

