import java.util.Scanner;
public class PNZ {
    public static void main(String[] args) {
        System.out.println("Enter the number - ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num > 0) {
            System.out.println("The entered number is positive.");
        }  else
            {
                System.out.println("The entered number is negative.");
            }
        }

}
