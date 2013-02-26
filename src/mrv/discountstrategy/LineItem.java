package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class LineItem {
    
    private Product product;
    private int qty;

    public LineItem(Product product, int qty) {
        //validation needed
        this.qty = qty;
        this.product = product;
        
    }
    
    public final double getUnitCost(){
        
        return product.getUnitCost();
    }
    
    public final double getSubTotal() {
        
        double subTotal = (product.getUnitCost() * qty) - product.getDiscount(qty);
        return subTotal;
    }
    
    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //validation needed
        this.qty = qty;
    }
    
    public final String getLineItem(){
        String id = product.getProdID();
        String name = product.getProdName();
        double price = product.getUnitCost();
        double subTotal = getSubTotal();
        double discount = product.getDiscount(qty);
        
        return id + " " + name + "\t" + qty + "\t" + price + "\t\t" + subTotal + "\t\t" + discount;
        
                
        
    }
    
    
    
    
    
//    public static void main(String[] args) {
//        
//        LineItem lineitem = new LineItem("B205", 2);
//        
//        System.out.println(lineitem.getLineItem());
//    }

    
    
    
    
    

}
