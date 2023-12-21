import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of test case : ");
        int t = ip.nextInt();

        for (int i = 0; i < t; i++) {
            int a = ip.nextInt();
            int b = ip.nextInt();
            int n = ip.nextInt();

            for (int j = 0; j < n; j++) {
                a = a+b;
                System.out.print(a + " ");
                b=b*2;
            }
            System.out.println();
        }
        ip.close();
    }
}
