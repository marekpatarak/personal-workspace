package hackerman.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChallenge {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		List<String> emails = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			emails.add(scan.nextLine());
		}
		System.out.println(emails);

		String regex = "^[a-z]{1,} [a-z\\.]{1,}@gmail\\.com";
		Pattern pattern = Pattern.compile(regex);

		Iterator<String> iterator = emails.iterator();

		while (iterator.hasNext()) {
			Matcher matcher = pattern.matcher(iterator.next());
			if (!matcher.find()) {
				iterator.remove();
			}
		}

		System.out.println(emails);
		Collections.sort(emails);

		String regex2 = "^[a-z]{1,}";
		pattern = Pattern.compile(regex2);

		Iterator<String> iterator2 = emails.iterator();

		while (iterator2.hasNext()) {
			Matcher matcher = pattern.matcher(iterator2.next());
			if (matcher.find()) {
				System.out.println(matcher.group());
			}
		}

		System.out.println(emails);

	}
}


