package sk.itvkurze.swing._40_zatvorenie_okna_aplikacie.gui;

public class PriponaSuboruUtil
{
	public static String getPripnaSuboru(String nazovSuboru)
	{
		int indexBodky = nazovSuboru.lastIndexOf(".");
		
		if (indexBodky == -1)
		{
			return null;
		}
		
		if (indexBodky == nazovSuboru.length() - 1)
		{
			return null;
		}
		
		return nazovSuboru.substring(indexBodky, nazovSuboru.length());
	}
}
