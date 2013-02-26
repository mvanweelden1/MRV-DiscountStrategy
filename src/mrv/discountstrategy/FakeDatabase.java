package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
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
      
     public final Product findProduct(final String prodId) {
         //validation needed
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProdID())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
	
     public final Customer findCustomer(final String custID){
         //validation needed
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
