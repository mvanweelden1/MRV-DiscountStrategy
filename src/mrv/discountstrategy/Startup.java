package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister("300");
        
        cr.addCustomerToSale("300");
        cr.addItemToSale("A101", 3);
        cr.addItemToSale("B205", 5);
        cr.finalizeSale();
    }
}
