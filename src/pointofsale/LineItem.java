
package pointofsale;

/**
 * This class's responsibility is to generate an individual lineItem for the receipt
 * to use and display based on the productID and quantity entered. 
 * 
 * @author Alex
 */
public class LineItem {
   
    private final MockProductDatabase db;
    private Product product;
    private int quantity;
    private final double lineTotal;
    
    
    /**
     * 
     * @param productID
     * @param quantity 
     * 
     * The "productID" variable passed in is immediately found and initialized by the 
     * setProduct method.
     * 
     * The "quantity" variable is used to generate a lineTotal;
     */
    
    public LineItem( String productID , int quantity ){
        
        db = new MockProductDatabase();
        setProduct( db.findProductByID( productID ) );
        setQuantity( quantity );
        lineTotal = product.getPrice() * quantity;
    }
    
    public Product getProduct(){
        return product;
    }
    
    private void setProduct( Product product ){
        this.product = product;
    }
    
    public double getLineTotal(){
        return lineTotal;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity( int quantity ) throws IllegalArgumentException {
        if( quantity == 0 )
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        this.quantity = quantity;
    }
    
    public double getTotalAfterDiscount( ){
        return product.getTotalAfterDiscount( quantity );
    }

    public double getPricePerItemAfterDiscount(){
        return getTotalAfterDiscount() / quantity;
    }
    
    @Override
    public String toString(){
        return "Product: " + product
                +"\nQuantity: " + quantity + " | " + "Price $: " + product.getPrice()
                +"\nPrice Per Item After Discount: $" + getPricePerItemAfterDiscount()
                +"\nLine Total Before Discount: $" + lineTotal;
    }
    
}
