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
        CashRegister cr = new CashRegister();
        
        cr.addCustomerToSale("300");
        cr.addItemToSale("A101", 3);
        cr.addItemToSale("B205", 5);
        cr.finalizeSale();
        
        CashRegister cr2 = new CashRegister();
        cr2.addCustomerToSale("100");
        cr2.addItemToSale("A101", 5);
        cr2.addItemToSale("C222", 15);
        cr2.finalizeSale();
    }
}
