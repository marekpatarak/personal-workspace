package dk.cngroup.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcStatsTest {

    int[] testArray = {6,9,15,-2,92,11};

    @Test
    public void shouldReturnMinValue() {
        CalcStats calc = new CalcStats();
        assertEquals(-2,calc.getMinValue(testArray));
    }

    @Test
    public void shouldReturnMaxValue() {
        CalcStats calc = new CalcStats();
        assertEquals(92,calc.getMaxValue(testArray));
    }

    @Test
    public void shouldReturnNumberOfElems() {
        CalcStats calc = new CalcStats();
        assertEquals(6,calc.getNumberOfElems(testArray));
    }

    @Test
    public void shouldReturnAverage() {
        CalcStats calc = new CalcStats();
        assertEquals(21.833333,calc.getAverage(testArray),0.001);
    }
}
