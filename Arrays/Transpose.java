import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int m = ip.nextInt();

        int [][] Transpose = new int[n][m] ;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Transpose[i][j] = ip.nextInt();
            }
        }
        System.out.println("The transpose is : ");

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();

        }
    }
}
