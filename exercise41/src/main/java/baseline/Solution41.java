package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.io.*;
import java.util.*;

public class Solution41 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // try catch
        try {
            // create a file object

            File myObj = new File("exercise41_input.txt");
            Scanner myReader = new Scanner(myObj);
            // while we have a next line put it into a array
            while (myReader.hasNextLine()) {
                names.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // print
        Collections.sort(names);
        System.out.println("Total of " + names.size() + " names");
        System.out.println("-----------------");
        for(String x : names) {
            System.out.println(x);
        }
    }
}
