import java.sql.SQLOutput;
import java.util.Scanner;
public class SumNaturalNum {
    public static void main(String[] args) {
        System.out.print("Enter the N natural number : ");
        Scanner ip = new Scanner(System.in);
        double  N = ip.nextDouble();

        double Count = 0 ;
        for (int i = 0; i <= N; i++) {
            Count = Count + i;
        }
        System.out.print("The sum of first " + N + "Natural Numbers is : " + Count );
    }
}
