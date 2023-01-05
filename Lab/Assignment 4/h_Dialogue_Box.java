import java.awt.*;
import java.awt.event.*;

public class h_Dialogue_Box {

	public static void main(String args[]) {
		new DialogBoxExample();
	}
}

class DialogBoxExample extends WindowAdapter implements ActionListener {
	Frame frame;
	Label label_1;
	TextField field_1;
	Button button_1, button_2, button_3;
	Dialog d1, d2, d3;

	DialogBoxExample() {
		frame = new Frame("Dialog Box Example");

		button_1 = new Button("Open Dialog Box");
		label_1 = new Label("Click on the button to open the Dialog Box");

		frame.add(label_1);
		frame.add(button_1);

		button_1.addActionListener(this);
		frame.pack();
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 500);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Open Dialog Box")) {
			d1 = new Dialog(frame, "ModalDialog", true);
			Label label = new Label("This is a Dialog Box.", Label.CENTER);
			d1.add(label);
			d1.addWindowListener(this);
			d1.pack();
			d1.setLocationRelativeTo(frame);
			d1.setLocation(new Point(100, 100));
			d1.setSize(300, 300);
			d1.setVisible(true);
		}
	}

}