package sk.itvkurze.zadanie6_17;

import java.util.Scanner;

import javax.swing.JFrame;

public class ZobrazovacPretinKruznice {

	public static int polomer1, polomer2;

	public static void main(String[] args) {

		boolean check = true;
		Scanner scanner = new Scanner(System.in);

		while (check) {
		System.out.println("Zadaj polomer kruznice 1");
		polomer1 = scanner.nextInt();
		System.out.println("Zadaj polomer kruznice 2");
		polomer2 = scanner.nextInt();

			if (polomer1 >= 0 && polomer2 >= 0) {
				check = false;
			} else {
				System.out.println("Jeden z polomerov bol zaporny, zadaj znovu");
			}
		}

		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("Pretinajuce sa kruznice");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaPretinKruznice komponenta = new KomponentaPretinKruznice();
		okno.add(komponenta);

		okno.setVisible(true);
	}
}

