package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;

import java.awt.event.ActionEvent;
import javax.swing.text.TabableView;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.*;

public class CartScreenController {
	private Cart cart;
	
	@FXML
	private Button btnPlay;

	@FXML
	private Button btnRemove;
	
	@FXML
	private TextField tfFilter;
	
	@FXML
	private RadioButton radioBtnFilterID;
	
	@FXML
	private RadioButton radioBtnFilterTitle;
	
	@FXML
	private TableView<Media> tblMedia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediaCategory;
	
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	
	@FXML
	private Label lblTotalCost;
	

	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
	
	@FXML
	private void initialize() {
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems((ObservableList<Media>) this.cart.getItemsOrdered());
		
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		
		tblMedia.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Media>() {
					@Override
					public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
						if(newValue != null)
							updateButtonBar(newValue);
					}
				});
		
		tfFilter.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				showFilteredMedia(newValue);
			}
	    });
		
		lblTotalCost.setText(String.format("Total Cost: %.2f", cart.totalCost()));
	    cart.getTotalCostProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
	        lblTotalCost.setText(String.format("Total Cost: %.2f", newValue));
	    });
	}
	private void updateButtonBar(Media media) {
	    btnRemove.setVisible(true);
	    if(media instanceof Playable) {
		    btnPlay.setVisible(true);
	    }
	    else {
		    btnPlay.setVisible(false);

	    }
	}
	
	private void showFilteredMedia(String filterText) {
	    boolean filterById = radioBtnFilterID.isSelected();
	    boolean filterByTitle = radioBtnFilterTitle.isSelected();

	    // Create a FilteredList based on the original media list
	    FilteredList<Media> filteredList = new FilteredList<>(cart.getItemsOrdered());

	    // Set a new predicate based on the selected filter criteria
	    filteredList.setPredicate(media -> {
	        if (filterText.isEmpty()) {
	            // No filter text, show all media
	            return true;
	        } else if (filterById) {
	            // Filter by ID
	            return String.valueOf(media.getId()).contains(filterText);
	        } else if (filterByTitle) {
	            // Filter by title
	            return media.getTitle().contains(filterText);
	        }
	        return false; // Default case, should not happen
	    });

	    // Update the table view with the filtered media list
	    tblMedia.setItems(filteredList);
	}

	@FXML
	void btnRemovePressed(ActionEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(media);
	}
}
