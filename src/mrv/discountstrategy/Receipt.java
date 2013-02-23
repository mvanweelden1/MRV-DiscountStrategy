package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class Receipt {

    LineItem[] lineItems = new LineItem[0];

    public void addItemToSale(String prodId, int qty) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(prodId);


        if (product != null) {
            addLineItem(product, qty);
        }

    }

    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public void generateReceipt() {

        for (int i = 0; i < lineItems.length; i++) {

            System.out.println(lineItems[i].getLineItem());
        }
    }

    public static void main(String[] args) {

        Receipt receipt = new Receipt();

        receipt.addItemToSale("B205", 1);

        receipt.generateReceipt();




    }
}
