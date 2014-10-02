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
   
    private MockProductDatabase db;
    private Product product;
    private int quantity;
    private double lineTotal;
    
    
    
    public LineItem( String productID , int quantity ){
        
        db = new MockProductDatabase();
        setProduct( db.findProductByID( productID ) );
        setQuantity( quantity );
        lineTotal = product.getPrice() * quantity;
    }
    
    public Product getProduct(){
        return product;
    }
    
    public final void setProduct(Product product){
        this.product = product;
    }
    
    public void setLineTotal( double lineTotal ){
        this.lineTotal = lineTotal;
    }
    
    public double getLineTotal(){
        return lineTotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getTotalAfterDiscount( ){
        return product.getTotalAfterDiscount(quantity);
    }

    @Override
    public String toString(){
        return "Description: " + product
                +"\nQuantity: " + quantity 
                +"\nPrice Per Item After Discount: $" + getTotalAfterDiscount()
                +"\nLine Total Before Discount: $" + lineTotal;
    }
    
}
