package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void main() {
        List<String> names = new ArrayList<>();
        try {
            // create a file object

            File myObj = new File("exercise41_input.txt");
            Scanner myReader = new Scanner(myObj);
            // while we have a next line put it into a array
            while (myReader.hasNextLine()) {
                names.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Collections.sort(names);
        List<String> test = new ArrayList<>();
        test.add("Johnson, Jim");
        test.add("Jones, Aaron");
        test.add("Jones, Chris");
        test.add("Ling, Mai");
        test.add("Swift, Geoffrey");
        test.add("Xiong, Fong");
        test.add("Zarnecki, Sabrina");
        assertEquals(test, names);
    }
}