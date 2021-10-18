package baseline;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

public class ProductSearch {
    public static class MyProduct {
        //String Name
        String name;
        //Double Price
        double price;
        //Int Quantity
        int quantity;

        public MyProduct(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return this.name;
        }

        public double getPrice(){
            return price;
        }

        public int getQuantity() {
            return  quantity;
        }

        // testing method
        public boolean compare(MyProduct product) {
            boolean flag = true;
            if (!(this.name.equals(product.name)))
                flag = false;
            if ((this.quantity != product.quantity))
                flag = false;
            if ((this.price != product.price))
                flag =false;

            return flag;
        }
    }






    private List<MyProduct> products;

    public ProductSearch(File file) {
        String input = "";
        products = new ArrayList<>();
        try {
            // create a file object
            Scanner myReader = new Scanner(file);
            // while we have a next line pass it to csvParser
            while (myReader.hasNextLine()) {
                 input = input.concat(myReader.nextLine());
                 input = input.concat("\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        deSerializeData(input);
    }

    // testing constructor
    public ProductSearch(String input) {
        products = new ArrayList<>();
        deSerializeData(input);
    }

    // parseData
    // use gson to parse data
    public void deSerializeData(String input) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(input, JsonObject.class);
        JsonArray jsonArray = jsonObject.get("products").getAsJsonArray();
        Type productListType = new TypeToken<ArrayList<MyProduct>>(){}.getType();
        products =  gson.fromJson(jsonArray, productListType);
    }

    // askSearchMethod
    public void askForProduct() {
        Scanner sc = new Scanner(System.in);
        //ask for product name until a result is achieved
        while (true) {
            System.out.print("What is the product name? ");
            String input = sc.nextLine();
            // call actualSearch
            MyProduct searchResult = findProduct(input);
            if (searchResult != null) {
                System.out.println("Name: " + searchResult.getName());
                System.out.printf("Price: %.2f%n", searchResult.getPrice());
                System.out.println("Quantity: " + searchResult.getQuantity());
                break;
            } else {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        }
    }

    // actualSearch
    public MyProduct findProduct(String compare) {
        for (MyProduct product : products) {
            // loop through list testing if Name equals input
            if (product.getName().toLowerCase(Locale.ROOT).equals(compare.toLowerCase(Locale.ROOT))) {
                // if equals return MyProduct
                return product;
            }
        }
        return null;
    }

    public List<MyProduct> getProducts() {
        return products;
    }
}
