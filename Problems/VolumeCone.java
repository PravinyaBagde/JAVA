import java.util.Scanner;
public class VolumeCone {
    public static void main(String[] args) {
        System.out.print("Enter the value of r : " );
        Scanner ip = new Scanner(System.in);
        double r = ip.nextDouble();

        System.out.print("Enter the value of h : " );
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();;

        double Volume = (3.14 * r * r) * h/3;
        System.out.print("The volme of cone is : " + Volume);
    }
}
