import java.util.Scanner;

public class g_First_Missing_Positive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();

        int nums[] = new int[length];

        for (int i = 0; i < length; i++)
            nums[i] = scan.nextInt();

        scan.close();

        for (int i = 1; i <= nums.length + 1; i++) {
            boolean flag = false;

            for (int j = 0; j < nums.length && !flag; j++) {

                if (nums[j] == i)
                    flag = true;
            }

            if (!flag) {
                System.out.println(i);
                return;
            }
        }
    }
}
