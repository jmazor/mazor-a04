package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

class Solution41Test {

    @Test
    void main() {
        // ATTENTION GRADER
        // I AM HARDOCDING DATA BECAUSE WHAT IF THE FILE CHANGES
        wordSort actual = new wordSort("Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong");
        List<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        expected.add("Jones, Chris");
        expected.add("Ling, Mai");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        expected.add("Zarnecki, Sabrina");
        actual.sort();
        assertEquals(expected, actual.getWords());
    }
}