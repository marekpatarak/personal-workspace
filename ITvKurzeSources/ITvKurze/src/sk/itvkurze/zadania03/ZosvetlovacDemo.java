package sk.itvkurze.zadania03;

import java.awt.Color;

public class ZosvetlovacDemo {

	public static void main(String[] args) {
		Color farba = new Color(50, 100, 150);
		System.out.println(farba);
		farba = farba.brighter();
		System.out.println(farba);
	}

}
