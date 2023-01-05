import java.awt.*;
import java.awt.event.*;

public class f_Menu_using_Frame {
	public static void main(String args[]) {
		new menu();
	}
}

class menu {

	// Constructor
	menu() {
		Frame f = new Frame("Hello");

		MenuBar mb = new MenuBar();

		Menu menu = new Menu("File");

		Menu submenu = new Menu("Open Recent");

		// Creating menu items
		MenuItem item_1 = new MenuItem("New");
		MenuItem item_2 = new MenuItem("Open");
		MenuItem item_3 = new MenuItem("Save");
		MenuItem item_4 = new MenuItem("Save As");
		MenuItem item_5 = new MenuItem("Recent 1");
		MenuItem item_6 = new MenuItem("Recent 2");
		MenuItem item_7 = new MenuItem("Recent 3");
		MenuItem item_8 = new MenuItem("Recent 4");

		// Adding items to menu
		menu.add(item_1);
		menu.add(item_2);
		menu.add(item_3);
		menu.add(item_4);

		// Adding items to submenu
		submenu.add(item_5);
		submenu.add(item_6);
		submenu.add(item_7);
		submenu.add(item_8);

		// Adding submenu to menu
		menu.add(submenu);

		// Adding Menu to MenuBar
		mb.add(menu);

		f.setMenuBar(mb);
		f.setSize(500, 500);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
}
 