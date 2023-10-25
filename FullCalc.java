import java.util.Scanner;

public class FullCalc {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter operation (add, sub, mul, div): ");
        String op = scan.next();

        if (op.equals("add"))
            System.out.println("Result: " + (num1+num2));
        else if (op.equals("sub"))
            System.out.println("Result: " + (num1-num2));
        else if (op.equals("mul"))
            System.out.println("Result: " + (num1*num2));
        else if (op.equals("div"))
            System.out.println("Result: " + (num1/num2));
        else
            System.out.println("Error: Invalid entry");
    }
}
