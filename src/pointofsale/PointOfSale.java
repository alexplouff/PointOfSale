
package pointofsale;


/** Start-up class.
 * 
 * To look up a customer use --> register.startNewTransaction( "Cust###" );
 * To look up a product use ---> register.addNewLineItem( " charA-C " , quantity ); where quantity is your amount desired.
 * To end transaction and print receipt use --> register.generateTotalsAndPrintReceipt();
 * 
 * @author Alex
 */
public class PointOfSale {


    public static void main(String[] args) {
       
        Register register = new Register();
        
        register.startNewTransaction( "Cust102" );
        
        register.addNewLineItem( "A101" , 3 );
        register.addNewLineItem( "B101" , 2 );
        register.addNewLineItem( "C103" , 1 );
        
        register.generateTotalsAndPrintReceipt();
        
    }
    
}
