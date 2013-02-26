package mrv.discountstrategy;

import java.util.Date;

/**
 *
 * @author Mark Van Weelden
 */
public class Receipt {

    private static int receiptNumber = 0;
    private LineItem[] lineItems = new LineItem[0];
    private Customer customer;

    public Receipt() {

        receiptNumber++;

    }

    public final void addCustomer(String custID) {
        //validation needed
        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer(custID);
    }

    public final void addItem(String prodId, int qty) {
        //validation needed
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(prodId);


        if (product != null) {
            addLineItem(product, qty);
        }

    }

    public final void addLineItem(Product product, int qty) {
        //validation needed
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        //validation needed
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

    public final double getTotalAfterDiscount() {

        double total = 0.0;

        for (int i = 0; i < lineItems.length; i++) {

            total += lineItems[i].getSubTotal();
        }

        return total;

    }

    public final void generateReceipt() {

        System.out.println("Receipt # " + receiptNumber);
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("ID\t" + "Customer Name");
        System.out.println("----------------------------------");
        customer.getCustomer();
        System.out.println("==================================");
        System.out.println("Prod ID" + "  Prod Name\t" + "Qty\t" + "Unit Price\t" + "Subtotal\t" + "Discount");

        for (int i = 0; i < lineItems.length; i++) {

            System.out.println(lineItems[i].getLineItem());
        }

        System.out.println();

        System.out.println("Total Before Discount: \t" + getTotalBeforeDiscount());

        System.out.println("Total After Discount: \t" + getTotalAfterDiscount());
        
        System.out.println("You saved: " + (getTotalBeforeDiscount() - getTotalAfterDiscount()));
        
        System.out.println("\n\n");
        

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
