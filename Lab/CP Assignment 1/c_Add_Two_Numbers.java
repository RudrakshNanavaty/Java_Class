import java.util.Scanner;

public class c_Add_Two_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 lengths: ");
        int length1 = sc.nextInt();
        int length2 = sc.nextInt();

        int[] num1 = new int[length1];
        System.out.print("1st Number: ");
        for (int i = 0; i < length1; i++)
            num1[i] = sc.nextInt();

        int[] num2 = new int[length2];
        System.out.print("2nd Number: ");
        for (int i = 0; i < length2; i++) {
            num2[i] = sc.nextInt();
        }

        sc.close();

        int maxDigit = Math.max(length1, length2);

        int[] sum = new int[maxDigit + 1];

        int carry = 0;

        // loop ends when i < 0 AND carry == 0
        for (int i = sum.length - 1; i > 0; i--) {
            int digit1 = num1[i - 1];
            int digit2 = num2[i - 1];

            int digitAdded = digit1 + digit2 + carry;
            carry = 0;

            if (digitAdded >= 10) {
                sum[i] = digitAdded % 10;
                carry++;
            } else {
                sum[i] = digitAdded;
            }
        }

        sum[0] = (carry == 1) ? 1 : 0;

        System.out.print("Output    : ");
        for (int i = (sum[0] == 0) ? 1 : 0; i < sum.length; i++)
        System.out.print(sum[i] + " ");

        System.out.println();
    }
}