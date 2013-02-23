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
    
    public double getDiscount(int qty){  
        return discount.getDiscount(unitCost, qty);
    }
    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    public static void main(String[] args) {
        Product product = new Product("123", "Hat", 10, new QuantityDiscount());
        double amt = product.getDiscount(4);
        System.out.println(amt);
    }

}
