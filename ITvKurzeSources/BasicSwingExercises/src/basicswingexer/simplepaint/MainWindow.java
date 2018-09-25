package basicswingexer.simplepaint;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame implements ActionListener {

	// private JPanel panel;
	private KomponentaCanvas canvas;
	private JColorChooser colorChooser;
	private String clickedShape;

	public MainWindow() {
		// TODO Auto-generated constructor stub
		super("Simple paint");
		// this.panel = new JPanel();
		this.canvas = new KomponentaCanvas();
		this.colorChooser = new JColorChooser();
		this.clickedShape = "Obdlznik";
		setLayout(new BorderLayout());
		setJMenuBar(createMenuBar());

		canvas.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				canvas.setColor(MainWindow.this.colorChooser.getColor());
				System.out.println(clickedShape);
				if (clickedShape.equals("Obdlznik"))
					canvas.setShape(new Rectangle(e.getX(), e.getY(), 50, 50));
				if (clickedShape.equals("Elipsa"))
					canvas.setShape(new Ellipse2D.Double(e.getX(), e.getY(), 50, 50));
				canvas.paintImmediately(e.getX(), e.getY(), 51, 51);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		setVisible(true);
		setSize(1000, 800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		add(canvas, BorderLayout.CENTER);
		add(colorChooser, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	public JMenuBar createMenuBar() {

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenu tvaryMenuItem = new JMenu("Tvary");
		JMenuItem exitMenuItem = new JMenuItem("Exit");

		menu.add(tvaryMenuItem);
		menu.addSeparator();
		menu.add(exitMenuItem);

		JMenuItem rectItem = new JMenuItem("Obdlznik");
		JMenuItem elipsItem = new JMenuItem("Elipsa");

		ActionListener menuItemListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JMenuItem klikTvarItem = (JMenuItem) e.getSource();
				MainWindow.this.clickedShape = klikTvarItem.getText();
			}
		};

		rectItem.addActionListener(menuItemListener);
		elipsItem.addActionListener(menuItemListener);

		tvaryMenuItem.add(rectItem);
		tvaryMenuItem.add(elipsItem);

		menuBar.add(menu);
		menuBar.setVisible(true);

		return menuBar;
	}

}
