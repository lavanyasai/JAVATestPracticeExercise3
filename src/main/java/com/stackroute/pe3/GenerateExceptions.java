package main.java.com.stackroute.pe3;

/*
Generate exceptions of type NegativeArraySizeException, IndexOutOfBoundsException and NullPointerException.
 */

public class GenerateExceptions {
    public String generateNegativeArraySizeException() {
        String result = null;
        int arraySize = -8;
        try {
            int[] array = new int[arraySize];
        } catch (NegativeArraySizeException ex) {
            result = "Negative Array Size Exception";
        }
        return result;
    }

    public String generateIndexOutOfBoundsException() {
        String result = null;
        int arraySize = 5;
        try {
            int[] array = new int[arraySize];
            System.out.println(array[8]);
        } catch (IndexOutOfBoundsException ex) {
            result = "Index Out Of Bounds Exception";
        }
        return result;
    }

    public String generateNullPointerException() {
        String result = null;
        String string = null;
        try
        {
            if (string.equals("")) {
                System.out.print("Same");
            }
        } catch (NullPointerException ex) {
            result = "Null Pointer Exception";
        }
        return result;
    }
}
