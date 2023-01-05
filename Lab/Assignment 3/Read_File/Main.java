import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		try {
			// Create a File object
			File file = new File("./file.txt");
			// Initialize file scanner
			Scanner reader = new Scanner(file);

			int charCount = 0,
					wordCount = 0,
					sentenceCount = 0;

			// Iterate through all the lines from file
			while (reader.hasNextLine()) {

				// reading next line
				String line = reader.nextLine();

				// update no. of characters
				charCount += line.length();
				// update no. of words
				wordCount += line.split(" ").length;
				// update no. of sentences
				sentenceCount += line.strip().split("[.?!] ").length;
			}
			// Close file scanner
			reader.close();

			// Printing Outputs
			System.out.println("No. of characters: " + charCount);
			System.out.println("No. of words     : " + wordCount);
			System.out.println("No. of sentences : " + sentenceCount);
		}
		// if file does not exist
		catch (FileNotFoundException e) {
			System.out.println("'file.txt' does not exist.");
		}
	}
}