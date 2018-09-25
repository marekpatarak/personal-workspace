package sk.itvkurze.zadanie6_4;

public class AnoNie {
	
	
	public String validujVstup(String vstup) {
		
		if (vstup.equalsIgnoreCase("Ano") || vstup.equalsIgnoreCase("A") || vstup.equalsIgnoreCase("Jasne")
				|| vstup.equalsIgnoreCase("V pohode") || vstup.equalsIgnoreCase("Urcite")
				|| vstup.equalsIgnoreCase("Dozaista") || vstup.equalsIgnoreCase("Preco nie"))
			{
			return "OK";
			} else {
			if (vstup.equalsIgnoreCase("N") || vstup.equalsIgnoreCase("Nie")) {
				return "Ukoncujem program";
			} else {
				return "chybny vstup";
			}
		}
	}
		
		
}


