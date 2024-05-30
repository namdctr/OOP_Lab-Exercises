package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store(5); // Create a store with a capacity of 5 DVD
		
        // Create DVD objects 
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 29.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 21.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        store.addDVD(dvd5);
        System.out.println("");
        // Display all the DVDs in the store after adding
        System.out.println("Display all the DVDs in the store after adding");
        store.displayDVDs();
        System.out.println("");
        
        // Try to add one more DVD (store is already full)
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 17.99f);
        store.addDVD(dvd6);
        System.out.println("");

        // Remove a DVD from the store
        store.removeDVD(dvd3);
        System.out.println("");
        
        // Display all the DVDs in the store after removing
        System.out.println("Display all the DVDs in the store after removing");
        store.displayDVDs();
        System.out.println("");
        

        // Try to remove a DVD that is not in the store
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 14.99f);
        store.removeDVD(dvd7);
    }
}
