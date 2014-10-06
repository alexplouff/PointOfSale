
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
public class ReceiptByConsoleOutput implements ReceiptStrategy {

    private LineItem lineItem;
    private LineItem[] lineItems;
    private double grandTotal;
    private double totalDiscount;
    private double amountDueAfterDiscount;

    public ReceiptByConsoleOutput() {
        lineItems = new LineItem[0];

    }
    
    /**
     * This method creates a new lineItem and adds it to the receipt. The product
     * gets looked up by its' productID and if successful, creates a new lineItem.
     * @param productID
     * @param quantity 
     */
    @Override
    public void addNewLineItem( String productID , int quantity ) throws IllegalArgumentException {
        
        if( productID == null || productID.length() != 4
                || quantity < 1)
        
            throw new IllegalArgumentException("ProductID must be 4 Characters "
                    + "and quantity must be greater than 0.");
        
        
        lineItem = new LineItem( productID , quantity );
     
    }

    @Override
    public void addToArray( final LineItem item ) throws IllegalArgumentException {
        
        if( item == null )
            throw new IllegalArgumentException("This is not of type LineItem.");
        
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
        System.out.println( toString() );
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
