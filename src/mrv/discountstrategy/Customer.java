package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class Customer {
    
    private String customerID;
    private String name;

    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }
    
    public final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    
    public final void getCustomer() {
        
        System.out.println(customerID + " " + name);
    }

}
