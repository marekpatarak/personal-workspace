package sk.itvkurze.zadanie27_1d;

import java.awt.Color;
import java.awt.Font;
import java.util.EventObject;

public class PanelFontSetupEvent extends EventObject
{
	private Font fontType;
	private Color fontColor;
	private Integer fontSize;
	private boolean isBold;
	private boolean isCursive;
	private String input;
	
	public PanelFontSetupEvent(Object source)
	{
		super(source);
	}
	
	public PanelFontSetupEvent(Object source, Font font, Color color, Integer fontSize, boolean isBold,
			boolean isCursive,
			String input)
	{
		super(source);
		
		this.fontType = font;
		this.fontColor = color;
		this.fontSize = fontSize;
		this.isBold = isBold;
		this.isCursive = isCursive;
		this.input = input;
	}

	public Font getFont() {
		return fontType;
	}

	public void setFont(Font font) {
		this.fontType = font;
	}

	public Color getColor()
	{
		return fontColor;
	}

	public void setColor(Color color)
	{
		this.fontColor = color;
	}


	public Integer getFontSize()
	{
		return fontSize;
	}

	public void setFontSize(Integer fontSize)
	{
		this.fontSize = fontSize;
	}
	
	
	public boolean getIsBold()
	{
		return this.isBold;
	}
	
	public boolean getIsCursive()
	{
		return this.isCursive;
	}
	
	public String getInput() {
		return this.input;
	}
	
	public static Font getFont(PanelFontSetupEvent event) {
		Font nastFont = new Font(event.getFont().toString(), Font.PLAIN, event.getFontSize());

		if (event.getIsBold() == true && event.getIsCursive() == true) {
			nastFont = nastFont.deriveFont(Font.BOLD | Font.ITALIC, nastFont.getSize());
		} else {

			if (event.getIsBold() == true && event.getIsCursive() == false) {
				nastFont = nastFont.deriveFont(Font.BOLD, nastFont.getSize());
			} else {

				if (event.getIsBold() == false && event.getIsCursive() == true) {
					nastFont = nastFont.deriveFont(Font.ITALIC, nastFont.getSize());

				} else {

					if (event.getIsBold() == false && event.getIsCursive() == false) {
						nastFont = nastFont.deriveFont(Font.PLAIN, nastFont.getSize());

					}
				}
			}

		}

		return nastFont;
	}
}
