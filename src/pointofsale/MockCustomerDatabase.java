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
public class MockCustomerDatabase {
    
    
    private final Customer [] customers = {
        
        new Customer( "Mike" , "Carpenter" , "Cust101"),
        new Customer( "Alex" , "Plouff" , "Cust102"),
        new Customer( "Josh" , "Conley" , "Cust103")
        
    };
    
    public Customer findCustomer( String custID){
        Customer customer = null;
        
        for ( Customer c : customers )
            if( custID.equals(c.getCustID())) {
                customer = c;
            } 
        
        return customer;
    }
    
}
