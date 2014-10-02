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
        cdb.findCustomer(custID);
    }
    
    public void addNewLineItem( String productID , int quantity ){
        LineItem lineItem = new LineItem( productID , quantity );
        receipt.addToArray(lineItem);
    }
    
    public void generateTotalsAndPrintReceipt(){
        receipt.generateTotals();
        System.out.println(receipt);
    }
    
}
