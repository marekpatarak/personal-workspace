package sk.itvkurze.zadanie26_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZobrazovacPrvkovTester {

	public static void main(String[] args) {
		String veta = "Programovanie v Jave nas bavi :-)";
		Iterable<String> prvky = Arrays.asList(veta.split(" "));
		ZobrazovacUtil.zobraz(prvky);
		System.out.println("Ocakavane hodnoty: Programovanie, v, Jave, nas, bavi, :-)");

		List<Integer> cisla = new ArrayList<>();
		cisla.add(55);
		cisla.add(44);
		cisla.add(33);
		ZobrazovacUtil.zobraz(cisla);
		System.out.println("Ocakavane hodnoty: 55, 44, 33");

	}

}
