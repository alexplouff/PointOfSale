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
public interface ReceiptStrategy {

    /**
     * This method creates a new lineItem and adds it to the receipt. The product
     * gets looked up by its' productID and if successful, creates a new lineItem.
     * @param productID
     * @param quantity
     */
    
    public abstract void addNewLineItem(String productID, int quantity);

    public abstract void addToArray(final LineItem item);

    /**
     * gernateTotals() generates all the totals from the lineItem class and uses
     * them to create the amount after discount.
     */
    
    public abstract void generateTotals();

    public abstract void reStartArray();
    
    public abstract double getAmountDueAfterDiscount();

    public abstract double getGrandTotal();

    public abstract LineItem getLineItem();

    public abstract LineItem[] getLineItems();

    public abstract double getTotalDiscount();
    
    public abstract void printReceipt();

    @Override
    public abstract String toString();
    
}
