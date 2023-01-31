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
            if(nums[i-1] != i) {
                System.out.println("First Missing Positive: ", i);
                return;
            }
            System.out.println("First Missing Positive: ", i+1);   
        }
    }
}
