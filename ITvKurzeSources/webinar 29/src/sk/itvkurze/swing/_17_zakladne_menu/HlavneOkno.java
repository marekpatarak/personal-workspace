package sk.itvkurze.swing._17_zakladne_menu;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
		JMenuItem zobrazFormularItem = new JMenuItem("Formular Osobne Data");
		zobrazMenu.add(zobrazFormularItem);
		windowMenu.add(zobrazMenu);
		
		menuBar.add(fileMenu);
		menuBar.add(windowMenu);
		
		return menuBar;
	}
}
