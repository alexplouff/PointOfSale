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
public interface DiscountStrategy {

    double getTotalAfterDiscount(double price, double qty);
    
}