package sk.itvkurze.swing._30_dialogove_okno.gui;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class NastaveniaDialog extends JDialog
{
	public NastaveniaDialog(JFrame rodic)
	{
		super(rodic, "Vlastnosti", false);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
}
