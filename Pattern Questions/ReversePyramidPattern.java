import java.sql.SQLOutput;
import java.util.Scanner;
public class ReversePyramidPattern {
    public static void main(String[] args) {
        System.out.print("Enter the value of num : ");
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();

        for (int i = num; i >= 1 ; i--) {

            //to print spaces
            for (int j = 1; j <= num -i ; j++) {
                System.out.print(" ");
            }
            // to print star
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
