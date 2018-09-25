package basicswingexer.simplepaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;

import javax.swing.JComponent;

public class KomponentaCanvas extends JComponent {

	public Point pointA, pointB;
	public Color color;
	public Shape shape;

	public KomponentaCanvas() {
		this.pointA = null;
		this.pointB = null;
	}

	public void setPointB(Point point) {
		this.pointB = point;
	}

	public void setPointA(Point point) {
		this.pointA = point;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
		setPointA(new Point((int) shape.getBounds().getX(), (int) shape.getBounds().getY()));
	}

	public Shape getShape() {
		return this.shape;
	}

	@Override
	public void paint(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(this.color);
		if (pointA != null)
			g2.draw(shape);

	}

}
