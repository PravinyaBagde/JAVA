import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = ip.nextInt();

        int real = x;
        int rev = 0;

        while( x != 0){
            int digit = x % 10;
            rev = rev*10 + digit;
            x = x/10;
        }
        if( rev == real){
            System.out.print("The number is palindrome .");
        }else {
            System.out.print("Not a palindrome number");
        }
    }
}
