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
public class Product {
    
    private DiscountStrategy discount;
    
    private String productDescription;
    private double price;
    private String productID;
    
    public Product( String productID, double price, String productDescription 
                            , DiscountStrategy discount) {
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

    private final void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }
    
    public double getTotalAfterDiscount( int qty){
        return discount.getTotalAfterDiscount(this.price , qty);
    }
    
    @Override
    public String toString(){
        return productID + " " + productDescription;
    }
}
