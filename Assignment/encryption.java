import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class encryption {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		try {

			System.out.print("\nInput string to write to file:\n\t");
			String b = scan.nextLine();
			scan.close();

			// Open file
			FileOutputStream fo = new FileOutputStream("./encrypted.dat");

			// Writing to file
			for (int i = 0; i < b.length(); i++) {
				char c = b.charAt(i);
				fo.write(c + 5);
			}

			System.out.println("\nWrite successful.\n");

			// Close file
			fo.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
