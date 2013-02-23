package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class CashRegister {
    
    private Receipt receipt;

    public CashRegister(String custID) {
        this.receipt = new Receipt(custID);
    }
    
    public final void addItemToSale(String prodID, int qty) {
        
        receipt.addItemToSale(prodID, qty);
        
        
    }
    
    public final void finalizeSale(){
        
        receipt.generateReceipt();
    }

}
