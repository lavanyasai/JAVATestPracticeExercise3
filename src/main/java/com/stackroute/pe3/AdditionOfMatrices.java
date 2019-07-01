package main.java.com.stackroute.pe3;

/*
Performs addition of matrices.
 */

public class AdditionOfMatrices {
    public int[][] computeAdditionOfMatrices(int numberOfRows, int numberOfColumns, int[][] firstMatrixValues, int[][] secondMatrixValues) {
        int[][] result;
        if(numberOfRows > 0 && numberOfColumns > 0) {
            result = new int[numberOfRows][numberOfColumns];
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    result[i][j] = firstMatrixValues[i][j] + secondMatrixValues[i][j];
                }
            }
        }
        else {
            return null;
        }
        return result;
    }
}
