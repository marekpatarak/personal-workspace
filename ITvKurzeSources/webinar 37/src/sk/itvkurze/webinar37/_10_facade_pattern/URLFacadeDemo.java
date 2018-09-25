package sk.itvkurze.webinar37._10_facade_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLFacadeDemo
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http", "www.azet.sk", 80, "");

		BufferedReader vstup = new BufferedReader(new InputStreamReader(url.openStream()));

		String riadokVstupu;

		while ((riadokVstupu = vstup.readLine()) != null) {
		    System.out.println(riadokVstupu);
		}
	}
}
