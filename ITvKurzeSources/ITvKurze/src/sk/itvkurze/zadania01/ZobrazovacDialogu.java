package sk.itvkurze.zadania01;
import javax.swing.JOptionPane;

public class ZobrazovacDialogu {

	public static void main(String[] args) {
        String vaseMeno = JOptionPane.showInputDialog("Ako sa volas?");
		System.out.println("Vase meno je: " + vaseMeno);
        System.exit(0);
	}
} 


