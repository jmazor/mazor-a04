package baseline;

import java.util.List;
import java.util.*;
import java.io.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */


public class Solution42 {
    public static void main(String[] args) {
        File file = new File("./data/exercise42_input.txt");
        MyParser csvData = new MyParser(file);
        csvData.printList();
    }
}
