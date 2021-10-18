package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

import java.io.File;

public class Solution44 {
    public static void main(String[] args) {
        File input =  new File("./data/exercise44_input.txt");
        ProductSearch products = new ProductSearch(input);
        products.askForProduct();
    }
}

