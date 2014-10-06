
package pointofsale;

/** This class's purpose is to simulate a product database.
 *
 * @author Alex
 */
public class MockProductDatabase implements ProductDatabaseStrategy {

    private final Product[] products = {
        
        new Product("A101", 14.99, "Baseball Bat", new DiscountByQuantity(1,.1)),
        new Product("A102", 15.99, "Baseball", new DiscountByQuantity(1,.1)),
        new Product("A103", 19.99, "Baseball Glove", new DiscountByQuantity(1,.1)),
        
        new Product("B101", 19.99, "Basketball", new DiscountByQuantity(1,.1)),
        new Product("B102", 25.99, "Basketball Shorts", new DiscountByQuantity(1,.1)),
        new Product("B103", 21.99, "Basketball Shit", new DiscountByQuantity(1,.1)),
        
        new Product("C101", 9.99, "Athletic Sock" , new NoDiscount()),
        new Product("C102", 10.99, "Tattoo Cover-Sleeve",new NoDiscount()),
        new Product("C103", 54.99, "Bundle", new NoDiscount())

    };

    
    /**
     * finds an individual product by its' unique productID
     *              it is the first argument in the product Constructor.
     * 
     * @param productID unique identifier per product
     * 
     * @return specific product
     */
    @Override
    public Product findProductByID( String productID ) throws IllegalArgumentException {

        if( productID == null || productID.length() != 4 )
            throw new IllegalArgumentException("ProductID must be 7 characters, "
                    + " must start with a capitalized single character 'A' and '"
                    + "followed by three digits ### --> 'A101' ");
        
        Product product = null;

        for ( Product p : products ) {

            if ( productID.equals( p.getProductID() ) )
                    product = p;
            }
        
        return product;

    }
    
}
