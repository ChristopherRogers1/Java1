import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        boolean isPali = true;

        for (int i = 0; i < word.length()/2; i++)
        {
            if (word.charAt(i)!=word.charAt(word.length()-(i+1)))
            {
                isPali=false;
            }
        }

        if (isPali)
            System.out.println("This word is a palindrome!");
        else
            System.out.println("This word isn't a palindrome");

    }
}