package sk.itvkurze.webinar25._03_zoliky_neohranicene;

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
			
			// class je trieda ktora reprezentuje samotnu triedu, je genericka
			// metoda forName na zaklade retazca zisti o aku triedu sa jedna a vytvori jej
			// instanciu, v case kompilacie nie sme schopni zistit presny typ tejto triedy
			// a preto specifikujeme neohraniceny zolik, co moze predstavovat akykolvek typ
			// mohli by sme to zapisat aj nasledovne, ale nema to ziadne logicke opodstatnene
			// final Class<? extends Object> triedaOsoba = Class.forName(nazovTriedy);
			
			// aky je roziel medzi <?> a <Object> ???
			// <?> - specifikuje akykolvek typ triedy, ktory je ziatial neznamy
			// <Object> specifikuje presny konkretny jeden typ, ktory je java.lang.Object
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
