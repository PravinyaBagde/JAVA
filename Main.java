import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("First Number  - ");
        Scanner input = new Scanner(System.in);
         int num1 = input.nextInt();

        System.out.println("Second Number - ");
        Scanner inpute = new Scanner(System.in);
        int num2 = inpute.nextInt();

        int Addition = num1 + num2;

        System.out.println("The addition of two numbers is = " + Addition);

    }
}

//Sum of two numbers