package sk.itvkurze.swing._10_gird_bag_layout;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PlochaTextScrollBar extends JPanel
{
	private JTextArea plochaTextu;
	
	public PlochaTextScrollBar() 
	{
		plochaTextu = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(plochaTextu), BorderLayout.CENTER);
	}
	
	public void vlozText(String text)
	{
		plochaTextu.append(text);
	}
}
