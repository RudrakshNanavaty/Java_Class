import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;

public class kb_Box_Layout {

	public static void main(String[] args) {

		// Function to set up the window frame.
		JFrame.setDefaultLookAndFeelDecorated(true);

		// Creating Object of "JFrame" class
		JFrame frame = new JFrame("BoxLayout Example");

		// Declaration of objects of JButton class.
		JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5;

		// Function to set the default close operation of JFrame the.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Creating Object of "boxlayout" in Y_Axis from top to down
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		// to set the box layout
		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));

		// Initialization of Buttons
		jbtn1 = new JButton("Button 1");
		jbtn2 = new JButton("Button 2");
		jbtn3 = new JButton("Button 3");
		jbtn4 = new JButton("Button 4");
		jbtn5 = new JButton("Button 5");

		// Adding Buttons to Frame
		panel.add(jbtn1);
		panel.add(jbtn2);
		panel.add(jbtn3);
		panel.add(jbtn4);
		panel.add(jbtn5);

		frame.add(panel);

		frame.pack();
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
