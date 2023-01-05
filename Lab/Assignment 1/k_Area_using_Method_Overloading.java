import java.util.Scanner;

public class k_Area_using_Method_Overloading {

	static double area (double x, int shape) {

		if(shape == 1)
		return 3.1415928 * x * x;

		else return x * x;
	}

	static double area (double x, double y, int shape) {

		if(shape == 3)
		return 0.5 * x * y;

		else return x * y;
	}

	public static void main (String[] args) {

		// Initialising Scanner
		Scanner scan = new Scanner(System.in);

		System.out.println("\nWhat do you want to find the area of?");
		System.out.println("1 - Circle");
		System.out.println("2 - Square");
		System.out.println("3 - Triangle");
		System.out.println("4 - Rectangle");

		System.out.print("Input: ");
		int shape = scan.nextInt();
		double area = 0;

		// switch case to take user inputs
		switch (shape) {

			// Circle
			case 1:
			System.out.print("\nEnter radius: ");
			double radius = scan.nextDouble();
			area = area(radius, shape);
			break;

			// Square
			case 2:
			System.out.print("\nEnter side: ");
			double side = scan.nextDouble();
			area = area(side, shape);
			break;

			// Triangle
			case 3:
			System.out.print("\nEnter base and height: ");
			double base = scan.nextDouble();
			double height = scan.nextDouble();
			area = area(base, height, shape);
			break;

			// Rectangle
			case 4:
			System.out.print("\nEnter length and width: ");
			double length = scan.nextDouble();
			double width = scan.nextDouble();
			area = area(length, width, shape);
			break;

			default:
			break;
		}
		// closing scanner
		scan.close();

		// Printing the area if user entered a valid shape
		if(area != 0)
		System.out.println("The area is: " + area + '\n');
		else
		System.out.println("\nPlease enter a valid shape.\n");
	}
}
