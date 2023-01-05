import java.util.Scanner;

public class c_Calc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 2 numbers: ");

		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.print("Enter operation (+, -, *, /): ");
		char o = scan.next().charAt(0);
		scan.close();

		float result;

		System.out.print("Result of operation: ");

		switch (o) {
			case '+':
				result = x + y;
				System.out.println(result);
				break;

			case '-':
				result = x - y;
				System.out.println(result);
				break;

			case '*':
				result = x * y;
				System.out.println(result);
				break;

			case '/':
				result = x / y;
				System.out.println(result);
				break;

			default:
				System.out.println("Invalid Oeration.");
		}
	}
}