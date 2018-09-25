package sk.theory.oop;

public class DogInherit extends AnimalInherit {
	String rasa;
	String farba;

	public DogInherit(String type, String gender, int age, String rasa, String farba) {
		super(type, gender, age);
		this.rasa = rasa;
		this.farba = farba;
	}

	public void bark() {
		System.out.println("Haf Haf");
	}

	@Override
	public void eat() {
		System.out.println(this.rasa + " zerie maso");
	}

	@Override
	public void writeAttributes() {
		super.writeAttributes();
		System.out.println("Rasa: " + this.rasa);
		System.out.println("Farba: " + this.farba);
	}

}
