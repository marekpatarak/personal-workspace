package sk.itvkurze.zadanie27_1b;

import java.util.EventObject;

public class PanelFontSetupEvent extends EventObject
{
	private FontColor font;
	private Integer fontSize;
	private boolean isBold;
	private boolean isCursive;
	private String input;
	
	public PanelFontSetupEvent(Object source)
	{
		super(source);
	}
	
	public PanelFontSetupEvent(Object source, FontColor font, Integer fontSize, boolean isBold, boolean isCursive,
			String input)
	{
		super(source);
		
		this.font = font;
		this.fontSize = fontSize;
		this.isBold = isBold;
		this.isCursive = isCursive;
		this.input = input;
	}

	public FontColor getFont()
	{
		return font;
	}

	public void setColor(FontColor font)
	{
		this.font = font;
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
	
}
