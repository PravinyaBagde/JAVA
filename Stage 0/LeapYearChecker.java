import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.print("Enter the year you want to check: ");
        Scanner ya = new Scanner(System.in);
        int year = ya.nextInt();


        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            }
            else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else
        {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner to release resources
        ya.close();
    }
}
