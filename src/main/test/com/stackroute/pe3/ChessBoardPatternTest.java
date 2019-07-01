package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.ChessBoardPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChessBoardPatternTest {

    ChessBoardPattern chessBoardPattern;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        chessBoardPattern = new ChessBoardPattern();
    }

    @Test
    public void checkWhetherThePatternIsCorrect() {
        actualResult = chessBoardPattern.generatePattern();
        expectedResult = "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        chessBoardPattern = null;
    }
}
