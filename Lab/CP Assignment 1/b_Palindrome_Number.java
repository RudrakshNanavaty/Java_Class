import java.util.Scanner;

public class b_Palindrome_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        String str = sc.nextLine();
        sc.close();

        boolean flag = true;

        int length = str.length();

        for (int i = 0; i < length / 2 && flag == true; i++) {

            if(str.charAt(i) != str.charAt(length - i -1))
                flag = false;
        }
        System.out.println(flag);
    }
}
