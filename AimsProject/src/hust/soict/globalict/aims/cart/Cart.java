package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Media;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private FloatProperty totalCostProperty = new SimpleFloatProperty(0);
	
	public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media has been added to the cart.");
    }

    public void removeMedia(Media media) {
        boolean removed = itemsOrdered.remove(media);
        if (removed) {
            System.out.println("The media has been removed from the cart.");
        } else {
            System.out.println("The media is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0; 
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + media.toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public void searchByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Search results for media ID " + id + ":");
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No matching media found with ID " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results for media title: " + title);
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching media found with title: " + title);
        }
    }
    
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    
    private void updateTotalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        totalCostProperty.set(total);
    }

    public float getTotalCost() {
        return totalCostProperty.get();
    }

    public FloatProperty getTotalCostProperty() {
        return totalCostProperty;
    }
}