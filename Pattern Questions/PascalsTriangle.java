import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        printPascalsTriangle(numRows);
    }

    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "   ");
            }
            System.out.println();
        }
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
