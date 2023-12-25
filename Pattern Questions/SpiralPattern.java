import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] spiralMatrix = new int[rows][cols];
        int value = 1;

        int startRow = 0, endRow = rows - 1, startCol = 0, endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse right
            for (int i = startCol; i <= endCol; i++) {
                spiralMatrix[startRow][i] = value++;
            }
            startRow++;

            // Traverse down
            for (int i = startRow; i <= endRow; i++) {
                spiralMatrix[i][endCol] = value++;
            }
            endCol--;

            // Traverse left
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    spiralMatrix[endRow][i] = value++;
                }
                endRow--;
            }

            // Traverse up
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    spiralMatrix[i][startCol] = value++;
                }
                startCol++;
            }
        }

        // Print the spiral matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", spiralMatrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
