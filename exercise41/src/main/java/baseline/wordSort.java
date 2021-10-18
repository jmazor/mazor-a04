package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class wordSort {
    private List<String> words = new ArrayList<>();

    public wordSort(File file) {
        try {
            // create a file object
            File myObj = new File("./data/exercise41_input.txt");
            Scanner myReader = new Scanner(myObj);
            // while we have a next line put it into a array
            while (myReader.hasNextLine()) {
                words.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // testing constructor
    public wordSort(String input) {
        words = Arrays.asList(input.split("\n"));
    }

    public void sort() {
        Collections.sort(words);
    }

    public void printList() {
        System.out.println("Total of " + words.size() + " names");
        System.out.println("-----------------");
        for(String x : words) {
            System.out.println(x);
        }
    }

    public List<String> getWords() {
        return words;
    }
}
