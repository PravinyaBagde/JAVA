import java.util.Scanner;
public class Acircle {
    public static void main(String[] args) {
        System.out.print("Enter the value of radius : ");
        Scanner ip = new Scanner(System.in);
        int r = ip.nextInt();

        double Area = 3.14 * r * r ;
        System.out.println("The area of cirle is : " + Area);
    }
}
