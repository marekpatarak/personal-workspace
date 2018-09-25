package sk.itvkurze.swing._28_vyber_riadkov_v_tabulke.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import sk.itvkurze.swing._28_vyber_riadkov_v_tabulke.controller.Controller;



public class HlavneOkno extends JFrame
{
	private VlastnyPanel panel;
	private PanelSNastrojmi panelSNastrojmi;
	private Formular formular;
	private JFileChooser fileChooser;
	private Controller controller;
	private TabulkaPanel tabulka;
	
	private static final String OSOBNE_DATA_DIR = "C:\\OSOBNE_DATA\\";

	public HlavneOkno()
	{
		super("Jednoducha Desktopova Aplikacia");

		setLayout(new BorderLayout());

		panel = new VlastnyPanel();
		panelSNastrojmi = new PanelSNastrojmi();
		formular = new Formular();
		tabulka = new TabulkaPanel();
		
		controller = new Controller();
		
		tabulka.setData(controller.getOsoby());

		setJMenuBar(vytvorMenuBar());
		
		fileChooser = new JFileChooser(OSOBNE_DATA_DIR);
		// filter na osobne data
		fileChooser.addChoosableFileFilter(new OsobneDataFilter());
		
		// filter na obrazky
		// fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Subory s obrazkami", ImageIO.getReaderFileSuffixes()));
		fileChooser.setAcceptAllFileFilterUsed(false);

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
				controller.vlozOsobu(event);
				tabulka.refresh();
			}
		});

		// add(panel, BorderLayout.CENTER);
		add(tabulka, BorderLayout.CENTER);
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
		importDataItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		exportDataItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		importDataItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// potrebujeme skontrolovat, ci pouzivatel klikol na spravne tlacitko
				
				if (fileChooser.showOpenDialog(HlavneOkno.this) == JFileChooser.APPROVE_OPTION)
				{
					File vybranySubor = fileChooser.getSelectedFile();
					try
					{
						controller.nacitajZoSuboru(vybranySubor);
						tabulka.refresh();
					} catch (IOException e1)
					{
						JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne nacitat data zo suboru '" + vybranySubor + "'", "Chyba pri citani", JOptionPane.ERROR_MESSAGE);
					}
					System.out.println("Import dat: " + vybranySubor);
				}
			}
		});
		
		exportDataItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// potrebujeme skontrolovat, ci pouzivatel klikol na spravne tlacitko
				
				if (fileChooser.showSaveDialog(HlavneOkno.this) == JFileChooser.APPROVE_OPTION)
				{
					File vybranySubor = fileChooser.getSelectedFile();
					// kontrola pripony, ak pouzivatel zabudne doplnit prionu .osd, doplnime ju za neho
					vybranySubor = skontrolujPriponu(vybranySubor);
					
					try
					{
						controller.ulozDoSuboru(vybranySubor);
					} catch (IOException e1)
					{
						JOptionPane.showMessageDialog(HlavneOkno.this, "Nie je mozne zapisat data do suboru '" + vybranySubor + "'", "Chyba pri zapise", JOptionPane.ERROR_MESSAGE);
					}
					System.out.println("Export dat: " + fileChooser.getSelectedFile());
				}
			}

			private File skontrolujPriponu(File vybranySubor)
			{
				String nazov = vybranySubor.getAbsolutePath();
				if (! nazov.endsWith(".osd"))
				{
					nazov += ".osd";
				}
				
				return new File(nazov);
			}
		});

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
