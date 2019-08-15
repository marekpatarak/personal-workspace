package dk.cngroup.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOrOddTest {

    @Test
    public void shouldEvenOrOddWhenEmptyArray() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("even",evenOrOdd.oddOrEven(new int[]{}));
    }

    @Test
    public void shouldEvenOrOddWhenOneElem() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("even",evenOrOdd.oddOrEven(new int[]{0}));
        assertEquals("odd",evenOrOdd.oddOrEven(new int[]{1}));
        assertEquals("even",evenOrOdd.oddOrEven(new int[]{2}));

    }

    @Test
    public void shouldEvenOrOddWhenMoreElems() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals("odd",evenOrOdd.oddOrEven(new int[]{2, 5, 34, 6}));
        assertEquals("even",evenOrOdd.oddOrEven(new int[]{0, -1, -5}));

    }
}
