package main.java.com.stackroute.pe3;

/*
Throws an object of class Exception inside a try block.
 */

public class ThrowException {
    public String raiseException(String inputString) {
        String result = "";
        try {
            throw new Exception(inputString);
        }
        catch(Exception exception) {
            result = result + exception.getMessage();
        }
        finally {
            result = result + "\n" + "Finally";
        }
        return result;
    }
}
