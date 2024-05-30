package hust.soict.globalict.aims.screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.media.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
	private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfArtist;
    // Other components and fields
    
    private JButton btnAdd; // Add button reference
    
    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        
        // Other component initialization
        JLabel lblTitle = new JLabel("Title:");
        tfTitle = new JTextField();
        
        JLabel lblCategory = new JLabel("Category:");
        tfCategory = new JTextField();
        
        JLabel lblDirector = new JLabel("Artist:");
        tfArtist = new JTextField();
        

        
        btnAdd = new JButton("Add"); // Create the add button
        
        // Add the button to the UI and handle the button click event
        add(btnAdd);
        add(lblTitle);
        add(tfTitle);
        add(lblCategory);
        add(tfCategory);
        add(lblDirector);
        add(tfArtist);
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
        // Handle the logic for adding a CompactDisc to the store
        // You can access the input values from the corresponding text fields
        
        // Example logic:
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        String artist = tfArtist.getText();
        
        CompactDisc cd = new CompactDisc(title, artist);
        store.addMedia(cd);
        
        // Close the current AddCompactDiscToStoreScreen window and go back to the StoreScreen
        dispose();
    }
}


