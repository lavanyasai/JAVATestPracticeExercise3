package main.java.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.GenerateExceptions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GenerateExceptionsTest {

    GenerateExceptions generateExceptions;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        generateExceptions = new GenerateExceptions();
    }

    @Test
    public void checkWhetherTheNegativeArraySizeExceptionIsRaised() {
        actualResult = generateExceptions.generateNegativeArraySizeException();
        expectedResult = "Negative Array Size Exception";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheIndexOutOfBoundsExceptionIsRaised() {
        actualResult = generateExceptions.generateIndexOutOfBoundsException();
        expectedResult = "Index Out Of Bounds Exception";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheNullPointerExceptionIsRaised() {
        actualResult = generateExceptions.generateNullPointerException();
        expectedResult = "Null Pointer Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        generateExceptions = null;
    }
}
