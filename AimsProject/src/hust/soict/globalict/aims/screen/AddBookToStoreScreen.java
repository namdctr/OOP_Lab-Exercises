package hust.soict.globalict.aims.screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    // Other components and fields
	private JTextField tfTitle;
    private JTextField tfCategory;
    
    private JButton btnAdd; // Add button reference
    
    public AddBookToStoreScreen(Store store) {
        super(store);
        
        // Other component initialization
        
        btnAdd = new JButton("Add"); // Create the add button
        JLabel lblTitle = new JLabel("Title:");
        tfTitle = new JTextField();
        
        JLabel lblCategory = new JLabel("Category:");
        tfCategory = new JTextField();
        
        // Add the button to the UI and handle the button click event
        add(btnAdd);
        add(lblTitle);
        add(tfTitle);
        add(lblCategory);
        add(tfCategory);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddButtonClicked();
            }
        });
        
        // Other UI setup and configuration
    }
    
    // Other methods
    
    public void handleAddButtonClicked() {
        // Handle the logic for adding a Book to the store
        // You can access the input values from the corresponding text fields
        
        // Example logic:
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        
        Book book = new Book(title, category);
        store.addMedia(book);
        
        // Close the current AddBookToStoreScreen window and go back to the StoreScreen
        dispose();
    }
}
