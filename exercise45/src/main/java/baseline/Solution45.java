package baseline;

import java.io.File;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class Solution45 {

    public static void main(String[] args) {
        File input = new File("./data/exercise45_input.txt");
        // init FindNReplace
        FindNReplace textInput = new FindNReplace(input);
        // Replace
        textInput.replaceWords("utilize", "use");
        File output = new File("./data/exercise45_output.txt");
        //Output
        textInput.printString(output);
    }
}
