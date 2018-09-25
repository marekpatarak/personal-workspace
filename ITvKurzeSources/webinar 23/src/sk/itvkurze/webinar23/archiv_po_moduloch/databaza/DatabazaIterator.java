package sk.itvkurze.webinar23.archiv_po_moduloch.databaza;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import sk.itvkurze.webinar23.archiv_po_moduloch.Zmluva;
import sk.itvkurze.webinar23.archiv_po_moduloch.ArchivException;

class DatabazaIterator implements Iterator<Zmluva>
{
    private ResultSet odpoved;

    DatabazaIterator(final ResultSet odpoved)
    {
        this.odpoved = odpoved;
    }

    @Override
    public boolean hasNext()
    {
        try
        {
            return odpoved.next();
        }
        catch (SQLException e)
        {
            throw new ArchivException("Nie je mozne iterovat cez vysledky z DB", e);
        }
    }

    @Override
    public Zmluva next()
    {
        try
        {
            final int id = odpoved.getInt(1);
            final String klient = odpoved.getString(2);
            final int odpracovaneHodiny = odpoved.getInt(3);
            final Zmluva zmluva = new Zmluva(klient, odpracovaneHodiny);
            zmluva.setId(id);
            return zmluva;
        }
        catch (SQLException e)
        {
            throw new ArchivException("Nie je mozne precitat zaznam zmluvy", e);
        }
    }
}
