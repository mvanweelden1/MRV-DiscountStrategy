package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double cost, int qty) {
        return 0;
    }

    @Override
    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRate(double rate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
