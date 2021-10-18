package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */


class Solution46Test {

    @Test
    void checkHistogramData() {
        File file = new File("./data/exercise46_input.txt");
        boolean flag  = true;
        MyHistogram expected = new MyHistogram(file);
        int count = expected.getData().get("badger");
        if (count != 7)
            flag = false;
        count = expected.getData().get("mushroom");
        if (count != 2)
            flag = false;
        count = expected.getData().get("snake");
        if (count != 1)
            flag = false;
        assertTrue(flag);
    }

    @Test
    void checkHistogramSize() {
        File file = new File("./data/exercise46_input.txt");
        boolean flag  = true;
        MyHistogram expected = new MyHistogram(file);
        assertEquals(3, expected.getData().size());
    }
    
}



