import java.util.Scanner;

public class DisPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Distance, x1, x2, y1, y2;

        System.out.print("Enter x1 :");
        x1 = input.nextDouble();

        System.out.print("Enter y1 :");
        y1 = input.nextDouble();

        System.out.print("Enter x2 :");
        x2 = input.nextDouble();

        System.out.print("Enter y2 :");
        y2 = input.nextDouble();

        Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("The distance bwteen the two point is : " + Distance);

    }
}





