
package pointofsale;

import java.util.Arrays;

/** The purpose of this class is to create a conceptual register by accepting
 * customers , creating a new transaction , adding products to a transaction , 
 * and printing a receipt.
 *
 * @author Alex
 */
public class Register {
    
    private final Receipt receipt;
    private final MockCustomerDatabase cdb;
    
    public Register(){
        receipt = new Receipt();
        cdb = new MockCustomerDatabase();
    }
    
    public Receipt geReceipt(){
        return receipt;
    }
    
    public void startNewTransaction( String custID ){
        cdb.findCustomer( custID );
    }
    
    /** This method adds a new lineItem based on the productID and quantity entered.
     * 
     * @param productID
     * @param quantity 
     */
    public void addNewLineItem( String productID , int quantity ){
        receipt.addNewLineItem( productID, quantity );
        receipt.addToArray( receipt.getLineItem() );
    }
    
    public void generateTotalsAndPrintReceipt(){
        receipt.generateTotals();
        System.out.println( receipt );
    }
    
}
