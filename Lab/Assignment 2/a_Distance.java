import java.util.Scanner;
import java.lang.Math;

public class a_Distance {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter meters and centimeters:\n");
		int meters = scan.nextInt();
		double centimeters = scan.nextDouble();
		scan.close();

		Distance d = new Distance(meters, centimeters);

		System.out.println("Feet  : " + d.getFeet());
		System.out.println("Inches: " + d.getInch());
	}

}

class Distance {
	private double distance;
	private double imperialDistance;

	public Distance() {
		this.distance = 0;
		this.imperialDistance = distance * 3.28048;
	}

	public Distance(int meters, double centimeters) {
		this.distance = meters + (centimeters / 100);
		this.imperialDistance = distance * 3.28048;
	}

	public int getFeet() {
		return (int) Math.floor(this.imperialDistance);
	}

	public double getInch() {
		return (this.imperialDistance - getFeet()) * 12;
	}
}