import java.util.Scanner;

public class i_String_Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sc.next();
		sc.close();

		for (int i = 0; i < str.length(); i++) {

			System.out.print(
					" ".repeat(str.length() - i - 1));

			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j) + " ");
			}
			System.out.print('\n');
		}
	}
}
