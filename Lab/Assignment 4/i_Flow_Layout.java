import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class i_Flow_Layout {

	public static void main(String args[]) {
		new i_Flow_Layout();
	}

	JFrame frame;

	i_Flow_Layout() {
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
		JButton button_10 = new JButton("10");

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
		frame.add(button_10);

		// Arranging in Flow Layout
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 500);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}
}
