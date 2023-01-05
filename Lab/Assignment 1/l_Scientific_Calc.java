import java.util.Scanner;

public class l_Scientific_Calc {

	public static void main (String[] args) {

		// Initialising Scanner
		Scanner scan = new Scanner(System.in);

		System.out.println("\nWhat operation do you want to perform?");
		System.out.println("1 - Square Root");
		System.out.println("2 - Sine");
		System.out.println("3 - Tangent");
		System.out.println("4 - Power");
		System.out.println("5 - Log (Base 10)");
		System.out.println("6 - Floor");
		System.out.println("7 - Ceiling");

		System.out.print("Input: ");
		int operation = scan.nextInt();

		// switch case to take user inputs
		switch (operation) {

			// Square Root
			case 1:
			System.out.println("Enter Operand:");
			double x = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.sqrt(x));
			break;

			// Sine
			case 2:
			System.out.println("Enter Operand:");
			double s = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.sin(s));
			break;

			// Tangent
			case 3:
			System.out.println("Enter Operand:");
			double t = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.tan(t));
			break;
			// Power
			case 4:
			System.out.println("Enter Coefficient and exponents:");
			double m = scan.nextDouble();
			double n = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.pow(m, n));
			break;

			// Log (Base 10)
			case 5:
			System.out.println("Enter Operand:");
			double l = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.log10(l));
			break;

			// Floor
			case 6:
			System.out.println("Enter Operand:");
			double f = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.floor(f));
			break;

			// Ceiling
			case 7:
			System.out.println("Enter Operand:");
			double c = scan.nextDouble();
			System.out.println("\nAnswer = " + Math.ceil(c));
			break;

			default:
			System.out.println("Please enter valid inputs.");
			break;
		}
		// Closing Scanner
		scan.close();
	}
}
