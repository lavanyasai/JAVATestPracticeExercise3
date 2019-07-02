package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.LoopAroundAndRemoveTheVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopAroundAndRemoveTheVowelsTest {

    LoopAroundAndRemoveTheVowels loopAroundAndRemoveTheVowels;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        loopAroundAndRemoveTheVowels = new LoopAroundAndRemoveTheVowels();
    }

    @Test
    public void givenStringsReturnsStringsWithoutVowels() {
        actualResult = loopAroundAndRemoveTheVowels.removeTheVowels(new String[] {"India", "United States", "Germany", "Egypt"});
        expectedResult = "Ind\n" + "Untd Stts\n" + "Grmny\n" + "Egypt\n";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberAsStringReturnsNumber() {
        actualResult = loopAroundAndRemoveTheVowels.removeTheVowels(new String[] {"12345"});
        expectedResult = "12345\n";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        loopAroundAndRemoveTheVowels = null;
    }
}