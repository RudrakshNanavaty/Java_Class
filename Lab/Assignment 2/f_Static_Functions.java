public class f_Static_Functions {
	public static void main(String args[]) {
		// 3 arguments
		function('A', 'B', 'C');
		// 0 arguments
		function();
		// 2 arguments
		function('X', 'Y');
	}

	static void function(char... c) {
		System.out.println("Number of arguments: " + c.length);

		for (int i : c)
			System.out.print(i + " ");
		System.out.println();
	}
}