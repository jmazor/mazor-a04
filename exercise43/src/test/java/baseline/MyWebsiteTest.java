package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

// THIS TEST LEAVES BEHIND THE /website FOLDER ON PURPOSE

class MyWebsiteTest {
    MyWebsite generatedSite = new MyWebsite("mySite", "Justin", true, true);
    boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }

    @Test
    void createWebsite() {
        generatedSite.createWebsite();
        File file = new File("./data/website/" + generatedSite.getSiteName());
        assertTrue(file.exists());
        deleteDirectory(file);
    }

    @Test
    void createIndex() {
        generatedSite.createWebsite();
        File file = new File("./data/website/" + generatedSite.getSiteName() + "/index.html");
        File dir = new File("./data/website/" + generatedSite.getSiteName());
        String expected = "<head>\n" +
                "\t<meta name=\"author\" content=\"Justin\">\n" +
                "</head>\n";
        String actual = "";
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                actual = actual.concat(myReader.nextLine());
                actual = actual.concat("\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        assertEquals(expected, actual);
        deleteDirectory(dir);
    }

    @Test
    void createJSS() {
        generatedSite.createWebsite();
        File dir = new File("./data/website/" + generatedSite.getSiteName());
        File file = new File("./data/website/" + generatedSite.getSiteName() + "/js");
        assertTrue(file.exists());
        deleteDirectory(dir);
    }

    @Test
    void createCSS() {
        generatedSite.createWebsite();
        File dir = new File("./data/website/" + generatedSite.getSiteName());
        File file = new File("./data/website/" + generatedSite.getSiteName() + "/css");
        assertTrue(file.exists());
        deleteDirectory(dir);

    }
}