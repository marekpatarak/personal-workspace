package sk.itvkurze.swing._20_dialogove_okna;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import com.sun.glass.events.KeyEvent;

public class HlavneOkno extends JFrame
{
	private JButton tlacitko;
	private VlastnyPanel panel;
	private PanelSNastrojmi panelSNastrojmi;
	private Formular formular;

	public HlavneOkno()
	{
		super("Graficka Aplikacia");

		setLayout(new BorderLayout());

		panel = new VlastnyPanel();
		panelSNastrojmi = new PanelSNastrojmi();

		formular = new Formular();

		setJMenuBar(vytvorMenuBar());
		
		panelSNastrojmi.setTextListener(new TextListener()
		{
			@Override
			public void posliText(String text)
			{
				// System.out.println(text);
				panel.vlozText(text);
			}
		});

		formular.setFormularListener(new FormularListener()
		{
			public void nastalaFormularEvent(FormularEvent event)
			{
				String meno = event.getMeno();
				String zamestnanie = event.getZamestnanie();
				int vekovaKategoria = event.getVekovaKategoria();
				String status = event.getStatus();
				boolean jeCudzinec = event.jeCudzinec();
				String statnaPrislusnost = event.getStatnaPrislusnost();
				String pohlavie = event.getPohlavie();

				panel.vlozText(meno + ": " + zamestnanie + ": " + vekovaKategoria + ", " + status + ", " + jeCudzinec
						+ ", " + statnaPrislusnost + ", " + pohlavie + "\n");
			}
		});

		add(panel, BorderLayout.CENTER);
		add(panelSNastrojmi, BorderLayout.NORTH);
		add(formular, BorderLayout.WEST);

		setSize(1000, 500);
		setMinimumSize(new Dimension(450, 400));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JMenuBar vytvorMenuBar()
	{
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenuItem exportDataItem = new JMenuItem("Export Dat ...");
		JMenuItem importDataItem = new JMenuItem("Import Dat ...");
		JMenuItem exitItem = new JMenuItem("Exit");

		fileMenu.add(exportDataItem);
		fileMenu.add(importDataItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		// vytvorime si menu v ramci menu
		JMenu windowMenu = new JMenu("Window");
		JMenu zobrazMenu = new JMenu("Zobraz");
		JCheckBoxMenuItem zobrazFormularItem = new JCheckBoxMenuItem("Formular Osobne Data");
		zobrazFormularItem.setSelected(true);

		zobrazMenu.add(zobrazFormularItem);
		windowMenu.add(zobrazMenu);

		menuBar.add(fileMenu);
		menuBar.add(windowMenu);

		zobrazFormularItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JCheckBoxMenuItem menuItem = (JCheckBoxMenuItem) e.getSource();
				formular.setVisible(menuItem.isSelected());
			}
		});

		fileMenu.setMnemonic(KeyEvent.VK_F);
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/*
				// information message, question message, warning ...
				String prihlasovacieMeno = JOptionPane.showInputDialog(HlavneOkno.this, "Zadaj svoje prihlasovacie meno",
						"Zadaj prihlasovacie meno", JOptionPane.OK_OPTION|JOptionPane.QUESTION_MESSAGE);
				
				System.out.println("Prihlasovaie meno: " + prihlasovacieMeno);
				*/
				int odpoved = JOptionPane.showConfirmDialog(HlavneOkno.this, "Skutocne chcete ukoncit program?",
						"Potvrdenie ukoncenia", JOptionPane.OK_CANCEL_OPTION);
				
				if (odpoved == JOptionPane.OK_OPTION)
				{
					System.exit(0);
				}
			}
		});

		return menuBar;
	}
}
