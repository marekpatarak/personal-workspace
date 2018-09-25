package sk.itvkurze.webinar34._04_builder_pattern;

public class BuilderPatternDemo
{
	public static void main(String[] args)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Toto je priklad ");
		builder.append("pouzitia builder patternu. ");
		builder.append("Obsahuje metody na pridavanie ");
		builder.append(" takmer cohokolvek, z coho si neskor vyrobime retazec.");
		builder.append(55);
		String text = builder.toString();
		System.out.println(text);
	}
}
