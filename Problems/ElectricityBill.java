import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        System.out.print("Enter the amount of units  - ");
        Scanner ip = new Scanner(System.in);
        int unit = ip.nextInt();

        double rate;

        if (unit <= 100) {
            rate = 5;
        } else if (unit <= 200) {
            rate = 7;
        } else if (unit <= 300) {
            rate = 10;
        } else {
            System.out.print("INVALID UNITS !!!");
            return;
        }
        double TotalCost = unit * rate;
        System.out.println("Your Bill Calculation in Progress");
        System.out.println("The amount of units are - " + unit);
        System.out.println("Total Cost For Your Usage is - " + TotalCost);
    }
}