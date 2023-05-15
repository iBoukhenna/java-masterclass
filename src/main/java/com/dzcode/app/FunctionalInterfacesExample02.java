package com.dzcode.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterfacesExample02 {
    
    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();
        Map<Category, List<Product>> productsByCategory = new HashMap<>();
                
        for (Product product : products) {
            // Without functional interfaces and lambda expressions.
            // Check if the map already has a List for this category; if not, add one.
            // Add the product to the appropriate list in the map.
            /*Category category = product.getCategory();
            if (!productsByCategory.containsKey(category)) {
                productsByCategory.put(category, new ArrayList<>());
            }
            productsByCategory.get(category).add(product);*/

            // With Map.computeIfAbsent()
            // computeIfAbsent() gets the existing List for the category, or calls the given
            // Function<Category, List<Product>> to create the List if there is no entry in the Map for the category.
            productsByCategory.computeIfAbsent(product.getCategory(), c -> new ArrayList<>()).add(product);
        }

        // Map.forEach() takes a BiConsumer (a Consumer which takes two parameters); the key and value of each entry.
        productsByCategory.forEach((category, ps) -> {
            System.out.println("Category: " + category);
            ps.forEach(product -> System.out.println("- " + product.getName()));
        });
    }
}
