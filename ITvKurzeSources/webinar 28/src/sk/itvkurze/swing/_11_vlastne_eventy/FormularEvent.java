package sk.itvkurze.swing._11_vlastne_eventy;

import java.util.EventObject;

//konvencia ze pri tvorbe vlastneho eventu by sa malo dedit od EventObjectu
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

	public String getZamestnanie()
	{
		return zamestnanie;
	}

	
	
}
