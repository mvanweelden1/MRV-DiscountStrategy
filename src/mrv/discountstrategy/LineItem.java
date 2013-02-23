package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class LineItem {
    
    private Product product;
    private String prodID;
    private int qty;

    public LineItem(Product product, int qty) {
        this.prodID = prodID;
        this.qty = qty;
        this.product = product;
        
    }
    
    public double getSubTotal() {
        
        double subTotal = (this.product.getUnitCost() * qty) - this.product.getDiscount(qty);
        return subTotal;
    }
    
    public final String getLineItem(){
        String id = this.product.getProdID();
        String name = this.product.getProdName();
        double price = this.product.getUnitCost();
        double subTotal = this.getSubTotal();
        return id + " " + name + " " + price + " " + subTotal;
        
                
        
    }
    
//    public static void main(String[] args) {
//        
//        LineItem lineitem = new LineItem("B205", 2);
//        
//        System.out.println(lineitem.getLineItem());
//    }
    
    
    
    

}
