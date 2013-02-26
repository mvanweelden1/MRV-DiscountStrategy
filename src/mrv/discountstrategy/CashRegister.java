package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class CashRegister {

    private Receipt receipt;

    public CashRegister() {
        this.receipt = new Receipt();
    }

    public final void addItemToSale(String prodID, int qty) {
        //validation needed
        receipt.addItem(prodID, qty);

    }

    public final void startTransaction(String custID) {
        //validation needed
        receipt.addCustomer(custID);
    }

    public final void finalizeSale() {

        receipt.generateReceipt();
    }
}
