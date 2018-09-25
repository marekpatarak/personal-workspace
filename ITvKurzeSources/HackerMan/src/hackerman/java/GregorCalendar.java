package hackerman.java;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorCalendar {
	
	public static String getDay(Integer day, Integer month, Integer year) {
        /*
        * Write your code here.
        */
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(year, month, day);
		int cislo = calendar.get(Calendar.DAY_OF_WEEK) + 4 > 7 ? calendar.get(Calendar.DAY_OF_WEEK) + 4 - 7
				: calendar.get(Calendar.DAY_OF_WEEK) + 4;

		switch (cislo) {
		case 1:
			return "MONDAY";
		case 2:
			return "TUESDAY";
		case 3:
			return "WEDNESDAY";
		case 4:
			return "THURSDAY";
		case 5:
			return "FRIDAY";
		case 6:
			return "SATURDAY";
		case 7:
			return "SUNDAY";
		default:
			return "nic";
		}
        
    }

    public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String month = in.next();
		// String day = in.next();
		// String year = in.next();
        
		System.out.println(getDay(30, 6, 1990));
    }

}
