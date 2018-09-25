package sk.itvkurze.webinar36._07_bridge_pattern;

import java.util.List;

public class FormatovacTlace implements Formatovac
{

	@Override
	public String naformatuj(String hlavicka, List<Detail> detaily)
	{
		StringBuilder builder = new StringBuilder();
		builder.append(hlavicka);
		builder.append("\n");
		
		for (Detail detail : detaily)
		{
			builder.append(detail.getNavestie());
			builder.append(": ");
			builder.append(detail.getHodnota());
			builder.append("\n");
		}
		
		return builder.toString();
	}
}
