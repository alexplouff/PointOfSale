
package pointofsale;

/**
 *
 * @author Alex
 * 
 * This class is a part of the DiscountStrategy and does not return a discount at all.
 */
public class NoDiscount implements DiscountStrategy {
    
    
    @Override
    public double getTotalAfterDiscount( double price, int qty ){
        
        return price * qty;
        
    }
    
}
