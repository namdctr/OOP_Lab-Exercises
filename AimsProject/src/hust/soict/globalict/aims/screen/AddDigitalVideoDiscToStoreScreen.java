package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.media.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.*;
import javax.swing.JTextField;


public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfDirector;
    private JTextField tfLength;
    private JButton btnAdd;
    
    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        
        btnAdd = new JButton("Add"); // Create the add button

        JLabel lblTitle = new JLabel("Title:");
        tfTitle = new JTextField();
        
        JLabel lblCategory = new JLabel("Category:");
        tfCategory = new JTextField();
        
        JLabel lblDirector = new JLabel("Director:");
        tfDirector = new JTextField();
        
        JLabel lblLength = new JLabel("Length:");
        tfLength = new JTextField();
        
        // Arrange the UI components using layout managers or scene builder tools
        
        // Call the createUIComponents method from the superclass to create common components
        createUIComponents();
        add(btnAdd);
        // Add the specific components for adding a DigitalVideoDisc
        add(lblTitle);
        add(tfTitle);
        add(lblCategory);
        add(tfCategory);
        add(lblDirector);
        add(tfDirector);
        add(lblLength);
        add(tfLength);
        
        // Update the window size if needed
        
        // Handle the button click event for adding a DigitalVideoDisc
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddButtonClicked();
            }
        });
    }
    
    @Override
    public void handleAddButtonClicked() {
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        String director = tfDirector.getText();
        int length = Integer.parseInt(tfLength.getText());
        
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length);
        store.addMedia(dvd);
        
        // After adding the DigitalVideoDisc, go back to the StoreScreen
        StoreScreen storeScreen = new StoreScreen(store);
        storeScreen.setVisible(true);
        dispose(); // Close the current AddDigitalVideoDiscToStoreScreen window
    }
}
