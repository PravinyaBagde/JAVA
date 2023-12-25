import java.util.Scanner;

public class HollowAlphaPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the hollow pyramid pattern: ");
        int rows = scanner.nextInt();

        char currentChar = 'A';

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the characters
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print characters for the first and last rows
            if (i == 1 || i == rows) {
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(currentChar++);
                }
            } else { // Print characters with spaces in between
                for (int k = 1; k <= 2 * i - 1; k++) {
                    if (k == 1 || k == 2 * i - 1) {
                        System.out.print(currentChar++);
                    } else {
                        System.out.print(" ");
                        currentChar++;
                    }
                }
            }

            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
