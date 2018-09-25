package sk.itvkurze.webinar36._07_bridge_pattern;

public class BridgeDemo
{
	public static void main(String[] args)
	{
		Film film = new Film();
		film.setZaner("Akcny");
		film.setNazov("Terminator");
		film.setTrvanie("2:15");
		film.setRok("1995");
		
		Formatovac formatovacTlace = new FormatovacTlace();
		Zobrazovac zobrazovacFilmu = new ZobrazovacFilmu(film);
		
		// komponenta formatovac netusi o tom aka realna implementacia zobrazovaca sa pouzije
		// a plati to aj opacne zobrazovac netusi, aka realna implemetacia formatovaca sa pouzije
		String materialNaTlac = zobrazovacFilmu.zobraz(formatovacTlace);
		
		System.out.println(materialNaTlac);
		
		Formatovac htmlFormatovac = new HTMLFormatovac();
		
		String htmlMaterial = zobrazovacFilmu.zobraz(htmlFormatovac);
		System.out.println(htmlMaterial);
	}
}
