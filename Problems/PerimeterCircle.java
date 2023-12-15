import java.util.Scanner;
public class PerimeterCircle {
    public static void main(String[] args) {
        System.out.print("Enter the value of r : " );
        Scanner ip = new Scanner(System.in);
        double r = ip.nextDouble();;

        double P = 2 * 3.14 * r;
        System.out.println("The perimeter of circle is : " + P);
    }
}
