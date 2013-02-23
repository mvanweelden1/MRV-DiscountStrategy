package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class Receipt {

    private LineItem[] lineItems = new LineItem[0];
    private Customer customer;


    public final void addCustomer(String custID) {

        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer(custID);
    }

    public final void addItemToSale(String prodId, int qty) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(prodId);


        if (product != null) {
            addLineItem(product, qty);
        }

    }

    public final void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }

    private final void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public final double getTotalBeforeDiscount() {

        double total = 0.0;

        for (int i = 0; i < lineItems.length; i++) {

            total += (lineItems[i].getUnitCost() * lineItems[i].getQty());
        }
        
        return total;
    }
    
    public final double getTotalAfterDiscount(){
        
        double total = 0.0;
        
         for (int i = 0; i < lineItems.length; i++) {

            total += lineItems[i].getSubTotal();
        }
        
        return total;
        
    }

    public final void generateReceipt() {
        
        System.out.println("ID\t" + "Customer Name");
        System.out.println("----------------------------------");
        customer.getCustomer();
        System.out.println("==================================");
        System.out.println("Prod ID" + "  Prod Name\t" + "Qty\t" + "Unit Price\t" + "Subtotal");

        for (int i = 0; i < lineItems.length; i++) {

            System.out.println(lineItems[i].getLineItem());
        }
        
        System.out.println();
        
        System.out.println("Total Before Discount: \t" + getTotalBeforeDiscount());
        
        System.out.println("Total After Discount: \t" + getTotalAfterDiscount());

    }
//    public static void main(String[] args) {
//
//        Receipt receipt = new Receipt("300");
//
//        receipt.generateReceipt();
//
//
//
//
//    }
}
