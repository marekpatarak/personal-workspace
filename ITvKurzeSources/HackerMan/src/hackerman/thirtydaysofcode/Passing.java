package hackerman.thirtydaysofcode;

public class Passing {

	public static void main(String[] args) {
		// v poli sa zmenia elementy
		int[] pole = { 3, 1 };
		swap(pole);
		System.out.println(pole[0] + " " + pole[1]);

		// hodnota a sa nezmeni
		int a = 4;
		change(a);
		System.out.println(a);

		// hodnota str sa nezmeni
		String str = "before";
		changeStr(str);
		System.out.println(str);

	}

	public static void swap(int[] pole1) {
		pole1 = new int[] { 1, 2, 3 };
		int swap = pole1[0];
		pole1[0] = pole1[1];
		pole1[1] = swap;

	}

	public static void change(int b) {
		b = 5;
	}

	public static void changeStr(String string) {
		string = "after";
	}

}

class Pole {
	int[] pole;

	Pole(int[] pole) {
		this.pole = pole;
	}

	public void swap(int[] polep) {
		int[] test = polep;

		int swap = polep[0];
		polep[0] = polep[1];
		polep[1] = swap;
		this.pole = polep;
	}
}
