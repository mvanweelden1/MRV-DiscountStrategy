package mrv.discountstrategy;

/**
 *This class is an abstraction layer for the retail discount strategies.
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public interface DiscountStrategy {

    public abstract double getDiscount(double cost, int qty);

    public abstract double getRate();

    public abstract void setRate(double rate);

}
