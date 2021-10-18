package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class MyParser {
    private List<List<String>> inputData;

    public MyParser(File file) {
        inputData = new ArrayList<>();
        try {
            // create a file object
            Scanner myReader = new Scanner(file);
            // while we have a next line pass it to csvParser
            while (myReader.hasNextLine()) {
                String temp = myReader.nextLine();
                csvParse(temp);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // testing constructor
    public MyParser(String input) {
        inputData = new ArrayList<>();
        csvParse(input);
    }

     public void csvParse(String input) {
        inputData.add(Arrays.asList(input.split(",")));
    }

    public void printList() {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (List<String> line : inputData ) {
            for (String names : line) {
                System.out.printf("%-11s", names);
            }
            System.out.println();
        }
    }

    public List<List<String>> getInputData() {
        return inputData;
    }
}
