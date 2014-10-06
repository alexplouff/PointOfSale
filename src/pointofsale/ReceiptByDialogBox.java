/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class ReceiptByDialogBox implements ReceiptStrategy{

    private LineItem lineItem;
    private LineItem[] lineItems;
    private double grandTotal;
    private double totalDiscount;
    private double amountDueAfterDiscount;

    public ReceiptByDialogBox() {
        
        lineItems = new LineItem[0];
    }

    private void setLineItem( LineItem lineItem ) {
        this.lineItem = lineItem;
    }
    
    /**
     * This method creates a new lineItem and adds it to the receipt. The product
     * gets looked up by its' productID and if successful, creates a new lineItem.
     * @param productID
     * @param quantity 
     */
    @Override
    public void addNewLineItem( String productID , int quantity ){
        lineItem = new LineItem( productID , quantity );
     
    }

    @Override
    public void addToArray( final LineItem item ) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    @Override
    public LineItem getLineItem() {
        return lineItem;
    }

    @Override
    public LineItem[] getLineItems() {
        return lineItems;
    }

    /**
     * gernateTotals() generates all the totals from the lineItem class and uses
     * them to create the amount after discount.
     */
    @Override
    public void generateTotals() {
        for ( LineItem item : lineItems ) {
            grandTotal += item.getLineTotal();
            amountDueAfterDiscount += item.getTotalAfterDiscount();
            totalDiscount = grandTotal - amountDueAfterDiscount;
        }
    }

    @Override
    public double getGrandTotal() {
        return grandTotal;
    }

    @Override
    public double getTotalDiscount() {
        return totalDiscount;
    }

    @Override
    public double getAmountDueAfterDiscount() {
        return amountDueAfterDiscount;
    }
    
    @Override
    public void printReceipt(){
        
        JOptionPane.showMessageDialog(
                
                null ,
                toString() ,
                "Receipt Dialog" ,
                JOptionPane.PLAIN_MESSAGE) ;

    }
   
    
    @Override
        public String toString() {
        
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance( Locale.US );
        String s = Arrays.toString(lineItems);
        
        
        
           return "Items: "
                + "\n" + s.replaceAll("[,]", "\n\n")
                + "\n\n            Grand Total: " + formatter.format( grandTotal )
                + "\n            Discount: " + formatter.format( totalDiscount )
                + "\n            Amount Due: " + formatter.format( amountDueAfterDiscount );
           
           
    }
    
    
}
