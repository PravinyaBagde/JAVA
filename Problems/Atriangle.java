import java.util.Scanner;
public class Atriangle {
    public static void main(String[] args) {
        System.out.print("Enter the value of base : ");
        Scanner ip = new Scanner(System.in);
        int base = ip.nextInt();

        System.out.print("Enter the value of height : ");
        int height = ip.nextInt();

        double Area = 0.5 * base * height ;
        System.out.println("The area of triangle is : " + Area);
    }
}
