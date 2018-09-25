package sk.itvkurze.swing._14_combo_box;

import java.util.EventObject;

public class FormularEvent extends EventObject
{
	private String meno;
	private String zamestnanie;
	private int vekovaKategoria;
	private String status;
	
	public FormularEvent(Object source)
	{
		super(source);
	}
	
	public FormularEvent(Object source, String meno, String zamestnanie, int vekovaKategoria, String status)
	{
		super(source);
		
		this.meno = meno;
		this.zamestnanie = zamestnanie;
		this.vekovaKategoria = vekovaKategoria;
		this.status = status;
	}

	public String getMeno()
	{
		return meno;
	}

	public void setMeno(String meno)
	{
		this.meno = meno;
	}

	public String getZamestnanie()
	{
		return zamestnanie;
	}

	public void setZamestnanie(String zamestnanie)
	{
		this.zamestnanie = zamestnanie;
	}
	
	public int getVekovaKategoria()
	{
		return this.vekovaKategoria;
	}
	
	public String getStatus()
	{
		return this.status;
	}
}
