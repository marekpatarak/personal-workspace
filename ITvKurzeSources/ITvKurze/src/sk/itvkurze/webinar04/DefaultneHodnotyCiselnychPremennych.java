package sk.itvkurze.webinar04;

public class DefaultneHodnotyCiselnychPremennych {

	public static void main(String[] args) {
		Premenne premenne = new Premenne();
		System.out.println("default byte: " + premenne.b);
		System.out.println("default short: " + premenne.s);
		System.out.println("default int:" + premenne.i);
		System.out.println("default long:" + premenne.l);
		System.out.println("default float:" + premenne.f);
		System.out.println("default double:" + premenne.d);
	}
}
	class Premenne {

		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
	}


