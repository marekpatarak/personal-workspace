package sk.theory.misc;

public class TestIfDebug {

	public static void main(String[] args) {

		// stanovenie breakpointu pre debug
		// doubleclick na cislo riadka
		// alt shift D - skratka debug + j ako java aplikacia
		// v ramic debug perspektivy
		// resume - pokracovanie po dalsi breakpoint, ak nie je tak dokonci program
		// suspend - pozastavenie vlakna
		// terminate - ukoncenie debugu
		// step into f5 = zanorenie napr. do metody
		// step over f6 - preskocenie zanorenia

		int cislo = 5;
		// porovnavacie operatory <, >, <=, >=, ==, !=

		// otocenie podmienky (!(podmienka))
		System.out.println("Pred prikazom vetvenia");

		if (!(cislo >= 5)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("Po prikaze vetvenia");

	}

}
