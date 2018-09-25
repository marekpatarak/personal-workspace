package sk.itvkurze.zadanie27_1d;

import java.awt.Font;

public class FontType extends Font {


	protected FontType(Font font) {
		super(font);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.getFontName();
	}
}
