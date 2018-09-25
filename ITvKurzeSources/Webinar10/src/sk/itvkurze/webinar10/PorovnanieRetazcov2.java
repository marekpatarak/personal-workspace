package sk.itvkurze.webinar10;

public class PorovnanieRetazcov2 {

	public static void main(String[] args) {
		System.out.println("\t".equals("\n"));
		System.out.println("\t".equals("\t "));
		System.out.println("\u0000".equals("\u0000\u0000"));
		System.out.println("test".equalsIgnoreCase("TEST"));
		System.out.println("\t".length());
		System.out.println("\t".equals("	"));

		System.out.println("TEST".toLowerCase().equals("test"));

	}

}
