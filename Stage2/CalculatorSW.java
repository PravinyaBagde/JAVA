import java.util.Scanner;
public class CalculatorSW{
    public static void main(String[] args) {
        System.out.print("Enter the first number - ");
        Scanner ip = new Scanner(System.in);
        double num1 = ip.nextDouble();

        System.out.print("Enter the second number - ");
        Scanner input = new Scanner(System.in);
        double num2 = input.nextDouble();

        System.out.print("Enter the operation in symbolic form - ");
        Scanner ins = new Scanner(System.in);
        char operator = ins.next().charAt(0);

        double result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                }else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                result = num1 % num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            default:
                System.out.println("INVALID OPERATOR.");

        }

        System.out.println("The expected answer is  " + result);
    }
}