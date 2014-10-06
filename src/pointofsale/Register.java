
package pointofsale;

import java.util.Arrays;

/** The purpose of this class is to create a conceptual register by accepting
 * customers , creating a new transaction , adding products to a transaction , 
 * and printing a receipt.
 *
 * @author Alex
 */
public class Register {
    
    private final ReceiptStrategy receiptStrategy;    
    private final CustomerDatabaseStrategy cdb;
    
    public Register( ReceiptStrategy receiptStrategy ){
        
        this.receiptStrategy = receiptStrategy;
        cdb = new MockCustomerDatabase();
    }
    
    public ReceiptStrategy geReceipt(){
        return receiptStrategy;
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
        receiptStrategy.addNewLineItem( productID, quantity );
        receiptStrategy.addToArray( receiptStrategy.getLineItem() );
    }
    
    public void generateTotalsAndPrintReceipt(){
        receiptStrategy.generateTotals();
        receiptStrategy.printReceipt();
    }
    
}
