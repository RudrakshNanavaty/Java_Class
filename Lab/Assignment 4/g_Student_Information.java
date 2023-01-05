import java.awt.*;
import java.awt.event.*;

public class g_Student_Information {
	public static void main(String[] args) {
		new StuDetails();
	}
}

class StuDetails extends Frame {

	//  Creating Labels
	Label label_1;
	Label label_2;
	Label label_3;
	Label label_4;
	Label label_5;

	StuDetails() {

		// Calling Frame Constructor to give Label
		super("Student Details");

		// Initialising Labels
		label_1 = new Label("Name    : Rudraksh Nanavaty");
		label_2 = new Label("Roll No.: 21BCP182");
		label_3 = new Label("Branch  : Computer Engineering");
		label_4 = new Label("Division: 2");
		label_5 = new Label("Group   : 6");

		// Giving labels to display labels
		label_1.setBounds(25, 50, 250, 30);
		label_2.setBounds(25, 100, 250, 30);
		label_3.setBounds(25, 150, 250, 30);
		label_4.setBounds(25, 200, 250, 30);
		label_5.setBounds(25, 250, 250, 30);

		// Add labels to frame
		this.add(label_1);
		this.add(label_2);
		this.add(label_3);
		this.add(label_4);
		this.add(label_5);

		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
