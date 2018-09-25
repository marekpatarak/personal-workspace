package sk.itvkurze.zadania01;
import javax.swing.JOptionPane;

public class ZobrazovacDialogu2 {

	public static void main(String[] args) {
		String vaseMeno = JOptionPane.showInputDialog("Ako sa volas?");
		JOptionPane.showMessageDialog(null, "Ahoj, " + vaseMeno + " :))");
		JOptionPane.showMessageDialog(null, "Usmievaj sa neustale " + vaseMeno + " :))");
		System.exit(0);
	}
} 
