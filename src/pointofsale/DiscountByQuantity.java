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
public class DiscountByQuantity implements DiscountStrategy{
    private int minQty;
    private double discountRate;
    
    public DiscountByQuantity(int minQty, double discountRate) {
        this.minQty = minQty;
        this.discountRate = discountRate;
    }
    
    
    public double getTotalAfterDiscount(double price, int qty) {

        double total = price * qty;
        
        if (qty > minQty) {
            total = total - ( total*discountRate ); 
            
        }
    
        return total;

    }
    
    
    
}
