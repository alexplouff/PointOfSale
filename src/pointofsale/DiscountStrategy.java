/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

/** Description of class
 * 
 * This is the interface for each Discount object. The method should be over-ridden
 * to apply the discount and return the total AFTER the discount has been applied.
 *
 * @author Alex
 */
public interface DiscountStrategy {

    double getTotalDueAfterDiscount(double price, int qty);
    
}
