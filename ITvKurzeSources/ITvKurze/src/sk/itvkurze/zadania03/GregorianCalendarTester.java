package sk.itvkurze.zadania03;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTester {

	public static void main(String[] args) {
		GregorianCalendar datumNarodenia = new GregorianCalendar(1990, Calendar.JUNE, 30);
		GregorianCalendar dnesnyDatum = new GregorianCalendar();

		dnesnyDatum.add(Calendar.DAY_OF_MONTH, 100);

		System.out.println("a) d�tum, ktor� je presne posunut� o 100 dni dopredu od dne�n�ho d�tumu ");
		System.out.println(dnesnyDatum.get(Calendar.DAY_OF_MONTH) + "/" + (dnesnyDatum.get(Calendar.MONTH) + 1) + "/"
				+ dnesnyDatum.get(Calendar.YEAR));

		System.out.println("b) de� v t��dni, ktor� reprezentuje de� mojich naroden�n");
		int denVTyzdni = datumNarodenia.get(Calendar.DAY_OF_WEEK);

		switch (denVTyzdni) {
		case 1:
			System.out.println("Nedela");
			break;
		case 2:
			System.out.println("Pondelok");
			break;
		case 3:
			System.out.println("Utorok");
			break;
		case 4:
			System.out.println("Streda");
			break;
		case 5:
			System.out.println("Stvrtok");
			break;
		case 6:
			System.out.println("Piatok");
			break;
		case 7:
			System.out.println("Sobota");
			break;
		}

		datumNarodenia.add(Calendar.DAY_OF_MONTH, 10000);

		System.out.println("c) d�tum, ktor� uplynie presne 10000 dn� od mojho narodenia ");
		System.out.println(datumNarodenia.get(Calendar.DAY_OF_MONTH) + "/" + (datumNarodenia.get(Calendar.MONTH) + 1)
				+ "/" + datumNarodenia.get(Calendar.YEAR));

	}

}
