import java.util.Scanner;
public class FloydTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int num = 1;

        for (int i = 1; i <= n ; i++) {
            //Inner Loop
            for (int j = 1; j <= i ; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
    }
}
