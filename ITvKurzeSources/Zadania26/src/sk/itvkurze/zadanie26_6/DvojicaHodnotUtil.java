package sk.itvkurze.zadanie26_6;

import java.util.Arrays;

public class DvojicaHodnotUtil {

	public static <T> DvojicaHodnot<T, T> minmax(T[] pole) {

		T[] zotriedPole = pole;
		Arrays.sort(zotriedPole);

		T minPrvok = zotriedPole[0];
		T maxPrvok = zotriedPole[zotriedPole.length - 1];

		return new DvojicaHodnot<T, T>(minPrvok, maxPrvok);

	}


}


