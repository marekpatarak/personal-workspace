package sk.itvkurze.webinar39._14_command_pattern;
// Receiver
public class Svetlo
{
	private boolean jeZapnute = false; 
	
	public void prepni()
	{
		if (jeZapnute)
		{
			zhasni();
			jeZapnute = false;
		}
		else 
		{
			zazni();
			jeZapnute = true;
		}
	}
	
	public void zazni()
	{
		System.out.println("Svetlo sa zaplo.");
	}
	
	public void zhasni() 
	{
		System.out.println("Svetlo sa zhaslo.");
	}
}
