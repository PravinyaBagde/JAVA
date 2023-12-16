import java.util.Scanner;
public class NumofCombination {
    public static void main(String[] args) {
        System.out.print("Enter the value of n and r : ");
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int r = ip.nextInt();
        int ncr = 1;
        for (int i = 1; i <= r; i++) {
            ncr = ncr * n / i;
            n--;
        }
        System.out.print("NCR = " + ncr);
    }
}
