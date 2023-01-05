import java.util.Scanner;

public class g_Words_with_Capital {

	static boolean isCapital(char c) {

		String str = Character.toString(c);

		return str.matches("^[A-Z]$");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Sentence : ");
		String inputString = scan.nextLine();
		scan.close();

		int wordCount =
		( isCapital(inputString.charAt(0)) )
		? 1
		: 0;

		for (int i = 0; i < inputString.length(); i++) {

			if ( Character.isWhitespace(inputString.charAt(i)) && isCapital(inputString.charAt(i + 1)) ) {

				wordCount++;
			}
		}

		System.out.println(wordCount + " words start with a capital letter.");

	}
}