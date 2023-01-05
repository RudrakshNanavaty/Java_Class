import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class j_Border_Layout {

	public static void main(String args[]) {
		new j_Border_Layout();
	}

	JFrame frame;

	j_Border_Layout() {
		frame = new JFrame();

		// Creating Buttons
		JButton button_1 = new JButton("1");
		JButton button_2 = new JButton("2");
		JButton button_3 = new JButton("3");
		JButton button_4 = new JButton("4");
		JButton button_5 = new JButton("5");
		JButton button_6 = new JButton("6");
		JButton button_7 = new JButton("7");
		JButton button_8 = new JButton("8");
		JButton button_9 = new JButton("9");

		// Adding Buttons to frame
		frame.add(button_1);
		frame.add(button_2);
		frame.add(button_3);
		frame.add(button_4);
		frame.add(button_5);
		frame.add(button_6);
		frame.add(button_7);
		frame.add(button_8);
		frame.add(button_9);

		// Arranging in Grid Layout
		frame.setLayout(new GridLayout(3, 3));
		frame.setSize(500, 500);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}
}
