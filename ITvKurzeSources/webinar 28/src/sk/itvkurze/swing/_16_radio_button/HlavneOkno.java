package sk.itvkurze.swing._16_radio_button;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

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
}
