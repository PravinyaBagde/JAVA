import java.util.Scanner;
public class DayofWeek {
    public static void main(String[] args) {
        System.out.print("Enter the number - ");
        Scanner ip = new Scanner(System.in);
        int dayNumber = ip.nextInt();

        String dayname;

        switch (dayNumber) {
            case 1:
                dayname = "Sunday";
                break;
            case 2:
                dayname = "Monday";
                break;
            case 3:
                dayname = "Tuesday";
                break;
            case 4:
                dayname = "Wednesday";
                break;
            case 5:
                dayname = "Thursday";
                break;
            case 6:
                dayname = "Friday";
                break;
            case 7:
                dayname = "Sunday";
                break;
            default:
                dayname = "INVALID DAY";
        }
        System.out.println("Day : " + dayname);
    }
}


