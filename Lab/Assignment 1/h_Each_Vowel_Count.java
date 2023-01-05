import java.util.Scanner;

public class h_Each_Vowel_Count {

	static boolean isVowel(char c) {

		String str = Character.toString(c);

		return str.matches("^[aeiouAEIOU]$");
	}

	static boolean isChar(char c) {

		String str = Character.toString(c);

		return str.matches("^[a-zA-Z]$");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Sentence : ");
		String inputString = scan.nextLine();

		while (! inputString.equals("quit")) {

			int count[] = { 0, 0, 0, 0, 0 };

			for (int i = 0; i < inputString.length(); i++) {

				char c = inputString.charAt(i);

				if (isChar(c)) {
					if (isVowel(c)) {
						switch (c) {
							case 'a':
								count[0]++;
								break;
							case 'e':
								count[1]++;
								break;
							case 'i':
								count[2]++;
								break;
							case 'o':
								count[3]++;
								break;
							case 'u':
								count[4]++;
								break;
						}
					}
				}
			}

			System.out.println("A : " + count[0]);
			System.out.println("E : " + count[1]);
			System.out.println("I : " + count[2]);
			System.out.println("O : " + count[3]);
			System.out.println("U : " + count[4]);

			System.out.println("\nEnter another sentence:");
			System.out.println("(or 'quit')");
			inputString = scan.nextLine();
		}

		scan.close();
	}
}