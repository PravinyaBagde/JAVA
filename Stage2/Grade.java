import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Fair enough.");
                break;
            case 'D':
                System.out.println("You need improvement.");
                break;
            case 'F':
                System.out.println("You failed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
