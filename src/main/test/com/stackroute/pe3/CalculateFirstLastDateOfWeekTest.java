package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.CalculateFirstLastDateOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculateFirstLastDateOfWeekTest {

    CalculateFirstLastDateOfWeek calculateFirstLastDateOfWeek;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() {
        calculateFirstLastDateOfWeek = new CalculateFirstLastDateOfWeek();
    }

    @Test
    public void returnsFirstDateOfWeek() {
        actualResult = calculateFirstLastDateOfWeek.calculateFirstDateOfWeek();
        expectedResult = "Mon 01/07/2019";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void returnsLastDateOfWeek() {
        actualResult = calculateFirstLastDateOfWeek.calculateLastDateOfWeek();
        expectedResult = "Sun 07/07/2019";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        calculateFirstLastDateOfWeek = null;
    }
}