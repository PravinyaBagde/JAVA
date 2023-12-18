import java.util.Scanner;
public class LeftAngleTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the value of n : ");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

}
