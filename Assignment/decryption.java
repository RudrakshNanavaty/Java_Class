import java.io.FileInputStream;
import java.io.IOException;

public class decryption {
	public static void main(String[] args) throws IOException {

		int ch;

		// Read the file
		System.out.println("\nReading from encrypted.dat");
		try (FileInputStream fi = new FileInputStream("encrypted.dat")) {

			while ((ch = fi.read()) != -1) {
				System.out.print((char) (ch - 5));
			}

			System.out.println('\n');
		}
	}
}
