package sk.itvkurze.webinar36._08_composite_pattern;

import java.util.HashMap;
import java.util.Map;

public class CompositePatternDemo
{
	public static void main(String[] args)
	{
		Map<String, String> nastaveniaOsoby = new HashMap<>();

		nastaveniaOsoby.put("rola", "osoba");
		nastaveniaOsoby.put("pristup", "obmedzeny");

		Map<String, String> skupinaAtributov = new HashMap<>();
		skupinaAtributov.put("skupinova_rola", "hr");

		Map<String, String> vsetkyAtributy = new HashMap<>();

		vsetkyAtributy.putAll(nastaveniaOsoby);
		vsetkyAtributy.putAll(skupinaAtributov);
		
		System.out.println(vsetkyAtributy);
	}
}
