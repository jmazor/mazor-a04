package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

class Solution42Test {

    @Test
    void csvParse() {
        MyParser csvData = new MyParser("Ling,Mai,55900");

        List<String> expected = new ArrayList<>();
        expected.add("Ling");
        expected.add("Mai");
        expected.add("55900");
        // ensures csv parse works
        assertEquals(expected, csvData.getInputData().get(0));
    }
}