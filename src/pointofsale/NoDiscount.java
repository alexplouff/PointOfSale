
package pointofsale;

/**
 *
 * @author Alex
 * 
 * This class is a part of the DiscountStrategy and does not return a discount at all.
 */
public class NoDiscount implements DiscountStrategy {
    
    
    @Override
    public double getTotalAfterDiscount( double price, int qty ) throws IllegalArgumentException{
        
        if( qty < 1 ){
            throw new IllegalArgumentException("Quantity can NOT be less than 1");
        }
        
        return price * qty;
        
    }
    
}
