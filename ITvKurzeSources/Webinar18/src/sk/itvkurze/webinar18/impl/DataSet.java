package sk.itvkurze.webinar18.impl;

import java.util.Arrays;

public class DataSet {

	public String[] pripravData() {
		String[] data = { "test1", "test2" };
		System.out.println("aktualne testovacie data: " + Arrays.toString(data));
		return data;
	}

	public String[] pripravData2() {
		String[] data = { "gen1", "gen2" };
		System.out.println("aktualne testovacie data: " + Arrays.toString(data));
		return data;
	}

}
