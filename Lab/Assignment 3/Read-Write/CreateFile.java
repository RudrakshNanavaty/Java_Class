import java.util.Scanner;
// file handlers
import java.io.FileWriter;
import java.io.FileReader;
// exceptions
import java.io.IOException;
import java.io.FileNotFoundException;

class CreateFile {
	public static void main(String[] args) {

		home();
	}

	static void home() {
		Scanner scan = new Scanner(System.in);

		// clear terminal
		System.out.print("\033[H\033[2J");
		System.out.flush();

		System.out.println("\n========== WELCOME ==========");
		System.out.println("1 - Read from file.txt");
		System.out.println("2 - Write to file.txt");

		int input = scan.nextInt();

		switch (input) {
			case 1:
				fileRead();
				break;

			case 2:
				fileWrite();
				break;

			default:
				System.out.println("Invalid Input.");
		}
	}

	static void fileRead() {
		try {
			Scanner scan = new Scanner(System.in);

			FileReader fr = new FileReader("file.txt");

			System.out.println("");

			// read from FileReader char by char
			int ch;
			while ((ch = fr.read()) != -1)
				System.out.print((char) ch);

			System.out.println("\n");

			System.out.println("Press any key for Main Menu.");

			// close the file
			fr.close();

			scan.next();
			home();

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("IO Error.");
		}
	};

	static void fileWrite() {
		try {

			Scanner scan = new Scanner(System.in);

			System.out.print("\nEnter a string: ");
			String str = scan.nextLine();

			// attach a file to FileWriter
			FileWriter fw = new FileWriter("file.txt");

			// write string to file char by char
			for (int i = 0; i < str.length(); i++)
				fw.write(str.charAt(i));

			System.out.println("\nWrite Successful.");
			System.out.println("Press any key for Main Menu.");

			// close the file
			fw.close();

			scan.next();
			home();

		} catch (IOException e) {
			System.out.println("IO Error.");
		}
	};
}