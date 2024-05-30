package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }
    
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media '" + media.getTitle() + "' has been added to the store.");
    }

    public void removeMedia(Media media) {
        boolean removed = itemsInStore.remove(media);
        if (removed) {
            System.out.println("Media '" + media.getTitle() + "' has been removed from the store.");
        } else {
            System.out.println("Media '" + media.getTitle() + "' is not found in the store.");
        }
    }
    
    public void removeMedia(String title) {
        Media mediaToRemove = null;
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                mediaToRemove = media;
                break;
            }
        }

        if (mediaToRemove != null) {
            boolean removed = itemsInStore.remove(mediaToRemove);
            if (removed) {
                System.out.println("Media '" + mediaToRemove.getTitle() + "' has been removed from the store.");
            } else {
                System.out.println("Failed to remove media '" + mediaToRemove.getTitle() + "' from the store.");
            }
        } else {
            System.out.println("Media with title '" + title + "' is not found in the store.");
        }
    }

    public void displayMedia() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty. No media available.");
        } else {
            System.out.println("Media in the store:");
            for (int i = 0; i < itemsInStore.size(); i++) {
                System.out.println((i + 1) + ". " + itemsInStore.get(i));
            }
        }
    }
    
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}

