package sk.itvkurze.swing._24_MVC_controller.gui;

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
