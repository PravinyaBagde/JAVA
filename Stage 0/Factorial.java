import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        System.out.print("Enter the number of your choice - ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 0){
            System.out.println("The given number is negative.");
        }else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("The Factorial of " + num + " is  - " + factorial);
        }
    }
}