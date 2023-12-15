import java.util.Scanner;
public class Arhombus{
    public static void main(String[] args) {
        System.out.print("Enter the value of the D1 : ");
        Scanner ip = new Scanner(System.in);
        double D1 = ip.nextDouble();

        System.out.print("Enter the value of the D2 : ");
        Scanner input = new Scanner(System.in);
        double D2 = input.nextDouble();

        double Area = ( D1 * D2 )/2 ;
        System.out.print("The area of rhombus is : " + Area);
    }
}
