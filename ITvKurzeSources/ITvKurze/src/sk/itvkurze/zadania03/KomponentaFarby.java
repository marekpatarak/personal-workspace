package sk.itvkurze.zadania03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class KomponentaFarby extends JComponent {
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		g2.setFont(new Font("Arial", Font.PLAIN, 18));
		g2.drawString("Programovanie v Jave ma baví :)", 50, 20);
		g2.setColor(Color.BLUE);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 40);
		g2.setColor(Color.CYAN);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 60);
		g2.setColor(Color.GRAY);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 80);
		g2.setColor(Color.darkGray);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 100);
		g2.setColor(Color.lightGray);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 120);
		g2.setColor(Color.GREEN);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 140);
		g2.setColor(Color.MAGENTA);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 160);
		g2.setColor(Color.orange);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 180);
		g2.setColor(Color.PINK);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 200);
		g2.setColor(Color.RED);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 220);
		g2.setColor(Color.YELLOW);
		g2.drawString("Programovanie v Jave ma baví :)", 50, 240);
		}

	}
