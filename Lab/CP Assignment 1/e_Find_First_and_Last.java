import java.util.Scanner;

public class e_Find_First_and_Last {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Length = ");
		int length = scan.nextInt();

		int nums[] = new int[length];

		System.out.print("nums   = ");
		for (int i = 0; i < length; i++)
			nums[i] = scan.nextInt();

		System.out.print("Target = ");
		int target = scan.nextInt();

		scan.close();

		int start = -1, end = -1;

		for (int i = 0; i < length; i++) {
			if (nums[i] == target) {
				if (start == -1)
					start = i;

				end = i;
			}
		}

		System.out.println("[" + start + ", " + end + "]");
	}
}
