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
public class Customer {
    
    private String firstName;
    private String lastName;
    private String custID;
    
    public Customer( String firstName, String lastName , String custID){
        
        setFirstName( firstName );
        setLastName( lastName );
        setCustID( custID );
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) throws IllegalArgumentException {
        if( firstName == null || firstName.length() < 3 )
            throw new IllegalArgumentException("First Name can NOT be empty "
                    + "or less than 3 characters long.");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) throws IllegalArgumentException {
                if( lastName == null || lastName.length() < 3 )
            throw new IllegalArgumentException("Last Name must can NOT be empty"
                    + "or less than 3 characters long.");
        this.lastName = lastName;
    }

    public String getCustID() {
        return custID;
    }

    private void setCustID(String custID) throws IllegalArgumentException {
                if( custID == null || custID.length() != 7 )
            throw new IllegalArgumentException("First Name must can NOT be empty"
                    + "or less than 3 characters long.");
        this.custID = custID;
    }
    
    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
    
}
