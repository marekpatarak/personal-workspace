package sk.itvkurze.webinar25._03_zoliky_neohranicene;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class ZapisovacOsob
{
	private final RandomAccessFile subor;
	
	public ZapisovacOsob(final File subor) throws FileNotFoundException 
	{
		this.subor = new RandomAccessFile(subor, "rw");
	}
	
	public void uloz(Osoba osoba) throws IOException
	{
		subor.writeUTF(osoba.getClass().getName());
		subor.writeUTF(osoba.getMeno());
		subor.writeInt(osoba.getVek());
	}

	public void ulozPole(Osoba[] osoby) throws IOException
	{
		for(Osoba osoba : osoby) 
		{
			uloz(osoba);
		}
	}
	
	public void ulozZoznamBezOhranicenia(final List<Osoba> osoby) throws IOException
	{
		for(Osoba osoba : osoby)
		{
			uloz(osoba);
		}
	}
	
	// zolik s hornym ohranicenim
	// public void ulozZoznamSOhranicenim(final List<T extends Osoba> osoby) throws IOException
	public <T extends Osoba> void ulozZoznamSOhranicenim(final List<T> osoby) throws IOException
	{
		for(Osoba osoba : osoby)
		{
			uloz(osoba);
		}
	}
}
