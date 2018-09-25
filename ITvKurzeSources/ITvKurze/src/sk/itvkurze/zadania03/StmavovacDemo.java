package sk.itvkurze.zadania03;

import java.awt.Color;

public class StmavovacDemo {

	public static void main(String[] args) {
		Color farba = new Color(0, 0, 0);
		farba = Color.RED;
		System.out.println(farba);
		farba = farba.darker();
		System.out.println(farba);
	}

}
