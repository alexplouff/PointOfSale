
package pointofsale;


/** Start-up class.
 * 
 * To look up a customer use --> register.startNewTransaction( "Cust###" );
 * To look up a product use ---> register.addNewLineItem( " charA-C " , quantity ); where quantity is your amount desired.
 * To end transaction and print receipt use --> register.generateTotalsAndPrintReceipt();
 * To end the sale , restart the LineItem[] and reset the receipt totals use --> register.endSale_and_resetArray();
 * @author Alex
 */
public class PointOfSale {


    public static void main(String[] args) {
       
     Register register = new Register( 
                
                       new ReceiptByConsoleOutput() , new MockCustomerDatabase()
                                              
     );
        
        
        
        register.startNewTransaction( "Cust102" );
        
        register.addNewLineItem( "A101" , 6 );
        register.addNewLineItem( "A101" , 1 );
        register.addNewLineItem( "C103" , 1 );
        
        register.generateTotalsAndPrintReceipt();
        
        register.endSale();
        
        
        
        System.out.println();
        System.out.println();
        
        
        
        register.startNewTransaction( "Cust102" );
        
        register.addNewLineItem( "B102" , 2 );
        
        register.generateTotalsAndPrintReceipt();
        
        register.endSale();
        
        
        
        System.out.println();
        System.out.println();
        
        
        
        register.startNewTransaction( "Cust101" );
        
        register.addNewLineItem( "A103" , 2 );
        register.addNewLineItem( "B102", 3 );
        register.addNewLineItem( "C101", 1 );
        
        register.generateTotalsAndPrintReceipt();
        
        register.endSale();
        
    }
    
}
