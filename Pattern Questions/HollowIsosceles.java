import java.util.Scanner;

public class HollowIsosceles{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the hollow isosceles triangle pattern: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars for the first and last rows
            if (i == 1 || i == rows) {
                for (int k = 1; k <= 2 * (rows - i) + 1; k++) {
                    System.out.print("*");
                }
            } else { // Print stars for other rows with spaces in between
                for (int k = 1; k <= 2; k++) {
                    if (k == 1 || k == 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
