package sk.itvkurze.zadanie7_10;

import java.util.Scanner;

import javax.swing.JFrame;

public class ZobrazovacKruznice {

	public static void main(String[] args) {
		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("Nahodne kruznice");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj pocet kruznic");

		KomponentaKruznice komponentaKruznice = new KomponentaKruznice(scanner.nextInt());
		okno.add(komponentaKruznice);

		okno.setVisible(true);
	}
}

