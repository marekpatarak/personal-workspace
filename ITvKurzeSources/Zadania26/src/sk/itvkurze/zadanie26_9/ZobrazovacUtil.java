package sk.itvkurze.zadanie26_9;

import java.util.Iterator;

public class ZobrazovacUtil<T> {

	public static <T> void zobraz(Iterable<T> prvky) {

		Iterator<T> iterator = prvky.iterator();
		do {
			T prvok = iterator.next();
			if (iterator.hasNext() == false) {
				System.out.print(prvok);
			} else {
				System.out.print(prvok + ", ");
			}
		} while (iterator.hasNext());

		System.out.println();
	}
}

