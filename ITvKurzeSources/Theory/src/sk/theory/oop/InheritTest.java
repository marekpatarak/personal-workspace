package sk.theory.oop;

public class InheritTest {

	public static void main(String[] args) {

		AnimalInherit zviera = new AnimalInherit("ryba", "samec", 2);
		DogInherit pes = new DogInherit("cicavec", "samica", 10, "Golden", "kremova");

		zviera.eat();
		zviera.writeAttributes();

		System.out.println("-----------------------");

		pes.eat();
		pes.bark();

		System.out.println("-----------------------");
		pes.writeAttributes();
	}

}
