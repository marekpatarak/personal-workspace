package sk.theory.misc;

public class ArgumentyProgramu {

	public static void main(String[] args) {

		/*
		 * nastavenie argumentov programu String[] args Run >> Run Configurations
		 * zalozka Arguments >> VM arguments (argumenty JVM) Program arguments - pole
		 * stringov
		 */

		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);

		// pri spustani z cmd ideme iba po dir src (nie hlbsie)
		// napr javac sk\theory\misc\ArgumentyProgramu.java
		// java sk.theory.misc.ArgumentyProgramu - bez argumentov
		// java sk.theory.misc.ArgumentyProgramu jeden 2 tri 4 - s argumentami

		// JavaP
		// skompilovanemy kod bytecode sa da prehliadnut pomocou javap
		// javap sk\theory\misc\ArgumentyProgramu.class
		// prezriet moznosti do cmd - javap
		// usage javap <options> <classes>

	}
}