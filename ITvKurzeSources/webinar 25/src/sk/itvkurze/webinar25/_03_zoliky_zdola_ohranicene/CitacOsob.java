package sk.itvkurze.webinar25._03_zoliky_zdola_ohranicene;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CitacOsob
{
	private final RandomAccessFile subor;
	
	public CitacOsob(final File subor) throws FileNotFoundException
	{
		this.subor = new RandomAccessFile(subor, "rw");
	}
	
	public Osoba nacitaj() throws ClassNotFoundException
	{
		try 
		{
			final String nazovTriedy = subor.readUTF();
			final String menoOsoby = subor.readUTF();
			final int vek = subor.readInt();
			
			final Class<?> triedaOsoba = Class.forName(nazovTriedy);
			final Constructor<?> konstruktor = triedaOsoba.getConstructor(String.class, int.class);
			return (Osoba) konstruktor.newInstance(menoOsoby, vek);
		}
		catch (IOException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) 
		{
			return null;
		}
	}

	public void nacitaj(List<? super Osoba> osoby) throws ClassNotFoundException 
	{
		Osoba osoba;
		while ((osoba = nacitaj()) != null)
		{
			osoby.add(osoba);
		}
	}
}
