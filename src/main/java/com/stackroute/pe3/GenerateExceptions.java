package main.java.com.stackroute.pe3;

/*
Generate exceptions of type NegativeArraySizeException, IndexOutOfBoundsException and NullPointerException.
 */

public class GenerateExceptions {
    public String generateNegativeArraySizeException() {
        int arraySize = -8;
        try {
            int[] array = new int[arraySize];
        } catch (NegativeArraySizeException ex) {
            return "Negative Array Size Exception";
        }
        return null;
    }

    public String generateIndexOutOfBoundsException() {
        int arraySize = 5;
        try {
            int[] array = new int[arraySize];
            System.out.println(array[8]);
        } catch (IndexOutOfBoundsException ex) {
            return "Index Out Of Bounds Exception";
        }
        return null;
    }

    public String generateNullPointerException() {
        String string = null;
        try
        {
            if (string.equals("")) {
                System.out.print("Same");
            }
        } catch (NullPointerException ex) {
            return  "Null Pointer Exception";
        }
        return null;
    }
}
