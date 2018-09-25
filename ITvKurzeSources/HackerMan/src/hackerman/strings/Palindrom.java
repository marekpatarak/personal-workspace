package hackerman.strings;

public class Palindrom {

	public static void main(String[] args) {

		String A = "java";
		/* Enter your code here. Print output to STDOUT. */
		StringBuilder str = new StringBuilder(A);
		str.reverse();

		if (A.equals(str.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}

	}

}
