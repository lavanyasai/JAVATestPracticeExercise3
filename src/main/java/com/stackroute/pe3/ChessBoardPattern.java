package main.java.com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;

/*
Creates a chess board pattern.
 */

public class ChessBoardPattern {
    public String generatePattern() {
        int numberOfRows = 9;
        int numberOfColumns = 8;
        String result = "";
        int blackWhiteIndicator = 1;
        for(int i=0; i<numberOfRows; i++) {
            for(int j=0; j<numberOfColumns; j++) {
                if(blackWhiteIndicator == 1) {
                    result = result + "WW|";
                    blackWhiteIndicator = 0;
                }
                else {
                    result = result + "BB|";
                    blackWhiteIndicator = 1;
                }
            }
            if(blackWhiteIndicator == 1) {
                blackWhiteIndicator = 0;
            }
            else {
                blackWhiteIndicator = 1;
            }
            result = result + "\n";
        }
        return result;
    }
}
