
package pointofsale;

/**
 * This class is a member of the DiscountStrategy and returns the price
 * after the discount has been applied. 
 * This discount is determined by the quantity and if the quantity purchased is
 * greater than the "minQty" variable the discount will be applied.
 * 
 * @author Alex
 */
public class DiscountByQuantity implements DiscountStrategy{
    private final int minQty;
    private final double discountRate;
    
    public DiscountByQuantity( int minQty , double discountRate ) {
        this.minQty = minQty;
        this.discountRate = discountRate;
    }
    
    
    @Override
    public double getTotalAfterDiscount( double price , int qty ) {

        double total = price * qty;
        
        if ( qty > minQty ) {
            total = total - ( total * discountRate ); 
            
        }
    
        return total;

    }
    
    
    
}
