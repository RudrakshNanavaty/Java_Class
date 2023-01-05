import java.util.Scanner;

public class a_Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");

        int arrSize = sc.nextInt();
        int[] numArr = new int[arrSize];

        System.out.print("nums = ");
        for (int i = 0; i < arrSize; i++)
            numArr[i] = sc.nextInt();

        System.out.print("Target = ");
        int target = sc.nextInt();

        sc.close();

        boolean flag = false;

        for (int i = 0; i < arrSize & flag == false; i++) {
            for (int j = i + 1; j < arrSize && flag == false; j++) {
                if (numArr[i] + numArr[j] == target)
                    System.out.println("Output: [" + i + ", " + j + "]");
            }
        }
        if (flag == false) {
            System.out.println(
                    "No 2 numbers in nums add up to the target");
        }
    }
}