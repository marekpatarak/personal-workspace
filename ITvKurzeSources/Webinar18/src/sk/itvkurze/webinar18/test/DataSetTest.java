package sk.itvkurze.webinar18.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;

import sk.itvkurze.webinar18.impl.DataSet;

public class DataSetTest {

	// right click na class >> new >> Junit test case >> vybrat metody pre ktore
	// chceme vytvorit test case

	@Test
	public void testPripravDataOK() {
		String[] data = { "test1", "test2" };
		DataSet dataSet = new DataSet();
		assertArrayEquals(data, dataSet.pripravData());
	}

	@Test
	public void testPripravData2OK() {
		String[] data = { "gen1", "gen2" };
		DataSet dataSet = new DataSet();
		assertArrayEquals(data, dataSet.pripravData2());
	}

	@Test
	public void testPripravDataNull() {
		assertNotNull(new DataSet().pripravData2());
	}

	@Test
	public void testPripravData2notOK() {
		String[] data = { "gen1", "gen2", "gen3" };
		DataSet dataSet = new DataSet();
		String testData = Arrays.toString(data);
		String ziskData = Arrays.toString(dataSet.pripravData2());
		assertEquals(testData, ziskData);

	}

}
