import java.util.Scanner;

public class e_Maximum_using_Conditional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nums[] = new int[3];

		System.out.print("Enter 3 numbers: ");
		for (int i = 0; i < 3; i++)
			nums[i] = sc.nextInt();

		sc.close();

		int maximum = (nums[0] >= nums[1])
				? (nums[0] >= nums[2]) ? nums[0] : nums[2]
				: (nums[1] >= nums[2]) ? nums[1] : nums[2];

		System.out.println("Maximum = " + maximum);
	}
}