package sk.itvkurze.webinar36._07_bridge_pattern;

import java.util.ArrayList;
import java.util.List;

public class ZobrazovacFilmu extends Zobrazovac
{
	private Film film;
	
	public ZobrazovacFilmu(Film film) 
	{
		this.film = film;
	}
	
	@Override
	protected List<Detail> getDetaily()
	{
		List<Detail> detaily = new ArrayList<>();
		
		detaily.add(new Detail("Nazov", film.getNazov()));
		detaily.add(new Detail("Rok", film.getRok()));
		detaily.add(new Detail("Trvanie", film.getTrvanie()));
		
		return detaily;
	}
	
	@Override
	protected String getHlavicka()
	{
		return film.getZaner();
	}
}
