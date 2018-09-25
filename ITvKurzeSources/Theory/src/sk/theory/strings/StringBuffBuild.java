package sk.theory.strings;

public class StringBuffBuild {

	public static void main(String[] args) {

		// efektivna praca s retazcami
		// StringBuilder - v jednovlaknovych aplikaciach
		// StringBuffer - vo viacvlaknovych aplikaciach

		StringBuilder builder = new StringBuilder();
		builder.append("test");
		builder.append("\n");
		builder.append(123);
		builder.append(false);

		System.out.println(builder.toString());

	}

}
