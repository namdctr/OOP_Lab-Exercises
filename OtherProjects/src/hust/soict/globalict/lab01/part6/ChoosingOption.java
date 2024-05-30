package hust.soict.globalict.lab01.part6;
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change your first class ticket ?");
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"NO"));
		System.exit(0);
	}
}

// Question:
//- If users choose "Cancel", the program will display the message "You've chosen: NO"
//- To customize the options to the users, we can use the showOptionDialog method instead 
//of the showConfirmDialog method. For example, to create a custom dialog box with options 
//"I do" and "I don't", we can modify the code as following:

//import javax.swing.JOptionPane;
//public class tesss {
//	public static void main(String[] args) {
//		String[] options = {"I do", "I don't"};
//		int option = JOptionPane.showOptionDialog(null, "Do you want to change your first class ticket ?", "Select an option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
//		if(option == JOptionPane.YES_OPTION) {
//		    JOptionPane.showMessageDialog(null, "You've chosen: I do");
//		} else if(option == JOptionPane.NO_OPTION) {
//		    JOptionPane.showMessageDialog(null, "You've chosen: I don't");
//		}
//		System.exit(0);
//	}
//}