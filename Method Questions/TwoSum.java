import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();

        int product = getProduct(number);
        int sum = getSum(number);

        int difference = product - sum;
        System.out.println("The difference is: " + difference);

        System.out.println("The product of digits is : " +product);
        System.out.print("The sum of digits is : " + sum);
    }

    private static int getProduct(int number) {
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    private static int getSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
