package sk.itvkurze.webinar23.archiv_po_moduloch.databaza;

import java.sql.ResultSet;
import java.util.Iterator;

import sk.itvkurze.webinar23.archiv_po_moduloch.Zmluva;

class DatabazaIterable implements Iterable<Zmluva>
{
    private ResultSet odpoved;

    public DatabazaIterable(final ResultSet resultSet)
    {
        this.odpoved = resultSet;
    }

    @Override
    public Iterator<Zmluva> iterator()
    {
        return new DatabazaIterator(odpoved);
    }
}
