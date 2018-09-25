package sk.itvkurze.webinar24._01_typovo_nebezpecny_kod;

import java.util.ArrayList;
import java.util.List;

public class Priklad
{
	public static void main(String[] args)
	{
		List<String> studenti = new ArrayList<String>();		// type inference
		
	//	studenti.add(99);
		studenti.add("Igor Kovac");
		
		
		System.out.println(studenti);
		
		String prvyStudent = studenti.get(0);
		System.out.println("Prvy student: " + prvyStudent);
	}
}
