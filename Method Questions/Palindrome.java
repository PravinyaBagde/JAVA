import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number string : ");
        Scanner ip = new Scanner(System.in);
        double num = ip.nextDouble();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.print("Not a palindrome number.");
        }
    }

    public static boolean isPalindrome(double num) {
        String numStr = String.valueOf((int) num);
        int length = numStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
