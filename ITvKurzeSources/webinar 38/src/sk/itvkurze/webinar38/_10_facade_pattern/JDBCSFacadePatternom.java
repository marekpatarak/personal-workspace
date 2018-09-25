package sk.itvkurze.webinar38._10_facade_pattern;

import java.util.List;

public class JDBCSFacadePatternom
{
	public static void main(String[] args)
	{
		JdbcFacade jdbcFacade = new JdbcFacade();
		
		jdbcFacade.vytvorTabulku();
		
		System.out.println("Tabulka bola vytvorena.");
		
		jdbcFacade.vlozDataDoTabulky();
		
		System.out.println("Data boli uspedne vlozene do tabulky");
		
		List<Adresa> adresy = jdbcFacade.getAdresy();
		
		for (Adresa adresa : adresy)
		{
			System.out.println(adresa.getId() + " " + adresa.getUlica() + " " + adresa.getMesto());
		}
	}
}
