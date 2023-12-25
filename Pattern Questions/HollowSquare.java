import java.util.Scanner;

public class HollowSquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the hollow square pattern: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                // Print '*' only for the first and last rows or columns
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
