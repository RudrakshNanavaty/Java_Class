import java.awt.*;
import java.awt.event.*;

public class b_Mouse_Handler {
	public static void main(String[] args) {
		new MouseListenerExample();
	}
}

class MouseListenerExample extends Frame implements MouseListener {

	MouseListenerExample() {
		setSize(500, 500);
		setVisible(true);
		addMouseListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	public void mouseClicked(MouseEvent e) {
		this.setBackground(Color.ORANGE);
		System.out.println("Mouse clicked");
	}

	public void mouseEntered(MouseEvent e) {
		this.setBackground(Color.GREEN);
		System.out.println("Mouse entered");
	}

	public void mouseExited(MouseEvent e) {
		this.setBackground(Color.BLUE);
		System.out.println("Mouse exited");
	}

	public void mousePressed(MouseEvent e) {
		this.setBackground(Color.GREEN);
		System.out.println("Mouse pressed");
	}

	public void mouseReleased(MouseEvent e) {
		this.setBackground(Color.GREEN);
		System.out.println("Mouse released");
	}
}
