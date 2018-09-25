package sk.itvkurze.zadanie27_1b;

import java.awt.Color;

public class FontColor {

	Color color;
	String colorName;

	public FontColor(Color color, String colorName) {
		this.color = color;
		this.colorName = colorName;
	}

	public Color getColor() {
		return this.color;

	}

	public String getColorName() {
		return this.colorName;
	}

	@Override
	public String toString() {
		return this.colorName;
	}
}
