package mrv.discountstrategy;

/**
 *This is the startup class for the discount strategy project
 * @author Mark Van Weelden
 * @version 1.00
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.startTransaction("300");
        cr.addItemToSale("A101", 3);
        cr.addItemToSale("B205", 5);
        cr.addItemToSale("C222", 1);
        cr.finalizeSale();
        
        CashRegister cr2 = new CashRegister();
        cr2.startTransaction("100");
        cr2.addItemToSale("A101", 5);
        cr2.addItemToSale("C222", 15);
        cr2.finalizeSale();
        
        CashRegister cr3 = new CashRegister();
        cr3.startTransaction("300");
        cr3.addItemToSale("D333", 1);
        cr3.finalizeSale();
    }
}
