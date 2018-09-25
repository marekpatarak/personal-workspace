package sk.itvkurze.zadania03;

import java.util.Random;

public class SimulatorHoduKockou {

	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println("Hod kockou: " + (generator.nextInt(6) + 1));
	}

}
