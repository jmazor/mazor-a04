package baseline;

import java.io.*;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */


public class MyWebsite {
    static final String CREATE_SUCCESS = "Created: ./website/";
    static final String CREATE_FAILURE = "File already exists.";
    static final String RELATIVE_PATH = "./data/website/";

    private String siteName;
    private String author;
    private boolean javaScript;
    private boolean css;

    public MyWebsite() {
        // create Scanner
        Scanner sc = new Scanner(System.in);
        // ask for site name
        System.out.print("Site Name: ");
        siteName = sc.nextLine();
        // ask for author name
        System.out.print("Author: ");
        author = sc.nextLine();
        // ask if javascript should be created
        System.out.print("Do you want a folder for JavaScript? ");
        String temp = sc.nextLine();
        javaScript = temp.equals("y") || temp.equals("Y") || temp.equals("Yes") || temp.equals("yes") || temp.equals("YES");
        System.out.print("Do you want a folder for CSS? ");
        temp = sc.nextLine();
        css = temp.equals("y") || temp.equals("Y") || temp.equals("Yes") || temp.equals("yes") || temp.equals("YES");

    }

    // testing Constructor
    public MyWebsite(String siteName, String author, boolean javaScript, boolean css) {

        this.siteName = siteName;
        this.author = author;
        this.javaScript = javaScript;
        this.css = css;
    }

    public void createWebsite() {
        this.createDir();
        this.createIndex();
        this.createJS();
        this.createCSS();
    }


    private void createDir() {
        File newDir = new File(RELATIVE_PATH + siteName);
        boolean bool = newDir.mkdirs();
        if (bool) {
            System.out.println(CREATE_SUCCESS + siteName);
        } else {
            System.out.println(CREATE_FAILURE);
        }
    }

    private void createIndex() {
        // create Index with <title> and <meta>
        // Create new file
        try (FileWriter myWriter = new FileWriter(RELATIVE_PATH + siteName +"/index.html"))
        {
            myWriter.write("<!DOCTYPE html>\n");
            myWriter.write("<html>\n");
            myWriter.write("<head>\n");
            myWriter.write("\t<title> \"" + siteName + "\" </title>\n");
            myWriter.write("\t<meta name=\"author\" content=\"" + author + "\">\n");
            myWriter.write("</head>\n");
            myWriter.write("<body>\n");
            myWriter.write("</body>\n");
            myWriter.write("</html>\n");
            System.out.println(CREATE_SUCCESS + siteName + "/index.html");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    private void createCSS() {
        if(css) {
            File cssDir = new File(RELATIVE_PATH+ siteName + "/css");
            boolean bool = cssDir.mkdirs();
            if (bool) {
                System.out.println(CREATE_SUCCESS + siteName + "/css/") ;
            } else {
                System.out.println(CREATE_FAILURE);
            }
        }
    }

    private void createJS() {
        if(javaScript) {
            File cssDir = new File(RELATIVE_PATH + siteName + "/js");
            boolean bool = cssDir.mkdirs();
            if (bool) {
                System.out.println(CREATE_SUCCESS + siteName + "/js/") ;
            } else {
                System.out.println(CREATE_FAILURE);
            }
        }
    }

    // testing function
    public String getSiteName() {
        return siteName;
    }
}