import java.util.Scanner;

public class b_Reference_Variable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter feet and inch:\n");
		int feet = scan.nextInt();
		double inch = scan.nextDouble();
		scan.close();

		Distance d0 = new Distance(feet, inch);
		System.out.print(d0.Feet() + " ft.\t");
		System.out.print(d0.Inch() + " in.\n");

		Distance d1 = new Distance(d0.Feet(), d0.Inch());
		System.out.print(d1.Feet() + " ft.\t");
		System.out.print(d1.Inch() + " in.\n");

		Distance d2 = new Distance(d0);
		System.out.print(d2.Feet() + " ft.\t");
		System.out.print(d2.Inch() + " in.\n");
	}

}

class Distance {
	private int feet;
	private double inch;
	public double distance;

	// Constructors
	public Distance() {
		this.distance = 0;
	}

	public Distance(int feet, double inch) {
		this.feet = feet;
		this.inch = inch;
		this.distance = feet + (inch / 12);
	}

	public Distance(Distance d) {
		this.feet = d.feet;
		this.inch = d.inch;
		this.distance = d.distance;
	}

	// Getters
	public int Feet() {
		return this.feet;
	}

	public double Inch() {
		return this.inch;
	}
}
