import java.util.Scanner;

public class CountUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int counter=0;

        for (int i=0; i < str.length(); i++)
        {
            if (Character.isUpperCase(str.charAt(i)))
            {
                counter+=1;
            }
        }
        System.out.println("The number of capital letters is : " + counter);
    }
}
