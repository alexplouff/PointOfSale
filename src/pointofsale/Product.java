
package pointofsale;

/**
 * The purpose of this class is to create a conceptual product. The product requires
 * a productID , price , description , and a DiscountStrategy to be a real product.
 * @author Alex
 */
public class Product {
    
    private DiscountStrategy discount;
    
    private String productDescription;
    private double price;
    private String productID;
    
    public Product( String productID , double price , String productDescription 
                            , DiscountStrategy discount ) {
        setProductID( productID);
        setPrice( price );
        setProductDescription( productDescription );
        setDiscountStrategy( discount );
    }
    
    private void setDiscountStrategy( DiscountStrategy discount ){
        this.discount = discount;
    }
    
    public DiscountStrategy getDiscount(){
        return discount;
    }

    public String getProductDescription() {
        return productDescription;
    }

    private void setProductDescription( String productDescription ) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    private void setProductID( String productID ) {
        this.productID = productID;
    }
    
    public double getTotalAfterDiscount( int qty ){
        return discount.getTotalAfterDiscount( this.price , qty );
    }
    
    @Override
    public String toString(){
        return productID + " " + productDescription;
    }
}
