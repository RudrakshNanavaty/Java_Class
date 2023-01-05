import java.util.Scanner;

public class j_Asterisk_Diamond {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Height: ");
		int height = sc.nextInt();
		sc.close();

		for (int i = 0; i < height; i++) {

			System.out.print(
					" ".repeat(height - i - 1));

			System.out.print("* ".repeat(i + 1));

			System.out.print('\n');
		}

		for (int i = height - 1; i > 0; i--) {

			System.out.print(
					" ".repeat(height - i));

			System.out.print("* ".repeat(i));

			System.out.print('\n');
		}
	}
}
