package main.java.com.stackroute.pe3;

/*
Program to set up an array of places, loop round and remove the vowels.
 */

public class LoopAroundAndRemoveTheVowels {
    public String removeTheVowels(String[] inputString) {
        String result = "";
        for(int j=0; j<inputString.length; j++) {
            for (int i = 0; i < inputString[j].length(); i++) {
                if (inputString[j].charAt(i) == 'a' || inputString[j].charAt(i) == 'e' || inputString[j].charAt(i) == 'i' || inputString[j].charAt(i) == 'o' || inputString[j].charAt(i) == 'u') {
                    result = result.concat("");
                } else {
                    result = result.concat(String.valueOf(inputString[j].charAt(i)));
                }
            }
            result = result + "\n";
        }
        return result;
    }
}