package hust.soict.globalict.test.cart;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new dvd objects and add them to the cart 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1); 
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		// Test the printCart method 
		cart.printCart();
		
		// Test the seachByID method
		System.out.println("Testing searchByID:");
        cart.searchByID(2); // found
        cart.searchByID(4); // not found
        
        // Test the searchByTitle method
        System.out.println("\nTesting searchByTitle:");
        cart.searchByTitle("Aladdin");  // found
        cart.searchByTitle("The Jungle Book"); // not found
	}
}
