package sk.itvkurze.webinar23.archiv_po_moduloch.csv;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import sk.itvkurze.webinar23.archiv_po_moduloch.ArchivException;
import sk.itvkurze.webinar23.archiv_po_moduloch.ArchivZmluv;
import sk.itvkurze.webinar23.archiv_po_moduloch.Kriterium;
import sk.itvkurze.webinar23.archiv_po_moduloch.Zmluva;

public class CSVArchivZmluv implements ArchivZmluv
{
    private final List<Zmluva> zmluvy;
    private final CSVPersistor persistor;

    private int nasledujuceId = 1;

    public CSVArchivZmluv(final String cesta)
    {
        persistor = new CSVPersistor(cesta);
        zmluvy = persistor.nacitaj();
    }

    @Override
    public void vloz(final Zmluva zmluva) throws ArchivException
    {
        if (zmluva.getId() == NEEXISTUJUCE_ID)
        {
            zmluvy.add(zmluva);
            zmluva.setId(nasledujuceId++);
        }
    }

    @Override
    public void zmaz(final Zmluva zmluvaNaZmazanie) throws ArchivException
    {
        if (zmluvy.removeIf(engagement -> engagement.getId() == zmluvaNaZmazanie.getId()))
        {
            zmluvaNaZmazanie.setId(NEEXISTUJUCE_ID);
        }
    }

    @Override
    public Iterable<Zmluva> vyhladaj(final Kriterium kriterium) throws ArchivException
    {
        return zmluvy.stream().filter(aplikujFilter(kriterium)).collect(Collectors.toList());
    }

    private Predicate<? super Zmluva> aplikujFilter(final Kriterium kriterium)
    {
        final String klient = kriterium.getKlient();
        return zmluva -> zmluva.getOdpracovaneHodiny() >= kriterium.getPrinajmensomOdpracovanychHodin() &&
                             (klient == null || zmluva.getKlient().equals(klient));
    }

    @Override
    public void close() throws Exception
    {
        persistor.uloz(zmluvy);
    }
}
