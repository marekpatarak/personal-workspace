package sk.itvkurze.swing._13_list_box_praca_s_datami;

import java.util.EventObject;

public class FormularEvent extends EventObject
{
	private String meno;
	private String zamestnanie;
	private int vekovaKategoria;
	
	public FormularEvent(Object source)
	{
		super(source);
	}
	
	public FormularEvent(Object source, String meno, String zamestnanie, int vekovaKategoria)
	{
		super(source);
		
		this.meno = meno;
		this.zamestnanie = zamestnanie;
		this.vekovaKategoria = vekovaKategoria;
	}

	public String getMeno()
	{
		return meno;
	}

	public String getZamestnanie()
	{
		return zamestnanie;
	}

	public int getVekovaKategoria()
	{
		return this.vekovaKategoria;
	}
}
