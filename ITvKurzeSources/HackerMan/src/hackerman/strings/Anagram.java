package hackerman.strings;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String a = "aaaaa";
		String b = "aa";
		System.out.println(isAnagram(a, b));

	}

	static boolean isAnagram(String a, String b) {

		if (a.length() != b.length())
			return false;

		HashMap<Character, Integer> mapA = new HashMap<>();
		HashMap<Character, Integer> mapB = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			if (mapA.get(Character.toLowerCase(a.charAt(i))) == null) {
				mapA.put(Character.toLowerCase(a.charAt(i)), 1);
			} else {
				int k = mapA.get(Character.toLowerCase(a.charAt(i)));
				mapA.put(Character.toLowerCase(a.charAt(i)), k + 1);
			}
			;

			if (mapB.get(Character.toLowerCase(b.charAt(i))) == null) {
				mapB.put(Character.toLowerCase(b.charAt(i)), 1);
			} else {
				int k = mapB.get(Character.toLowerCase(b.charAt(i)));
				mapB.put(Character.toLowerCase(b.charAt(i)), k + 1);
			}
			;
		}

		for (Character znak : mapA.keySet()) {
			if (mapB.get(znak) == null)
				return false;
			if (mapA.get(znak) != mapB.get(znak))
				return false;
		}

		return true;
	}

}
