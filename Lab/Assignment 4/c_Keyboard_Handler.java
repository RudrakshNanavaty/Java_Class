import java.awt.*;
import java.awt.event.*;

public class c_Keyboard_Handler {
	public static void main(String[] args) {
		new KeyListenerExample();
	}
}

class KeyListenerExample extends Frame implements KeyListener {
	KeyListenerExample() {
		setSize(500, 500);
		setVisible(true);
		this.addKeyListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	public void keyPressed(KeyEvent e) {
		this.setBackground(Color.ORANGE);
		System.out.println("key pressed");
	}

	public void keyReleased(KeyEvent e) {
		this.setBackground(Color.RED);
		System.err.println("key released");
	}

	public void keyTyped(KeyEvent e) {
		this.setBackground(Color.GREEN);
		System.out.println("key tapped");
	}
}
