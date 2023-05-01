package com.dzcode.app;

import java.util.ArrayList;
import java.util.List;

public class LambdasExercise02 {

    public interface ProductFilter {
        boolean accept(Product product);
    }

    /**
     * Exercise 2: Find products by category by implementing a functional interface using a lambda expression and calling it.
     *
     * @param products The list of products to search.
     * @param category The category of products to search for.
     * @return A new list containing the products which are in the specified category.
     */
    public List<Product> findProductsByCategory(List<Product> products, Category category) {
        // TODO: Implement interface ProductFilter with a lambda expression
        // The lambda expression should return true if the product is in the given category
        ProductFilter filter = product -> product.getCategory().equals(category) ; // TODO: Replace 'null' by a lambda expression

        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            // TODO: Add products that are accepted by the filter to the 'result' list
            if (filter.accept(product)) {
                result.add(product);
            }
        }

        return result;
    }
}
