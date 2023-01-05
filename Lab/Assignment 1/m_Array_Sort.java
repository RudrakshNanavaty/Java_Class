import java.util.Arrays;
import java.util.Scanner;

public class m_Array_Sort {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter length of array: ");
		int n = scan.nextInt();
		int[] a = new int[n];

		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		scan.close();

		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("The Sorted array: " + Arrays.toString(a));
	}
}
