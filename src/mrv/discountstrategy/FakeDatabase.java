package mrv.discountstrategy;

/**
 *This class serves as a fake database containing product and customer objects
 * 
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class FakeDatabase {

      Product[] products = {
	        new Product("A101", "Baseball Hat", 10, new VariableRateDiscount(.15)),
	        new Product("B205", "Men's Dress Shirt", 100, new VariableRateDiscount(.12)),
	        new Product("C222", "Women's Socks", 20, new QuantityDiscount(.10, 5)),
                new Product("D333", "Mens Watch", 55, new NoDiscount())
	    };
      
      Customer[] customers = {
          new Customer("100", "Smith, Bob"),
          new Customer("200", "Anderson, Mike"),
          new Customer("300", "Van Weelden, Mark")
          
      };
      /**
       * Used to find a product in the fake database from the product ID
       * @param prodId a string containing the product ID
       * @return the product object
       */
     public final Product findProduct(final String prodId) {
         if(prodId == null || prodId.length() == 0){
             System.out.println("Error: Invalid product ID");
             return null;
         }
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProdID())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
     /**
      * Used to find a customer in the fake database using the customer ID
      * @param custID a string containing the customer ID
      * @return customer object
      */
     public final Customer findCustomer(final String custID){
         if(custID == null || custID.length() == 0){
             
             System.out.println("Error: invalid customer ID");
             return null;
         }
         Customer customer = null;
         for(Customer c : customers){
             if(custID.equals(c.getCustomerID())){
                 customer = c;
                 break;
             }
         }
         
         return customer;
     } 
      
}
