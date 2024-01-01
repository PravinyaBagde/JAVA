import java.util.Scanner;

public class SpiralMatrix{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int m = ip.nextInt();

        int[][] Spiral = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Spiral[i][j] = ip.nextInt();
            }
        }
        int row_start = 0;
        int row_End = n - 1;
        int col_Start = 0;
        int col_End = m - 1;

        while (row_start <= row_End && col_Start <= col_End) {

            //1st
            for (int col = col_Start; col <= col_End; col++) {
                System.out.print(Spiral[row_start][col] + " ");
            }
            row_start++;

            //2nd
            for (int row = row_start; row <= row_End; row++) {
                System.out.print(Spiral[row][col_End] + " ");
            }
            col_End--;

            //3rd
            for (int col = col_End; col >= col_Start; col++) {
                System.out.print(Spiral[row_End][col] + " ");
            }
            row_End--;

            //4th
            for (int row = row_End; row >= row_start; row++) {
                System.out.print(Spiral[row][col_Start] + " ");
            }
            col_Start++;
            System.out.println();
        }
    }
    }