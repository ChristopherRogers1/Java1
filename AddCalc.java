import java.util.Scanner;

public class AddCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        int num3 = num1+num2;

        System.out.println("Result: " + num3);
    }
}
