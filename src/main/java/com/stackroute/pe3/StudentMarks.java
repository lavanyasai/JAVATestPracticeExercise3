package main.java.com.stackroute.pe3;

/*
Checks whether the student grades are in the range of 0 and 100.
 */

public class StudentMarks {
    public String checkWhetherTheValuesAreInRange(int numberOfStudents, int[] studentGrades) {
        String result = "Grades are correct";
        try {
            for (int i = 0; i < numberOfStudents; i++) {
                if (studentGrades[i] < 0 || studentGrades[i] > 100) {
                    throw new Exception("Grades");
                }
            }
        }
        catch (Exception exception) {
            result = "Exception";
        }
        return result;
    }
}
