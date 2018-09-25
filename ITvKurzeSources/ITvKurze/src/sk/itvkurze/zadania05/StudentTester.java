package sk.itvkurze.zadania05;

public class StudentTester {

	public static void main(String[] args) {
		// vytvorenie noveho studenta
		Student novyStudent = new Student("Marek Patarák");

		// 1.test , 20 bodov
		novyStudent.vykonajTest(20);

		// vypisanie stavu studenta po 1 teste
		System.out.println("Meno studenta: " + novyStudent.getMeno());
		System.out.println("Ocakavany vystup je: Marek Patarák");
		System.out.println("Celkove skore studenta: " + novyStudent.getCelkoveSkore() + " bodov");
		System.out.println("Ocakavany vystup je: 20 bodov");
		System.out.println("Priemerne skore studenta: " + novyStudent.getPriemerneSkore() + " bodov");
		System.out.println("Ocakavany vystup je: 20 bodov");
		System.out.println();

		// 2.test , 30 bodov
		novyStudent.vykonajTest(30);

		// vypisanie stavu studenta po 2 teste
		System.out.println("Meno studenta: " + novyStudent.getMeno());
		System.out.println("Ocakavany vystup je: Marek Patarák");
		System.out.println("Celkove skore studenta: " + novyStudent.getCelkoveSkore() + " bodov");
		System.out.println("Ocakavany vystup je: 50 bodov");
		System.out.println("Priemerne skore studenta: " + novyStudent.getPriemerneSkore() + " bodov");
		System.out.println("Ocakavany vystup je: 25 bodov");
		System.out.println();

		// pocet testov sa uchovava ale neda sa k nemu pristupit
	}

}
