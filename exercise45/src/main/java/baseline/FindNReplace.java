package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class FindNReplace {
    private String text;

    public FindNReplace (File file) {
        text = "";
        try {
            // create a file object
            Scanner myReader = new Scanner(file);
            // while we have a next line put it into a string
            while (myReader.hasNextLine()) {
                text = text.concat(myReader.nextLine());
                text = text.concat("\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // testing constructor
    public  FindNReplace(String input) {
        this.text = input;
    }


    public String getText() {
        return this.text;
    }

    public void replaceWords(String removeWord, String addWord) {
        // use replaceAll
        text = text.replaceAll(removeWord, addWord);
    }

    public void printString(File file) {
        try (FileWriter myWriter = new FileWriter(file)){
            myWriter.write(text);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
