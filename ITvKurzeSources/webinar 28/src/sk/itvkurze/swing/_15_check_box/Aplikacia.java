package sk.itvkurze.swing._15_check_box;

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
