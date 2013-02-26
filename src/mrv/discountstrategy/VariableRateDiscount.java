package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class VariableRateDiscount implements DiscountStrategy{
    
    private double rate = .10;

    public VariableRateDiscount() {
    }
    
    

    public VariableRateDiscount(double rate) {
        
        setRate(rate);
    }
    
    
    @Override
    public final double getDiscount(double cost, int qty){
        return cost * qty * rate;
    }

    
    @Override
    public final double getRate() {
        return rate;
    }

    
    @Override
    public final void setRate(double rate) {
        this.rate = rate;
    }
    
//    public static void main(String[] args) {
//        HolidayDiscount discount = new HolidayDiscount();
//        double amt = discount.getDiscount(10, 2);
//        System.out.println(amt);
//    }
}
