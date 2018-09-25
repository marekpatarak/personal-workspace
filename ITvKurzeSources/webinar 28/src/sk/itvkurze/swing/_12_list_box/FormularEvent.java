package sk.itvkurze.swing._12_list_box;

import java.util.EventObject;

public class FormularEvent extends EventObject
{
	private String meno;
	private String zamestnanie;
	
	public FormularEvent(Object source)
	{
		super(source);
	}
	
	public FormularEvent(Object source, String meno, String zamestnanie)
	{
		super(source);
		this.meno = meno;
		this.zamestnanie = zamestnanie;
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
	
	
}
