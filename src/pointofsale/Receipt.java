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

    public Receipt() {
        lineItems = new LineItem[0];
        
    }
    
    public void setGrandTotal(){
        for(LineItem item : lineItems){
            grandTotal += item.getLineTotal();
        }
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

    public double getGrandTotal() {
        return grandTotal;
    }

    public LineItem getLineItem() {
        return lineItem;
    }

    public LineItem[] getLineItems() {
          return lineItems;
    }

    @Override
    public String toString() {
        return "Items: "
                + "\n" + Arrays.toString(lineItems)
                + "\nGrand Total: $" + getGrandTotal();

    }

    public static void main(String[] args) {
        Product p = new Product("A101", 15.99, "Bat" );
        LineItem l = new LineItem(p, 2);
        LineItem o = new LineItem(p, 3);

        Receipt r = new Receipt();
        r.setLineItem(l);
        r.addToArray(l);
        r.addToArray(o);
        r.setGrandTotal();
        System.out.println(r);

    }

}
