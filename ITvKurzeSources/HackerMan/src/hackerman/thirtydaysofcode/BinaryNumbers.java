package hackerman.thirtydaysofcode;

public class BinaryNumbers {

	public static void main(String[] args) {
		System.out.println(decToBin(524283));
		String str = decToBin(524283);
		System.out.println(maxCountOnes(str));

	}

	public static int maxCountOnes(String str) {
		int maxCount = 0;
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.substring(i, i + 1).equals("1")) {
				count++;
				if (count > maxCount)
				maxCount = count;
			} else {
				if (count > maxCount)
					maxCount = count;
				count = 0;
			}
		}
		return maxCount;
	}

	public static String decToBin(int n) {
		String str = "";
		int remainder = 0;

		while (n > 0) {
			remainder = n % 2;
			n = n / 2;
			str = Integer.toString(remainder) + str;
		}

		return str;
	}
}
