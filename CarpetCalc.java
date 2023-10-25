import java.util.Scanner;

public class CarpetCalc {
    static boolean done = false;
    static int width, height, total=0;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price per square feet: ");
        int price = scan.nextInt();
        scan.nextLine();

        while (!done) {

            System.out.println("Enter room dimensions (width x height): ");
            String input = scan.nextLine();

            if (input.equals("done"))
                done=true;
                else {
                String[] dimensions = input.split("x");
                int width = Integer.parseInt(dimensions[0].trim());
                int height = Integer.parseInt(dimensions[1].trim());

                total+= (height*width*price);
            }
        }

        System.out.println("Total cost: " + total);
    }
}
