package sk.itvkurze.zadanie6_16;

import java.util.Scanner;

import javax.swing.JFrame;

public class ZobrazovacPretinKruznicaBod {

	public static int bodX, bodY;

	public static void main(String[] args) {

		boolean check = true;
		Scanner scanner = new Scanner(System.in);

		while (check) {
			System.out.println("Zadaj suradnicu bodu X");
			bodX = scanner.nextInt();
			System.out.println("Zadaj suradnicu bodu Y");
			bodY = scanner.nextInt();

			if ((bodX >= 0 && bodY >= 0) && (bodX <= 800 && bodY <= 800)) {
				check = false;
			} else {
				System.out.println("Bod mimo okna, zadaj znovu");
			}
		}

		JFrame okno = new JFrame();
		okno.setSize(800, 800);

		okno.setTitle("Pretinajuce sa bod a kruznica");

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaPretinKruznicaBod komponenta = new KomponentaPretinKruznicaBod();
		okno.add(komponenta);

		okno.setVisible(true);
	}
}

