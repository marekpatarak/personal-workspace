package sk.itvkurze.webinar38._11_flyweight_pattern;

public class SimpleFlyweightDemo
{
	public static void main(String[] args)
	{
		Integer prveCislo = Integer.valueOf(5);

		Integer druheCislo = Integer.valueOf(5);

		Integer tretieCislo = Integer.valueOf(10);

		System.out.println(System.identityHashCode(prveCislo));
		System.out.println(System.identityHashCode(druheCislo));
		System.out.println(System.identityHashCode(tretieCislo));

	}
}
