import java.util.Scanner;
import static java.lang.Character.*;


public class LetterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vowelCount = 0, consonantCount = 0;

        System.out.println("Enter a string: ");
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++)
        {
            if (input.substring(i,i+1).equals("a")||input.substring(i,i+1).equals("e")||input.substring(i,i+1).equals("i")||input.substring(i,i+1).equals("o")||input.substring(i,i+1).equals("u"))
            {
                vowelCount++;
            }
            else if (input.substring(i,i+1).equals(" ")||input.substring(i,i+1).equals(".")||input.substring(i,i+1).equals("!")||input.substring(i,i+1).equals("?"))
            {

            }
            else
                consonantCount++;
        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);
    }
}
