import java.util.Scanner;
public class TravelDays {
    public static void main(String[] args) {
        System.out.print("Enter the number of days in August: ");
        Scanner ip = new Scanner(System.in);
        int totalDays = ip.nextInt();

        int evenDays = (totalDays / 2);
            System.out.print("The number of days you can go out is : " + evenDays);
        }

        }

