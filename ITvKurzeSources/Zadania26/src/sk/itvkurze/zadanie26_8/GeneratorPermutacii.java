package sk.itvkurze.zadanie26_8;

import java.util.ArrayList;
import java.util.List;

public class GeneratorPermutacii<T> {
	List<T> vstup;

	public GeneratorPermutacii(List<T> data) {
		this.vstup = data;
	}

	public List<List<T>> getPermutacie() {
		List<List<T>> vsetkyPermutacie = new ArrayList<List<T>>();
		int fact = getFactorial(this.vstup.size());

		for (int i = 1; i <= fact; i++) {
			List<T> list = this.vstup;

			for (int j = 0; j < list.size(); j++) {

			}

		}
		return vsetkyPermutacie;
	}

	public int getFactorial(int n) {
		int fact = 1;

		for (int i = n; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}
}
