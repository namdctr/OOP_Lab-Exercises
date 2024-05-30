package hust.soict.globalict.aims.screen;
	import hust.soict.globalict.aims.store.*;
import javax.swing.JFrame;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddItemToStoreScreen extends JFrame{

	protected Store store;

    // ... UI components and constructor ...

    public void createUIComponents() {
        // ... Create and arrange the UI components using layout managers or scene builder tools ...
        // ... Add event listeners to buttons and handle the user's input ...
    }

    public AddItemToStoreScreen(Store store) throws HeadlessException {
		super();
		this.store = store;
	}

	public void handleAddButtonClicked() {
        // Get the input values from the text fields or other UI components
        // Create a new item object based on the input values
        // Add the item to the store using the store object passed to the constructor
        // Perform any additional logic or validation as needed

        // After adding the item, go back to the StoreScreen
        StoreScreen storeScreen = new StoreScreen(store);
        storeScreen.setVisible(true);
        dispose(); // Close the current AddItemToStoreScreen window
    }

}

