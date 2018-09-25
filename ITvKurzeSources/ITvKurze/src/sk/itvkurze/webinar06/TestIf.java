package sk.itvkurze.webinar06;

public class TestIf {


	public static void main(String[] args) {

		int cislo = 5;
		// porovnavacie operatory <, >, <=, >=, ==, !=

		// otocenie podmienky (!(podmienka))
		if (!(cislo >= 5)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println("po vetveni");
		
		int dlzkaPola = args.length;
		
		if (dlzkaPola == 0) {
			System.out.println("Zadaj jeden celociselny vstup");
		}
		else {
			//String -> int (Integer)
			String prvyParameter = args
		}
	}

}
