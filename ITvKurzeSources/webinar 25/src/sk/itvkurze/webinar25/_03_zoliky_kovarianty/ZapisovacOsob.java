package sk.itvkurze.webinar25._03_zoliky_kovarianty;

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
}
