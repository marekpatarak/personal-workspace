package sk.itvkurze.zadanie14_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputReader {

	protected static HashMap<String, Tovar> readInput(String link) {

		// citanie zo suboru
		HashMap<String, Tovar> loadedKatalog = new HashMap<>();
		Tovar tovar;
		try {
			InputStream fis = new FileInputStream(link);
			Scanner scan = new Scanner(fis);
			while (scan.hasNextLine()) {
				try {

					tovar = parsujStrToTovar((scan.nextLine()));
					if (tovar != null)
						loadedKatalog.put(tovar.ID, tovar);
				} catch (NullPointerException e) {

				}
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loadedKatalog;

	}

	private static Tovar parsujStrToTovar(String string) {

		String regex = "(\\d{4})\\|([^|]{1,})\\|(\\d{1,}\\.\\d\\d)\\|(\\d{1,2}\\.\\d\\d)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		Tovar tovar = null;
		if (matcher.find()) {
			tovar = new Tovar(matcher.group(1), matcher.group(2), Double.valueOf(matcher.group(3)),
					Double.valueOf(matcher.group(4)));

		} else {
			tovar = null;
		}

		return tovar;
	}

}
