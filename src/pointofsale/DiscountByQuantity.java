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

    @Override
    public double getTotalAfterDiscount(double price, double qty) {

        double total = price * qty;
        
        if (qty > 1) {
            total = total - ( total*.1 ); 
            
        }
    
        return total;
    }
    
    public static void main(String[] args) {
        
    DiscountByQuantity a = new DiscountByQuantity();
        System.out.println(a.getTotalAfterDiscount(5.00, 1));
        System.out.println(a.getTotalAfterDiscount(5.00, 2));
    }
    
}
