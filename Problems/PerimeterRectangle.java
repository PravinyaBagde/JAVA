import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        System.out.print("Enter the value of L : " );
        Scanner ip = new Scanner(System.in);
        double L = ip.nextDouble();

        System.out.print("Enter the value of W : " );
        Scanner input = new Scanner(System.in);
        double W = input.nextDouble();;

        double P = 2 * (L + W);
        System.out.print("The perimeter of rectangle is : " + P);
    }
}
