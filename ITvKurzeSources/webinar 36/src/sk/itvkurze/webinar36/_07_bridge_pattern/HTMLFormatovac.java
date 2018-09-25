package sk.itvkurze.webinar36._07_bridge_pattern;

import java.util.List;

public class HTMLFormatovac implements Formatovac
{

	@Override
	public String naformatuj(String hlavicka, List<Detail> detaily)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		builder.append("<th>");
		builder.append("Zaner");
		builder.append("</th>");
		builder.append("<th>");
		builder.append(hlavicka);
		builder.append("</th>");
		
		for (Detail detail : detaily)
		{
			builder.append("<tr><td>");
			builder.append(detail.getNavestie());
			builder.append("</td><td>");
			builder.append(detail.getHodnota());
			builder.append("</td></tr>");
		}
		builder.append("</table>");
		
		return builder.toString();
	}

}
