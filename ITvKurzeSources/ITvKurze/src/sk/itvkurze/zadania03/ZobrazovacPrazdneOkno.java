package sk.itvkurze.zadania03;

import java.awt.Color;

import javax.swing.JFrame;
public class ZobrazovacPrazdneOkno {

	public static void main(String[] args) {
		JFrame prazdneOkno = new JFrame();
		// a)
		prazdneOkno.setSize(800, 600);

		// b) vyberte konstatntu, ktora zodpoveda sivej farbe
		prazdneOkno.getContentPane().setBackground(Color.GRAY);

		// c) chceme okno vycentrovat relativne ku ziadnej komponente
		// a kedze metoda ocakava referencny typ, je potrebne pouzit hodnotu null
		prazdneOkno.setLocationRelativeTo(null);

		// d) nezabudnite, ze sa jedna o retazec, t.j. pouzite uvodzovky
		prazdneOkno.setTitle("Prázdne okno");

		// e) uz mate hotovy, skuste si tento riadok zakomentovat a otestovat co sa
		// stane >> aplikacia stale bezi aj po zavreti okna
		prazdneOkno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// f)
		prazdneOkno.setVisible(true);
	}
}