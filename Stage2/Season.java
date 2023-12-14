import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        System.out.print("Enter the number :  ");
        Scanner ip = new Scanner(System.in);
        int month = ip.nextInt();

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(season = "The season is Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(season = "The season is Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(season = "The season is Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(season = "This season is Winter");
                break;

            default:
                System.out.println("Not a valid month");
        }
    }
}