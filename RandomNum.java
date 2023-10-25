import java.util.Scanner;
import java.math.*;

public class RandomNum {
    public static void main(String[] args)
    {
        double randomNum;
        boolean done = false;
        Scanner scan = new Scanner(System.in);
        while (done==false)
        {
            randomNum = Math.random()*5+1;
            System.out.println("Enter a number:");
            if (scan.nextInt()==(int)randomNum)
            {
                System.out.println("You got it!");
                done = true;
            }
            else
                System.out.println("Try again...");
        }
    }
}
