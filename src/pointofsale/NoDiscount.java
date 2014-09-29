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
public class NoDiscount implements DiscountStrategy {
    
    @Override
    public double getTotalAfterDiscount( double price, double qty){
        
        return price * qty;
        
    }
    
}
