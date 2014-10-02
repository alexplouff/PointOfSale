/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class Receipt {

    private LineItem lineItem;
    private LineItem[] lineItems;
    private double grandTotal;
    private double totalDiscount;
    private double amountDueAfterDiscount;

    public Receipt() {
        lineItems = new LineItem[0];

    }

    public final void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public LineItem getLineItem() {
        return lineItem;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void generateTotals() {
        for (LineItem item : lineItems) {
            grandTotal += item.getLineTotal();
            amountDueAfterDiscount += item.getTotalAfterDiscount();
            totalDiscount = grandTotal - amountDueAfterDiscount;
        }
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public double getAmountDueAfterDiscount() {
        return amountDueAfterDiscount;
    }
    
    @Override
        public String toString() {
        String s = Arrays.toString(lineItems);
        
           return "Items: "
                + "\n" + s.replaceAll("[,]", "\n\n")
                + "\n\n            Grand Total: $" + grandTotal
                + "\n            Discount: $" + totalDiscount
                + "\n            Amount Due: $" + amountDueAfterDiscount;
    }

}
