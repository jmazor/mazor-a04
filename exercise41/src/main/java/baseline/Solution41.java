package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.io.*;
import java.util.*;

public class Solution41 {
    public static void main(String[] args) {
        File file = new File("./data/exercise41_input.txt");
        wordSort words = new wordSort(file);
        words.sort();
        words.printList();

    }
}
