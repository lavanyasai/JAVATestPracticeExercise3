package main.java.test.com.stackroute.pe3;

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
    public void setUp() throws Exception {
        calculateFirstLastDateOfWeek = new CalculateFirstLastDateOfWeek();
    }

    @Test
    public void checkWhetherTheFirstDateOfWeekIsCorrect() {
        actualResult = calculateFirstLastDateOfWeek.calculateFirstDateOfWeek();
        expectedResult = "Mon 01/07/2019";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheLastDateOfWeekIsCorrect() {
        actualResult = calculateFirstLastDateOfWeek.calculateLastDateOfWeek();
        expectedResult = "Sun 07/07/2019";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        calculateFirstLastDateOfWeek = null;
    }
}