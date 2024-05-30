package hust.soict.globalict.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;

public class MediaStore extends JPanel {
	private Media media;
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		container.add(new JButton ("Add to cart"));
		if(media instanceof Playable) {
			container.add(new JButton("Play"));
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
//	private void addToCart() {
//	        // Add the media to the cart
//	        // Implement the logic to add the media item to the cart
//	    }
//	    
//    private void playMedia() {
//        // Play the media in a dialog window
//        // Implement the logic to play the media item
//        JDialog dialog = new JDialog();
//        dialog.setTitle("Play Media");
//        dialog.setSize(400, 300);
//        
//        // Add the necessary components and logic to play the media in the dialog window
//        
//        dialog.setVisible(true);
//    }
}
