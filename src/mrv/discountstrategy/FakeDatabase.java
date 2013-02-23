package mrv.discountstrategy;

/**
 *
 * @author Mark Van Weelden
 */
public class FakeDatabase {

      Product[] products = {
	        new Product("A101", "Baseball Hat", 19.95, new HolidayDiscount()),
	        new Product("B205", "Men's Dress Shirt", 35.50, new HolidayDiscount()),
	        new Product("C222", "Women's Socks", 9.50, new QuantityDiscount())
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
