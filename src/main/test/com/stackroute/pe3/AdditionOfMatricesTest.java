package main.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.AdditionOfMatrices;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class AdditionOfMatricesTest {

    AdditionOfMatrices additionOfMatrices;
    int[][] expectedResult;
    int[][] actualResult;

    @Before
    public void setUp() throws Exception {
        additionOfMatrices = new AdditionOfMatrices();
    }

    @Test
    public void checkWhetherTheAdditionOfMatricesIsCorrect() {
        actualResult = additionOfMatrices.computeAdditionOfMatrices(3, 2, new int[][] {{1, 2}, {3, 4}, {5, 6}}, new int[][] {{9, 8}, {7, 6}, {5, 4}});
        expectedResult = new int[][] {{10, 10}, {10, 10}, {10, 10}};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheAdditionOfMatricesIsNotCorrect() {
        actualResult = additionOfMatrices.computeAdditionOfMatrices(-1, 2, new int[][] {{1, 2}, {3, 4}, {5, 6}}, new int[][] {{9, 8}, {7, 6}, {5, 4}});
        assertNull(actualResult);
    }

    @After
    public void tearDown() throws Exception {
        additionOfMatrices = null;
    }
}
