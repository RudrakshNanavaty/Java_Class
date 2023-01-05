import java.util.Arrays;
import java.util.Scanner;

public class f_Median_of_Sorted_Arrays {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("2 Lengths = ");
		int l1 = scan.nextInt();
		int l2 = scan.nextInt();

		int nums1[] = new int[l1];
		int nums2[] = new int[l2];

		System.out.print("nums1  = ");
		for (int i = 0; i < l1; i++)
			nums1[i] = scan.nextInt();

		System.out.print("nums2  = ");
		for (int i = 0; i < l2; i++)
			nums2[i] = scan.nextInt();

		scan.close();

		int[] arr3 = new int[l1 + l2];

		System.arraycopy(nums1, 0, arr3, 0, l1);
		System.arraycopy(nums2, 0, arr3, l1, l2);

		Arrays.sort(arr3);

		System.out.println(Median(arr3));
	}

	static double Median(int[] arr) {
		int length = arr.length;

		if (length % 2 == 0) {
			int z = length / 2;
			int mid1 = arr[z];
			int mid2 = arr[z - 1];

			double ans = ((mid1 + mid2) * 1.0) / 2;
			return ans;
		}

		else {
			int z = length / 2;
			return arr[z];
		}
	}
}
