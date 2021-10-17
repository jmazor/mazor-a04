package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */


class FindNReplaceTest {
    FindNReplace test = new FindNReplace("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "utilizes an IDE to write her Java programs\".");

    @Test
    void testReplace() {
        test.replaceWords("utilize", "use");
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        assertEquals(expected, test.getText());
    }
}