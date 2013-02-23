package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class LineItem {
    
    private Product product;
    private FakeDatabase database = new FakeDatabase();
    private String prodID;

    public LineItem(String prodID) {
        this.prodID = prodID;
        product = database.findProduct(prodID);
        
    }
    
    public final String getLineItem(){
        String id = this.product.getProdID();
        String name = this.product.getProdName();
        double price = this.product.getUnitCost();
        
        return id + " " + name + " " + price;
        
                
        
    }
    
    public static void main(String[] args) {
        
        LineItem lineitem = new LineItem("A101");
        
        System.out.println(lineitem.getLineItem());
    }
    
    
    
    

}
