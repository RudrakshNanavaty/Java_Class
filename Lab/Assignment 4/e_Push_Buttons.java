import java.awt.*;
import java.awt.event.*;

public class e_Push_Buttons {
	public static void main(String[] args) {

		// Create a frame
		Frame f = new Frame("Button Example");

		// Create a text field
		final TextField tf = new TextField();

		tf.setBounds(50, 50, 50, 50);

		// Create a button
		Button b = new Button("button");

		b.setBounds(50, 50, 50, 50);

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Button Pressed.");
			}
		});

		f.add(b);
		f.add(tf);
		f.setSize(500, 500);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
}