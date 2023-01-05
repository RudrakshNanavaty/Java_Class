import java.util.Scanner;

public class f_Vowel_Consonant {

	static boolean isVowel(char c) {

		String vowels = "aeiouAEIOU";

		return vowels.indexOf(c) != -1;
	}

	static boolean isChar(char c) {

		String str = Character.toString(c);

		return str.matches("^[a-zA-Z]$");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Sentence    : ");
		String inputString = scan.nextLine();
		scan.close();

		int vowelCount = 0, consonantCount = 0;

		for (int i = 0; i < inputString.length(); i++) {

			if ( isVowel(inputString.charAt(i)) )
				vowelCount++;

			else if ( isChar(inputString.charAt(i)) )
				consonantCount ++;
		}

		System.out.println("Vowels : " + vowelCount);
		System.out.println("Consonants : " + consonantCount);
	}
}