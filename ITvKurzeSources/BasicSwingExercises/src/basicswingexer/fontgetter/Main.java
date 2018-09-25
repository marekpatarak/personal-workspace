package basicswingexer.fontgetter;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class Main {

	public static void main(String[] args) {

		Font[] poleFontov = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

		for (Font font : poleFontov) {
			System.out.println(font.getFontName());
		}
	}

}
