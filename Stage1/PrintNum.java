import java.util.Scanner;
public class PrintNum {
    public static void main(String[] args) {
        System.out.print("Enter the number - ");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }
}