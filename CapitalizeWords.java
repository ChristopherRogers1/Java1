import java.util.Scanner;

import static java.lang.Character.*;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        boolean everyOther = false;
        StringBuilder string = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if (i == 0)
                string.setCharAt(i, toUpperCase(str.charAt(i)));
            else if (Character.isWhitespace(string.charAt(i)))
            {
                if (everyOther) {
                    string.setCharAt(i + 1, toUpperCase(str.charAt(i + 1)));
                    everyOther=!everyOther;
                }
                else
                    everyOther=!everyOther;
            }
        }
        System.out.println(string);
    }
}
