package baseline;

import java.io.File;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */


public class Solution46 {
    // This is a string for testing purposes


    public static void main(String[] args) {
        File file = new File("./data/exercise46_input.txt");
       MyHistogram histogram = new MyHistogram(file);
       histogram.printMap();
    }
}
