import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial= factorial*i;

        }
        System.out.print("The factorial of "+ num +" is "+ factorial);

    }
}
