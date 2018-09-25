package sk.itvkurze.webinar25._04_erasure;

public class PrikladInstancie<T>
{
	public boolean equals(Object o)
	{
		if (o instanceof PrikladInstancie /* <T> */)
		{
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(new PrikladInstancie<>() instanceof PrikladInstancie);
		
		System.out.println(new PrikladInstancie<Integer>().equals(new PrikladInstancie<String>()));
	}
}
