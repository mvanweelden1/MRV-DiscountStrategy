package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class HolidayDiscount implements DiscountStrategy{
    
    private double rate = .10;

    
    @Override
    public double getDiscount(double cost, int qty){
        return cost * qty * rate;
    }

    
    @Override
    public double getRate() {
        return rate;
    }

    
    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }
    
//    public static void main(String[] args) {
//        HolidayDiscount discount = new HolidayDiscount();
//        double amt = discount.getDiscount(10, 2);
//        System.out.println(amt);
//    }
}
