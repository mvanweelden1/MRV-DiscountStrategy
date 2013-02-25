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

        receipt.addItem(prodID, qty);

    }

    public final void startTransaction(String custID) {

        receipt.addCustomer(custID);
    }

    public final void finalizeSale() {

        receipt.generateReceipt();
    }
}
