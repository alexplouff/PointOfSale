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
public class PointOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Register register = new Register();
        
        register.startNewTransaction("Cust102");
        
        register.addNewLineItem("A101", 3);
        register.addNewLineItem("C101", 2);
        
        register.generateTotalsAndPrintReceipt();
        
    }
    
}
