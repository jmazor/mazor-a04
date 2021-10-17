package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    @Test
    void sortMap() {
        Map<String, Integer> data = new HashMap<>();
        data.put("Monkey", 2);
        data.put("Gumbo", 7);
        data.put("Time", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Gumbo", 7);
        expected.put("Time", 4);
        expected.put("Monkey", 2);

        //data = Solution46.sortMap(data);
        // iterate through every item
        String test = "";

        //actual
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            test = test.concat(entry.getKey());
            // print number of stars
            test = test.concat(entry.getValue().toString());
            System.out.println();
        }


        // expected
        for (Map.Entry<String, Integer> entry : expected.entrySet()) {
            test = test.concat(entry.getKey());
            // print number of stars
            test = test.concat(entry.getValue().toString());
            System.out.println();
        }
    }
}
