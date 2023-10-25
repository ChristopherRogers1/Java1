import java.util.Scanner;

public class UppercaseName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        name = name.toUpperCase();
        System.out.println("Your name in upper case is " + name);
    }
}