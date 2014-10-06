
package pointofsale;

/**
 * This is a mock database to simulate an actual database.
 * @author Alex
 */
public class MockCustomerDatabase {
    
    
    private final Customer [] customers = {
        
        new Customer( "Mike" , "Carpenter" , "Cust101" ) ,
        new Customer( "Alex" , "Plouff" , "Cust102" ) ,
        new Customer( "Josh" , "Conley" , "Cust103" )
        
    };
    
    
    /** findCustomer( custID )
     * this method finds an individual customer by their unique identifier ( custID )
     * @param custID
     * 
     * @return customer
     */
    public Customer findCustomer( String custID ){
        Customer customer = null;
        
        for ( Customer c : customers )
            if( custID.equals( c.getCustID() ) ) {
                customer = c;
            } 
        
        return customer;
    }
    
}
