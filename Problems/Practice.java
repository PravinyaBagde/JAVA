import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the integer : " );
        int n = ip.nextInt();

        System.out.println("You've entered this number : " + n);

        int ans = opposNum(n);
        System.out.println("Your ans is : " + ans);
    }

    static int opposNum(int n) {
        if (n > 0) {
            return -n;
        } else if (n < 0) {
            return -n;
        } else {
            return 0;
        }
    }
}