package hackerman.strings;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokens {

	public static void main(String[] args) {
		String str = "He is a very very good boy, isn't he?";
		ArrayList<String> list = vratTokeny(str);
		vypisTokeny(list);
	}

	static void vypisTokeny(ArrayList<String> list) {
		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}
	}


	static ArrayList<String> vratTokeny(String s) {
		ArrayList<String> zoznam = new ArrayList<>();

		String regex = "[a-zA-Z]{1,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			zoznam.add(matcher.group());
		}
		;

		return zoznam;
	}
}
