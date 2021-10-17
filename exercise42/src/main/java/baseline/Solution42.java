package baseline;

import java.util.List;
import java.util.*;
import java.io.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */


public class Solution42 {

    public static List<List<String>> readInput(){
        // try catch read input
        List<List<String>> inputList = new ArrayList<>();
        try {
            // create a file object
            File myObj = new File("exercise42_input.txt");
            Scanner myReader = new Scanner(myObj);
            // while we have a next line pass it to csvParser
            while (myReader.hasNextLine()) {
                String temp = myReader.nextLine();
                inputList.add(csvParse(temp));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return inputList;
    }

    public static List<String> csvParse(String input) {
        return Arrays.asList(input.split(","));
    }

    public static void printList (List<List<String>> input) {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (List<String> line : input) {
            for (String names : line) {
                System.out.printf("%-11s", names);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<List<String>> input = readInput();
        printList(input);
    }
}
