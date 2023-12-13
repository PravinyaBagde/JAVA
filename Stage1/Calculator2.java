import java.util.Scanner;

public class Calculator2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumberFromUser("Enter the first number: ", scanner);
        double num2 = getNumberFromUser("Enter the second number: ", scanner);

        int choice = getOperationChoice(scanner);

        double result = performOperation(num1, num2, choice);

        if (Double.isNaN(result)) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            displayResult(result);
        }

        scanner.close();
    }

    private static double getNumberFromUser(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static int getOperationChoice(Scanner scanner) {
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        return scanner.nextInt();
    }

    private static double performOperation(double num1, double num2, int choice) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return (num2 != 0) ? num1 / num2 : Double.NaN;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                return Double.NaN;
        }
    }

    private static void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
