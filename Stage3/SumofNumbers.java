import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  System.out.print("Enter the list of numbers OR Enter 0 to terminate the list : ");


        int sumNegative = 0;
        int sumEvenPositive = 0;
        int sumOddPositive = 0;

        int number;
        do {
            System.out.print("Enter a number : ");
            number = scanner.nextInt();

            if (number < 0) {
                sumNegative = sumNegative + number;
            } else if (number % 2 == 0) {
                sumEvenPositive = sumEvenPositive + number;
            } else {
                sumOddPositive = sumOddPositive + number;
            }
        } while (number != 0) ;
                System.out.println("Sum of negative numbers is : " + sumNegative);
                System.out.println("Sum of positive evne numbers is : " + sumEvenPositive);
                System.out.println("Sum of odd positive number is : " + sumOddPositive);
            }
        }
