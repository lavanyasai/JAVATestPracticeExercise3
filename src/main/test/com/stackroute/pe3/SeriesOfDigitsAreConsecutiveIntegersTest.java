package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.SeriesOfDigitsAreConsecutiveIntegers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SeriesOfDigitsAreConsecutiveIntegersTest {

    SeriesOfDigitsAreConsecutiveIntegers seriesOfDigitsAreConsecutiveIntegers;
    boolean actualResult;

    @Before
    public void setUp() throws Exception {
        seriesOfDigitsAreConsecutiveIntegers = new SeriesOfDigitsAreConsecutiveIntegers();
    }

    @Test
    public void givenIntegerArrayReturnsFalse() {
        actualResult = seriesOfDigitsAreConsecutiveIntegers.checkWhetherTheNumbersAreConsecutive(new int[]{98, 96, 95, 94, 93});
        assertFalse(actualResult);
    }

    @Test
    public void givenIntegerArrayReturnsTrue() {
        actualResult = seriesOfDigitsAreConsecutiveIntegers.checkWhetherTheNumbersAreConsecutive(new int[]{54, 53, 52, 51, 50, 49, 48});
        assertTrue(actualResult);
    }

    @After
    public void tearDown() throws Exception {
        seriesOfDigitsAreConsecutiveIntegers = null;
    }
}
