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
    void checkHistogram() {
        File file = new File("./data/exercise46_input.txt");
        Map<String, Integer> actual = Solution46.createHistogram(file);
        int count = actual.get("badger");
        assertEquals(7,  count);
    }

    @Test
    void checkMushroom() {
        File file = new File("./data/exercise46_input.txt");
        Map<String, Integer> actual = Solution46.createHistogram(file);
        int count = actual.get("mushroom");
        assertEquals(2,  count);
    }
    @Test
    void checkSnake() {
        File file = new File("./data/exercise46_input.txt");
        Map<String, Integer> actual = Solution46.createHistogram(file);
        int count = actual.get("snake");
        assertEquals(1,  count);
    }

    @Test
    void ensureSize() {
        File file = new File("./data/exercise46_input.txt");
        Map<String, Integer> actual = Solution46.createHistogram(file);
        assertEquals(3,  actual.size());
    }

}



