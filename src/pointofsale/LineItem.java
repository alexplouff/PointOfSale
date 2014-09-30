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
public class LineItem {
   
    private Product product;
    private int quantity;
    private double lineTotal;
    
    public LineItem( Product product , int quantity ){
            
        setProduct( product );
        setQuantity( quantity );
        lineTotal = quantity * product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }
    
    @Override
    public String toString(){
        return product + 
                " \n Quantity:" + quantity +
                " \n Subtotal:" + lineTotal;
    }
        
}
