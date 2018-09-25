package sk.itvkurze.webinar25._03_zoliky_zhora_ohranicene;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Polia podporuju tzv. typovy covariant
// Kolekcie nepodporuju tzv. typovy covariant
public class ArchivOsobTest
{
    private ObchodnyPartner peter_kovac = new ObchodnyPartner("Peter Kovac", 89);
    private ObchodnyPartner emil_horvath = new ObchodnyPartner("Emil Horvath", 100);
    private Zamestnanec julo_matas = new Zamestnanec("Julo Matas", 65);

    private File subor;
    private ZapisovacOsob zapisovac;
    private CitacOsob citac;

    @Test
    public void testCitanieZPrazdnehoSuboru() throws Exception
    {
    	CitacOsob citac = new CitacOsob(subor);

        assertNull(citac.nacitaj());
    }

    @Test
    public void testZapisANacitajOsoby() throws Exception
    {
        ZapisovacOsob zapisovac = new ZapisovacOsob(subor);
        CitacOsob citac = new CitacOsob(subor);

        // substitucny princip
        zapisovac.uloz(peter_kovac);

        assertEquals(peter_kovac, citac.nacitaj());
    }

    @Test
    public void testUlozeniaANacitaniaDvochOsob() throws Exception
    {
        zapisovac.uloz(peter_kovac);
        zapisovac.uloz(emil_horvath);

        assertEquals(peter_kovac, citac.nacitaj());
        assertEquals(emil_horvath, citac.nacitaj());
    }
    
    @Test
    public void testUlozeniaANacitaniaPolaOsob() throws Exception
    {
    	// pouzivanie invariantov je typovo nebezpecne, nakolko ...
    	// hitneme ArrayStoreException
//    	Zamestnanec[] zamestnanci = new Zamestnanec[2];
//    	Osoba[] osoby = zamestnanci;
    	
    	ObchodnyPartner[] partnery = new ObchodnyPartner[2];
    	Osoba[] osoby = partnery;
    	
    	osoby[0] = peter_kovac;
    	osoby[1] = emil_horvath;
    	
    	zapisovac.ulozPole(osoby);
    	
    	assertEquals(peter_kovac, citac.nacitaj());
        assertEquals(emil_horvath, citac.nacitaj());
    }
    
    @Test
    public void testUlozeniaANacitaniaZoznamuOsob() throws Exception
    {
    	List<ObchodnyPartner> partnery = new ArrayList<>();
    	// problem s hornym ohranicenim ...
    	// List<Osoba> partnery = new ArrayList<>();
    	partnery.add(peter_kovac);
    	partnery.add(emil_horvath);
    	
    	zapisovac.ulozZoznamSOhranicenim(partnery);
    	// zapisovac.ulozZoznamBezOhranicenia(partnery);
    	
    	assertEquals(peter_kovac, citac.nacitaj());
        assertEquals(emil_horvath, citac.nacitaj());
    }

    @Before
    public void setUp() throws Exception
    {
        subor = File.createTempFile("tmp", "osoby");
        zapisovac = new ZapisovacOsob(subor);
        citac = new CitacOsob(subor);
    }

    @After
    public void tearDown()
    {
        if (subor.exists())
        {
            subor.delete();
        }
    }
}