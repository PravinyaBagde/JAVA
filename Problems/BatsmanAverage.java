import java.util.Scanner;
public class BatsmanAverage {
    public static void main(String[] args) {
        System.out.print("Enter the player's name : ");
        Scanner io = new Scanner(System.in);
        String Name = io.next();

        System.out.print("Enter the number of runs you've scored : ");
        Scanner ip = new Scanner(System.in);
        double TotalRuns = ip.nextDouble();

        System.out.print("Enter the number of outs you've faced  : ");
        Scanner op = new Scanner(System.in);
        double NumofOut = op.nextDouble();

        double Battingaverage = (TotalRuns / NumofOut);
        System.out.print("The Average of " +  Name  + " as a BatsMan is : " + Battingaverage);

    }
}
