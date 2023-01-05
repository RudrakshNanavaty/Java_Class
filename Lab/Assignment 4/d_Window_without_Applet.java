import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class d_Window_without_Applet {
	public static void main(String[] args) {
		System.out.println();
		new JFrameDemo();
	}

}

class JFrameDemo extends JFrame implements WindowListener {

	// Constructor
	public JFrameDemo() {
		this.setSize(500, 500);
		this.setVisible(true);
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed\n");
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window De-Iconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Window Activated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Window Deactivated");
	}
}
