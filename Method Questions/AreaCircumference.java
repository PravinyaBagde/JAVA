import java.util.Scanner;
public class AreaCircumference {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the value of r : ");
        double r = ip.nextInt();

        double Area = isArea(r);
        double Circumference = isCircumference(r);

        System.out.println("The area of a circle is : " + Area);
        System.out.print("The circumference of a cirle is : " + Circumference);
    }

    public static double isArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double isCircumference(double r) {
        return 2 * Math.PI * r;
    }
}
