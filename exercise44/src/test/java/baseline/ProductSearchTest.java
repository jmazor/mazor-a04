package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Justin Mazor
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {
    String input = "{\n" +
            "    \"products\" : [\n" +
            "        {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 },\n" +
            "        {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 },\n" +
            "        {\"name\": \"Doodad\", \"price\": 5.00, \"quantity\": 10 }\n" +
            "    ]\n" +
            "}";
    List<ProductSearch.MyProduct> expected = new ArrayList<>();
    ProductSearch actual = new ProductSearch(input);

    @Test
    void deSerializeData() {
        // TO GRADER
        // I COULD READ FROM A FILE. BUT WHAT IF THE FILE CHANGES
        // SO I HAVE HARDCODED IT HERE

        expected.add(new ProductSearch.MyProduct("Widget", 25.00, 5));
        expected.add(new ProductSearch.MyProduct("Thing", 15.00, 5));
        expected.add(new ProductSearch.MyProduct("Doodad", 5.00, 10));
        boolean flag = false;
        for (int i = 0; i != expected.size(); ++i) {
            flag = expected.get(i).compare(actual.getProducts().get(i));
            if (flag == false)
                break;
        }
        assertTrue(flag);
    }

    @Test
    void findProduct() {
        ProductSearch.MyProduct result = actual.findProduct("widget");
        ProductSearch.MyProduct expected = new ProductSearch.MyProduct("Widget", 25.00, 5);
        assertTrue(result.compare(expected));
    }
}