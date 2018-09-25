package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class KomponentaObdlznik extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		// ziskame graficky kontext
		Graphics2D g2 = (Graphics2D) g;

		// vytvorime obdlznik
		Rectangle obdlznik = new Rectangle(5, 10, 20, 30);

		// zobrazime obdlznik v grafickom kontexte, posun obdlznika, vykreslenie
		// obdlznika podla zadania
		g2.draw(obdlznik);
		obdlznik.translate(15, 25);
		g2.draw(obdlznik);

		// bonus
		// vytvorenie noveho obdlznika, nastavenie cervenej, vykreslenie cerveneho
		// obdlznika
		// vyfarbenie na cerveno
		Rectangle obdlznik2 = new Rectangle(50, 50, 200, 150);
		g2.setColor(new Color(255,0,0));
		g2.draw(obdlznik2);
		g2.fill(obdlznik2);

		// manualne nastavenie novej polohy a velkosti obdlznika, nastavenie bielej,
		// vykreslenie,
		// vyplnenie na bielo
		obdlznik2.x = 100;
		obdlznik2.y = 110;
		obdlznik2.width = 100;
		obdlznik2.height = 30;
		g2.setColor(new Color(255, 255, 255));
		g2.draw(obdlznik2);
		g2.fill(obdlznik2);

		// posun obdlznika pomocou translate() a manualne nast. velkosti obdlznika,
		// vykreslenie, vyplnenie

		obdlznik2.translate(35, -35);
		obdlznik2.width = 30;
		obdlznik2.height = 100;
		g2.draw(obdlznik2);
		g2.fill(obdlznik2);




	}
}