package main.java.test.com.stackroute.pe3;

import main.java.com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentMarksTest {

    StudentMarks studentMarks;
    String expectedResult;
    String actualResult;

    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @Test
    public void checkWhetherTheGradeIsWithinTheRange() {
        actualResult = studentMarks.checkWhetherTheValuesAreInRange(5, new int[] {10, 20, 30, 40, 50});
        expectedResult =  "Grades are correct";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkWhetherTheExceptionIsRaised() {
        actualResult = studentMarks.checkWhetherTheValuesAreInRange(5, new int[] {10, 20, 300, 40, 50});
        expectedResult =  "Exception";
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() throws Exception {
        studentMarks = null;
    }
}
