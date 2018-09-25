package sk.itvkurze.zadanie26_5;

import java.util.Arrays;
import java.util.Comparator;

public class DvojicaHodnotUtil<T> {

	public static <T> DvojicaHodnot<T, T> minmax(T[] pole, Comparator<T> komparator) {

		T[] zotriedPole = pole;
		Arrays.sort(zotriedPole, komparator);

		T minPrvok = zotriedPole[0];
		T maxPrvok = zotriedPole[zotriedPole.length - 1];

		return new DvojicaHodnot<T, T>(minPrvok, maxPrvok);

	}


}


