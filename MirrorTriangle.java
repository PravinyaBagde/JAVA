import java.util.Scanner;

public class MirrorTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print mirror image triangle pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
