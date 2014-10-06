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
public interface CustomerDatabaseStrategy {

    /** findCustomer( custID )
     * this method finds an individual customer by their unique identifier ( custID )
     * @param custID
     *
     * @return customer
     */
    
    public abstract Customer findCustomer( String custID );
    
}
