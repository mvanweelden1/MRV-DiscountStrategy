package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class LineItem {
    
    private Product product;
    private int qty;

    public LineItem(Product product, int qty) {
        this.qty = qty;
        this.product = product;
        
    }
    
    public final double getUnitCost(){
        
        return this.product.getUnitCost();
    }
    
    public final double getSubTotal() {
        
        double subTotal = (this.product.getUnitCost() * qty) - this.product.getDiscount(qty);
        return subTotal;
    }
    
    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }
    
    public final String getLineItem(){
        String id = this.product.getProdID();
        String name = this.product.getProdName();
        double price = this.product.getUnitCost();
        double subTotal = this.getSubTotal();
        
        return id + " " + name + "\t" + qty + "\t" + price + "\t\t" + subTotal;
        
                
        
    }
    
    
    
    
    
//    public static void main(String[] args) {
//        
//        LineItem lineitem = new LineItem("B205", 2);
//        
//        System.out.println(lineitem.getLineItem());
//    }

    
    
    
    
    

}
