
package pointofsale;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

/** The purpose of this class is to create a conceptual, individual lineItem 
 * for the receipt class to use. The lineItem is stored in a self-adjusting
 * array ( lineItems ). 
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

    private void setLineItem( LineItem lineItem ) {
        this.lineItem = lineItem;
    }
    
    /**
     * This metod creates a new lineItem and adds it to the receipt. The product
     * gets looked up by its' productID and if successful, creates a new lineItem.
     * @param productID
     * @param quantity 
     */
    public void addNewLineItem( String productID , int quantity ){
        lineItem = new LineItem( productID , quantity );
     
    }

    public void addToArray( final LineItem item ) {
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

    /**
     * gernateTotals() generates all the totals from the lineItem class and uses
     * them to create the amount after discount.
     */
    public void generateTotals() {
        for ( LineItem item : lineItems ) {
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
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance( Locale.US );
        String s = Arrays.toString(lineItems);
        
           return "Items: "
                + "\n" + s.replaceAll("[,]", "\n\n")
                + "\n\n            Grand Total: $" + formatter.format( grandTotal )
                + "\n            Discount: $" + formatter.format( totalDiscount )
                + "\n            Amount Due: $" + formatter.format( amountDueAfterDiscount );
           
           
    }
        
}
