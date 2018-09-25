package sk.theory.oop;

public class AnimalInherit {
	String type;
	String gender;
	int age;

	public AnimalInherit(String type, String gender, int age) {
		this.age = age;
		this.type = type;
		this.gender = gender;

	}

	public void eat() {
		System.out.println(this.type + " pije mlieko");
	}

	public void writeAttributes() {
		System.out.println("Typ: " + this.type);
		System.out.println("Vek: " + this.age);
		System.out.println("Pohlavie: " + this.gender);

	}

}
