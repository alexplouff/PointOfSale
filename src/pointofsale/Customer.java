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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }
    
    public String toString(){
        return firstName + " " + lastName;
    }
    
}
