package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class Solution42Test {

    @Test
    void csvParse() {
        List<String> actual = Solution42.csvParse("1,2,3");
        List<String> expected= new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        assertEquals(expected, actual);
    }
}