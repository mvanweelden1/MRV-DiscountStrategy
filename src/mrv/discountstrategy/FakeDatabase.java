package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class FakeDatabase {

      Product[] products = {
	        new Product("A101", "Baseball Hat", 10, new HolidayDiscount()),
	        new Product("B205", "Men's Dress Shirt", 100, new HolidayDiscount()),
	        new Product("C222", "Women's Socks", 20, new QuantityDiscount())
	    };
      
     public final Product findProduct(final String prodId) {
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProdID())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
	
      
      
}
