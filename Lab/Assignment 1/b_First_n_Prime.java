import java.util.Scanner;

public class b_First_n_Prime {

	static boolean checkPrime(int n) {

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("How many prime numbers? ");
		int n = scan.nextInt();

		scan.close();

		int count = 0;

		for (int i = 2; count < n; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
	}
}