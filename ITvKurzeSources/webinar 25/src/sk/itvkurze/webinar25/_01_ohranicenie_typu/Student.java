package sk.itvkurze.webinar25._01_ohranicenie_typu;

public class Student implements Comparable<Student>
{
	private double priemerZnamok;
	
	public double getPriemerZnamok()
	{
		return priemerZnamok;
	}

	public void setPriemerZnamok(double priemerZnamok)
	{
		this.priemerZnamok = priemerZnamok;
	}

	@Override
	public int compareTo(Student o)
	{
		return Double.compare(priemerZnamok, o.getPriemerZnamok());
	}

}
