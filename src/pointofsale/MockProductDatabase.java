/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/**
 *
 * @author Alex
 */
public class MockProductDatabase {

    Product productKey;
    Product[] products = {
        new Product("A101", 14.99, "Baseball Bat"),
        new Product("A102", 15.99, "Baseball"),
        new Product("A103", 19.99, "Baseball Glove"),
        new Product("B101", 19.99, "Basketball"),
        new Product("B102", 25.99, "Basketball Shorts"),
        new Product("B103", 21.99, "Basketball Shit"),
        new Product("C101", 9.99, "Athletic Sock"),
        new Product("C102", 10.99, "Tattoo Cover-Sleeve"),
        new Product("C103", 54.99, "Bundle")

    };

    public Product findProductByID(String productID) {

        Product product = null;

        for (Product p : products) {

            if (productID.equals(p.getProductID() ) )
                    product = p;
            }
        
        return product;

    }

    public static void main(String[] args) {
       
        
       
    }

}
