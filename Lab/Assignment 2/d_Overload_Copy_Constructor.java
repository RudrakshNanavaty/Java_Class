public class d_Overload_Copy_Constructor {

	public static void main(String[] args) {
		// object instances
		Class c1 = new Class(6);
		Class c2 = new Class(144, 10);
		Class c3 = new Class(c2, 69);

		// outputs
		System.out.println("Factorial = " + c1.result);
		System.out.println("Product   = " + c2.result);
		System.out.println("Maximum   = " + c3.result);

	}
}

class Class {

	private int a, b;
	public int result;

	// function to find factorial
	private int factorial(int n) {

		int fact = 1;

		while (n > 1) {
			fact *= n;
			n--;
		}

		return fact;
	}

	// function to find maximum of 3 numbers
	private int max(int x, int y, int z) {
		return (x > y)
				? (x > z) ? x : z
				: (y > z) ? y : z;
	}

	// constructors
	Class(int x) {
		this.a = x;
		this.b = 0;
		result = this.factorial(x);
	}

	Class(int x, int y) {
		this.a = x;
		this.b = y;
		this.result = x * y;
	}

	Class(Class cp, int x) {
		this.a = cp.a;
		this.b = cp.b;
		this.result = this.max(this.a, this.b, x);
	}
}