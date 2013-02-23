package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class Product {
    
    private String prodID;
    private String prodName;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String prodID, String prodName, double unitCost, DiscountStrategy discount) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }
    
    public final double getDiscount(int qty){  
        return discount.getDiscount(unitCost, qty);
    }
    
    public final String getProdID() {
        return prodID;
    }

    public final void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    
//    public static void main(String[] args) {
//        Product product = new Product("123", "Hat", 10, new QuantityDiscount());
//        double amt = product.getDiscount(4);
//        System.out.println(amt);
//    }

}
