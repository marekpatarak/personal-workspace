package sk.itvkurze.webinar23.archiv_po_moduloch.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import sk.itvkurze.webinar23.archiv_po_moduloch.Zmluva;
import sk.itvkurze.webinar23.archiv_po_moduloch.ArchivException;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CSVPersistor
{
    private static final int STLPEC_KLIENTI = 0;
    private static final int STLPEC_ODPRACOVANE_HODINY = 1;

    private final String cesta;

    CSVPersistor(final String cesta)
    {
        this.cesta = cesta;
    }

    List<Zmluva> nacitaj()
    {
        try (CSVReader citac = new CSVReader(new FileReader(cesta)))
        {
            final List<Zmluva> zmluvy = new ArrayList<>();
            final Iterator<String[]> iterator = citac.iterator();
            while (iterator.hasNext())
            {
                final String[] riadok = iterator.next();
                final String klient = riadok[STLPEC_KLIENTI];
                final int odpracovaneHodiny = Integer.parseInt(riadok[STLPEC_ODPRACOVANE_HODINY]);
                zmluvy.add(new Zmluva(klient, odpracovaneHodiny));
            }
            return zmluvy;
        }
        catch (IOException e)
        {
            throw new ArchivException("Nie je mozne nacitat obsah: " + cesta, e);
        }
    }

    void uloz(final List<Zmluva> zmluvy)
    {
        try (CSVWriter zapisovac = new CSVWriter(new FileWriter(cesta)))
        {
            zmluvy.forEach(zmluva ->
            {
                final String[] riadok = {
                    zmluva.getKlient(),
                    String.valueOf(zmluva.getOdpracovaneHodiny())
                };
                zapisovac.writeNext(riadok);
            });
        }
        catch (IOException e)
        {
            throw new ArchivException("Nie je mozne ulozit obsah: " + cesta, e);
        }
    }
}
