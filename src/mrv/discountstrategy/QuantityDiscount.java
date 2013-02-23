package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class QuantityDiscount implements DiscountStrategy {

    private int minQty = 2;
    private double rate = .10;

    @Override
    public double getDiscount(double cost, int qty) {
        if (qty >= minQty) {
            return cost * qty * rate;
        } else {
            return 0;
        }
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

//    public static void main(String[] args) {
//        QuantityDiscount discount = new QuantityDiscount();
//        double amt = discount.getDiscount(10, 2);
//        System.out.println(amt);
//
//
//    }
}
