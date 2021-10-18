package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyHistogram {
    private Map<String, Integer> data;

    public MyHistogram(File file) {
            // read through a text file
           data = new HashMap<>();
            try {
                Scanner myReader = new Scanner(file);
                while (myReader.hasNextLine()) {
                    String[] line = myReader.nextLine().split(" ");
                    for (String word: line) {
                        // check to see if word is in map

                        if (data.containsKey(word)) {
                            // if it is increase value
                            data.put(word, data.get(word) + 1);
                        } else {
                            // if not add it to map and increase value
                            data.put(word, 1);
                        }

                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

    }


    public void printMap() {
        // creates a copy of Map
        Map<String, Integer> copyData = new HashMap<>();
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            copyData.put(entry.getKey(), entry.getValue());
        }
        // iterate through every item
        int count = copyData.size();

        for (; count !=0 ; --count) {
            // Gets Highest Map entry
            int max = 0;
            String key = "";
            for (Map.Entry<String, Integer> entry : copyData.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            System.out.printf("%-10s ", key.concat(":"));
            // print number of stars
            for (int i = 0; i != max; ++i) {
                System.out.print("*");
            }
            System.out.println();
            // removes from copy
            copyData.remove(key);
        }
    }
    public Map<String, Integer> getData() {
        return data;
    }
}
