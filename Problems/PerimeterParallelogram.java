import java.util.Scanner;
public class PerimeterParallelogram {
    public static void main(String[] args) {
        System.out.print("Enter the value of a : " );
        Scanner ip = new Scanner(System.in);
        double a = ip.nextDouble();

        System.out.print("Enter the value of b : " );
        Scanner input = new Scanner(System.in);
        double b = input.nextDouble();;

        double P = 2 * (a + b);
        System.out.print("The perimeter of paralellogram is : " + P);
    }
}
