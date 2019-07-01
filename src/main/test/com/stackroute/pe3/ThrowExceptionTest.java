package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.ThrowException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThrowExceptionTest {

    ThrowException throwException;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        throwException = new ThrowException();
    }

    @Test
    public void checkWhetherTheExceptionIsRaised() {
        actualResult = throwException.raiseException("Raise Exception");
        expectedResult = "Raise Exception" + "\n" + "Finally";
        assertEquals(expectedResult, actualResult);
    }

     @After
    public void tearDown() throws Exception {
        throwException = null;
    }
}
