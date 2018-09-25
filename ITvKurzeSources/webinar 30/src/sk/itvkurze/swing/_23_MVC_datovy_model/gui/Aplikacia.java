package sk.itvkurze.swing._23_MVC_datovy_model.gui;

import javax.swing.SwingUtilities;

public class Aplikacia
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new HlavneOkno();
			}
		});
	}
}
