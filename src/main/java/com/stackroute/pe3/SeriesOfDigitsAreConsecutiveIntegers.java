package main.java.com.stackroute.pe3;

/*
Finds out if a series of 7 digits are consecutive numbers.
 */

import java.util.Arrays;

public class SeriesOfDigitsAreConsecutiveIntegers {
    public boolean checkWhetherTheNumbersAreConsecutive(int[] inputValues) {
        boolean result = true;
        Arrays.sort(inputValues);
        for(int i=0; i<inputValues.length; i++) {
            if(i < inputValues.length-1) {
                if (inputValues[i + 1] == (inputValues[i] + 1)) {
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
