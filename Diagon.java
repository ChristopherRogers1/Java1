import java.util.Scanner;

public class Diagon {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        String[] words = input.split(" ");
        int counter=0;

        for (int i = 0; i < words.length; i++)
        {
            for (int n = 0; n < words[i].length(); n++) {
                for (int x = 0; x < counter; x++)
                    System.out.print(" ");
                System.out.println(words[i].charAt(n));
                counter++;
            }
            counter=0;
        }
    }
}