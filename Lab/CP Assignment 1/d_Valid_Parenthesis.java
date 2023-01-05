
import java.util.Scanner;

public class d_Valid_Parenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("s = ");
        String s = scan.nextLine();
        scan.close();

        System.out.println(doBracketsMatch(s));
    }

    static boolean doBracketsMatch(String s) {

        if (s.length() % 2 != 0)
            return false;

        String tempStr = "";
        char lastOpen = ' ';

        for (int i = 0; i < s.length(); i++) {

            char tempChar = s.charAt(i);

            switch (tempChar) {
                // storing last open bracket in a temporary string
                case '(':
                case '{':
                case '[':
                    tempStr += tempChar;
                    lastOpen = tempStr.charAt(tempStr.length() - 1);
                    break;

                // the first closed bracket should be equal to the last open bracket
                case ')':
                    if (lastOpen != '(')
                        return false;
                    else
                        tempStr = tempStr.substring(0, tempStr.length() - 1);
                    break;
                case '}':
                    if (lastOpen != '{')
                        return false;
                    else
                        tempStr = tempStr.substring(0, tempStr.length() - 1);
                    break;
                case ']':
                    if (lastOpen != '[')
                        return false;
                    else
                        tempStr = tempStr.substring(0, tempStr.length() - 1);
                    break;
            }
        }
        return true;
    }
}
