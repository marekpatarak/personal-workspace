package sk.itvkurze.webinar25._01_ohranicenie_typu;

// v nasom pripade T je akakolvek trieda, alebo rozhranie, ktore implementuje
// rozhranie Comparable, cize je mozne na danom objekte zavola metetodu compareTo
public class ZotriedenaDvojica<T extends Comparable<T>>
{
	private final T prvyClen;
	private final T druhyClen;
	
	public ZotriedenaDvojica(T prvyClen, T druhyClen)
	{
		// este pred priradenim chceme vediet, ktory clen je skutocne mensi
		if (prvyClen.compareTo(druhyClen) < 0)
		{
			this.prvyClen = prvyClen; 
			this.druhyClen = druhyClen;
		}
		else 
		{
			this.prvyClen = druhyClen;
			this.druhyClen = prvyClen;
		}
	}

	public T getPrvyClen()
	{
		return prvyClen;
	}

	public T getDruhyClen()
	{
		return druhyClen;
	}
	
	
}
