package sk.itvkurze.swing._31_spinner_a_specialne_cisla.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Databaza
{
	private List<Osoba> osoby;
	
	public Databaza()
	{
		// pouzijeme implementacu LinkedList nakolko je viac usposobena na pridavanie/mazanie 
		// dat z lubovolenho indexu
		osoby = new LinkedList<Osoba>();
	}
	
	public void vlozOsobu(Osoba osoba)
	{
		osoby.add(osoba);
	}
	
	public List<Osoba> getOsoby()
	{
		// tymto zabezpecime, zemimo tuto triedu nikto zoznam osob nedokaze zmenit
		return Collections.unmodifiableList(osoby);
	}
	
	public void ulozDoSuboru(File subor) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(subor);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Osoba[] ludia = osoby.toArray(new Osoba[osoby.size()]);
		
		oos.writeObject(ludia);
		
		oos.close();
	}
	
	public void nacitajZoSuboru(File subor) throws IOException
	{
		FileInputStream fis = new FileInputStream(subor);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try
		{
			Osoba[] ludia = (Osoba[]) ois.readObject();
			
			osoby.clear();
			
			osoby.addAll(Arrays.asList(ludia));
			
		} catch (ClassNotFoundException e)
		{
			System.err.println("Chyba pri nacitavani suboru");
			e.printStackTrace();
		}
		
		ois.close();
	}

	public void zmazOsobu(int riadok)
	{
		osoby.remove(riadok);
	}
}
