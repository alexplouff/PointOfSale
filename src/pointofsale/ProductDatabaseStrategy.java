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
public interface ProductDatabaseStrategy {

    /**
     * finds an individual product by its' unique productID
     *              it is the first argument in the product Constructor.
     *
     * @param productID unique identifier per product
     *
     * @return specific product
     */
    public abstract Product findProductByID( String productID );
    
}
