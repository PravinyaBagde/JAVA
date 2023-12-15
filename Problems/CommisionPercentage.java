import java.util.Scanner;
public class CommisionPercentage {
    public static void main(String[] args) {
        System.out.print("Enter the commision amount : ");
        Scanner sc = new Scanner(System.in);
        double Camount = sc.nextDouble();

        System.out.print("Enter your total sales : ");
        double Tsales = sc.nextDouble();

        double CommisionPerecentage = (Camount/Tsales) * 100;
        System.out.print("Your Commision Percentage is : " + CommisionPerecentage);

    }
}
